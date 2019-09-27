//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componentIdentInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ItemNumberType"/>
 *         &lt;element name="subItineraryInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SubItineraryDetailsType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}PricingTicketingSubsequentTypeI_67532S" minOccurs="0"/>
 *         &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
 *         &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FareRulesInformationTypeI" minOccurs="0"/>
 *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FareQualifierDetailsType" minOccurs="0"/>
 *         &lt;element name="fareCurrency" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ConversionRateType_67496S" minOccurs="0"/>
 *         &lt;element name="fareReferenceInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ReferenceInfoType" minOccurs="0"/>
 *         &lt;element name="tourCodeInformation" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}TourInformationType" minOccurs="0"/>
 *         &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}PricingTicketingDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentInfoType", propOrder = {
    "componentIdentInfo",
    "subItineraryInfo",
    "monetaryInfo",
    "componentClassInfo",
    "fareCalculationCodeDetails",
    "fareRulesInfo",
    "fareQualifierDetails",
    "fareCurrency",
    "fareReferenceInfo",
    "tourCodeInformation",
    "pricingTicketingDetails"
})
public class FareComponentInfoType {

    @XmlElement(required = true)
    protected ItemNumberType componentIdentInfo;
    protected List<SubItineraryDetailsType> subItineraryInfo;
    protected MonetaryInformationType monetaryInfo;
    protected PricingTicketingSubsequentTypeI67532S componentClassInfo;
    protected FareCalculationCodeDetailsType fareCalculationCodeDetails;
    protected FareRulesInformationTypeI fareRulesInfo;
    protected FareQualifierDetailsType fareQualifierDetails;
    protected ConversionRateType67496S fareCurrency;
    protected ReferenceInfoType fareReferenceInfo;
    protected TourInformationType tourCodeInformation;
    @XmlElement(required = true)
    protected PricingTicketingDetailsType pricingTicketingDetails;

    /**
     * Gets the value of the componentIdentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType }
     *     
     */
    public ItemNumberType getComponentIdentInfo() {
        return componentIdentInfo;
    }

    /**
     * Sets the value of the componentIdentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType }
     *     
     */
    public void setComponentIdentInfo(ItemNumberType value) {
        this.componentIdentInfo = value;
    }

    /**
     * Gets the value of the subItineraryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subItineraryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubItineraryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubItineraryDetailsType }
     * 
     * 
     */
    public List<SubItineraryDetailsType> getSubItineraryInfo() {
        if (subItineraryInfo == null) {
            subItineraryInfo = new ArrayList<SubItineraryDetailsType>();
        }
        return this.subItineraryInfo;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType value) {
        this.monetaryInfo = value;
    }

    /**
     * Gets the value of the componentClassInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingSubsequentTypeI67532S }
     *     
     */
    public PricingTicketingSubsequentTypeI67532S getComponentClassInfo() {
        return componentClassInfo;
    }

    /**
     * Sets the value of the componentClassInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingSubsequentTypeI67532S }
     *     
     */
    public void setComponentClassInfo(PricingTicketingSubsequentTypeI67532S value) {
        this.componentClassInfo = value;
    }

    /**
     * Gets the value of the fareCalculationCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareCalculationCodeDetailsType }
     *     
     */
    public FareCalculationCodeDetailsType getFareCalculationCodeDetails() {
        return fareCalculationCodeDetails;
    }

    /**
     * Sets the value of the fareCalculationCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCalculationCodeDetailsType }
     *     
     */
    public void setFareCalculationCodeDetails(FareCalculationCodeDetailsType value) {
        this.fareCalculationCodeDetails = value;
    }

    /**
     * Gets the value of the fareRulesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesInformationTypeI }
     *     
     */
    public FareRulesInformationTypeI getFareRulesInfo() {
        return fareRulesInfo;
    }

    /**
     * Sets the value of the fareRulesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesInformationTypeI }
     *     
     */
    public void setFareRulesInfo(FareRulesInformationTypeI value) {
        this.fareRulesInfo = value;
    }

    /**
     * Gets the value of the fareQualifierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierDetailsType }
     *     
     */
    public FareQualifierDetailsType getFareQualifierDetails() {
        return fareQualifierDetails;
    }

    /**
     * Sets the value of the fareQualifierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierDetailsType }
     *     
     */
    public void setFareQualifierDetails(FareQualifierDetailsType value) {
        this.fareQualifierDetails = value;
    }

    /**
     * Gets the value of the fareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType67496S }
     *     
     */
    public ConversionRateType67496S getFareCurrency() {
        return fareCurrency;
    }

    /**
     * Sets the value of the fareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType67496S }
     *     
     */
    public void setFareCurrency(ConversionRateType67496S value) {
        this.fareCurrency = value;
    }

    /**
     * Gets the value of the fareReferenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getFareReferenceInfo() {
        return fareReferenceInfo;
    }

    /**
     * Sets the value of the fareReferenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setFareReferenceInfo(ReferenceInfoType value) {
        this.fareReferenceInfo = value;
    }

    /**
     * Gets the value of the tourCodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TourInformationType }
     *     
     */
    public TourInformationType getTourCodeInformation() {
        return tourCodeInformation;
    }

    /**
     * Sets the value of the tourCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourInformationType }
     *     
     */
    public void setTourCodeInformation(TourInformationType value) {
        this.tourCodeInformation = value;
    }

    /**
     * Gets the value of the pricingTicketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsType }
     *     
     */
    public PricingTicketingDetailsType getPricingTicketingDetails() {
        return pricingTicketingDetails;
    }

    /**
     * Sets the value of the pricingTicketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsType }
     *     
     */
    public void setPricingTicketingDetails(PricingTicketingDetailsType value) {
        this.pricingTicketingDetails = value;
    }

}
