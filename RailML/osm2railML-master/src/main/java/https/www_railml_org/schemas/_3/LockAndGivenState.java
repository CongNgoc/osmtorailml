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
 * the tuple of references to the key lock and its state plus the level of enforcement
 * 
 * <p>Java class for LockAndGivenState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LockAndGivenState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}AssetAndGivenState"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedLockAndState" type="{https://www.railml.org/schemas/3.1}LockAndState"/&gt;
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
@XmlType(name = "LockAndGivenState", propOrder = {
    "relatedLockAndState"
})
public class LockAndGivenState
    extends AssetAndGivenState
{

    @XmlElement(required = true)
    protected LockAndState relatedLockAndState;

    /**
     * Gets the value of the relatedLockAndState property.
     * 
     * @return
     *     possible object is
     *     {@link LockAndState }
     *     
     */
    public LockAndState getRelatedLockAndState() {
        return relatedLockAndState;
    }

    /**
     * Sets the value of the relatedLockAndState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockAndState }
     *     
     */
    public void setRelatedLockAndState(LockAndState value) {
        this.relatedLockAndState = value;
    }

}
