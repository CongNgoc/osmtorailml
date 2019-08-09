//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * Details for timing the overlap release.
 * 
 * <p>Java class for OverlapReleaseTimer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverlapReleaseTimer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://www.railml.org/schemas/3.1}anyAttribute"/&gt;
 *       &lt;attribute name="timerValue" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="overlapReleaseCondition" type="{https://www.railml.org/schemas/3.1}tOverlapReleaseCondition" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverlapReleaseTimer")
public class OverlapReleaseTimer {

    @XmlAttribute(name = "timerValue", required = true)
    protected Duration timerValue;
    @XmlAttribute(name = "overlapReleaseCondition")
    protected TOverlapReleaseCondition overlapReleaseCondition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the timerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimerValue() {
        return timerValue;
    }

    /**
     * Sets the value of the timerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimerValue(Duration value) {
        this.timerValue = value;
    }

    /**
     * Gets the value of the overlapReleaseCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TOverlapReleaseCondition }
     *     
     */
    public TOverlapReleaseCondition getOverlapReleaseCondition() {
        return overlapReleaseCondition;
    }

    /**
     * Sets the value of the overlapReleaseCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOverlapReleaseCondition }
     *     
     */
    public void setOverlapReleaseCondition(TOverlapReleaseCondition value) {
        this.overlapReleaseCondition = value;
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
