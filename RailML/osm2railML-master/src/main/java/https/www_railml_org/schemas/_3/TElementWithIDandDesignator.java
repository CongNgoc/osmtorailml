//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tElementWithIDandDesignator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tElementWithIDandDesignator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}tElementWithID"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designator" type="{https://www.railml.org/schemas/3.1}Designator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tElementWithIDandDesignator", propOrder = {
    "designator"
})
@XmlSeeAlso({
    EntityIL.class
})
public class TElementWithIDandDesignator
    extends TElementWithID
{

    protected Designator designator;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link Designator }
     *     
     */
    public Designator getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designator }
     *     
     */
    public void setDesignator(Designator value) {
        this.designator = value;
    }

}
