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
 * reference to any detector and its state inside or outside the restricted area required for use
 * 
 * <p>Java class for DetectorInState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorInState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}EntityIL"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="givenState" type="{https://www.railml.org/schemas/3.1}DetectorAndGivenState"/&gt;
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
@XmlType(name = "DetectorInState", propOrder = {
    "givenState"
})
public class DetectorInState
    extends EntityIL
{

    @XmlElement(required = true)
    protected DetectorAndGivenState givenState;

    /**
     * Gets the value of the givenState property.
     * 
     * @return
     *     possible object is
     *     {@link DetectorAndGivenState }
     *     
     */
    public DetectorAndGivenState getGivenState() {
        return givenState;
    }

    /**
     * Sets the value of the givenState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetectorAndGivenState }
     *     
     */
    public void setGivenState(DetectorAndGivenState value) {
        this.givenState = value;
    }

}
