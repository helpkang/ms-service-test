//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of discount and penalty information, the monetary amount, and associated information.
 * 
 * <p>Java class for DiscountPenaltyMonetaryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPenaltyMonetaryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="function" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="amountType" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/TPICGR_13_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPenaltyMonetaryInformationType", propOrder = {
    "function",
    "amountType",
    "amount",
    "rate",
    "currency"
})
public class DiscountPenaltyMonetaryInformationType {

    protected String function;
    protected String amountType;
    protected BigDecimal amount;
    protected String rate;
    protected String currency;

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
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

}
