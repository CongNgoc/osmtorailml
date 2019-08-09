//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package https.www_railml_org.schemas._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyPantograph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyPantograph"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="requiresTSIcompliance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="compliantTSITypes" type="{https://www.railml.org/schemas/3.1}tTSIPantoHeadTypeList" /&gt;
 *       &lt;attribute name="nationalPanHeadTypes" type="{https://www.railml.org/schemas/3.1}tPantoHeadTypeList" /&gt;
 *       &lt;attribute name="contactStripMaterials" type="{https://www.railml.org/schemas/3.1}tContactStripMaterialList" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyPantograph")
public class EnergyPantograph {

    @XmlAttribute(name = "requiresTSIcompliance")
    protected Boolean requiresTSIcompliance;
    @XmlAttribute(name = "compliantTSITypes")
    protected List<TTSIPantoHeadType> compliantTSITypes;
    @XmlAttribute(name = "nationalPanHeadTypes")
    protected List<TPantoHeadType> nationalPanHeadTypes;
    @XmlAttribute(name = "contactStripMaterials")
    protected List<TContactStripMaterial> contactStripMaterials;

    /**
     * Gets the value of the requiresTSIcompliance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresTSIcompliance() {
        return requiresTSIcompliance;
    }

    /**
     * Sets the value of the requiresTSIcompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresTSIcompliance(Boolean value) {
        this.requiresTSIcompliance = value;
    }

    /**
     * Gets the value of the compliantTSITypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compliantTSITypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompliantTSITypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTSIPantoHeadType }
     * 
     * 
     */
    public List<TTSIPantoHeadType> getCompliantTSITypes() {
        if (compliantTSITypes == null) {
            compliantTSITypes = new ArrayList<TTSIPantoHeadType>();
        }
        return this.compliantTSITypes;
    }

    /**
     * Gets the value of the nationalPanHeadTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalPanHeadTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalPanHeadTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPantoHeadType }
     * 
     * 
     */
    public List<TPantoHeadType> getNationalPanHeadTypes() {
        if (nationalPanHeadTypes == null) {
            nationalPanHeadTypes = new ArrayList<TPantoHeadType>();
        }
        return this.nationalPanHeadTypes;
    }

    /**
     * Gets the value of the contactStripMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactStripMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactStripMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TContactStripMaterial }
     * 
     * 
     */
    public List<TContactStripMaterial> getContactStripMaterials() {
        if (contactStripMaterials == null) {
            contactStripMaterials = new ArrayList<TContactStripMaterial>();
        }
        return this.contactStripMaterials;
    }

}
