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
 * <p>Java class for tIxlTechnologyTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tIxlTechnologyTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="digital"/&gt;
 *     &lt;enumeration value="electronic"/&gt;
 *     &lt;enumeration value="relay"/&gt;
 *     &lt;enumeration value="electromechanical"/&gt;
 *     &lt;enumeration value="mechanical"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tIxlTechnologyTypeList")
@XmlEnum
public enum TIxlTechnologyTypeList {

    @XmlEnumValue("digital")
    DIGITAL("digital"),
    @XmlEnumValue("electronic")
    ELECTRONIC("electronic"),
    @XmlEnumValue("relay")
    RELAY("relay"),
    @XmlEnumValue("electromechanical")
    ELECTROMECHANICAL("electromechanical"),
    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),
    @XmlEnumValue("manual")
    MANUAL("manual");
    private final String value;

    TIxlTechnologyTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIxlTechnologyTypeList fromValue(String v) {
        for (TIxlTechnologyTypeList c: TIxlTechnologyTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
