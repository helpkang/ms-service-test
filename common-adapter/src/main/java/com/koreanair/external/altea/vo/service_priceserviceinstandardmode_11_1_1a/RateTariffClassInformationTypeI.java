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
 * To identify the current and/or original fare basis code.
 * 
 * <p>Java class for RateTariffClassInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTariffClassInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateTariffClass" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="rateTariffIndicator" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="otherRateTariffClass" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="otherRateTariffIndicator" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTariffClassInformationTypeI", propOrder = {
    "rateTariffClass",
    "rateTariffIndicator",
    "otherRateTariffClass",
    "otherRateTariffIndicator"
})
public class RateTariffClassInformationTypeI {

    protected String rateTariffClass;
    protected String rateTariffIndicator;
    protected String otherRateTariffClass;
    protected String otherRateTariffIndicator;

    /**
     * Gets the value of the rateTariffClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTariffClass() {
        return rateTariffClass;
    }

    /**
     * Sets the value of the rateTariffClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTariffClass(String value) {
        this.rateTariffClass = value;
    }

    /**
     * Gets the value of the rateTariffIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTariffIndicator() {
        return rateTariffIndicator;
    }

    /**
     * Sets the value of the rateTariffIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTariffIndicator(String value) {
        this.rateTariffIndicator = value;
    }

    /**
     * Gets the value of the otherRateTariffClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRateTariffClass() {
        return otherRateTariffClass;
    }

    /**
     * Sets the value of the otherRateTariffClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRateTariffClass(String value) {
        this.otherRateTariffClass = value;
    }

    /**
     * Gets the value of the otherRateTariffIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRateTariffIndicator() {
        return otherRateTariffIndicator;
    }

    /**
     * Sets the value of the otherRateTariffIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRateTariffIndicator(String value) {
        this.otherRateTariffIndicator = value;
    }

}
