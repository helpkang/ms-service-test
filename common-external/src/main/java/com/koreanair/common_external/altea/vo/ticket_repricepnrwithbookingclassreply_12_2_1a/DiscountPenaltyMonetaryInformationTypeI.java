//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:52 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_repricepnrwithbookingclassreply_12_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of discount and penalty information, the monetary amount, and associated information.
 * 
 * <p>Java class for DiscountPenaltyMonetaryInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPenaltyMonetaryInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penaltyType" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="penaltyQualifier" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="penaltyAmount" type="{http://xml.amadeus.com/TARIPR_12_2_1A}NumericDecimal_Length1To11" minOccurs="0"/>
 *         &lt;element name="discountCode" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="penaltyCurrency" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPenaltyMonetaryInformationTypeI", propOrder = {
    "penaltyType",
    "penaltyQualifier",
    "penaltyAmount",
    "discountCode",
    "penaltyCurrency"
})
public class DiscountPenaltyMonetaryInformationTypeI {

    protected String penaltyType;
    protected String penaltyQualifier;
    protected BigDecimal penaltyAmount;
    protected String discountCode;
    protected String penaltyCurrency;

    /**
     * Gets the value of the penaltyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyType() {
        return penaltyType;
    }

    /**
     * Sets the value of the penaltyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyType(String value) {
        this.penaltyType = value;
    }

    /**
     * Gets the value of the penaltyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyQualifier() {
        return penaltyQualifier;
    }

    /**
     * Sets the value of the penaltyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyQualifier(String value) {
        this.penaltyQualifier = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyAmount(BigDecimal value) {
        this.penaltyAmount = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the penaltyCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyCurrency() {
        return penaltyCurrency;
    }

    /**
     * Sets the value of the penaltyCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyCurrency(String value) {
        this.penaltyCurrency = value;
    }

}
