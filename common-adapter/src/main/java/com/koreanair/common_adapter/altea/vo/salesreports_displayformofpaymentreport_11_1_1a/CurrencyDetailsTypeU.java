//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:12:44 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displayformofpaymentreport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The usage to which a currency relates
 * 
 * <p>Java class for CurrencyDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyQualifier" type="{http://xml.amadeus.com/TSRFRQ_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="currencyIsoCode" type="{http://xml.amadeus.com/TSRFRQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDetailsTypeU", propOrder = {
    "currencyQualifier",
    "currencyIsoCode"
})
public class CurrencyDetailsTypeU {

    @XmlElement(required = true)
    protected String currencyQualifier;
    protected String currencyIsoCode;

    /**
     * Gets the value of the currencyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyQualifier() {
        return currencyQualifier;
    }

    /**
     * Sets the value of the currencyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyQualifier(String value) {
        this.currencyQualifier = value;
    }

    /**
     * Gets the value of the currencyIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    /**
     * Sets the value of the currencyIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIsoCode(String value) {
        this.currencyIsoCode = value;
    }

}
