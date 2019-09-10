/**
 osm2railML - creating railML infrastructure from OpenStreetMap data
 Copyright (C) 2016-2017  Sebastian Albert
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sebalbert.osm2railml;

import com.sebalbert.osm2railml.osm.Node;
import com.sebalbert.osm2railml.osm.OsmExtract;
import com.sebalbert.osm2railml.osm.Way;
import com.sebalbert.osm2railml.osm.Way.NodeRef;

import https.www_railml_org.schemas._3.*;
import net.sf.geographiclib.Geodesic;
import net.sf.geographiclib.GeodesicData;
import org.xml.sax.SAXException;

import javax.management.relation.Relation;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.BufferUnderflowException;
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Main executable.
 *
 */
public class Main
{

    /**
     * Reads XML from OpenStreetMap in order to generate railML infrastructure from it
     * @param args - first argument is expected to be a local (relative) filename
     * @throws JAXBException
     */
    public static void main( String[] args ) throws JAXBException, MalformedURLException, SAXException {
        setTopology();        
    }
    
    /*
     * Created date: 20/08/2019
     * Author: Cong Nguyen
     * Modified date: 28/08/2019
     * Description: Create structure for micro topology
     * */
    //set topology for micro
    private static void setTopology() throws JAXBException
    {
    	List<String> listCanon = new ArrayList<>();
    	OsmExtract osm = OsmExtract.fromFile(new File("src/main/resource/22-08-2019-remove-dupOSM.xml"));
    	for(Way way : osm.ways)
    	{
    		System.out.println("Way: " + way.id);
    		for(Way.NodeRef nd : way.nd)
    		{
    			
    			if(isCanonicalNodeRef(nd))
    			{
    				System.out.println(" NodeId: " + nd.node.id + " Position: " + nd.topologicalPosition());
//    				String Canon = nd.node.id;
//    				if(listCanon.contains(Canon))
//    				{
//    					System.out.println("        NodeRef Duplicate: " + Canon);
//    					System.out.println("        WayRefs size: " + nd.node.wayRefs.size());
//    				}
//    				System.out.println("   NodeRef: " + Canon);
//    				listCanon.add(Canon);
    			}
    		}
    	}
    	 // creation of railML structure to be marshalled in the end
        RailML rail = new RailML();
        rail.setVersion("3.1");
        Infrastructure is = new Infrastructure();
        is.setId("is");
        rail.setInfrastructure(is);
        Topology topo = new Topology();
        is.setTopology(topo);
        //FunctionalInfrastructure contain "tracks", "crossing", "bufferStop"
        FunctionalInfrastructure func_insfr = new FunctionalInfrastructure();
        
        //NetElemnt & NetRelation & NetWork
    	NetElements nets = new NetElements();
    	NetRelations net_rels = new NetRelations();
    	Networks networks = new Networks();	
    	Network network = new Network();
    	network.setId("nw01");
    	RTMLevelNetwork level_network = new RTMLevelNetwork();
    	level_network.setId("lv0");
    	List<NetElement> l_ele = new ArrayList<NetElement>();	
    	List<NetRelation> l_rel = new ArrayList<NetRelation>();
    	List<TElementWithIDref> l_NetworkResource = new ArrayList<TElementWithIDref>();
    	
    	//Track - set structure for Track
    	Tracks trcs = new Tracks();
    	List<Track> l_track = new ArrayList<>();
    	
		//BufferStops & OpenEnd- set structure for BufferStops& OpenEnd
		BufferStops buffer_stops = new BufferStops();
		Borders borders = new Borders();
		SwitchesIS switches = new SwitchesIS();
		Crossings crossings = new Crossings();
		List<BufferStop> list_BufferStop = new ArrayList<>();
		List<Border> list_Border = new ArrayList<>();//Border as OpenEnd
		List<SwitchIS> list_Switch = new ArrayList<>();
		List<Crossing> list_Crossing = new ArrayList<>();
		//wayToTrack(osm.ways, l_track, list_BufferStop, list_Border);
	
		//declare variable i to save index of way in ways
		int indexWay = 0;
		//Add NetElement
		List<String> list_switchID = new ArrayList<>();
		List<String> list_crossingID = new ArrayList<>();
    	for(Way way : osm.ways)
    	{
    		//Add ID for NetElement
    		String netelement_id = "w_" + way.id;
    		
    		//Add NetworkResource to List NetworkResource
    		TElementWithIDref NetworkResource = new TElementWithIDref();
    		NetworkResource.setRef(netelement_id);
    		l_NetworkResource.add(NetworkResource);
    		
	    	//Add Child associatedPositioningSystem into NetElement
	    	RTMAssociatedPositioningSystem assoc_net_element = new RTMAssociatedPositioningSystem();
	    	assoc_net_element.setId(netelement_id + "_gps01");
    		
    		//Add Child intrinsicCoordinate into associatedPositioningSystem
    		RTMIntrinsicCoordinate intric_coor_1 = new RTMIntrinsicCoordinate();
    		intric_coor_1.setId(netelement_id + "_gps01" + "_ic01");
    		
    		//Add Child geometricCoordinate into intrinsicCoordinate
    		RTMGeometricCoordinate geo_coor = new RTMGeometricCoordinate();
    		//Without setID
    		int middle = way.nd.size()  / 2 ;
    		double x, y;
    		if (way.nd.size() %2 == 0) 
    		{
    			x = (way.nd.get(middle).node.lon + way.nd.get(middle - 1).node.lon) / 2;  
    			y = (way.nd.get(middle).node.lat + way.nd.get(middle - 1).node.lat) / 2; 
    		}
    		else {  
    			x = way.nd.get(middle).node.lon; 
    			y =  way.nd.get(middle).node.lat;
			}
			geo_coor.setX(x);
			geo_coor.setY(y);
			//Modify date: 28/08
			geo_coor.setPositioningSystemRef(netelement_id + "_gps01");
			//End modify
			
    		//Add all child to RTMAssociatedPositioningSystem element
    		intric_coor_1.getGeometricCoordinate().add(geo_coor);
    		assoc_net_element.getIntrinsicCoordinate().add(intric_coor_1);
    		
    		//NetElement	
	    	NetElement ele = new NetElement();
    		ele.setId(netelement_id);
    		ele.getAssociatedPositioningSystem().add(assoc_net_element);
	    	l_ele.add(ele);
	    	
	    	//ADD NetRelation     	
	    	for(int j = indexWay + 1; j < osm.ways.size(); j++)
	    	{
	    		Way wayAnother = osm.ways.get(j);
	    		if(way.nd.getLast().node.id == wayAnother.nd.getFirst().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 1, 0, l_NetworkResource));
	    		}
	    		else if(way.nd.getFirst().node.id == wayAnother.nd.getLast().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 0, 1, l_NetworkResource));
	    		}
	    		else if(way.nd.getFirst().node.id == wayAnother.nd.getFirst().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 0, 0, l_NetworkResource));
	    		}
	    		else if(way.nd.getLast().node.id == wayAnother.nd.getLast().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 1, 1, l_NetworkResource));
	    		}	
	    	}
	    	
	    	for (Way.NodeRef nd : way.nd) {	    
	            final int waysAtNode = nd.node.wayRefs.size();
	            final int topologicalPosition = nd.topologicalPosition();
	            //---level_crossing node is just reference a way
	            // detect and model switches and crossings
	            //Compare Switch & Crossing
	            if(waysAtNode == 1)
	            {
					//Start BufferStop and OpenEnd
					if(nd.topologicalPosition() == 1 || nd.topologicalPosition() == -1)
					{
				    	addBufferStopOrOpenEnd(nd, list_BufferStop, list_Border);
					}
			    	//--- END BufferStop and OpenEnd
	            }
	            else
	            {
					//find most probable "partner" at a joining node by computing angles (via geodesic azimuth)
	                Way.NodeRef partner = mutuallyOppositeEnd(nd);
	                String nodeType = nd.node.getTag("railway");  
	                if (nodeType != null && (nodeType.equals("railway_crossing"))) {    
	                	// avoid setting a crossing at both respective ends of two sequentially joined tracks
	                	String crossingId = "crossing_" + nd.node.id;
	                	if (!isCanonicalNodeRef(nd) || list_crossingID.contains(crossingId)) continue;
	                	list_crossingID.add(crossingId);
	                    list_Crossing.add(setCrossing(nd));
	                } 
	                else 
	                {
	                    // unless explicitly set as "railway_crossing", we assume a switch
	                    //String switchType = nd.node.getTag("railway:switch");
	                    if (isCanonicalNodeRef(nd) && 
	                    		(topologicalPosition == Way.NodeRef.INTERIOR || (waysAtNode > 2 && partner != null))) {
	                    	String switchId = "switch_" + nd.node.id;
	                    	if(list_switchID.contains(switchId)) continue;
	                    	list_Switch.add(setStructureSwitchIS(nd));
	                    	list_switchID.add(switchId); 
	                    	System.out.println("  NodeId: " + nd.node.id + "     Posiioin + " + topologicalPosition);
	                    }
	                }
				}
	        }	
	    	indexWay++;
	    }
    	
    	//Add NetElement & NetRelation to topology
    	net_rels.getNetRelation().addAll(l_rel);
    	nets.getNetElement().addAll(l_ele);
    	level_network.getNetworkResource().addAll(l_NetworkResource);
    	network.getLevel().add(level_network);
    	networks.getNetwork().add(network);
    	topo.setNetElements(nets);
    	topo.setNetRelations(net_rels);
    	topo.setNetworks(networks);

    	//Add list BufferStop to BufferStops element and list Border to Borders element
    	buffer_stops.getBufferStop().addAll(list_BufferStop);
    	borders.getBorder().addAll(list_Border);
    	//Add list SwitchIS to BufferStops element
    	switches.getSwitchIS().addAll(list_Switch);
    	//Add list Crossing to Crossings element
    	crossings.getCrossing().addAll(list_Crossing);
    	//FuntionalInfrastructure
    	trcs.getTrack().addAll(l_track);
    	//func_insfr.setTracks(trcs);
    	if(list_BufferStop.size() != 0) func_insfr.setBufferStops(buffer_stops);
    	if(list_Border.size() != 0) func_insfr.setBorders(borders);
    	if(list_Switch.size() != 0) func_insfr.setSwitchesIS(switches);
    	if(list_Crossing.size() != 0) func_insfr.setCrossings(crossings);
    	
    	is.setFunctionalInfrastructure(func_insfr);
    	JAXBContext jc = JAXBContext.newInstance(RailML.class);
        Marshaller marshaller = jc.createMarshaller();
//         SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//         Schema schema = schemaFactory.newSchema(
//                  new URL("file:///F:/Projects/RailML/osm2railML-master/src/main/xsd/infrastructure3.xsd"));
//         marshaller.setSchema(schema);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        File file = new File("src/main/resource/RailML3-1-07-09.xml");
        marshaller.marshal(rail, file); 
    }
    
    /*
     * Created date: 20/08/2019
     * Author: Cong Nguyen
     * Modified date: ///
     * Description: Create structure for Track
     * */
    private static void wayToTrack(List<Way> ways, List<Track> trcs, List<BufferStop> list_BufferStop, List<Border> list_Border)
    {
    	List<String> list_switch = new ArrayList<String>();
    	List<RTMAssociatedNetElement> list_AssocNetE = new ArrayList<RTMAssociatedNetElement>();	
    	for(int i = 0; i < ways.size(); i++)
    	{
    		Way way = ways.get(i);
        	System.out.println("Way: "+ way.id);
    		int countTrack = 1;
    		String text = (countTrack < 10 ? "0" : "") + countTrack;	
	    	Track trc = new Track();
	    	String trc_id = "trc_" + text;
	    	trc.setId(trc_id);
	    	TTrackType trc_type = TTrackType.MAIN_TRACK;
	    	trc.setType(trc_type);
	    	TElementWithIDref trc_begin_IDref = new TElementWithIDref();
	    	TElementWithIDref trc_end_IDref = new TElementWithIDref();
	    	//set linearLocation
	    	RTMLinearLocation linear_loc = new RTMLinearLocation();
	    	linear_loc.setId(trc_id + "_lloc01");
	    	boolean check = false;//variable to check this track contain one of BufferStop, Switch, Crossing
	    	RTMAssociatedNetElement assoc_netE = new RTMAssociatedNetElement();    	
	    	
	    	for (Way.NodeRef nd : way.nd) {	        	
	            final int waysAtNode = nd.node.wayRefs.size();
	            final int topologicalPosition = nd.topologicalPosition();
	            // detect and model switches and crossings
	            if (waysAtNode > 1) {
	            	//find most probable "partner" at a joining node by computing angles (via geodesic azimuth)
	                Way.NodeRef partner = mutuallyOppositeEnd(nd);
	                String nodeType = nd.node.getTag("railway");
	                
	                if (nodeType != null && (nodeType.equals("railway_crossing") || nodeType.equals("level_crossing"))) {
	                    // avoid setting a crossing at both respective ends of two sequentially joined tracks
	                    if (!isCanonicalNodeRef(nd)) continue;
	                    //Add Crossing at here
	                    
	                } else {
	                    // unless explicitly set as "railway_crossing", we assume a switch
	                    String switchType = nd.node.getTag("railway:switch");
	                    if (isCanonicalNodeRef(nd) && 
	                    		(topologicalPosition == Way.NodeRef.INTERIOR || (waysAtNode > 2 && partner != null))) {
	                    	String switchId = "switch_" + nd.node.id;
	                    	if(list_switch.contains(switchId)) continue;
	                    	System.out.println("    switchId: " + switchId);
	                    	//ADD Switch at here
	                    	list_switch.add(switchId); 
	                    }
	                }
	    		}
	        }
	    
	    	//Start BufferStop and OpenEnd
	    	Way.NodeRef node_first = way.nd.getFirst();
	    	boolean isAddFirstNode = addBufferStopOrOpenEnd(node_first, list_BufferStop, list_Border);
	    	
	    	Way.NodeRef node_last = way.nd.getLast();
	    	boolean isAddLastNode = addBufferStopOrOpenEnd(node_last, list_BufferStop, list_Border);
	    	//--- END BufferStop and OpenEnd
	    	if(isAddFirstNode || isAddLastNode)//One Of BufferStop
	    	{
	    		check = true;
	    		int indexCurrectOfTracks = trcs.size();
	    		if(indexCurrectOfTracks == 0)
	    		{
	    	    	trc_begin_IDref.setRef("bus_" + way.id);
	    	    	trc.setTrackBegin(trc_begin_IDref);
	    			trc_end_IDref.setRef("bus_" + way.id);
	    	    	trc.setTrackEnd(trc_end_IDref);
	    	    	linear_loc.getAssociatedNetElement().addAll(list_AssocNetE);
	    	    	list_AssocNetE.clear();
	    		}
	    		else
	    		{
	    			TElementWithIDref trackBegin = trcs.get(trcs.size() - 1).getTrackEnd();
	    			trc_begin_IDref.setRef(trackBegin.getRef());
	    	    	trc.setTrackBegin(trc_begin_IDref);
	    			trc_end_IDref.setRef("bus" + way.id);
	    	    	trc.setTrackEnd(trc_end_IDref);
	    	    	linear_loc.getAssociatedNetElement().addAll(list_AssocNetE);
	    	    	list_AssocNetE.clear();
	    		}
	    		countTrack++;
	    	}
	    	else
	    	{
	    		//this Track not contain One Of BufferStop, Switch, Crossing
	    		
		    	assoc_netE.setNetElementRef("w_" + way.id);
		    	assoc_netE.setKeepsOrientation(true);
		    	list_AssocNetE.add(assoc_netE);
		    	continue;
	    	}	    	
	    	
	    	//Calculate the length based on longitude and latitude of nodes included in the track
	    	Double distance = 0.0;
	    	if(way.nd.size() >= 2)
	    	{
	    		for (int j = 0; j < way.nd.size() - 1; j++)
	    		{
	    			GeodesicData geo = Geodesic.WGS84.Inverse(way.nd.get(j).node.lat, way.nd.get(j).node.lon, way.nd.get(j+1).node.lat, way.nd.get(j+1).node.lon );
					distance += geo.s12;  
	    		}
	    	}
	    	//set Length for track
	    	Length length = new Length();
	    	length.setValue(doubleToBigDecimal(distance, 6));
	    	length.setType("physical");
	    	trc.getLength().add(length);
	    	trc.getLinearLocation().add(linear_loc);
	    	trcs.add(trc);
    	}
    }
    
    /*Created date: 25/08/2019
     * Author: Cong Nguyen
     * Modified date: 26/08/2019
     * Description: Create structure for NetRelation 
     */
    private static NetRelation setNetRelation(Way way, Way wayAnother, int PosOnA, int PosOnB
    		, List<TElementWithIDref> l_NetworkResource)
    {	
    	NetRelation net_rel  = new NetRelation();
    	String NetRel = "w_" + way.id + "_" + wayAnother.id;
    	net_rel.setId(NetRel);
    	net_rel.setPositionOnA(BigInteger.valueOf(PosOnA));
    	net_rel.setPositionOnB(BigInteger.valueOf(PosOnB));	
    	TElementWithIDref eleA = new TElementWithIDref();
    	eleA.setRef("w_" + way.id);
    	net_rel.setElementA(eleA);
    	TElementWithIDref eleB = new TElementWithIDref();
    	eleB.setRef("w_" + wayAnother.id);
    	net_rel.setElementB(eleB);
    	
    	//Add Network Resource to List Network Resource
    	TElementWithIDref NetworkResource = new TElementWithIDref();
		NetworkResource.setRef(NetRel);
		l_NetworkResource.add(NetworkResource);
    	return net_rel;
    }
    
    /*Created date: 21/08/2019
     * Author: Cong Nguyen
     * Modified date: 30/08/2019
     * Description: Add data to List<BufferStop> & List<Border>(as OpenEnd at here)
     */
    private static boolean addBufferStopOrOpenEnd(Way.NodeRef nd, List<BufferStop> list_BufferStop
    		, List<Border> list_Border)
    {
		String nodeType = nd.node.getTag("railway");
    	//System.out.println(nd.node.id);
		if(nodeType != null && nodeType.equals("buffer_stop"))
		{
    		BufferStop buffer_stop = new BufferStop();
    		setValueBufferStop(buffer_stop, nd);
    		list_BufferStop.add(buffer_stop);
    		return true;
		}
		else 
		{
        	//Border as Open End
        	Border border = new Border();     	
        	setValueBorder(border, nd);
        	list_Border.add(border);
        	return false;
        }
    }
    
    /*
     * Created date: 20/08/2019
     * Author: Cong Nguyen
     * Modified date: ///
     * Description: Create structure for Buffer stop
     * */
    private static void setValueBufferStop(BufferStop buffer_stop, Way.NodeRef nd)
    {
    	String netelement_id = "w_" + nd.way.id;
    	String buffer_stop_id = "bufferStop_" + nd.node.id;
		buffer_stop.setId(buffer_stop_id);
        RTMSpotLocation spot_loc = new RTMSpotLocation();
        spot_loc.setId(buffer_stop_id + "_sloc01");
        spot_loc.setNetElementRef(netelement_id);	
		RTMGeometricCoordinate geo_coor_buffer = new RTMGeometricCoordinate();
		geo_coor_buffer.setX(nd.node.lon);
		geo_coor_buffer.setY(nd.node.lat);
		//setPositioningSystemRef 30/09/2019
		geo_coor_buffer.setPositioningSystemRef(netelement_id + "_gps01");
		//End
		spot_loc.setGeometricCoordinate(geo_coor_buffer);
		buffer_stop.getSpotLocation().add(spot_loc);
    }
    
    private static void setValueBorder(Border border, Way.NodeRef nd)
    { 	
    	border.setIsOpenEnd(true);
    	String OpenEnd_Id = "openEnd_" + nd.node.id;
    	String netelement_id = "w_" + nd.way.id;
    	border.setId(OpenEnd_Id);
    	//setType 30/09/2019
    	border.setType("station");
    	//End setType
    	//set data for SpotLocation element
    	RTMSpotLocation spot_loc = new RTMSpotLocation();
        spot_loc.setId(OpenEnd_Id + "_sloc01");
        spot_loc.setNetElementRef(netelement_id);
		RTMGeometricCoordinate geo_coor_buffer = new RTMGeometricCoordinate();
		geo_coor_buffer.setX(nd.node.lon);
		geo_coor_buffer.setY(nd.node.lat);
		//setPositioningSystemRef 30/09/2019
		geo_coor_buffer.setPositioningSystemRef(netelement_id + "_gps01");
		//End setPositioningSystemRef
		spot_loc.setGeometricCoordinate(geo_coor_buffer);
		border.getSpotLocation().add(spot_loc);
    }
    
    /*Create date: 23/08/2019	
     * Author:	Cong Nguyen
     * Modify date: 
     * Description: Create structure for SwitchesIS
     */
    private static SwitchIS setStructureSwitchIS(Way.NodeRef nd)
    {
    	SwitchIS switchIS = new SwitchIS();
		String switchId = "switch_" + nd.node.id;
		switchIS.setId(switchId);
		RTMSpotLocation spot_loc = new RTMSpotLocation();
		spot_loc.setId(switchId + "_sloc01");
		spot_loc.setNetElementRef("w_" + nd.way.id);
		RTMGeometricCoordinate geo_coor = new RTMGeometricCoordinate();
		geo_coor.setX(nd.node.lon);
		geo_coor.setY(nd.node.lat);
		geo_coor.setPositioningSystemRef("w_" + nd.way.id + "_gps01");
		spot_loc.setGeometricCoordinate(geo_coor);
		switchIS.getSpotLocation().add(spot_loc);
    	return switchIS;
    }
    
    /* Create date: 05/09/2019
     * Author: Cong Nguyen
     * Modify date: 05/09/2019
     * Description: create structure for LevelCrossingIS
     */
    private static Crossing setCrossing(NodeRef nd)
    {
    	Crossing crossing = new Crossing();
    	String crossingID = "crossing_" + nd.node.id;
    	crossing.setId(crossingID);
    	RTMSpotLocation spot_loc = new RTMSpotLocation();
		spot_loc.setId(crossingID + "_sloc01");
		spot_loc.setNetElementRef("w_" + nd.way.id);
		RTMGeometricCoordinate geo_coor = new RTMGeometricCoordinate();
		geo_coor.setX(nd.node.lon);
		geo_coor.setY(nd.node.lat);
		geo_coor.setPositioningSystemRef("w_" + nd.way.id + "_gps01");
		spot_loc.setGeometricCoordinate(geo_coor);
		crossing.getSpotLocation().add(spot_loc);
    	return crossing;
    }
    
    /* Create date: 26/08/2019
     * Author: Cong Nguyen
     * Modify date: 05/09/2019
     * Description: create structure for LevelCrossingIS
     */
    private static LevelCrossingIS setLevelCrossing(NodeRef nd)
    {
    	LevelCrossingIS lvCrossing = new LevelCrossingIS();
    	String crossingID = "crossing_" + nd.node.id;
    	lvCrossing.setId(crossingID);
    	RTMSpotLocation spot_loc = new RTMSpotLocation();
		spot_loc.setId(crossingID + "_sloc01");
		spot_loc.setNetElementRef("w_" + nd.way.id);
		RTMGeometricCoordinate geo_coor = new RTMGeometricCoordinate();
		geo_coor.setX(nd.node.lon);
		geo_coor.setY(nd.node.lat);
		geo_coor.setPositioningSystemRef("w_" + nd.way.id + "_gps01");
		spot_loc.setGeometricCoordinate(geo_coor);
		lvCrossing.getSpotLocation().add(spot_loc);
    	return lvCrossing;
    }
    
    private static BigDecimal doubleToBigDecimal(double value, int scale) {
        return new BigDecimal(new BigInteger(Long.toString(Math.round(value * Math.pow(10, scale)))), scale);
    }
    // find most probable "partner" at a joining node by computing angles (via geodesic azimuth)
    private static Way.NodeRef oppositeEnd(Way.NodeRef nd) {
        return nd.node.wayRefs.stream()
                .filter(r -> r != nd && r.topologicalPosition() != Way.NodeRef.INTERIOR)
                .min(Comparator.comparingDouble(nd2 -> Math.cos(nd2.azimuthTowardsWay() - nd.azimuthTowardsWay())))
                .orElse(null);
    }

    private static Way.NodeRef mutuallyOppositeEnd(Way.NodeRef nd) {
        Way.NodeRef other = oppositeEnd(nd);
        if (other == null || oppositeEnd(other) != nd) return null;
        return other;
    }
    // a NodeRef is a canonical place to add elements if it's either an interior node
    // or the way ID is lexicographically smaller than its partner's (if any)
    private static boolean isCanonicalNodeRef(Way.NodeRef nd) {
        if (nd.topologicalPosition() == Way.NodeRef.INTERIOR) return true;
        Way.NodeRef partner = mutuallyOppositeEnd(nd);
        return partner == null || partner.way.id.compareTo(nd.way.id) > 0;//
    }
    
}
