//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for AllFaresInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllFaresInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}StatusType"/>
 *         &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PricingTicketingDetailsType" minOccurs="0"/>
 *         &lt;element name="taxesDetailsInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TaxType" minOccurs="0"/>
 *         &lt;element name="involvedCurrenciesInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ConversionRateType" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}MonetaryInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="numberInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}NumberOfUnitsTypeI" minOccurs="0"/>
 *         &lt;element name="issueOriginatorGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}IssueOriginatorType" minOccurs="0"/>
 *         &lt;element name="faresInfoPerPassengerGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PassengerFaresInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="flightInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FlightInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="fareProductInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FareProductInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFaresInfoType", propOrder = {
    "statusInfo",
    "pricingTicketingDetails",
    "taxesDetailsInfo",
    "involvedCurrenciesInfo",
    "monetaryInfo",
    "numberInfo",
    "issueOriginatorGroup",
    "faresInfoPerPassengerGroup",
    "flightInfoGroup",
    "fareProductInfoGroup"
})
public class AllFaresInfoType {

    @XmlElement(required = true)
    protected StatusType statusInfo;
    protected PricingTicketingDetailsType pricingTicketingDetails;
    protected TaxType taxesDetailsInfo;
    protected ConversionRateType involvedCurrenciesInfo;
    protected List<MonetaryInformationType> monetaryInfo;
    protected NumberOfUnitsTypeI numberInfo;
    protected IssueOriginatorType issueOriginatorGroup;
    protected List<PassengerFaresInfoType> faresInfoPerPassengerGroup;
    protected List<FlightInformationType> flightInfoGroup;
    protected FareProductInfoType fareProductInfoGroup;

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatusInfo(StatusType value) {
        this.statusInfo = value;
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

    /**
     * Gets the value of the taxesDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxesDetailsInfo() {
        return taxesDetailsInfo;
    }

    /**
     * Sets the value of the taxesDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxesDetailsInfo(TaxType value) {
        this.taxesDetailsInfo = value;
    }

    /**
     * Gets the value of the involvedCurrenciesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType }
     *     
     */
    public ConversionRateType getInvolvedCurrenciesInfo() {
        return involvedCurrenciesInfo;
    }

    /**
     * Sets the value of the involvedCurrenciesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType }
     *     
     */
    public void setInvolvedCurrenciesInfo(ConversionRateType value) {
        this.involvedCurrenciesInfo = value;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationType }
     * 
     * 
     */
    public List<MonetaryInformationType> getMonetaryInfo() {
        if (monetaryInfo == null) {
            monetaryInfo = new ArrayList<MonetaryInformationType>();
        }
        return this.monetaryInfo;
    }

    /**
     * Gets the value of the numberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public NumberOfUnitsTypeI getNumberInfo() {
        return numberInfo;
    }

    /**
     * Sets the value of the numberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public void setNumberInfo(NumberOfUnitsTypeI value) {
        this.numberInfo = value;
    }

    /**
     * Gets the value of the issueOriginatorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link IssueOriginatorType }
     *     
     */
    public IssueOriginatorType getIssueOriginatorGroup() {
        return issueOriginatorGroup;
    }

    /**
     * Sets the value of the issueOriginatorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueOriginatorType }
     *     
     */
    public void setIssueOriginatorGroup(IssueOriginatorType value) {
        this.issueOriginatorGroup = value;
    }

    /**
     * Gets the value of the faresInfoPerPassengerGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faresInfoPerPassengerGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaresInfoPerPassengerGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFaresInfoType }
     * 
     * 
     */
    public List<PassengerFaresInfoType> getFaresInfoPerPassengerGroup() {
        if (faresInfoPerPassengerGroup == null) {
            faresInfoPerPassengerGroup = new ArrayList<PassengerFaresInfoType>();
        }
        return this.faresInfoPerPassengerGroup;
    }

    /**
     * Gets the value of the flightInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInformationType }
     * 
     * 
     */
    public List<FlightInformationType> getFlightInfoGroup() {
        if (flightInfoGroup == null) {
            flightInfoGroup = new ArrayList<FlightInformationType>();
        }
        return this.flightInfoGroup;
    }

    /**
     * Gets the value of the fareProductInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareProductInfoType }
     *     
     */
    public FareProductInfoType getFareProductInfoGroup() {
        return fareProductInfoGroup;
    }

    /**
     * Sets the value of the fareProductInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductInfoType }
     *     
     */
    public void setFareProductInfoGroup(FareProductInfoType value) {
        this.fareProductInfoGroup = value;
    }

}
