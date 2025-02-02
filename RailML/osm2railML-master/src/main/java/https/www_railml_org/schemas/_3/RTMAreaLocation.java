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
 * <p>Java class for RTM_AreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTM_AreaLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}RTM_EntityLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associatedNetElement" type="{https://www.railml.org/schemas/3.1}RTM_AssociatedNetElement" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTM_AreaLocation", propOrder = {
    "associatedNetElement"
})
public class RTMAreaLocation
    extends RTMEntityLocation
{

    @XmlElement(required = true)
    protected List<RTMAssociatedNetElement> associatedNetElement;

    /**
     * Gets the value of the associatedNetElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedNetElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedNetElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTMAssociatedNetElement }
     * 
     * 
     */
    public List<RTMAssociatedNetElement> getAssociatedNetElement() {
        if (associatedNetElement == null) {
            associatedNetElement = new ArrayList<RTMAssociatedNetElement>();
        }
        return this.associatedNetElement;
    }

}
