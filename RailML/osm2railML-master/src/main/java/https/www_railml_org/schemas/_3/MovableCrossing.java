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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Crossings are a special item for interlockings as a position is required for them even if there is no really movable item trackside.
 * Some crossings, especially high speed ones, have a movable frog to close the gap at the crossing (UK: movable nose crossing, DE: Herzstück mit beweglicher Spitze, NL: kruising met beweegbaar puntstuk). Unlike a switch, such a movable frog will not send the train left or right but it does guide the train. Thus the position is essential for avoiding derailment. Do not confound this class with ordinary double or single slip switches. The latter are regarded as two back-to-back switches.
 * 
 * <p>Java class for MovableCrossing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovableCrossing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}MovableElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="branchUpLeft" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="branchUpRight" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="branchDownLeft" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="branchDownRight" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="hasFoulingTrainDetectors" type="{https://www.railml.org/schemas/3.1}EntityILref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="preferredPosition" type="{https://www.railml.org/schemas/3.1}tCrossingPosition" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovableCrossing", propOrder = {
    "branchUpLeft",
    "branchUpRight",
    "branchDownLeft",
    "branchDownRight",
    "hasFoulingTrainDetectors"
})
public class MovableCrossing
    extends MovableElement
{

    @XmlElement(required = true)
    protected EntityILref branchUpLeft;
    @XmlElement(required = true)
    protected EntityILref branchUpRight;
    @XmlElement(required = true)
    protected EntityILref branchDownLeft;
    @XmlElement(required = true)
    protected EntityILref branchDownRight;
    protected List<EntityILref> hasFoulingTrainDetectors;
    @XmlAttribute(name = "preferredPosition")
    protected TCrossingPosition preferredPosition;

    /**
     * Gets the value of the branchUpLeft property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getBranchUpLeft() {
        return branchUpLeft;
    }

    /**
     * Sets the value of the branchUpLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setBranchUpLeft(EntityILref value) {
        this.branchUpLeft = value;
    }

    /**
     * Gets the value of the branchUpRight property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getBranchUpRight() {
        return branchUpRight;
    }

    /**
     * Sets the value of the branchUpRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setBranchUpRight(EntityILref value) {
        this.branchUpRight = value;
    }

    /**
     * Gets the value of the branchDownLeft property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getBranchDownLeft() {
        return branchDownLeft;
    }

    /**
     * Sets the value of the branchDownLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setBranchDownLeft(EntityILref value) {
        this.branchDownLeft = value;
    }

    /**
     * Gets the value of the branchDownRight property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getBranchDownRight() {
        return branchDownRight;
    }

    /**
     * Sets the value of the branchDownRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setBranchDownRight(EntityILref value) {
        this.branchDownRight = value;
    }

    /**
     * Gets the value of the hasFoulingTrainDetectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasFoulingTrainDetectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasFoulingTrainDetectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getHasFoulingTrainDetectors() {
        if (hasFoulingTrainDetectors == null) {
            hasFoulingTrainDetectors = new ArrayList<EntityILref>();
        }
        return this.hasFoulingTrainDetectors;
    }

    /**
     * Gets the value of the preferredPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TCrossingPosition }
     *     
     */
    public TCrossingPosition getPreferredPosition() {
        return preferredPosition;
    }

    /**
     * Sets the value of the preferredPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCrossingPosition }
     *     
     */
    public void setPreferredPosition(TCrossingPosition value) {
        this.preferredPosition = value;
    }

}
