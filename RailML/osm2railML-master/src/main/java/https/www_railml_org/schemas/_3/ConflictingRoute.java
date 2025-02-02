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
 * Iness definition:
 * The route conflict table identifies the routes that may never be simultaneously allocated, due to utilisation of common track elements.
 * 
 * <p>Java class for ConflictingRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConflictingRoute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}EntityIL"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersToRoute" type="{https://www.railml.org/schemas/3.1}EntityILref"/&gt;
 *         &lt;element name="conflictsWithRoute" type="{https://www.railml.org/schemas/3.1}EntityILref" maxOccurs="unbounded"/&gt;
 *         &lt;element name="reasonForConflict" type="{https://www.railml.org/schemas/3.1}ConflictReason" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ConflictingRoute", propOrder = {
    "refersToRoute",
    "conflictsWithRoute",
    "reasonForConflict"
})
public class ConflictingRoute
    extends EntityIL
{

    @XmlElement(required = true)
    protected EntityILref refersToRoute;
    @XmlElement(required = true)
    protected List<EntityILref> conflictsWithRoute;
    protected List<ConflictReason> reasonForConflict;

    /**
     * Gets the value of the refersToRoute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getRefersToRoute() {
        return refersToRoute;
    }

    /**
     * Sets the value of the refersToRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setRefersToRoute(EntityILref value) {
        this.refersToRoute = value;
    }

    /**
     * Gets the value of the conflictsWithRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conflictsWithRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConflictsWithRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getConflictsWithRoute() {
        if (conflictsWithRoute == null) {
            conflictsWithRoute = new ArrayList<EntityILref>();
        }
        return this.conflictsWithRoute;
    }

    /**
     * Gets the value of the reasonForConflict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonForConflict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonForConflict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConflictReason }
     * 
     * 
     */
    public List<ConflictReason> getReasonForConflict() {
        if (reasonForConflict == null) {
            reasonForConflict = new ArrayList<ConflictReason>();
        }
        return this.reasonForConflict;
    }

}
