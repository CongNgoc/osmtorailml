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
 * <p>Java class for SignalCatenary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalCatenary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}SignalX"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersToElectrificationSection" type="{https://www.railml.org/schemas/3.1}tElementWithIDref" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{https://www.railml.org/schemas/3.1}tSignalCatenaryType" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalCatenary", propOrder = {
    "refersToElectrificationSection"
})
public class SignalCatenary
    extends SignalX
{

    protected TElementWithIDref refersToElectrificationSection;
    @XmlAttribute(name = "type")
    protected TSignalCatenaryType type;

    /**
     * Gets the value of the refersToElectrificationSection property.
     * 
     * @return
     *     possible object is
     *     {@link TElementWithIDref }
     *     
     */
    public TElementWithIDref getRefersToElectrificationSection() {
        return refersToElectrificationSection;
    }

    /**
     * Sets the value of the refersToElectrificationSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TElementWithIDref }
     *     
     */
    public void setRefersToElectrificationSection(TElementWithIDref value) {
        this.refersToElectrificationSection = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TSignalCatenaryType }
     *     
     */
    public TSignalCatenaryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSignalCatenaryType }
     *     
     */
    public void setType(TSignalCatenaryType value) {
        this.type = value;
    }

}
