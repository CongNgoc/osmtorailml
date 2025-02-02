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
 * <p>Java class for SignalIS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalIS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.1}FunctionalInfrastructureEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isAnnouncementSignal" type="{https://www.railml.org/schemas/3.1}SignalAnnouncement" minOccurs="0"/&gt;
 *         &lt;element name="isCatenarySignal" type="{https://www.railml.org/schemas/3.1}SignalCatenary" minOccurs="0"/&gt;
 *         &lt;element name="isDangerSignal" type="{https://www.railml.org/schemas/3.1}SignalDanger" minOccurs="0"/&gt;
 *         &lt;element name="isEtcsSignal" type="{https://www.railml.org/schemas/3.1}SignalEtcs" minOccurs="0"/&gt;
 *         &lt;element name="isInformationSignal" type="{https://www.railml.org/schemas/3.1}SignalInformation" minOccurs="0"/&gt;
 *         &lt;element name="isLevelCrossingSignal" type="{https://www.railml.org/schemas/3.1}SignalLevelCrossing" minOccurs="0"/&gt;
 *         &lt;element name="isMilepost" type="{https://www.railml.org/schemas/3.1}SignalMilepost" minOccurs="0"/&gt;
 *         &lt;element name="isSpeedSignal" type="{https://www.railml.org/schemas/3.1}SignalSpeed" minOccurs="0"/&gt;
 *         &lt;element name="isStopPost" type="{https://www.railml.org/schemas/3.1}SignalStopPost" minOccurs="0"/&gt;
 *         &lt;element name="isTrainMovementSignal" type="{https://www.railml.org/schemas/3.1}SignalTrainMovement" minOccurs="0"/&gt;
 *         &lt;element name="isTrainRadioSignal" type="{https://www.railml.org/schemas/3.1}SignalRadio" minOccurs="0"/&gt;
 *         &lt;element name="isVehicleEquipmentSignal" type="{https://www.railml.org/schemas/3.1}SignalVehicleEquipment" minOccurs="0"/&gt;
 *         &lt;element name="connectedWithBaliseGroup" type="{https://www.railml.org/schemas/3.1}tElementWithIDref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="signalConstruction" type="{https://www.railml.org/schemas/3.1}SignalConstruction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isSwitchable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="belongsToParent" type="{https://www.railml.org/schemas/3.1}tRef" /&gt;
 *       &lt;attribute name="basedOnTemplate" type="{https://www.railml.org/schemas/3.1}tRef" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalIS", propOrder = {
    "isAnnouncementSignal",
    "isCatenarySignal",
    "isDangerSignal",
    "isEtcsSignal",
    "isInformationSignal",
    "isLevelCrossingSignal",
    "isMilepost",
    "isSpeedSignal",
    "isStopPost",
    "isTrainMovementSignal",
    "isTrainRadioSignal",
    "isVehicleEquipmentSignal",
    "connectedWithBaliseGroup",
    "signalConstruction"
})
public class SignalIS
    extends FunctionalInfrastructureEntity
{

    protected SignalAnnouncement isAnnouncementSignal;
    protected SignalCatenary isCatenarySignal;
    protected SignalDanger isDangerSignal;
    protected SignalEtcs isEtcsSignal;
    protected SignalInformation isInformationSignal;
    protected SignalLevelCrossing isLevelCrossingSignal;
    protected SignalMilepost isMilepost;
    protected SignalSpeed isSpeedSignal;
    protected SignalStopPost isStopPost;
    protected SignalTrainMovement isTrainMovementSignal;
    protected SignalRadio isTrainRadioSignal;
    protected SignalVehicleEquipment isVehicleEquipmentSignal;
    protected List<TElementWithIDref> connectedWithBaliseGroup;
    protected SignalConstruction signalConstruction;
    @XmlAttribute(name = "isSwitchable")
    protected Boolean isSwitchable;
    @XmlAttribute(name = "belongsToParent")
    protected String belongsToParent;
    @XmlAttribute(name = "basedOnTemplate")
    protected String basedOnTemplate;

    /**
     * Gets the value of the isAnnouncementSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalAnnouncement }
     *     
     */
    public SignalAnnouncement getIsAnnouncementSignal() {
        return isAnnouncementSignal;
    }

    /**
     * Sets the value of the isAnnouncementSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalAnnouncement }
     *     
     */
    public void setIsAnnouncementSignal(SignalAnnouncement value) {
        this.isAnnouncementSignal = value;
    }

    /**
     * Gets the value of the isCatenarySignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalCatenary }
     *     
     */
    public SignalCatenary getIsCatenarySignal() {
        return isCatenarySignal;
    }

    /**
     * Sets the value of the isCatenarySignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalCatenary }
     *     
     */
    public void setIsCatenarySignal(SignalCatenary value) {
        this.isCatenarySignal = value;
    }

    /**
     * Gets the value of the isDangerSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalDanger }
     *     
     */
    public SignalDanger getIsDangerSignal() {
        return isDangerSignal;
    }

    /**
     * Sets the value of the isDangerSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalDanger }
     *     
     */
    public void setIsDangerSignal(SignalDanger value) {
        this.isDangerSignal = value;
    }

    /**
     * Gets the value of the isEtcsSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalEtcs }
     *     
     */
    public SignalEtcs getIsEtcsSignal() {
        return isEtcsSignal;
    }

    /**
     * Sets the value of the isEtcsSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalEtcs }
     *     
     */
    public void setIsEtcsSignal(SignalEtcs value) {
        this.isEtcsSignal = value;
    }

    /**
     * Gets the value of the isInformationSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalInformation }
     *     
     */
    public SignalInformation getIsInformationSignal() {
        return isInformationSignal;
    }

    /**
     * Sets the value of the isInformationSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalInformation }
     *     
     */
    public void setIsInformationSignal(SignalInformation value) {
        this.isInformationSignal = value;
    }

    /**
     * Gets the value of the isLevelCrossingSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalLevelCrossing }
     *     
     */
    public SignalLevelCrossing getIsLevelCrossingSignal() {
        return isLevelCrossingSignal;
    }

    /**
     * Sets the value of the isLevelCrossingSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalLevelCrossing }
     *     
     */
    public void setIsLevelCrossingSignal(SignalLevelCrossing value) {
        this.isLevelCrossingSignal = value;
    }

    /**
     * Gets the value of the isMilepost property.
     * 
     * @return
     *     possible object is
     *     {@link SignalMilepost }
     *     
     */
    public SignalMilepost getIsMilepost() {
        return isMilepost;
    }

    /**
     * Sets the value of the isMilepost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalMilepost }
     *     
     */
    public void setIsMilepost(SignalMilepost value) {
        this.isMilepost = value;
    }

    /**
     * Gets the value of the isSpeedSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalSpeed }
     *     
     */
    public SignalSpeed getIsSpeedSignal() {
        return isSpeedSignal;
    }

    /**
     * Sets the value of the isSpeedSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalSpeed }
     *     
     */
    public void setIsSpeedSignal(SignalSpeed value) {
        this.isSpeedSignal = value;
    }

    /**
     * Gets the value of the isStopPost property.
     * 
     * @return
     *     possible object is
     *     {@link SignalStopPost }
     *     
     */
    public SignalStopPost getIsStopPost() {
        return isStopPost;
    }

    /**
     * Sets the value of the isStopPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalStopPost }
     *     
     */
    public void setIsStopPost(SignalStopPost value) {
        this.isStopPost = value;
    }

    /**
     * Gets the value of the isTrainMovementSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalTrainMovement }
     *     
     */
    public SignalTrainMovement getIsTrainMovementSignal() {
        return isTrainMovementSignal;
    }

    /**
     * Sets the value of the isTrainMovementSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalTrainMovement }
     *     
     */
    public void setIsTrainMovementSignal(SignalTrainMovement value) {
        this.isTrainMovementSignal = value;
    }

    /**
     * Gets the value of the isTrainRadioSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalRadio }
     *     
     */
    public SignalRadio getIsTrainRadioSignal() {
        return isTrainRadioSignal;
    }

    /**
     * Sets the value of the isTrainRadioSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalRadio }
     *     
     */
    public void setIsTrainRadioSignal(SignalRadio value) {
        this.isTrainRadioSignal = value;
    }

    /**
     * Gets the value of the isVehicleEquipmentSignal property.
     * 
     * @return
     *     possible object is
     *     {@link SignalVehicleEquipment }
     *     
     */
    public SignalVehicleEquipment getIsVehicleEquipmentSignal() {
        return isVehicleEquipmentSignal;
    }

    /**
     * Sets the value of the isVehicleEquipmentSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalVehicleEquipment }
     *     
     */
    public void setIsVehicleEquipmentSignal(SignalVehicleEquipment value) {
        this.isVehicleEquipmentSignal = value;
    }

    /**
     * Gets the value of the connectedWithBaliseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedWithBaliseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedWithBaliseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TElementWithIDref }
     * 
     * 
     */
    public List<TElementWithIDref> getConnectedWithBaliseGroup() {
        if (connectedWithBaliseGroup == null) {
            connectedWithBaliseGroup = new ArrayList<TElementWithIDref>();
        }
        return this.connectedWithBaliseGroup;
    }

    /**
     * Gets the value of the signalConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SignalConstruction }
     *     
     */
    public SignalConstruction getSignalConstruction() {
        return signalConstruction;
    }

    /**
     * Sets the value of the signalConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalConstruction }
     *     
     */
    public void setSignalConstruction(SignalConstruction value) {
        this.signalConstruction = value;
    }

    /**
     * Gets the value of the isSwitchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSwitchable() {
        return isSwitchable;
    }

    /**
     * Sets the value of the isSwitchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSwitchable(Boolean value) {
        this.isSwitchable = value;
    }

    /**
     * Gets the value of the belongsToParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelongsToParent() {
        return belongsToParent;
    }

    /**
     * Sets the value of the belongsToParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelongsToParent(String value) {
        this.belongsToParent = value;
    }

    /**
     * Gets the value of the basedOnTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedOnTemplate() {
        return basedOnTemplate;
    }

    /**
     * Sets the value of the basedOnTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedOnTemplate(String value) {
        this.basedOnTemplate = value;
    }

}
