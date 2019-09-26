//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SpecificDataInformationType"/>
 *         &lt;element name="ssrCodeInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SpecialRequirementsDetailsType_67545S" minOccurs="0"/>
 *         &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SelectionDetailsType_67537S"/>
 *         &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AttributeType_67538S" minOccurs="0"/>
 *         &lt;element name="serviceLevelInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FareQualifierDetailsType_67539S" minOccurs="0"/>
 *         &lt;element name="quantitiesInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}QuantityType" minOccurs="0"/>
 *         &lt;element name="associatedAmountsInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}MonetaryInformationType_67540S" minOccurs="0"/>
 *         &lt;element name="serviceIdentInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}ItemNumberType" minOccurs="0"/>
 *         &lt;element name="passengerServiceRequestGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}PassengerServiceRequestType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailsInfoType", propOrder = {
    "feeInfo",
    "ssrCodeInfo",
    "feeProcessingInfo",
    "serviceDescriptionInfo",
    "serviceAttributesInfo",
    "serviceLevelInfo",
    "quantitiesInfo",
    "associatedAmountsInfo",
    "serviceIdentInfo",
    "passengerServiceRequestGroup"
})
public class FeeDetailsInfoType {

    @XmlElement(required = true)
    protected SpecificDataInformationType feeInfo;
    protected SpecialRequirementsDetailsType67545S ssrCodeInfo;
    @XmlElement(required = true)
    protected SelectionDetailsType67537S feeProcessingInfo;
    protected SpecialRequirementsDetailsType serviceDescriptionInfo;
    protected AttributeType67538S serviceAttributesInfo;
    protected FareQualifierDetailsType67539S serviceLevelInfo;
    protected QuantityType quantitiesInfo;
    protected MonetaryInformationType67540S associatedAmountsInfo;
    protected ItemNumberType serviceIdentInfo;
    protected List<PassengerServiceRequestType> passengerServiceRequestGroup;

    /**
     * Gets the value of the feeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificDataInformationType }
     *     
     */
    public SpecificDataInformationType getFeeInfo() {
        return feeInfo;
    }

    /**
     * Sets the value of the feeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificDataInformationType }
     *     
     */
    public void setFeeInfo(SpecificDataInformationType value) {
        this.feeInfo = value;
    }

    /**
     * Gets the value of the ssrCodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType67545S }
     *     
     */
    public SpecialRequirementsDetailsType67545S getSsrCodeInfo() {
        return ssrCodeInfo;
    }

    /**
     * Sets the value of the ssrCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType67545S }
     *     
     */
    public void setSsrCodeInfo(SpecialRequirementsDetailsType67545S value) {
        this.ssrCodeInfo = value;
    }

    /**
     * Gets the value of the feeProcessingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsType67537S }
     *     
     */
    public SelectionDetailsType67537S getFeeProcessingInfo() {
        return feeProcessingInfo;
    }

    /**
     * Sets the value of the feeProcessingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsType67537S }
     *     
     */
    public void setFeeProcessingInfo(SelectionDetailsType67537S value) {
        this.feeProcessingInfo = value;
    }

    /**
     * Gets the value of the serviceDescriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType }
     *     
     */
    public SpecialRequirementsDetailsType getServiceDescriptionInfo() {
        return serviceDescriptionInfo;
    }

    /**
     * Sets the value of the serviceDescriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType }
     *     
     */
    public void setServiceDescriptionInfo(SpecialRequirementsDetailsType value) {
        this.serviceDescriptionInfo = value;
    }

    /**
     * Gets the value of the serviceAttributesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType67538S }
     *     
     */
    public AttributeType67538S getServiceAttributesInfo() {
        return serviceAttributesInfo;
    }

    /**
     * Sets the value of the serviceAttributesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType67538S }
     *     
     */
    public void setServiceAttributesInfo(AttributeType67538S value) {
        this.serviceAttributesInfo = value;
    }

    /**
     * Gets the value of the serviceLevelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierDetailsType67539S }
     *     
     */
    public FareQualifierDetailsType67539S getServiceLevelInfo() {
        return serviceLevelInfo;
    }

    /**
     * Sets the value of the serviceLevelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierDetailsType67539S }
     *     
     */
    public void setServiceLevelInfo(FareQualifierDetailsType67539S value) {
        this.serviceLevelInfo = value;
    }

    /**
     * Gets the value of the quantitiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantitiesInfo() {
        return quantitiesInfo;
    }

    /**
     * Sets the value of the quantitiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantitiesInfo(QuantityType value) {
        this.quantitiesInfo = value;
    }

    /**
     * Gets the value of the associatedAmountsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67540S }
     *     
     */
    public MonetaryInformationType67540S getAssociatedAmountsInfo() {
        return associatedAmountsInfo;
    }

    /**
     * Sets the value of the associatedAmountsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67540S }
     *     
     */
    public void setAssociatedAmountsInfo(MonetaryInformationType67540S value) {
        this.associatedAmountsInfo = value;
    }

    /**
     * Gets the value of the serviceIdentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType }
     *     
     */
    public ItemNumberType getServiceIdentInfo() {
        return serviceIdentInfo;
    }

    /**
     * Sets the value of the serviceIdentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType }
     *     
     */
    public void setServiceIdentInfo(ItemNumberType value) {
        this.serviceIdentInfo = value;
    }

    /**
     * Gets the value of the passengerServiceRequestGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerServiceRequestGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerServiceRequestGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerServiceRequestType }
     * 
     * 
     */
    public List<PassengerServiceRequestType> getPassengerServiceRequestGroup() {
        if (passengerServiceRequestGroup == null) {
            passengerServiceRequestGroup = new ArrayList<PassengerServiceRequestType>();
        }
        return this.passengerServiceRequestGroup;
    }

}
