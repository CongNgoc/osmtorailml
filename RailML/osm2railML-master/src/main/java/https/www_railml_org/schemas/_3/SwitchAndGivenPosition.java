//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * the tuple of references to the switch and its position plus the level of enforcement
 * 
 * <p>Java class for SwitchAndGivenPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwitchAndGivenPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}AssetAndGivenState"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedSwitchAndPosition" type="{https://www.railml.org/schemas/3.1}SwitchAndPosition"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchAndGivenPosition", propOrder = {
    "relatedSwitchAndPosition"
})
public class SwitchAndGivenPosition
    extends AssetAndGivenState
{

    @XmlElement(required = true)
    protected SwitchAndPosition relatedSwitchAndPosition;

    /**
     * Gets the value of the relatedSwitchAndPosition property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchAndPosition }
     *     
     */
    public SwitchAndPosition getRelatedSwitchAndPosition() {
        return relatedSwitchAndPosition;
    }

    /**
     * Sets the value of the relatedSwitchAndPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchAndPosition }
     *     
     */
    public void setRelatedSwitchAndPosition(SwitchAndPosition value) {
        this.relatedSwitchAndPosition = value;
    }

}
