//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 10:02:46 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceintegratemodereply_11_1_1a;

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
 *         &lt;element name="componentIdentInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}ItemNumberType_67589S"/>
 *         &lt;element name="subItineraryInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}SubItineraryInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}MonetaryInformationType_67627S" minOccurs="0"/>
 *         &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
 *         &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/TPISGR_11_1_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="fareRulesInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}FareRulesInformationTypeI" minOccurs="0"/>
 *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TPISGR_11_1_1A}FareQualifierDetailsType" minOccurs="0"/>
 *         &lt;element name="quantitiesInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}QuantityTypeI" minOccurs="0"/>
 *         &lt;element name="corporateInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}CorporateFareInformationType" minOccurs="0"/>
 *         &lt;element name="diagnosticInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}StatusType_67639S" minOccurs="0"/>
 *         &lt;element name="fareComponentMatchedSeqInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}ReferenceInfoType" minOccurs="0"/>
 *         &lt;element name="fareComponentParameterValue" type="{http://xml.amadeus.com/TPISGR_11_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *         &lt;element name="fareComponentRuleInfoGroup" type="{http://xml.amadeus.com/TPISGR_11_1_1A}FareComponentRuleInfoType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="fareComponentServiceAttributes" type="{http://xml.amadeus.com/TPISGR_11_1_1A}AttributeType" minOccurs="0"/>
 *         &lt;element name="fareComponentConversionRate" type="{http://xml.amadeus.com/TPISGR_11_1_1A}ConversionRateType_67611S" minOccurs="0"/>
 *         &lt;element name="fareComponentFeeInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}SpecificDataInformationType" minOccurs="0"/>
 *         &lt;element name="fareComponentServiceDescInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}InteractiveFreeTextType" minOccurs="0"/>
 *         &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TPISGR_11_1_1A}PricingTicketingDetailsType"/>
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
    "quantitiesInfo",
    "corporateInfo",
    "diagnosticInfo",
    "fareComponentMatchedSeqInfo",
    "fareComponentParameterValue",
    "fareComponentRuleInfoGroup",
    "fareComponentServiceAttributes",
    "fareComponentConversionRate",
    "fareComponentFeeInfo",
    "fareComponentServiceDescInfo",
    "pricingTicketingDetails"
})
public class FareComponentInfoType {

    @XmlElement(required = true)
    protected ItemNumberType67589S componentIdentInfo;
    protected List<SubItineraryInfoType> subItineraryInfo;
    protected MonetaryInformationType67627S monetaryInfo;
    protected PricingTicketingSubsequentTypeI componentClassInfo;
    protected List<FareCalculationCodeDetailsType> fareCalculationCodeDetails;
    protected FareRulesInformationTypeI fareRulesInfo;
    protected FareQualifierDetailsType fareQualifierDetails;
    protected QuantityTypeI quantitiesInfo;
    protected CorporateFareInformationType corporateInfo;
    protected StatusType67639S diagnosticInfo;
    protected ReferenceInfoType fareComponentMatchedSeqInfo;
    protected NumberOfUnitsType fareComponentParameterValue;
    protected List<FareComponentRuleInfoType> fareComponentRuleInfoGroup;
    protected AttributeType fareComponentServiceAttributes;
    protected ConversionRateType67611S fareComponentConversionRate;
    protected SpecificDataInformationType fareComponentFeeInfo;
    protected InteractiveFreeTextType fareComponentServiceDescInfo;
    @XmlElement(required = true)
    protected PricingTicketingDetailsType pricingTicketingDetails;

    /**
     * Gets the value of the componentIdentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType67589S }
     *     
     */
    public ItemNumberType67589S getComponentIdentInfo() {
        return componentIdentInfo;
    }

    /**
     * Sets the value of the componentIdentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType67589S }
     *     
     */
    public void setComponentIdentInfo(ItemNumberType67589S value) {
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
     * {@link SubItineraryInfoType }
     * 
     * 
     */
    public List<SubItineraryInfoType> getSubItineraryInfo() {
        if (subItineraryInfo == null) {
            subItineraryInfo = new ArrayList<SubItineraryInfoType>();
        }
        return this.subItineraryInfo;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67627S }
     *     
     */
    public MonetaryInformationType67627S getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67627S }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType67627S value) {
        this.monetaryInfo = value;
    }

    /**
     * Gets the value of the componentClassInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingSubsequentTypeI }
     *     
     */
    public PricingTicketingSubsequentTypeI getComponentClassInfo() {
        return componentClassInfo;
    }

    /**
     * Sets the value of the componentClassInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingSubsequentTypeI }
     *     
     */
    public void setComponentClassInfo(PricingTicketingSubsequentTypeI value) {
        this.componentClassInfo = value;
    }

    /**
     * Gets the value of the fareCalculationCodeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareCalculationCodeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareCalculationCodeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareCalculationCodeDetailsType }
     * 
     * 
     */
    public List<FareCalculationCodeDetailsType> getFareCalculationCodeDetails() {
        if (fareCalculationCodeDetails == null) {
            fareCalculationCodeDetails = new ArrayList<FareCalculationCodeDetailsType>();
        }
        return this.fareCalculationCodeDetails;
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
     * Gets the value of the quantitiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeI }
     *     
     */
    public QuantityTypeI getQuantitiesInfo() {
        return quantitiesInfo;
    }

    /**
     * Sets the value of the quantitiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeI }
     *     
     */
    public void setQuantitiesInfo(QuantityTypeI value) {
        this.quantitiesInfo = value;
    }

    /**
     * Gets the value of the corporateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public CorporateFareInformationType getCorporateInfo() {
        return corporateInfo;
    }

    /**
     * Sets the value of the corporateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public void setCorporateInfo(CorporateFareInformationType value) {
        this.corporateInfo = value;
    }

    /**
     * Gets the value of the diagnosticInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType67639S }
     *     
     */
    public StatusType67639S getDiagnosticInfo() {
        return diagnosticInfo;
    }

    /**
     * Sets the value of the diagnosticInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType67639S }
     *     
     */
    public void setDiagnosticInfo(StatusType67639S value) {
        this.diagnosticInfo = value;
    }

    /**
     * Gets the value of the fareComponentMatchedSeqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getFareComponentMatchedSeqInfo() {
        return fareComponentMatchedSeqInfo;
    }

    /**
     * Sets the value of the fareComponentMatchedSeqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setFareComponentMatchedSeqInfo(ReferenceInfoType value) {
        this.fareComponentMatchedSeqInfo = value;
    }

    /**
     * Gets the value of the fareComponentParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getFareComponentParameterValue() {
        return fareComponentParameterValue;
    }

    /**
     * Sets the value of the fareComponentParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setFareComponentParameterValue(NumberOfUnitsType value) {
        this.fareComponentParameterValue = value;
    }

    /**
     * Gets the value of the fareComponentRuleInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentRuleInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentRuleInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentRuleInfoType }
     * 
     * 
     */
    public List<FareComponentRuleInfoType> getFareComponentRuleInfoGroup() {
        if (fareComponentRuleInfoGroup == null) {
            fareComponentRuleInfoGroup = new ArrayList<FareComponentRuleInfoType>();
        }
        return this.fareComponentRuleInfoGroup;
    }

    /**
     * Gets the value of the fareComponentServiceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getFareComponentServiceAttributes() {
        return fareComponentServiceAttributes;
    }

    /**
     * Sets the value of the fareComponentServiceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setFareComponentServiceAttributes(AttributeType value) {
        this.fareComponentServiceAttributes = value;
    }

    /**
     * Gets the value of the fareComponentConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType67611S }
     *     
     */
    public ConversionRateType67611S getFareComponentConversionRate() {
        return fareComponentConversionRate;
    }

    /**
     * Sets the value of the fareComponentConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType67611S }
     *     
     */
    public void setFareComponentConversionRate(ConversionRateType67611S value) {
        this.fareComponentConversionRate = value;
    }

    /**
     * Gets the value of the fareComponentFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificDataInformationType }
     *     
     */
    public SpecificDataInformationType getFareComponentFeeInfo() {
        return fareComponentFeeInfo;
    }

    /**
     * Sets the value of the fareComponentFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificDataInformationType }
     *     
     */
    public void setFareComponentFeeInfo(SpecificDataInformationType value) {
        this.fareComponentFeeInfo = value;
    }

    /**
     * Gets the value of the fareComponentServiceDescInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public InteractiveFreeTextType getFareComponentServiceDescInfo() {
        return fareComponentServiceDescInfo;
    }

    /**
     * Sets the value of the fareComponentServiceDescInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public void setFareComponentServiceDescInfo(InteractiveFreeTextType value) {
        this.fareComponentServiceDescInfo = value;
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
