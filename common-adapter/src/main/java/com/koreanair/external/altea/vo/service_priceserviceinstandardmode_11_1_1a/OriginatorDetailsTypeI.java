//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Characteristics of the originator of a request.
 * 
 * <p>Java class for OriginatorDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codedCountry" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="codedCurrency" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="codedLanguage" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorDetailsTypeI", propOrder = {
    "codedCountry",
    "codedCurrency",
    "codedLanguage"
})
public class OriginatorDetailsTypeI {

    protected String codedCountry;
    protected String codedCurrency;
    protected String codedLanguage;

    /**
     * Gets the value of the codedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedCountry() {
        return codedCountry;
    }

    /**
     * Sets the value of the codedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedCountry(String value) {
        this.codedCountry = value;
    }

    /**
     * Gets the value of the codedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedCurrency() {
        return codedCurrency;
    }

    /**
     * Sets the value of the codedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedCurrency(String value) {
        this.codedCurrency = value;
    }

    /**
     * Gets the value of the codedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedLanguage() {
        return codedLanguage;
    }

    /**
     * Sets the value of the codedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedLanguage(String value) {
        this.codedLanguage = value;
    }

}
