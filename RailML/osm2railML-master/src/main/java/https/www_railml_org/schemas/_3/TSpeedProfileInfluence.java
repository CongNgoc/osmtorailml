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
 * <p>Java class for tSpeedProfileInfluence.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tSpeedProfileInfluence"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="increasing"/&gt;
 *     &lt;enumeration value="decreasing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tSpeedProfileInfluence")
@XmlEnum
public enum TSpeedProfileInfluence {

    @XmlEnumValue("increasing")
    INCREASING("increasing"),
    @XmlEnumValue("decreasing")
    DECREASING("decreasing");
    private final String value;

    TSpeedProfileInfluence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSpeedProfileInfluence fromValue(String v) {
        for (TSpeedProfileInfluence c: TSpeedProfileInfluence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
