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
 * <p>Java class for tBufferStopType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tBufferStopType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sleeperCross"/&gt;
 *     &lt;enumeration value="headRamp"/&gt;
 *     &lt;enumeration value="fixedBufferStop"/&gt;
 *     &lt;enumeration value="brakingBufferStop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tBufferStopType")
@XmlEnum
public enum TBufferStopType {

    @XmlEnumValue("sleeperCross")
    SLEEPER_CROSS("sleeperCross"),
    @XmlEnumValue("headRamp")
    HEAD_RAMP("headRamp"),
    @XmlEnumValue("fixedBufferStop")
    FIXED_BUFFER_STOP("fixedBufferStop"),
    @XmlEnumValue("brakingBufferStop")
    BRAKING_BUFFER_STOP("brakingBufferStop");
    private final String value;

    TBufferStopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TBufferStopType fromValue(String v) {
        for (TBufferStopType c: TBufferStopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
