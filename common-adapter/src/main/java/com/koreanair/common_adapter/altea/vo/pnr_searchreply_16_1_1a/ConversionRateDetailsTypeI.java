//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 10:34:16 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_searchreply_16_1_1a;

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
 *         &lt;element name="currency" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="pricingAmount" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumericDecimal_Length1To11" minOccurs="0"/>
 *         &lt;element name="convertedValueAmount" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumericDecimal_Length1To11" minOccurs="0"/>
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
    "currency",
    "pricingAmount",
    "convertedValueAmount"
})
public class ConversionRateDetailsTypeI {

    protected String currency;
    protected BigDecimal pricingAmount;
    protected BigDecimal convertedValueAmount;

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
     * Gets the value of the convertedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConvertedValueAmount() {
        return convertedValueAmount;
    }

    /**
     * Sets the value of the convertedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConvertedValueAmount(BigDecimal value) {
        this.convertedValueAmount = value;
    }

}
