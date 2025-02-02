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
 * <p>Java class for tRestrictionAreaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tRestrictionAreaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="radioHole"/&gt;
 *     &lt;enumeration value="noRegenerativeBrake"/&gt;
 *     &lt;enumeration value="noMagneticShoeBrake"/&gt;
 *     &lt;enumeration value="mainPowerSwitchOff"/&gt;
 *     &lt;enumeration value="lowerPantograph"/&gt;
 *     &lt;enumeration value="airTightness"/&gt;
 *     &lt;enumeration value="noStopping"/&gt;
 *     &lt;enumeration value="noSanding"/&gt;
 *     &lt;enumeration value="noEddyCurrentBrakeForEmergencyBrake"/&gt;
 *     &lt;enumeration value="noEddyCurrentBrakeForServiceBrake"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tRestrictionAreaType")
@XmlEnum
public enum TRestrictionAreaType {

    @XmlEnumValue("radioHole")
    RADIO_HOLE("radioHole"),

    /**
     * it is forbidden to use regenerative braking
     * 
     */
    @XmlEnumValue("noRegenerativeBrake")
    NO_REGENERATIVE_BRAKE("noRegenerativeBrake"),

    /**
     * it is forbidden to use the magnetic shoe brake
     * 
     */
    @XmlEnumValue("noMagneticShoeBrake")
    NO_MAGNETIC_SHOE_BRAKE("noMagneticShoeBrake"),

    /**
     * the main power engine has to be switched off
     * 
     */
    @XmlEnumValue("mainPowerSwitchOff")
    MAIN_POWER_SWITCH_OFF("mainPowerSwitchOff"),

    /**
     * the pantograph has to be lowered
     * 
     */
    @XmlEnumValue("lowerPantograph")
    LOWER_PANTOGRAPH("lowerPantograph"),
    @XmlEnumValue("airTightness")
    AIR_TIGHTNESS("airTightness"),

    /**
     * it is forbidden to stop
     * 
     */
    @XmlEnumValue("noStopping")
    NO_STOPPING("noStopping"),

    /**
     * it is forbidden to use sanding for increasing coefficient of adhesion
     * 
     */
    @XmlEnumValue("noSanding")
    NO_SANDING("noSanding"),
    @XmlEnumValue("noEddyCurrentBrakeForEmergencyBrake")
    NO_EDDY_CURRENT_BRAKE_FOR_EMERGENCY_BRAKE("noEddyCurrentBrakeForEmergencyBrake"),
    @XmlEnumValue("noEddyCurrentBrakeForServiceBrake")
    NO_EDDY_CURRENT_BRAKE_FOR_SERVICE_BRAKE("noEddyCurrentBrakeForServiceBrake");
    private final String value;

    TRestrictionAreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRestrictionAreaType fromValue(String v) {
        for (TRestrictionAreaType c: TRestrictionAreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
