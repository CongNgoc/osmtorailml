//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the top level element for railML3 functional infrastructure model.
 * 
 * <p>Java class for FunctionalInfrastructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalInfrastructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balises" type="{https://www.railml.org/schemas/3.1}Balises" minOccurs="0"/&gt;
 *         &lt;element name="borders" type="{https://www.railml.org/schemas/3.1}Borders" minOccurs="0"/&gt;
 *         &lt;element name="bufferStops" type="{https://www.railml.org/schemas/3.1}BufferStops" minOccurs="0"/&gt;
 *         &lt;element name="crossings" type="{https://www.railml.org/schemas/3.1}Crossings" minOccurs="0"/&gt;
 *         &lt;element name="derailersIS" type="{https://www.railml.org/schemas/3.1}DerailersIS" minOccurs="0"/&gt;
 *         &lt;element name="electrifications" type="{https://www.railml.org/schemas/3.1}Electrifications" minOccurs="0"/&gt;
 *         &lt;element name="keyLocksIS" type="{https://www.railml.org/schemas/3.1}KeyLocksIS" minOccurs="0"/&gt;
 *         &lt;element name="levelCrossingsIS" type="{https://www.railml.org/schemas/3.1}LevelCrossingsIS" minOccurs="0"/&gt;
 *         &lt;element name="lines" type="{https://www.railml.org/schemas/3.1}Lines" minOccurs="0"/&gt;
 *         &lt;element name="loadingGauges" type="{https://www.railml.org/schemas/3.1}LoadingGauges" minOccurs="0"/&gt;
 *         &lt;element name="operationalPoints" type="{https://www.railml.org/schemas/3.1}OperationalPoints" minOccurs="0"/&gt;
 *         &lt;element name="overCrossings" type="{https://www.railml.org/schemas/3.1}OverCrossings" minOccurs="0"/&gt;
 *         &lt;element name="platforms" type="{https://www.railml.org/schemas/3.1}Platforms" minOccurs="0"/&gt;
 *         &lt;element name="restrictionAreas" type="{https://www.railml.org/schemas/3.1}RestrictionAreas" minOccurs="0"/&gt;
 *         &lt;element name="serviceSections" type="{https://www.railml.org/schemas/3.1}ServiceSections" minOccurs="0"/&gt;
 *         &lt;element name="signalsIS" type="{https://www.railml.org/schemas/3.1}SignalsIS" minOccurs="0"/&gt;
 *         &lt;element name="speeds" type="{https://www.railml.org/schemas/3.1}Speeds" minOccurs="0"/&gt;
 *         &lt;element name="stoppingPlaces" type="{https://www.railml.org/schemas/3.1}StoppingPlaces" minOccurs="0"/&gt;
 *         &lt;element name="switchesIS" type="{https://www.railml.org/schemas/3.1}SwitchesIS" minOccurs="0"/&gt;
 *         &lt;element name="tracks" type="{https://www.railml.org/schemas/3.1}Tracks" minOccurs="0"/&gt;
 *         &lt;element name="trackBeds" type="{https://www.railml.org/schemas/3.1}TrackBeds" minOccurs="0"/&gt;
 *         &lt;element name="trackGauges" type="{https://www.railml.org/schemas/3.1}TrackGauges" minOccurs="0"/&gt;
 *         &lt;element name="trainDetectionElements" type="{https://www.railml.org/schemas/3.1}TrainDetectionElements" minOccurs="0"/&gt;
 *         &lt;element name="trainProtectionElements" type="{https://www.railml.org/schemas/3.1}TrainProtectionElements" minOccurs="0"/&gt;
 *         &lt;element name="trainRadios" type="{https://www.railml.org/schemas/3.1}TrainRadios" minOccurs="0"/&gt;
 *         &lt;element name="underCrossings" type="{https://www.railml.org/schemas/3.1}UnderCrossings" minOccurs="0"/&gt;
 *         &lt;element name="weightLimits" type="{https://www.railml.org/schemas/3.1}WeightLimits" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalInfrastructure", propOrder = {
    "balises",
    "borders",
    "bufferStops",
    "crossings",
    "derailersIS",
    "electrifications",
    "keyLocksIS",
    "levelCrossingsIS",
    "lines",
    "loadingGauges",
    "operationalPoints",
    "overCrossings",
    "platforms",
    "restrictionAreas",
    "serviceSections",
    "signalsIS",
    "speeds",
    "stoppingPlaces",
    "switchesIS",
    "tracks",
    "trackBeds",
    "trackGauges",
    "trainDetectionElements",
    "trainProtectionElements",
    "trainRadios",
    "underCrossings",
    "weightLimits",
    "any2"
})
public class FunctionalInfrastructure {

    protected Balises balises;
    protected Borders borders;
    protected BufferStops bufferStops;
    protected Crossings crossings;
    protected DerailersIS derailersIS;
    protected Electrifications electrifications;
    protected KeyLocksIS keyLocksIS;
    protected LevelCrossingsIS levelCrossingsIS;
    protected Lines lines;
    protected LoadingGauges loadingGauges;
    protected OperationalPoints operationalPoints;
    protected OverCrossings overCrossings;
    protected Platforms platforms;
    protected RestrictionAreas restrictionAreas;
    protected ServiceSections serviceSections;
    protected SignalsIS signalsIS;
    protected Speeds speeds;
    protected StoppingPlaces stoppingPlaces;
    protected SwitchesIS switchesIS;
    protected Tracks tracks;
    protected TrackBeds trackBeds;
    protected TrackGauges trackGauges;
    protected TrainDetectionElements trainDetectionElements;
    protected TrainProtectionElements trainProtectionElements;
    protected TrainRadios trainRadios;
    protected UnderCrossings underCrossings;
    protected WeightLimits weightLimits;
    @XmlAnyElement(lax = true)
    protected List<Object> any2;

    /**
     * Gets the value of the balises property.
     * 
     * @return
     *     possible object is
     *     {@link Balises }
     *     
     */
    public Balises getBalises() {
        return balises;
    }

    /**
     * Sets the value of the balises property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balises }
     *     
     */
    public void setBalises(Balises value) {
        this.balises = value;
    }

    /**
     * Gets the value of the borders property.
     * 
     * @return
     *     possible object is
     *     {@link Borders }
     *     
     */
    public Borders getBorders() {
        return borders;
    }

    /**
     * Sets the value of the borders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Borders }
     *     
     */
    public void setBorders(Borders value) {
        this.borders = value;
    }

    /**
     * Gets the value of the bufferStops property.
     * 
     * @return
     *     possible object is
     *     {@link BufferStops }
     *     
     */
    public BufferStops getBufferStops() {
        return bufferStops;
    }

    /**
     * Sets the value of the bufferStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferStops }
     *     
     */
    public void setBufferStops(BufferStops value) {
        this.bufferStops = value;
    }

    /**
     * Gets the value of the crossings property.
     * 
     * @return
     *     possible object is
     *     {@link Crossings }
     *     
     */
    public Crossings getCrossings() {
        return crossings;
    }

    /**
     * Sets the value of the crossings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crossings }
     *     
     */
    public void setCrossings(Crossings value) {
        this.crossings = value;
    }

    /**
     * Gets the value of the derailersIS property.
     * 
     * @return
     *     possible object is
     *     {@link DerailersIS }
     *     
     */
    public DerailersIS getDerailersIS() {
        return derailersIS;
    }

    /**
     * Sets the value of the derailersIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerailersIS }
     *     
     */
    public void setDerailersIS(DerailersIS value) {
        this.derailersIS = value;
    }

    /**
     * Gets the value of the electrifications property.
     * 
     * @return
     *     possible object is
     *     {@link Electrifications }
     *     
     */
    public Electrifications getElectrifications() {
        return electrifications;
    }

    /**
     * Sets the value of the electrifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Electrifications }
     *     
     */
    public void setElectrifications(Electrifications value) {
        this.electrifications = value;
    }

    /**
     * Gets the value of the keyLocksIS property.
     * 
     * @return
     *     possible object is
     *     {@link KeyLocksIS }
     *     
     */
    public KeyLocksIS getKeyLocksIS() {
        return keyLocksIS;
    }

    /**
     * Sets the value of the keyLocksIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyLocksIS }
     *     
     */
    public void setKeyLocksIS(KeyLocksIS value) {
        this.keyLocksIS = value;
    }

    /**
     * Gets the value of the levelCrossingsIS property.
     * 
     * @return
     *     possible object is
     *     {@link LevelCrossingsIS }
     *     
     */
    public LevelCrossingsIS getLevelCrossingsIS() {
        return levelCrossingsIS;
    }

    /**
     * Sets the value of the levelCrossingsIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelCrossingsIS }
     *     
     */
    public void setLevelCrossingsIS(LevelCrossingsIS value) {
        this.levelCrossingsIS = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link Lines }
     *     
     */
    public Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lines }
     *     
     */
    public void setLines(Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the loadingGauges property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingGauges }
     *     
     */
    public LoadingGauges getLoadingGauges() {
        return loadingGauges;
    }

    /**
     * Sets the value of the loadingGauges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingGauges }
     *     
     */
    public void setLoadingGauges(LoadingGauges value) {
        this.loadingGauges = value;
    }

    /**
     * Gets the value of the operationalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalPoints }
     *     
     */
    public OperationalPoints getOperationalPoints() {
        return operationalPoints;
    }

    /**
     * Sets the value of the operationalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalPoints }
     *     
     */
    public void setOperationalPoints(OperationalPoints value) {
        this.operationalPoints = value;
    }

    /**
     * Gets the value of the overCrossings property.
     * 
     * @return
     *     possible object is
     *     {@link OverCrossings }
     *     
     */
    public OverCrossings getOverCrossings() {
        return overCrossings;
    }

    /**
     * Sets the value of the overCrossings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverCrossings }
     *     
     */
    public void setOverCrossings(OverCrossings value) {
        this.overCrossings = value;
    }

    /**
     * Gets the value of the platforms property.
     * 
     * @return
     *     possible object is
     *     {@link Platforms }
     *     
     */
    public Platforms getPlatforms() {
        return platforms;
    }

    /**
     * Sets the value of the platforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platforms }
     *     
     */
    public void setPlatforms(Platforms value) {
        this.platforms = value;
    }

    /**
     * Gets the value of the restrictionAreas property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionAreas }
     *     
     */
    public RestrictionAreas getRestrictionAreas() {
        return restrictionAreas;
    }

    /**
     * Sets the value of the restrictionAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionAreas }
     *     
     */
    public void setRestrictionAreas(RestrictionAreas value) {
        this.restrictionAreas = value;
    }

    /**
     * Gets the value of the serviceSections property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSections }
     *     
     */
    public ServiceSections getServiceSections() {
        return serviceSections;
    }

    /**
     * Sets the value of the serviceSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSections }
     *     
     */
    public void setServiceSections(ServiceSections value) {
        this.serviceSections = value;
    }

    /**
     * Gets the value of the signalsIS property.
     * 
     * @return
     *     possible object is
     *     {@link SignalsIS }
     *     
     */
    public SignalsIS getSignalsIS() {
        return signalsIS;
    }

    /**
     * Sets the value of the signalsIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalsIS }
     *     
     */
    public void setSignalsIS(SignalsIS value) {
        this.signalsIS = value;
    }

    /**
     * Gets the value of the speeds property.
     * 
     * @return
     *     possible object is
     *     {@link Speeds }
     *     
     */
    public Speeds getSpeeds() {
        return speeds;
    }

    /**
     * Sets the value of the speeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speeds }
     *     
     */
    public void setSpeeds(Speeds value) {
        this.speeds = value;
    }

    /**
     * Gets the value of the stoppingPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link StoppingPlaces }
     *     
     */
    public StoppingPlaces getStoppingPlaces() {
        return stoppingPlaces;
    }

    /**
     * Sets the value of the stoppingPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoppingPlaces }
     *     
     */
    public void setStoppingPlaces(StoppingPlaces value) {
        this.stoppingPlaces = value;
    }

    /**
     * Gets the value of the switchesIS property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchesIS }
     *     
     */
    public SwitchesIS getSwitchesIS() {
        return switchesIS;
    }

    /**
     * Sets the value of the switchesIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchesIS }
     *     
     */
    public void setSwitchesIS(SwitchesIS value) {
        this.switchesIS = value;
    }

    /**
     * Gets the value of the tracks property.
     * 
     * @return
     *     possible object is
     *     {@link Tracks }
     *     
     */
    public Tracks getTracks() {
        return tracks;
    }

    /**
     * Sets the value of the tracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracks }
     *     
     */
    public void setTracks(Tracks value) {
        this.tracks = value;
    }

    /**
     * Gets the value of the trackBeds property.
     * 
     * @return
     *     possible object is
     *     {@link TrackBeds }
     *     
     */
    public TrackBeds getTrackBeds() {
        return trackBeds;
    }

    /**
     * Sets the value of the trackBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackBeds }
     *     
     */
    public void setTrackBeds(TrackBeds value) {
        this.trackBeds = value;
    }

    /**
     * Gets the value of the trackGauges property.
     * 
     * @return
     *     possible object is
     *     {@link TrackGauges }
     *     
     */
    public TrackGauges getTrackGauges() {
        return trackGauges;
    }

    /**
     * Sets the value of the trackGauges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackGauges }
     *     
     */
    public void setTrackGauges(TrackGauges value) {
        this.trackGauges = value;
    }

    /**
     * Gets the value of the trainDetectionElements property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDetectionElements }
     *     
     */
    public TrainDetectionElements getTrainDetectionElements() {
        return trainDetectionElements;
    }

    /**
     * Sets the value of the trainDetectionElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDetectionElements }
     *     
     */
    public void setTrainDetectionElements(TrainDetectionElements value) {
        this.trainDetectionElements = value;
    }

    /**
     * Gets the value of the trainProtectionElements property.
     * 
     * @return
     *     possible object is
     *     {@link TrainProtectionElements }
     *     
     */
    public TrainProtectionElements getTrainProtectionElements() {
        return trainProtectionElements;
    }

    /**
     * Sets the value of the trainProtectionElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainProtectionElements }
     *     
     */
    public void setTrainProtectionElements(TrainProtectionElements value) {
        this.trainProtectionElements = value;
    }

    /**
     * Gets the value of the trainRadios property.
     * 
     * @return
     *     possible object is
     *     {@link TrainRadios }
     *     
     */
    public TrainRadios getTrainRadios() {
        return trainRadios;
    }

    /**
     * Sets the value of the trainRadios property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainRadios }
     *     
     */
    public void setTrainRadios(TrainRadios value) {
        this.trainRadios = value;
    }

    /**
     * Gets the value of the underCrossings property.
     * 
     * @return
     *     possible object is
     *     {@link UnderCrossings }
     *     
     */
    public UnderCrossings getUnderCrossings() {
        return underCrossings;
    }

    /**
     * Sets the value of the underCrossings property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderCrossings }
     *     
     */
    public void setUnderCrossings(UnderCrossings value) {
        this.underCrossings = value;
    }

    /**
     * Gets the value of the weightLimits property.
     * 
     * @return
     *     possible object is
     *     {@link WeightLimits }
     *     
     */
    public WeightLimits getWeightLimits() {
        return weightLimits;
    }

    /**
     * Sets the value of the weightLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightLimits }
     *     
     */
    public void setWeightLimits(WeightLimits value) {
        this.weightLimits = value;
    }

    /**
     * Gets the value of the any2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny2() {
        if (any2 == null) {
            any2 = new ArrayList<Object>();
        }
        return this.any2;
    }

}
