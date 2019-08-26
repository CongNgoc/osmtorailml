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
        OsmExtract osm = OsmExtract.fromFile(new File("src/main/resource/Switch4OSM.xml"));
       
        for (Node n : osm.nodes)
        {
            System.out.println(n.id + ": " + n.lat + "/" + n.lon + " [" + n.tags.size() + " - ");
            
            for(int i = 0; i < n.tags.size(); i++)
            {
            	System.out.println("        Tag: " + n.tags.get(i).key + "->" + n.tags.get(i).value);
            }
        }
        System.out.println("Tag " + osm.nodes.get(0).tags.get(0).key + "->" + osm.nodes.get(0).tags.get(0).value);
//        for (Way w : osm.ways)
//        {
//            System.out.println(w.id + ":" + w.nd.size() + " - " + w.nd.get(0).node.id + " [" + w.tags.size() +
//                    " - railway:" + w.getTag("railway")); 
//        } 	
        setTopology(); 
    }
    
    
    /*
     * Created date: 20/08/2019
     * Author: Cong Nguyen
     * Modified date: ///
     * Description: Create structure for micro topology
     * */
    //set topology for micro
    private static void setTopology() throws JAXBException
    {
    	OsmExtract osm = OsmExtract.fromFile(new File("src/main/resource/Switch4OSM.xml"));
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
        
        //NetElemnt & NetRelation
    	NetElements nets = new NetElements();
    	NetRelations net_rels = new NetRelations();
    	List<NetElement> l_ele = new ArrayList<NetElement>();	
    	List<NetRelation> l_rel = new ArrayList<NetRelation>();
    		
    	//Track - set structure for Track
    	Tracks trcs = new Tracks();
		trcs.getTrack().addAll(osm.ways.parallelStream().map(w ->wayToTrack(w)).collect(Collectors.toList()));
    	
		//BufferStops & OpenEnd- set structure for BufferStops& OpenEnd
		BufferStops buffer_stops = new BufferStops();
		Borders borders = new Borders();
		List<BufferStop> list_BufferStop = new ArrayList<BufferStop>();
		List<Border> list_Border = new ArrayList<Border>();//Border as OpenEnd
		
		//Declare SwitchIS
		SwitchesIS switchesIS = new SwitchesIS();
		
		//declare var i to save index of way in ways
		int indexWay = 0;
		//Add NetElement
    	for(Way way : osm.ways)
    	{
    		//Add ID for NetElement
    		String netelement_id = "w_" + way.id;

	    	//Add Child associatedPositioningSystem into NetElement
	    	RTMAssociatedPositioningSystem assoc_net_element = new RTMAssociatedPositioningSystem();
	    	assoc_net_element.setPositioningSystemRef(netelement_id + "_gps01");
    		
    		//Add Child intrinsicCoordinate into associatedPositioningSystem
    		RTMIntrinsicCoordinate intric_coor_1 = new RTMIntrinsicCoordinate();
    		intric_coor_1.setId(netelement_id + "_gps01" + "_ic01");
    		
    		//Add Child geometricCoordinate into intrinsicCoordinate
    		RTMGeometricCoordinate geo_coor = new RTMGeometricCoordinate();
    		//Without setID
			int middle = (way.nd.size() - 1) / 2 ;
			geo_coor.setX(way.nd.get(middle).node.lon);
			geo_coor.setY(way.nd.get(middle).node.lat);
			
    		//Add all child to RTMAssociatedPositioningSystem element
    		intric_coor_1.getGeometricCoordinate().add(geo_coor);
    		assoc_net_element.getIntrinsicCoordinate().add(intric_coor_1);
    		
    		//NetElement	
	    	NetElement ele = new NetElement();
    		ele.setId(netelement_id);
    		ele.getAssociatedPositioningSystem().add(assoc_net_element);
	    	l_ele.add(ele);
	    	//set Lenght for NetElement ???? Yes - No
	    	 	
	    	//Add ID of NetElement for ref to NetworkResource
	    	TElementWithIDref ref_network = new TElementWithIDref();
	    	ref_network.setRef(netelement_id);
	    	
	    	
	    	//Start BufferStop and OpenEnd
	    	// start/end node is only contained in this way -> no connection, "border" of infrastructure
	    	//first & last Noderef in List Noderef
	    	Way.NodeRef node_first = way.nd.getFirst();
	    	addBufferStopOrOpenEnd(node_first, list_BufferStop, list_Border, netelement_id);
	    	
	    	Way.NodeRef node_last = way.nd.getLast();
	    	addBufferStopOrOpenEnd(node_last, list_BufferStop, list_Border, netelement_id);
	    	//--- END BufferStop and OpenEnd
	    	
	    	//ADD NetRelation     	
	    	for(int j = indexWay + 1; j < osm.ways.size(); j++)
	    	{
	    		Way wayAnother = osm.ways.get(j);  
	    		if(way.nd.getLast().node.id == wayAnother.nd.getFirst().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 1, 0));
	    		}
	    		else if(way.nd.getFirst().node.id == wayAnother.nd.getLast().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 0, 1));
	    		}
	    		else if(way.nd.getFirst().node.id == wayAnother.nd.getFirst().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 0, 0));
	    		}
	    		else if(way.nd.getLast().node.id == wayAnother.nd.getLast().node.id)
	    		{
	    			l_rel.add(setNetRelation(way, wayAnother, 1, 1));
	    		}
	    		
	    	}
	    	indexWay++;
	    }
    	
    	//Start Add Switch || Crossing
    	for (Node node : osm.nodes) {
    		final int way_at_node =  node.wayRefs.size();
    		//Switch - add SwitchIS to SwitchesIS
	    	if(way_at_node > 1)
	    	{
	    		String nodeType = node.getTag("railway");
	    		if(nodeType != null && nodeType.equals("switch"))
	    		{
	    			switchesIS.getSwitchIS().add(setStructureSwitchIS(node));
	    		}
	    		else
	    		{
	    			//Crossing or ...
	    			//Add Crossing at here
	    			if(nodeType != null && nodeType.equals("crossing"))
		    		{
		    			//code for crossing element
		    		}
	    		}
	    	}
    	}
    	//End Switch || Crossing
    	
    	//Add NetElement & NetRelation to topology
    	net_rels.getNetRelation().addAll(l_rel);
    	nets.getNetElement().addAll(l_ele);
    	topo.setNetElements(nets);
    	topo.setNetRelations(net_rels);
    	
    	//Add list BufferStop to BufferStops element and list Border to Borders element
    	buffer_stops.getBufferStop().addAll(list_BufferStop);
    	borders.getBorder().addAll(list_Border);
    	
    	//FuntionalInfrastructure
    	func_insfr.setTracks(trcs);
    	func_insfr.setBufferStops(buffer_stops);
    	func_insfr.setBorders(borders);
    	func_insfr.setSwitchesIS(switchesIS);
    	is.setFunctionalInfrastructure(func_insfr);
    	JAXBContext jc = JAXBContext.newInstance(RailML.class);
        Marshaller marshaller = jc.createMarshaller();
//         SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//         Schema schema = schemaFactory.newSchema(
//                  new URL("file:///F:/Projects/RailML/osm2railML-master/src/main/xsd/infrastructure3.xsd"));
//         marshaller.setSchema(schema);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        File file = new File("src/main/resource/railml.xml");
        marshaller.marshal(rail, file); 
    }
    
    /*
     * Created date: 20/08/2019
     * Author: Cong Nguyen
     * Modified date: ///
     * Description: Create structure for Track
     * */
    private static Track wayToTrack(Way way)
    {
    	Track trc = new Track();
    	String trc_id = "trc_" + way.id;
    	trc.setId(trc_id);
    	TElementWithIDref trc_begin_IDref = new TElementWithIDref();
    	trc_begin_IDref.setRef("tB_" + way.id);
    	trc.setTrackBegin(trc_begin_IDref);
    	TElementWithIDref trc_end_IDref = new TElementWithIDref();
    	trc_end_IDref.setRef("tE_" + way.id);
    	trc.setTrackEnd(trc_end_IDref);
    	//Calculate the length based on longitude and latitude of nodes included in the track
    	Double distance = 0.0;
    	if(way.nd.size() >= 2)
    	{
    		for (int i = 0; i < way.nd.size() - 1; i++)
    		{
    			GeodesicData geo = Geodesic.WGS84.Inverse(way.nd.get(i).node.lat, way.nd.get(i).node.lon, way.nd.get(i+1).node.lat, way.nd.get(i+1).node.lon );
				distance += geo.s12;  
    		}
    	}
    	//set Length for track
    	Length length = new Length();
    	length.setValue(doubleToBigDecimal(distance, 6));
    	trc.getLength().add(length);
    	//set linearLocation
    	RTMLinearLocation linear_loc = new RTMLinearLocation();
    	linear_loc.setId(trc_id + "_lloc01");
    	RTMAssociatedNetElement assoc_netE = new RTMAssociatedNetElement();
    	assoc_netE.setNetElementRef("null");
    	assoc_netE.setKeepsOrientation(true);
    	linear_loc.getAssociatedNetElement().add(assoc_netE);
    	trc.getLinearLocation().add(linear_loc);
    	return trc;
    }
    
    /*Created date: 25/08/2019
     * Author: Cong Nguyen
     * Modified date: 26/08/2019
     * Description: Create structure for NetRelation 
     */
    private static NetRelation setNetRelation(Way way, Way wayAnother, int PosOnA, int PosOnB)
    {
    	NetRelation net_rel  = new NetRelation();
    	net_rel.setId("w_" + way.id + "_" + wayAnother.id);
    	net_rel.setPositionOnA(BigInteger.valueOf(PosOnA));
    	net_rel.setPositionOnB(BigInteger.valueOf(PosOnB));	
    	TElementWithIDref eleA = new TElementWithIDref();
    	eleA.setRef("w_" + way.id);
    	net_rel.setElementA(eleA);
    	TElementWithIDref eleB = new TElementWithIDref();
    	eleB.setRef("w_" + wayAnother.id);
    	net_rel.setElementB(eleB);
    	return net_rel;
    }
    
    /*
     * Created date: 20/08/2019
     * Author: Cong Nguyen
     * Modified date: ///
     * Description: Create structure for Buffer stop
     * */
    private static void setValueBufferStop(BufferStop buffer_stop, Way.NodeRef nd, String netelement_id)
    {
    	String buffer_stop_id = "bufferStop_" + nd.node.id;
		buffer_stop.setId(buffer_stop_id);
        RTMSpotLocation spot_loc = new RTMSpotLocation();
        spot_loc.setId(buffer_stop_id + "_sloc01");
        //need to Understand
        spot_loc.setNetElementRef(netelement_id);	
        //
		RTMGeometricCoordinate geo_coor_buffer = new RTMGeometricCoordinate();
		geo_coor_buffer.setX(nd.node.lon);
		geo_coor_buffer.setY(nd.node.lat);
		spot_loc.setGeometricCoordinate(geo_coor_buffer);
		buffer_stop.getSpotLocation().add(spot_loc);
    }
    
    private static void setValueBorder(Border border, Way.NodeRef nd, String netelement_id)
    { 	
    	border.setIsOpenEnd(true);
    	String OpenEnd_Id = "openEnd_" + nd.node.id;
    	border.setId(OpenEnd_Id);
    	//set data for SpotLocation element
    	RTMSpotLocation spot_loc = new RTMSpotLocation();
        spot_loc.setId(OpenEnd_Id + "_sloc01");
        spot_loc.setNetElementRef(netelement_id);
		RTMGeometricCoordinate geo_coor_buffer = new RTMGeometricCoordinate();
		geo_coor_buffer.setX(nd.node.lon);
		geo_coor_buffer.setY(nd.node.lat);
		spot_loc.setGeometricCoordinate(geo_coor_buffer);
		border.getSpotLocation().add(spot_loc);
    }
    
    /*Created date: 21/08/2019
     * Author: Cong Nguyen
     * Modified date: 23/08/2019
     * Description: Add data to List<BufferStop> & List<Border>(as OpenEnd at here)
     */
    private static void addBufferStopOrOpenEnd(Way.NodeRef nd, List<BufferStop> list_BufferStop
    		, List<Border> list_Border, String netelement_id)
    {
    	if(nd.node.wayRefs.size() == 1)
    	{
    		String nodeType = nd.node.getTag("railway");
        	//System.out.println(nd.node.id);
    		if(nodeType != null && nodeType.equals("buffer_stop"))
    		{
        		BufferStop buffer_stop = new BufferStop();
        		setValueBufferStop(buffer_stop, nd, netelement_id);
        		list_BufferStop.add(buffer_stop);
    		}
    		else 
    		{
            	//Border as Open End
            	Border border = new Border();     	
            	setValueBorder(border, nd, netelement_id);
            	list_Border.add(border);
            }
    	}
    }
    
    /*Create date: 23/08/2019	
     * Author:	Cong Nguyen
     * Modify date: 
     * Description: Create structure for SwitchesIS
     */
    private static SwitchIS setStructureSwitchIS(Node node)
    {
    	SwitchIS switchIS = new SwitchIS();
		String switchId = "switch_" + node.id;
		switchIS.setId(switchId);
		RTMSpotLocation spot_loc = new RTMSpotLocation();
		spot_loc.setId(switchId + "_sloc01");
		//need to Understand
		spot_loc.setNetElementRef("null");
		//
		RTMGeometricCoordinate geo_coor = new RTMGeometricCoordinate();
		geo_coor.setX(node.lon);
		geo_coor.setY(node.lat);
		spot_loc.setGeometricCoordinate(geo_coor);
		switchIS.getSpotLocation().add(spot_loc);
    	return switchIS;
    }
    
    /* Create date: 26/08/2019
     * Author: Cong Nguyen
     * Modify date:
     * Description: create structure for LevelCrossingIS
     */
    private static LevelCrossingIS setCrossing(NodeRef nd)
    {
    	LevelCrossingIS lvCrossing = new LevelCrossingIS();
    	lvCrossing.setId("crossing" + nd.node.id);
    	
    	return lvCrossing;
    }
    
    private static BigDecimal doubleToBigDecimal(double value, int scale) {
        return new BigDecimal(new BigInteger(Long.toString(Math.round(value * Math.pow(10, scale)))), scale);
    }
}