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
import javax.xml.bind.annotation.XmlType;


/**
 * container element for all KeyLockIL elements
 * 
 * <p>Java class for KeyLocksIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyLocksIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="keyLockIL" type="{https://www.railml.org/schemas/3.1}KeyLockIL" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ownsLogicalDevice" type="{https://www.railml.org/schemas/3.1}LogicalDevice" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyLocksIL", propOrder = {
    "keyLockIL",
    "ownsLogicalDevice"
})
public class KeyLocksIL {

    protected List<KeyLockIL> keyLockIL;
    protected List<LogicalDevice> ownsLogicalDevice;

    /**
     * Gets the value of the keyLockIL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyLockIL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyLockIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyLockIL }
     * 
     * 
     */
    public List<KeyLockIL> getKeyLockIL() {
        if (keyLockIL == null) {
            keyLockIL = new ArrayList<KeyLockIL>();
        }
        return this.keyLockIL;
    }

    /**
     * Gets the value of the ownsLogicalDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownsLogicalDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnsLogicalDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalDevice }
     * 
     * 
     */
    public List<LogicalDevice> getOwnsLogicalDevice() {
        if (ownsLogicalDevice == null) {
            ownsLogicalDevice = new ArrayList<LogicalDevice>();
        }
        return this.ownsLogicalDevice;
    }

}
