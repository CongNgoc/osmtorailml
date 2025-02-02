//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Overlap is set in lockstep with the route. The interlocking releases the overlap when it is safe to presume that an approaching train will not overrun a closed destination signal. When the train occupied the last section (or destination area), an overlap release timer starts running. The timer value is defined by operational rules and the approaching speed. Upon expiry, the interlocking releases the overlap. Overlap is released together with the route or after expiration of the release timer. Overlap is released after a defined time in a timer that starts from a timerTriggerPoint.
 * 
 * <p>Java class for OverlapRelease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverlapRelease"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}EntityIL"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="releaseTriggerSection" type="{https://www.railml.org/schemas/3.1}EntityILref" minOccurs="0"/&gt;
 *         &lt;element name="overlapReleaseTimer" type="{https://www.railml.org/schemas/3.1}OverlapReleaseTimer" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "OverlapRelease", propOrder = {
    "releaseTriggerSection",
    "overlapReleaseTimer"
})
public class OverlapRelease
    extends EntityIL
{

    protected EntityILref releaseTriggerSection;
    @XmlElement(required = true)
    protected List<OverlapReleaseTimer> overlapReleaseTimer;

    /**
     * Gets the value of the releaseTriggerSection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getReleaseTriggerSection() {
        return releaseTriggerSection;
    }

    /**
     * Sets the value of the releaseTriggerSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setReleaseTriggerSection(EntityILref value) {
        this.releaseTriggerSection = value;
    }

    /**
     * Gets the value of the overlapReleaseTimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overlapReleaseTimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlapReleaseTimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverlapReleaseTimer }
     * 
     * 
     */
    public List<OverlapReleaseTimer> getOverlapReleaseTimer() {
        if (overlapReleaseTimer == null) {
            overlapReleaseTimer = new ArrayList<OverlapReleaseTimer>();
        }
        return this.overlapReleaseTimer;
    }

}
