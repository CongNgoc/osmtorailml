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
 * <p>Java class for RouteReleaseGroupsAhead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteReleaseGroupsAhead"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeReleaseGroupAhead" type="{https://www.railml.org/schemas/3.1}RouteReleaseGroupAhead" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteReleaseGroupsAhead", propOrder = {
    "routeReleaseGroupAhead"
})
public class RouteReleaseGroupsAhead {

    @XmlElement(required = true)
    protected List<RouteReleaseGroupAhead> routeReleaseGroupAhead;

    /**
     * Gets the value of the routeReleaseGroupAhead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeReleaseGroupAhead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteReleaseGroupAhead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteReleaseGroupAhead }
     * 
     * 
     */
    public List<RouteReleaseGroupAhead> getRouteReleaseGroupAhead() {
        if (routeReleaseGroupAhead == null) {
            routeReleaseGroupAhead = new ArrayList<RouteReleaseGroupAhead>();
        }
        return this.routeReleaseGroupAhead;
    }

}
