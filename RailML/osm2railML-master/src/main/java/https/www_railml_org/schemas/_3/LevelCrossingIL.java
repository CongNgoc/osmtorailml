//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * A level crossing (LX) is activated, i.e. requested to close for road traffic, upon train approach. This happens when the train crosses a detection point, i.e. an insulated track joint, axle counter or treadle. These approach detectors are commonly referred to as Approach Starting (AS).
 * 
 * <p>Java class for LevelCrossingIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LevelCrossingIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}TrackAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasInterface" type="{https://www.railml.org/schemas/3.1}EntityILref" minOccurs="0"/&gt;
 *         &lt;element name="isLevelCrossingType" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="refersTo" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="deactivatedBy" type="{https://www.railml.org/schemas/3.1}LevelCrossingDeactivator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="activationCondition" type="{https://www.railml.org/schemas/3.1}ActivationCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasTvdSection" type="{https://www.railml.org/schemas/3.1}EntityILref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="preferredPosition" type="{https://www.railml.org/schemas/3.1}tLevelCrossingState" /&gt;
 *       &lt;attribute name="unprotectedSpeed" type="{https://www.railml.org/schemas/3.1}tSpeedKmPerHour" /&gt;
 *       &lt;attribute name="typicalTimeToClose" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="constantWarningTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="minimumOpenTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="maximumClosedTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="requiresStopBeforeUnprotectedLevelCrossing" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevelCrossingIL", propOrder = {
    "hasInterface",
    "isLevelCrossingType",
    "refersTo",
    "deactivatedBy",
    "activationCondition",
    "hasTvdSection"
})
public class LevelCrossingIL
    extends TrackAsset
{

    protected EntityILref hasInterface;
    @XmlElement(required = true)
    protected EntityILref isLevelCrossingType;
    @XmlElement(required = true)
    protected EntityILref refersTo;
    protected List<LevelCrossingDeactivator> deactivatedBy;
    protected List<ActivationCondition> activationCondition;
    protected List<EntityILref> hasTvdSection;
    @XmlAttribute(name = "preferredPosition")
    protected TLevelCrossingState preferredPosition;
    @XmlAttribute(name = "unprotectedSpeed")
    protected BigDecimal unprotectedSpeed;
    @XmlAttribute(name = "typicalTimeToClose", required = true)
    protected Duration typicalTimeToClose;
    @XmlAttribute(name = "constantWarningTime")
    protected Duration constantWarningTime;
    @XmlAttribute(name = "minimumOpenTime")
    protected Duration minimumOpenTime;
    @XmlAttribute(name = "maximumClosedTime")
    protected Duration maximumClosedTime;
    @XmlAttribute(name = "requiresStopBeforeUnprotectedLevelCrossing")
    protected Boolean requiresStopBeforeUnprotectedLevelCrossing;

    /**
     * Gets the value of the hasInterface property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getHasInterface() {
        return hasInterface;
    }

    /**
     * Sets the value of the hasInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setHasInterface(EntityILref value) {
        this.hasInterface = value;
    }

    /**
     * Gets the value of the isLevelCrossingType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getIsLevelCrossingType() {
        return isLevelCrossingType;
    }

    /**
     * Sets the value of the isLevelCrossingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setIsLevelCrossingType(EntityILref value) {
        this.isLevelCrossingType = value;
    }

    /**
     * Gets the value of the refersTo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getRefersTo() {
        return refersTo;
    }

    /**
     * Sets the value of the refersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setRefersTo(EntityILref value) {
        this.refersTo = value;
    }

    /**
     * Gets the value of the deactivatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deactivatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeactivatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelCrossingDeactivator }
     * 
     * 
     */
    public List<LevelCrossingDeactivator> getDeactivatedBy() {
        if (deactivatedBy == null) {
            deactivatedBy = new ArrayList<LevelCrossingDeactivator>();
        }
        return this.deactivatedBy;
    }

    /**
     * Gets the value of the activationCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivationCondition }
     * 
     * 
     */
    public List<ActivationCondition> getActivationCondition() {
        if (activationCondition == null) {
            activationCondition = new ArrayList<ActivationCondition>();
        }
        return this.activationCondition;
    }

    /**
     * Gets the value of the hasTvdSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasTvdSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasTvdSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getHasTvdSection() {
        if (hasTvdSection == null) {
            hasTvdSection = new ArrayList<EntityILref>();
        }
        return this.hasTvdSection;
    }

    /**
     * Gets the value of the preferredPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TLevelCrossingState }
     *     
     */
    public TLevelCrossingState getPreferredPosition() {
        return preferredPosition;
    }

    /**
     * Sets the value of the preferredPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLevelCrossingState }
     *     
     */
    public void setPreferredPosition(TLevelCrossingState value) {
        this.preferredPosition = value;
    }

    /**
     * Gets the value of the unprotectedSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnprotectedSpeed() {
        return unprotectedSpeed;
    }

    /**
     * Sets the value of the unprotectedSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnprotectedSpeed(BigDecimal value) {
        this.unprotectedSpeed = value;
    }

    /**
     * Gets the value of the typicalTimeToClose property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTypicalTimeToClose() {
        return typicalTimeToClose;
    }

    /**
     * Sets the value of the typicalTimeToClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTypicalTimeToClose(Duration value) {
        this.typicalTimeToClose = value;
    }

    /**
     * Gets the value of the constantWarningTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getConstantWarningTime() {
        return constantWarningTime;
    }

    /**
     * Sets the value of the constantWarningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setConstantWarningTime(Duration value) {
        this.constantWarningTime = value;
    }

    /**
     * Gets the value of the minimumOpenTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumOpenTime() {
        return minimumOpenTime;
    }

    /**
     * Sets the value of the minimumOpenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumOpenTime(Duration value) {
        this.minimumOpenTime = value;
    }

    /**
     * Gets the value of the maximumClosedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumClosedTime() {
        return maximumClosedTime;
    }

    /**
     * Sets the value of the maximumClosedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumClosedTime(Duration value) {
        this.maximumClosedTime = value;
    }

    /**
     * Gets the value of the requiresStopBeforeUnprotectedLevelCrossing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresStopBeforeUnprotectedLevelCrossing() {
        return requiresStopBeforeUnprotectedLevelCrossing;
    }

    /**
     * Sets the value of the requiresStopBeforeUnprotectedLevelCrossing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresStopBeforeUnprotectedLevelCrossing(Boolean value) {
        this.requiresStopBeforeUnprotectedLevelCrossing = value;
    }

}
