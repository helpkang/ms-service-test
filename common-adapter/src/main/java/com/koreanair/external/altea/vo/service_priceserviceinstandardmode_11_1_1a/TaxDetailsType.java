//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a rate, type of tax, and currency code.
 * 
 * <p>Java class for TaxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rate" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxTypeCode" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="taxAmountOrPercentageQual" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" maxOccurs="97" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailsType", propOrder = {
    "rate",
    "countryCode",
    "currencyCode",
    "taxTypeCode",
    "taxAmountOrPercentageQual",
    "type"
})
public class TaxDetailsType {

    protected String rate;
    protected String countryCode;
    protected String currencyCode;
    protected String taxTypeCode;
    protected String taxAmountOrPercentageQual;
    protected List<String> type;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    /**
     * Gets the value of the taxAmountOrPercentageQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmountOrPercentageQual() {
        return taxAmountOrPercentageQual;
    }

    /**
     * Sets the value of the taxAmountOrPercentageQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmountOrPercentageQual(String value) {
        this.taxAmountOrPercentageQual = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

}
