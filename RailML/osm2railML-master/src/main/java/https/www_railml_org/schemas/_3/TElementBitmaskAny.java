//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tElementBitmaskAny complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tElementBitmaskAny"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="bitmask" type="{https://www.railml.org/schemas/3.1}tBitmaskAny" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tElementBitmaskAny")
public class TElementBitmaskAny {

    @XmlAttribute(name = "bitmask")
    protected String bitmask;

    /**
     * Gets the value of the bitmask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitmask() {
        return bitmask;
    }

    /**
     * Sets the value of the bitmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitmask(String value) {
        this.bitmask = value;
    }

}
