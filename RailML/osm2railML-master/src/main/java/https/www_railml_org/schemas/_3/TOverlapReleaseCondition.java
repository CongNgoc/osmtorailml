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
 * <p>Java class for tOverlapReleaseCondition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tOverlapReleaseCondition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="trainInitiatedTrigger"/&gt;
 *     &lt;enumeration value="startTimerAfterVacating"/&gt;
 *     &lt;enumeration value="startTimerUponOccupation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tOverlapReleaseCondition")
@XmlEnum
public enum TOverlapReleaseCondition {

    @XmlEnumValue("trainInitiatedTrigger")
    TRAIN_INITIATED_TRIGGER("trainInitiatedTrigger"),
    @XmlEnumValue("startTimerAfterVacating")
    START_TIMER_AFTER_VACATING("startTimerAfterVacating"),
    @XmlEnumValue("startTimerUponOccupation")
    START_TIMER_UPON_OCCUPATION("startTimerUponOccupation");
    private final String value;

    TOverlapReleaseCondition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TOverlapReleaseCondition fromValue(String v) {
        for (TOverlapReleaseCondition c: TOverlapReleaseCondition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
