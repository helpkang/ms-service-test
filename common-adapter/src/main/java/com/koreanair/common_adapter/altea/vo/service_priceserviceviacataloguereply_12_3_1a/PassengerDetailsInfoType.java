//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for PassengerDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDetailsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FareInformationType"/>
 *         &lt;element name="flightsCountInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}NumberOfUnitsType_67575S" minOccurs="0"/>
 *         &lt;element name="pricingticketingDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}PricingTicketingDetailsType_67619S" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ConversionRateType_67611S" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="discountAndPenaltyInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}DiscountAndPenaltyInformationType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}InteractiveFreeTextType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="formOfPaymentInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FormOfPaymentType" minOccurs="0"/>
 *         &lt;element name="taxDetailsInfoGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TaxDetailsInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="fareCalcConstructionInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FareCalcConstructionInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="fareSegmentInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FareSegmentInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ticketingAddInfoGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TicketingAdditionalInfoType" minOccurs="0"/>
 *         &lt;element name="fareComponentsInfoGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FareComponentsInfoType" minOccurs="0"/>
 *         &lt;element name="corporateFareInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}CorporateFareInformationType" minOccurs="0"/>
 *         &lt;element name="feeBreakdownGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FeeBreakdownType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="initialPricingInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}BinaryDataType" minOccurs="0"/>
 *         &lt;element name="proposedServiceInformation" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ProposedServiceInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDetailsInfoType", propOrder = {
    "fareInfo",
    "flightsCountInfo",
    "pricingticketingDetails",
    "conversionRate",
    "monetaryInfo",
    "discountAndPenaltyInfo",
    "interactiveFreeText",
    "formOfPaymentInfo",
    "taxDetailsInfoGroup",
    "fareCalcConstructionInfo",
    "fareSegmentInfo",
    "ticketingAddInfoGroup",
    "fareComponentsInfoGroup",
    "corporateFareInfo",
    "feeBreakdownGroup",
    "initialPricingInfo",
    "proposedServiceInformation"
})
public class PassengerDetailsInfoType {

    @XmlElement(required = true)
    protected FareInformationType fareInfo;
    protected NumberOfUnitsType67575S flightsCountInfo;
    protected PricingTicketingDetailsType67619S pricingticketingDetails;
    protected ConversionRateType67611S conversionRate;
    protected MonetaryInformationType monetaryInfo;
    protected List<DiscountAndPenaltyInformationType> discountAndPenaltyInfo;
    protected List<InteractiveFreeTextType> interactiveFreeText;
    protected FormOfPaymentType formOfPaymentInfo;
    protected List<TaxDetailsInfoType> taxDetailsInfoGroup;
    protected List<FareCalcConstructionInfoType> fareCalcConstructionInfo;
    protected List<FareSegmentInfoType> fareSegmentInfo;
    protected TicketingAdditionalInfoType ticketingAddInfoGroup;
    protected FareComponentsInfoType fareComponentsInfoGroup;
    protected CorporateFareInformationType corporateFareInfo;
    protected List<FeeBreakdownType> feeBreakdownGroup;
    protected BinaryDataType initialPricingInfo;
    protected List<ProposedServiceInfoType> proposedServiceInformation;

    /**
     * Gets the value of the fareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformationType }
     *     
     */
    public FareInformationType getFareInfo() {
        return fareInfo;
    }

    /**
     * Sets the value of the fareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformationType }
     *     
     */
    public void setFareInfo(FareInformationType value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the flightsCountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType67575S }
     *     
     */
    public NumberOfUnitsType67575S getFlightsCountInfo() {
        return flightsCountInfo;
    }

    /**
     * Sets the value of the flightsCountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType67575S }
     *     
     */
    public void setFlightsCountInfo(NumberOfUnitsType67575S value) {
        this.flightsCountInfo = value;
    }

    /**
     * Gets the value of the pricingticketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsType67619S }
     *     
     */
    public PricingTicketingDetailsType67619S getPricingticketingDetails() {
        return pricingticketingDetails;
    }

    /**
     * Sets the value of the pricingticketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsType67619S }
     *     
     */
    public void setPricingticketingDetails(PricingTicketingDetailsType67619S value) {
        this.pricingticketingDetails = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType67611S }
     *     
     */
    public ConversionRateType67611S getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType67611S }
     *     
     */
    public void setConversionRate(ConversionRateType67611S value) {
        this.conversionRate = value;
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
     * Gets the value of the discountAndPenaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountAndPenaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountAndPenaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountAndPenaltyInformationType }
     * 
     * 
     */
    public List<DiscountAndPenaltyInformationType> getDiscountAndPenaltyInfo() {
        if (discountAndPenaltyInfo == null) {
            discountAndPenaltyInfo = new ArrayList<DiscountAndPenaltyInformationType>();
        }
        return this.discountAndPenaltyInfo;
    }

    /**
     * Gets the value of the interactiveFreeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactiveFreeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractiveFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractiveFreeTextType }
     * 
     * 
     */
    public List<InteractiveFreeTextType> getInteractiveFreeText() {
        if (interactiveFreeText == null) {
            interactiveFreeText = new ArrayList<InteractiveFreeTextType>();
        }
        return this.interactiveFreeText;
    }

    /**
     * Gets the value of the formOfPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getFormOfPaymentInfo() {
        return formOfPaymentInfo;
    }

    /**
     * Sets the value of the formOfPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setFormOfPaymentInfo(FormOfPaymentType value) {
        this.formOfPaymentInfo = value;
    }

    /**
     * Gets the value of the taxDetailsInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetailsInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetailsInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsInfoType }
     * 
     * 
     */
    public List<TaxDetailsInfoType> getTaxDetailsInfoGroup() {
        if (taxDetailsInfoGroup == null) {
            taxDetailsInfoGroup = new ArrayList<TaxDetailsInfoType>();
        }
        return this.taxDetailsInfoGroup;
    }

    /**
     * Gets the value of the fareCalcConstructionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareCalcConstructionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareCalcConstructionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareCalcConstructionInfoType }
     * 
     * 
     */
    public List<FareCalcConstructionInfoType> getFareCalcConstructionInfo() {
        if (fareCalcConstructionInfo == null) {
            fareCalcConstructionInfo = new ArrayList<FareCalcConstructionInfoType>();
        }
        return this.fareCalcConstructionInfo;
    }

    /**
     * Gets the value of the fareSegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareSegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSegmentInfoType }
     * 
     * 
     */
    public List<FareSegmentInfoType> getFareSegmentInfo() {
        if (fareSegmentInfo == null) {
            fareSegmentInfo = new ArrayList<FareSegmentInfoType>();
        }
        return this.fareSegmentInfo;
    }

    /**
     * Gets the value of the ticketingAddInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingAdditionalInfoType }
     *     
     */
    public TicketingAdditionalInfoType getTicketingAddInfoGroup() {
        return ticketingAddInfoGroup;
    }

    /**
     * Sets the value of the ticketingAddInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingAdditionalInfoType }
     *     
     */
    public void setTicketingAddInfoGroup(TicketingAdditionalInfoType value) {
        this.ticketingAddInfoGroup = value;
    }

    /**
     * Gets the value of the fareComponentsInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentsInfoType }
     *     
     */
    public FareComponentsInfoType getFareComponentsInfoGroup() {
        return fareComponentsInfoGroup;
    }

    /**
     * Sets the value of the fareComponentsInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentsInfoType }
     *     
     */
    public void setFareComponentsInfoGroup(FareComponentsInfoType value) {
        this.fareComponentsInfoGroup = value;
    }

    /**
     * Gets the value of the corporateFareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public CorporateFareInformationType getCorporateFareInfo() {
        return corporateFareInfo;
    }

    /**
     * Sets the value of the corporateFareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public void setCorporateFareInfo(CorporateFareInformationType value) {
        this.corporateFareInfo = value;
    }

    /**
     * Gets the value of the feeBreakdownGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeBreakdownGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeBreakdownGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeBreakdownType }
     * 
     * 
     */
    public List<FeeBreakdownType> getFeeBreakdownGroup() {
        if (feeBreakdownGroup == null) {
            feeBreakdownGroup = new ArrayList<FeeBreakdownType>();
        }
        return this.feeBreakdownGroup;
    }

    /**
     * Gets the value of the initialPricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataType }
     *     
     */
    public BinaryDataType getInitialPricingInfo() {
        return initialPricingInfo;
    }

    /**
     * Sets the value of the initialPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataType }
     *     
     */
    public void setInitialPricingInfo(BinaryDataType value) {
        this.initialPricingInfo = value;
    }

    /**
     * Gets the value of the proposedServiceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposedServiceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposedServiceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposedServiceInfoType }
     * 
     * 
     */
    public List<ProposedServiceInfoType> getProposedServiceInformation() {
        if (proposedServiceInformation == null) {
            proposedServiceInformation = new ArrayList<ProposedServiceInfoType>();
        }
        return this.proposedServiceInformation;
    }

}
