//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify indicators related to pricing and ticketing.
 * 
 * <p>Java class for PricingTicketingInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketingModeIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="internationalDomSalesIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="statisticalCode" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="selfSaleIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="netReportingIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxOnCommissionIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="nonEndorsableIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="nonRefundableIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="penaltyRestrictionIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="presentCreditCardIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator11" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator12" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator13" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="nonInterlineableIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator15" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="nonExchangeableIndicator" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator17" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator18" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator19" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator20" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingInformationTypeI", propOrder = {
    "ticketingModeIndicator",
    "internationalDomSalesIndicator",
    "statisticalCode",
    "selfSaleIndicator",
    "netReportingIndicator",
    "taxOnCommissionIndicator",
    "nonEndorsableIndicator",
    "nonRefundableIndicator",
    "penaltyRestrictionIndicator",
    "presentCreditCardIndicator",
    "indicator11",
    "indicator12",
    "indicator13",
    "nonInterlineableIndicator",
    "indicator15",
    "nonExchangeableIndicator",
    "indicator17",
    "indicator18",
    "indicator19",
    "indicator20"
})
public class PricingTicketingInformationTypeI {

    protected String ticketingModeIndicator;
    protected String internationalDomSalesIndicator;
    protected String statisticalCode;
    protected String selfSaleIndicator;
    protected String netReportingIndicator;
    protected String taxOnCommissionIndicator;
    protected String nonEndorsableIndicator;
    protected String nonRefundableIndicator;
    protected String penaltyRestrictionIndicator;
    protected String presentCreditCardIndicator;
    protected String indicator11;
    protected String indicator12;
    protected String indicator13;
    protected String nonInterlineableIndicator;
    protected String indicator15;
    protected String nonExchangeableIndicator;
    protected String indicator17;
    protected String indicator18;
    protected String indicator19;
    protected String indicator20;

    /**
     * Gets the value of the ticketingModeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingModeIndicator() {
        return ticketingModeIndicator;
    }

    /**
     * Sets the value of the ticketingModeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingModeIndicator(String value) {
        this.ticketingModeIndicator = value;
    }

    /**
     * Gets the value of the internationalDomSalesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalDomSalesIndicator() {
        return internationalDomSalesIndicator;
    }

    /**
     * Sets the value of the internationalDomSalesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalDomSalesIndicator(String value) {
        this.internationalDomSalesIndicator = value;
    }

    /**
     * Gets the value of the statisticalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCode() {
        return statisticalCode;
    }

    /**
     * Sets the value of the statisticalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalCode(String value) {
        this.statisticalCode = value;
    }

    /**
     * Gets the value of the selfSaleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfSaleIndicator() {
        return selfSaleIndicator;
    }

    /**
     * Sets the value of the selfSaleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfSaleIndicator(String value) {
        this.selfSaleIndicator = value;
    }

    /**
     * Gets the value of the netReportingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReportingIndicator() {
        return netReportingIndicator;
    }

    /**
     * Sets the value of the netReportingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetReportingIndicator(String value) {
        this.netReportingIndicator = value;
    }

    /**
     * Gets the value of the taxOnCommissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOnCommissionIndicator() {
        return taxOnCommissionIndicator;
    }

    /**
     * Sets the value of the taxOnCommissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOnCommissionIndicator(String value) {
        this.taxOnCommissionIndicator = value;
    }

    /**
     * Gets the value of the nonEndorsableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEndorsableIndicator() {
        return nonEndorsableIndicator;
    }

    /**
     * Sets the value of the nonEndorsableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEndorsableIndicator(String value) {
        this.nonEndorsableIndicator = value;
    }

    /**
     * Gets the value of the nonRefundableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRefundableIndicator() {
        return nonRefundableIndicator;
    }

    /**
     * Sets the value of the nonRefundableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRefundableIndicator(String value) {
        this.nonRefundableIndicator = value;
    }

    /**
     * Gets the value of the penaltyRestrictionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRestrictionIndicator() {
        return penaltyRestrictionIndicator;
    }

    /**
     * Sets the value of the penaltyRestrictionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRestrictionIndicator(String value) {
        this.penaltyRestrictionIndicator = value;
    }

    /**
     * Gets the value of the presentCreditCardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentCreditCardIndicator() {
        return presentCreditCardIndicator;
    }

    /**
     * Sets the value of the presentCreditCardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentCreditCardIndicator(String value) {
        this.presentCreditCardIndicator = value;
    }

    /**
     * Gets the value of the indicator11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator11() {
        return indicator11;
    }

    /**
     * Sets the value of the indicator11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator11(String value) {
        this.indicator11 = value;
    }

    /**
     * Gets the value of the indicator12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator12() {
        return indicator12;
    }

    /**
     * Sets the value of the indicator12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator12(String value) {
        this.indicator12 = value;
    }

    /**
     * Gets the value of the indicator13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator13() {
        return indicator13;
    }

    /**
     * Sets the value of the indicator13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator13(String value) {
        this.indicator13 = value;
    }

    /**
     * Gets the value of the nonInterlineableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonInterlineableIndicator() {
        return nonInterlineableIndicator;
    }

    /**
     * Sets the value of the nonInterlineableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonInterlineableIndicator(String value) {
        this.nonInterlineableIndicator = value;
    }

    /**
     * Gets the value of the indicator15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator15() {
        return indicator15;
    }

    /**
     * Sets the value of the indicator15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator15(String value) {
        this.indicator15 = value;
    }

    /**
     * Gets the value of the nonExchangeableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonExchangeableIndicator() {
        return nonExchangeableIndicator;
    }

    /**
     * Sets the value of the nonExchangeableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonExchangeableIndicator(String value) {
        this.nonExchangeableIndicator = value;
    }

    /**
     * Gets the value of the indicator17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator17() {
        return indicator17;
    }

    /**
     * Sets the value of the indicator17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator17(String value) {
        this.indicator17 = value;
    }

    /**
     * Gets the value of the indicator18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator18() {
        return indicator18;
    }

    /**
     * Sets the value of the indicator18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator18(String value) {
        this.indicator18 = value;
    }

    /**
     * Gets the value of the indicator19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator19() {
        return indicator19;
    }

    /**
     * Sets the value of the indicator19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator19(String value) {
        this.indicator19 = value;
    }

    /**
     * Gets the value of the indicator20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator20() {
        return indicator20;
    }

    /**
     * Sets the value of the indicator20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator20(String value) {
        this.indicator20 = value;
    }

}
