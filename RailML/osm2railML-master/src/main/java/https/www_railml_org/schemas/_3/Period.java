//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="period" type="{https://www.railml.org/schemas/3.1}CalendarTimePeriod" minOccurs="0"/&gt;
 *           &lt;element name="periodBitmask" type="{https://www.railml.org/schemas/3.1}CalendarTimePeriodWithBitmask" minOccurs="0"/&gt;
 *           &lt;element name="periodGeneric" type="{https://www.railml.org/schemas/3.1}GenericTimePeriod" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "period",
    "periodBitmask",
    "periodGeneric"
})
public class Period {

    protected CalendarTimePeriod period;
    protected CalendarTimePeriodWithBitmask periodBitmask;
    protected GenericTimePeriod periodGeneric;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarTimePeriod }
     *     
     */
    public CalendarTimePeriod getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarTimePeriod }
     *     
     */
    public void setPeriod(CalendarTimePeriod value) {
        this.period = value;
    }

    /**
     * Gets the value of the periodBitmask property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarTimePeriodWithBitmask }
     *     
     */
    public CalendarTimePeriodWithBitmask getPeriodBitmask() {
        return periodBitmask;
    }

    /**
     * Sets the value of the periodBitmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarTimePeriodWithBitmask }
     *     
     */
    public void setPeriodBitmask(CalendarTimePeriodWithBitmask value) {
        this.periodBitmask = value;
    }

    /**
     * Gets the value of the periodGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link GenericTimePeriod }
     *     
     */
    public GenericTimePeriod getPeriodGeneric() {
        return periodGeneric;
    }

    /**
     * Sets the value of the periodGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericTimePeriod }
     *     
     */
    public void setPeriodGeneric(GenericTimePeriod value) {
        this.periodGeneric = value;
    }

}
