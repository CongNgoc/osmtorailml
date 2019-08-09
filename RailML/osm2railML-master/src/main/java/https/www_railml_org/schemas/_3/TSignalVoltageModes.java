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
 * <p>Java class for tSignalVoltageModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tSignalVoltageModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="nightOnly"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *     &lt;enumeration value="automatic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tSignalVoltageModes")
@XmlEnum
public enum TSignalVoltageModes {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("nightOnly")
    NIGHT_ONLY("nightOnly"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("automatic")
    AUTOMATIC("automatic");
    private final String value;

    TSignalVoltageModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSignalVoltageModes fromValue(String v) {
        for (TSignalVoltageModes c: TSignalVoltageModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
