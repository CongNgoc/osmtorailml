//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tGroupingTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tGroupingTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="catenary"/&gt;
 *     &lt;enumeration value="elementBlocking"/&gt;
 *     &lt;enumeration value="automaticRouteSetting"/&gt;
 *     &lt;enumeration value="automaticTrainRouting"/&gt;
 *     &lt;enumeration value="callOn"/&gt;
 *     &lt;enumeration value="emergencyStop"/&gt;
 *     &lt;enumeration value="pointStaggering"/&gt;
 *     &lt;enumeration value="pointHeating"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tGroupingTypes")
@XmlEnum
public enum TGroupingTypes {

    @XmlEnumValue("catenary")
    CATENARY("catenary"),
    @XmlEnumValue("elementBlocking")
    ELEMENT_BLOCKING("elementBlocking"),
    @XmlEnumValue("automaticRouteSetting")
    AUTOMATIC_ROUTE_SETTING("automaticRouteSetting"),
    @XmlEnumValue("automaticTrainRouting")
    AUTOMATIC_TRAIN_ROUTING("automaticTrainRouting"),
    @XmlEnumValue("callOn")
    CALL_ON("callOn"),
    @XmlEnumValue("emergencyStop")
    EMERGENCY_STOP("emergencyStop"),
    @XmlEnumValue("pointStaggering")
    POINT_STAGGERING("pointStaggering"),
    @XmlEnumValue("pointHeating")
    POINT_HEATING("pointHeating");
    private final String value;

    TGroupingTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TGroupingTypes fromValue(String v) {
        for (TGroupingTypes c: TGroupingTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
