//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 03:41:56 ���� KST 
//


package com.koreanair.common_external.altea.vo.docrefund_updaterefund_13_1_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the form of payment type, amounts, approval codes, and other related information.
 * 
 * <p>Java class for FormOfPaymentDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TRFUUQ_13_1_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/TRFUUQ_13_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="sourceOfApproval" type="{http://xml.amadeus.com/TRFUUQ_13_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="authorisedAmount" type="{http://xml.amadeus.com/TRFUUQ_13_1_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentDetailsTypeI", propOrder = {
    "type",
    "amount",
    "sourceOfApproval",
    "authorisedAmount"
})
public class FormOfPaymentDetailsTypeI {

    @XmlElement(required = true)
    protected String type;
    protected BigDecimal amount;
    protected String sourceOfApproval;
    protected BigInteger authorisedAmount;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the sourceOfApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfApproval() {
        return sourceOfApproval;
    }

    /**
     * Sets the value of the sourceOfApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfApproval(String value) {
        this.sourceOfApproval = value;
    }

    /**
     * Gets the value of the authorisedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorisedAmount() {
        return authorisedAmount;
    }

    /**
     * Sets the value of the authorisedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorisedAmount(BigInteger value) {
        this.authorisedAmount = value;
    }

}
