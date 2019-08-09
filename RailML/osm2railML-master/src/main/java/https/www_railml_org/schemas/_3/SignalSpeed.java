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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}SignalX"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersToBeginOfSpeedSection" type="{https://www.railml.org/schemas/3.1}tElementWithIDref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="refersToEndOfSpeedSection" type="{https://www.railml.org/schemas/3.1}tElementWithIDref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{https://www.railml.org/schemas/3.1}tSignalSpeedType" /&gt;
 *       &lt;attribute name="trainRelation" type="{https://www.railml.org/schemas/3.1}tTrainRelation" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalSpeed", propOrder = {
    "refersToBeginOfSpeedSection",
    "refersToEndOfSpeedSection"
})
public class SignalSpeed
    extends SignalX
{

    protected List<TElementWithIDref> refersToBeginOfSpeedSection;
    protected List<TElementWithIDref> refersToEndOfSpeedSection;
    @XmlAttribute(name = "type")
    protected TSignalSpeedType type;
    @XmlAttribute(name = "trainRelation")
    protected TTrainRelation trainRelation;

    /**
     * Gets the value of the refersToBeginOfSpeedSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refersToBeginOfSpeedSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersToBeginOfSpeedSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TElementWithIDref }
     * 
     * 
     */
    public List<TElementWithIDref> getRefersToBeginOfSpeedSection() {
        if (refersToBeginOfSpeedSection == null) {
            refersToBeginOfSpeedSection = new ArrayList<TElementWithIDref>();
        }
        return this.refersToBeginOfSpeedSection;
    }

    /**
     * Gets the value of the refersToEndOfSpeedSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refersToEndOfSpeedSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersToEndOfSpeedSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TElementWithIDref }
     * 
     * 
     */
    public List<TElementWithIDref> getRefersToEndOfSpeedSection() {
        if (refersToEndOfSpeedSection == null) {
            refersToEndOfSpeedSection = new ArrayList<TElementWithIDref>();
        }
        return this.refersToEndOfSpeedSection;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TSignalSpeedType }
     *     
     */
    public TSignalSpeedType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSignalSpeedType }
     *     
     */
    public void setType(TSignalSpeedType value) {
        this.type = value;
    }

    /**
     * Gets the value of the trainRelation property.
     * 
     * @return
     *     possible object is
     *     {@link TTrainRelation }
     *     
     */
    public TTrainRelation getTrainRelation() {
        return trainRelation;
    }

    /**
     * Sets the value of the trainRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTrainRelation }
     *     
     */
    public void setTrainRelation(TTrainRelation value) {
        this.trainRelation = value;
    }

}
