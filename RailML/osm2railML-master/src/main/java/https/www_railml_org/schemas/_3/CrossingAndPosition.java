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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tuple of crossing element and its (logical) position.
 * 
 * <p>Java class for CrossingAndPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossingAndPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}AssetAndState"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersToCrossing" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="inPosition" use="required" type="{https://www.railml.org/schemas/3.1}tCrossingPosition" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossingAndPosition", propOrder = {
    "refersToCrossing"
})
public class CrossingAndPosition
    extends AssetAndState
{

    @XmlElement(required = true)
    protected EntityILref refersToCrossing;
    @XmlAttribute(name = "inPosition", required = true)
    protected TCrossingPosition inPosition;

    /**
     * Gets the value of the refersToCrossing property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getRefersToCrossing() {
        return refersToCrossing;
    }

    /**
     * Sets the value of the refersToCrossing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setRefersToCrossing(EntityILref value) {
        this.refersToCrossing = value;
    }

    /**
     * Gets the value of the inPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TCrossingPosition }
     *     
     */
    public TCrossingPosition getInPosition() {
        return inPosition;
    }

    /**
     * Sets the value of the inPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCrossingPosition }
     *     
     */
    public void setInPosition(TCrossingPosition value) {
        this.inPosition = value;
    }

}
