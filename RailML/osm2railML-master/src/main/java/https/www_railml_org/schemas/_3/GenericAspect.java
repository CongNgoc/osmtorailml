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
 * A signal aspect according to the IM regulations. Each aspect is given a unique identifier, a name, e.g. Vr-6 and description e.g. warning signal - expect stop (Vorsignal Halt erwarten). This element allows a generic classification of each aspect. The aspect can include speed information.
 * 
 * <p>Java class for GenericAspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericAspect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}EntityIL"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="genericAspect" use="required" type="{https://www.railml.org/schemas/3.1}tGenericAspectList" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAspect")
public class GenericAspect
    extends EntityIL
{

    @XmlAttribute(name = "genericAspect", required = true)
    protected TGenericAspectList genericAspect;

    /**
     * Gets the value of the genericAspect property.
     * 
     * @return
     *     possible object is
     *     {@link TGenericAspectList }
     *     
     */
    public TGenericAspectList getGenericAspect() {
        return genericAspect;
    }

    /**
     * Sets the value of the genericAspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGenericAspectList }
     *     
     */
    public void setGenericAspect(TGenericAspectList value) {
        this.genericAspect = value;
    }

}
