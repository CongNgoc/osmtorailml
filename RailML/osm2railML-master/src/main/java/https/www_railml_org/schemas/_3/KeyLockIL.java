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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * A device, also known as key lock (de: Schlüsselschalter) situated near the track. It is used to request local control of a (group of) track assets from the interlocking. Commonly, staff requests local control from the interlocking via this device. Once granted, the key can be removed upon which the (group of) track asset is no longer under interlocking control. In reverse, the interlocking takes back control when the key is inserted and staff acknowledged relinquishing control. Note that the lock is a track asset defined in infrastructure namespace. The interlocking reads the state of the lock and returns permission to remove the key, i.e. levelOfControl=fullControl. A combined lock has a master lock that controls a set of slave locks. Slave locks may have to be released in a well-defined sequence.
 * 
 * <p>Java class for KeyLockIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyLockIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}LogicalDevice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptsKey" type="{https://www.railml.org/schemas/3.1}EntityILref" minOccurs="0"/&gt;
 *         &lt;element name="hasTvdSection" type="{https://www.railml.org/schemas/3.1}EntityILref" minOccurs="0"/&gt;
 *         &lt;element name="hasSlaveLock" type="{https://www.railml.org/schemas/3.1}EntityILref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hasAutomaticKeyRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hasAutomaticKeyLock" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="keyRequestTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="keyAuthoriseTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyLockIL", propOrder = {
    "acceptsKey",
    "hasTvdSection",
    "hasSlaveLock"
})
public class KeyLockIL
    extends LogicalDevice
{

    protected EntityILref acceptsKey;
    protected EntityILref hasTvdSection;
    protected List<EntityILref> hasSlaveLock;
    @XmlAttribute(name = "hasAutomaticKeyRelease")
    protected Boolean hasAutomaticKeyRelease;
    @XmlAttribute(name = "hasAutomaticKeyLock")
    protected Boolean hasAutomaticKeyLock;
    @XmlAttribute(name = "keyRequestTime")
    protected Duration keyRequestTime;
    @XmlAttribute(name = "keyAuthoriseTime")
    protected Duration keyAuthoriseTime;

    /**
     * Gets the value of the acceptsKey property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getAcceptsKey() {
        return acceptsKey;
    }

    /**
     * Sets the value of the acceptsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setAcceptsKey(EntityILref value) {
        this.acceptsKey = value;
    }

    /**
     * Gets the value of the hasTvdSection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getHasTvdSection() {
        return hasTvdSection;
    }

    /**
     * Sets the value of the hasTvdSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setHasTvdSection(EntityILref value) {
        this.hasTvdSection = value;
    }

    /**
     * Gets the value of the hasSlaveLock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasSlaveLock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasSlaveLock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getHasSlaveLock() {
        if (hasSlaveLock == null) {
            hasSlaveLock = new ArrayList<EntityILref>();
        }
        return this.hasSlaveLock;
    }

    /**
     * Gets the value of the hasAutomaticKeyRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAutomaticKeyRelease() {
        return hasAutomaticKeyRelease;
    }

    /**
     * Sets the value of the hasAutomaticKeyRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAutomaticKeyRelease(Boolean value) {
        this.hasAutomaticKeyRelease = value;
    }

    /**
     * Gets the value of the hasAutomaticKeyLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAutomaticKeyLock() {
        return hasAutomaticKeyLock;
    }

    /**
     * Sets the value of the hasAutomaticKeyLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAutomaticKeyLock(Boolean value) {
        this.hasAutomaticKeyLock = value;
    }

    /**
     * Gets the value of the keyRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getKeyRequestTime() {
        return keyRequestTime;
    }

    /**
     * Sets the value of the keyRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setKeyRequestTime(Duration value) {
        this.keyRequestTime = value;
    }

    /**
     * Gets the value of the keyAuthoriseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getKeyAuthoriseTime() {
        return keyAuthoriseTime;
    }

    /**
     * Sets the value of the keyAuthoriseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setKeyAuthoriseTime(Duration value) {
        this.keyAuthoriseTime = value;
    }

}
