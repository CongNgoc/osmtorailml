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
 * <p>Java class for tTrainProtectionMedium.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tTrainProtectionMedium"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cable"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="radio"/&gt;
 *     &lt;enumeration value="inductive"/&gt;
 *     &lt;enumeration value="mechanical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tTrainProtectionMedium")
@XmlEnum
public enum TTrainProtectionMedium {

    @XmlEnumValue("cable")
    CABLE("cable"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("radio")
    RADIO("radio"),
    @XmlEnumValue("inductive")
    INDUCTIVE("inductive"),
    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical");
    private final String value;

    TTrainProtectionMedium(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTrainProtectionMedium fromValue(String v) {
        for (TTrainProtectionMedium c: TTrainProtectionMedium.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
