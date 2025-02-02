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
 * <p>Java class for tInfrastructureState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tInfrastructureState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="disabled"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="operational"/&gt;
 *     &lt;enumeration value="conceptual"/&gt;
 *     &lt;enumeration value="planned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tInfrastructureState")
@XmlEnum
public enum TInfrastructureState {


    /**
     * The element is currently not usable, switched off or deactivated and therefore cannot be used regularly. However, it can be put back into operation at short notice without further construction, acceptance or approval activities.
     * 
     */
    @XmlEnumValue("disabled")
    DISABLED("disabled"),

    /**
     * The element is no longer available, removed, dismantled, or no longer exists. Planning, construction or commissioning activities are absolutely necessary for recommissioning.
     * 
     */
    @XmlEnumValue("closed")
    CLOSED("closed"),

    /**
     * The element is operational and can be used regularly.
     * 
     */
    @XmlEnumValue("operational")
    OPERATIONAL("operational"),

    /**
     * The construction or commissioning of the element is planned for the medium or long term. However, there are still no concrete (planning) activities for the construction of the element beyond the preliminary planning and cost estimation.
     * 
     */
    @XmlEnumValue("conceptual")
    CONCEPTUAL("conceptual"),

    /**
     * The construction or commissioning of the element is planned concretely and at short notice or concrete planning activities for the construction take place, e.g. design, approval or implementation planning, cost calculation, award of contracts. It is not normally possible to use the element.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned");
    private final String value;

    TInfrastructureState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TInfrastructureState fromValue(String v) {
        for (TInfrastructureState c: TInfrastructureState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
