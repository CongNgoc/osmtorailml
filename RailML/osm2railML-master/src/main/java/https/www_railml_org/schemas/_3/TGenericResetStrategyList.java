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
 * <p>Java class for tGenericResetStrategyList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tGenericResetStrategyList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unconditionalReset"/&gt;
 *     &lt;enumeration value="sweepRunWithoutConfirmation"/&gt;
 *     &lt;enumeration value="sweepRunWithConfirmation"/&gt;
 *     &lt;enumeration value="procedure"/&gt;
 *     &lt;enumeration value="conditionalReset"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tGenericResetStrategyList")
@XmlEnum
public enum TGenericResetStrategyList {

    @XmlEnumValue("unconditionalReset")
    UNCONDITIONAL_RESET("unconditionalReset"),
    @XmlEnumValue("sweepRunWithoutConfirmation")
    SWEEP_RUN_WITHOUT_CONFIRMATION("sweepRunWithoutConfirmation"),
    @XmlEnumValue("sweepRunWithConfirmation")
    SWEEP_RUN_WITH_CONFIRMATION("sweepRunWithConfirmation"),
    @XmlEnumValue("procedure")
    PROCEDURE("procedure"),
    @XmlEnumValue("conditionalReset")
    CONDITIONAL_RESET("conditionalReset");
    private final String value;

    TGenericResetStrategyList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TGenericResetStrategyList fromValue(String v) {
        for (TGenericResetStrategyList c: TGenericResetStrategyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
