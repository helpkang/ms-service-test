//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataType" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="count" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="pricingDate" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="accountCode" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="inputDesignator" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentDetailsType", propOrder = {
    "dataType",
    "count",
    "pricingDate",
    "accountCode",
    "inputDesignator"
})
public class FareComponentDetailsType {

    protected String dataType;
    protected BigInteger count;
    protected String pricingDate;
    protected String accountCode;
    protected String inputDesignator;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingDate(String value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the inputDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDesignator() {
        return inputDesignator;
    }

    /**
     * Sets the value of the inputDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDesignator(String value) {
        this.inputDesignator = value;
    }

}
