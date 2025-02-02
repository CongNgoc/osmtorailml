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
 * Extends the infrastructure::switch for IXL purposes. The graph model from RailTopoModel allows the definition of connections between tracks. Thus, one can include or exclude connections between tracks. The name SwitchIL is chosen to reconcile US nomenclature and to avoid a naming conflict with infrastructure domain.
 * 
 * <p>Java class for SwitchIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwitchIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}MovableElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasFoulingTrainDetectors" type="{https://www.railml.org/schemas/3.1}EntityILref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="branchLeft" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="branchRight" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="hasPositionRestriction" type="{https://www.railml.org/schemas/3.1}SwitchPositionRestriction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="preferredPosition" type="{https://www.railml.org/schemas/3.1}tSwitchPosition" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchIL", propOrder = {
    "hasFoulingTrainDetectors",
    "branchLeft",
    "branchRight",
    "hasPositionRestriction"
})
public class SwitchIL
    extends MovableElement
{

    protected List<EntityILref> hasFoulingTrainDetectors;
    @XmlElement(required = true)
    protected EntityILref branchLeft;
    @XmlElement(required = true)
    protected EntityILref branchRight;
    protected SwitchPositionRestriction hasPositionRestriction;
    @XmlAttribute(name = "preferredPosition")
    protected TSwitchPosition preferredPosition;

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
     * Gets the value of the branchLeft property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getBranchLeft() {
        return branchLeft;
    }

    /**
     * Sets the value of the branchLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setBranchLeft(EntityILref value) {
        this.branchLeft = value;
    }

    /**
     * Gets the value of the branchRight property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getBranchRight() {
        return branchRight;
    }

    /**
     * Sets the value of the branchRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setBranchRight(EntityILref value) {
        this.branchRight = value;
    }

    /**
     * Gets the value of the hasPositionRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchPositionRestriction }
     *     
     */
    public SwitchPositionRestriction getHasPositionRestriction() {
        return hasPositionRestriction;
    }

    /**
     * Sets the value of the hasPositionRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchPositionRestriction }
     *     
     */
    public void setHasPositionRestriction(SwitchPositionRestriction value) {
        this.hasPositionRestriction = value;
    }

    /**
     * Gets the value of the preferredPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TSwitchPosition }
     *     
     */
    public TSwitchPosition getPreferredPosition() {
        return preferredPosition;
    }

    /**
     * Sets the value of the preferredPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSwitchPosition }
     *     
     */
    public void setPreferredPosition(TSwitchPosition value) {
        this.preferredPosition = value;
    }

}
