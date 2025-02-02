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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinePerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinePerformance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowedLoadingGauge" type="{https://www.railml.org/schemas/3.1}tElementWithIDref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowedWeight" type="{https://www.railml.org/schemas/3.1}tElementWithIDref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="maxSpeed" type="{https://www.railml.org/schemas/3.1}tSpeedKmPerHour" /&gt;
 *       &lt;attribute name="maxTrainLength" type="{https://www.railml.org/schemas/3.1}tLengthM" /&gt;
 *       &lt;attribute name="usablePlatformLength" type="{https://www.railml.org/schemas/3.1}tLengthM" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinePerformance", propOrder = {
    "allowedLoadingGauge",
    "allowedWeight"
})
public class LinePerformance {

    protected List<TElementWithIDref> allowedLoadingGauge;
    protected List<TElementWithIDref> allowedWeight;
    @XmlAttribute(name = "maxSpeed")
    protected BigDecimal maxSpeed;
    @XmlAttribute(name = "maxTrainLength")
    protected BigDecimal maxTrainLength;
    @XmlAttribute(name = "usablePlatformLength")
    protected BigDecimal usablePlatformLength;

    /**
     * Gets the value of the allowedLoadingGauge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedLoadingGauge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedLoadingGauge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TElementWithIDref }
     * 
     * 
     */
    public List<TElementWithIDref> getAllowedLoadingGauge() {
        if (allowedLoadingGauge == null) {
            allowedLoadingGauge = new ArrayList<TElementWithIDref>();
        }
        return this.allowedLoadingGauge;
    }

    /**
     * Gets the value of the allowedWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TElementWithIDref }
     * 
     * 
     */
    public List<TElementWithIDref> getAllowedWeight() {
        if (allowedWeight == null) {
            allowedWeight = new ArrayList<TElementWithIDref>();
        }
        return this.allowedWeight;
    }

    /**
     * Gets the value of the maxSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the value of the maxSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSpeed(BigDecimal value) {
        this.maxSpeed = value;
    }

    /**
     * Gets the value of the maxTrainLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTrainLength() {
        return maxTrainLength;
    }

    /**
     * Sets the value of the maxTrainLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTrainLength(BigDecimal value) {
        this.maxTrainLength = value;
    }

    /**
     * Gets the value of the usablePlatformLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsablePlatformLength() {
        return usablePlatformLength;
    }

    /**
     * Sets the value of the usablePlatformLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsablePlatformLength(BigDecimal value) {
        this.usablePlatformLength = value;
    }

}
