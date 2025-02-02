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
 * <p>Java class for GmlLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GmlLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineString" type="{https://www.railml.org/schemas/3.1}LineTypeCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="point" type="{https://www.railml.org/schemas/3.1}PointTypeCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlLocations", propOrder = {
    "lineString",
    "point"
})
public class GmlLocations {

    protected List<LineTypeCoordinate> lineString;
    protected List<PointTypeCoordinate> point;

    /**
     * Gets the value of the lineString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineTypeCoordinate }
     * 
     * 
     */
    public List<LineTypeCoordinate> getLineString() {
        if (lineString == null) {
            lineString = new ArrayList<LineTypeCoordinate>();
        }
        return this.lineString;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointTypeCoordinate }
     * 
     * 
     */
    public List<PointTypeCoordinate> getPoint() {
        if (point == null) {
            point = new ArrayList<PointTypeCoordinate>();
        }
        return this.point;
    }

}
