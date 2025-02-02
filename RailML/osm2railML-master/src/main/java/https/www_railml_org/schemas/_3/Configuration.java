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
 * general attributes of interlocking configuration
 * 
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}EntityIL"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="technologyType" use="required" type="{https://www.railml.org/schemas/3.1}tIxlTechnologyTypeListExt" /&gt;
 *       &lt;attribute name="SWversion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="signalSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration")
public class Configuration
    extends EntityIL
{

    @XmlAttribute(name = "model")
    protected String model;
    @XmlAttribute(name = "technologyType", required = true)
    protected String technologyType;
    @XmlAttribute(name = "SWversion")
    protected String sWversion;
    @XmlAttribute(name = "signalSystem")
    protected String signalSystem;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the technologyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyType() {
        return technologyType;
    }

    /**
     * Sets the value of the technologyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyType(String value) {
        this.technologyType = value;
    }

    /**
     * Gets the value of the sWversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWversion() {
        return sWversion;
    }

    /**
     * Sets the value of the sWversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWversion(String value) {
        this.sWversion = value;
    }

    /**
     * Gets the value of the signalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalSystem() {
        return signalSystem;
    }

    /**
     * Sets the value of the signalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalSystem(String value) {
        this.signalSystem = value;
    }

}
