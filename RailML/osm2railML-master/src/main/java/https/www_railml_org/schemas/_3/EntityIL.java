//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * base type for normal elements in IL providing attributes @id and @name plus the possibility to add an anyAttribute
 * 
 * <p>Java class for EntityIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}tElementWithIDandDesignator"&gt;
 *       &lt;sequence&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://www.railml.org/schemas/3.1}anyAttribute"/&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityIL", propOrder = {
    "any"
})
@XmlSeeAlso({
    AssetsForIL.class,
    RouteRelation.class,
    ConflictingRoute.class,
    Key.class,
    Controller.class,
    GenericIM.class,
    Configuration.class,
    RouteActivationSection.class,
    RouteEntry.class,
    RouteExit.class,
    DangerPoint.class,
    Overlap.class,
    OverlapRelease.class,
    TrackAssetConnectedToIL.class,
    GenericRouteType.class,
    GenericAspect.class,
    GenericResetStrategy.class,
    SignalPlan.class,
    AspectRelation.class,
    PartialRoute.class,
    ActivationCondition.class,
    SignalDelayTime.class,
    ApproachStartingDetector.class,
    LevelCrossingDeactivator.class,
    SystemAssetConnectedToIL.class,
    ConflictReason.class,
    LevelCrossingTypeList.class,
    CombinedRoute.class,
    Interface.class,
    InputOutput.class,
    TrackAsset.class,
    ControlledSignalBox.class,
    SwitchPositionRestriction.class,
    ElementGroupingTypes.class,
    PowerSupplyIL.class,
    InterlockingInterface.class,
    SwitchInPosition.class,
    ElementGroup.class,
    DetectorTypes.class,
    AssetAndState.class,
    AssetAndGivenState.class,
    DerailerInPosition.class,
    CrossingInPosition.class,
    DetectorInState.class,
    SignalWithAspect.class,
    KeyLockInState.class,
    LevelCrossingInState.class,
    SignalBox.class
})
public class EntityIL
    extends TElementWithIDandDesignator
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
