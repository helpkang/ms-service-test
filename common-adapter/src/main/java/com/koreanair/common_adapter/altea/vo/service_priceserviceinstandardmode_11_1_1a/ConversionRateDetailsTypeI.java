//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the conversion rate and the monetary amount.
 * 
 * <p>Java class for ConversionRateDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionType" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="pricingAmount" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="dutyTaxFeeType" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="measurementValue" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="measurementSignificance" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateDetailsTypeI", propOrder = {
    "conversionType",
    "currency",
    "rateType",
    "pricingAmount",
    "conversionRate",
    "dutyTaxFeeType",
    "measurementValue",
    "measurementSignificance"
})
public class ConversionRateDetailsTypeI {

    protected String conversionType;
    protected String currency;
    protected String rateType;
    protected BigDecimal pricingAmount;
    protected BigDecimal conversionRate;
    protected String dutyTaxFeeType;
    protected BigDecimal measurementValue;
    protected String measurementSignificance;

    /**
     * Gets the value of the conversionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionType() {
        return conversionType;
    }

    /**
     * Sets the value of the conversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionType(String value) {
        this.conversionType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the pricingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingAmount() {
        return pricingAmount;
    }

    /**
     * Sets the value of the pricingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingAmount(BigDecimal value) {
        this.pricingAmount = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the dutyTaxFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyTaxFeeType() {
        return dutyTaxFeeType;
    }

    /**
     * Sets the value of the dutyTaxFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyTaxFeeType(String value) {
        this.dutyTaxFeeType = value;
    }

    /**
     * Gets the value of the measurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasurementValue() {
        return measurementValue;
    }

    /**
     * Sets the value of the measurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasurementValue(BigDecimal value) {
        this.measurementValue = value;
    }

    /**
     * Gets the value of the measurementSignificance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSignificance() {
        return measurementSignificance;
    }

    /**
     * Sets the value of the measurementSignificance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSignificance(String value) {
        this.measurementSignificance = value;
    }

}
