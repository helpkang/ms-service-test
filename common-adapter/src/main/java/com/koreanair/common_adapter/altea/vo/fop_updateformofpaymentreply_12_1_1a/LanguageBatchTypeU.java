//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:59 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_updateformofpaymentreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a language.
 * 
 * <p>Java class for LanguageBatchTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageBatchTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageQualifier" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="languageDetails" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}LanguageDetailsBatchTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageBatchTypeU", propOrder = {
    "languageQualifier",
    "languageDetails"
})
public class LanguageBatchTypeU {

    @XmlElement(required = true)
    protected String languageQualifier;
    @XmlElement(required = true)
    protected LanguageDetailsBatchTypeU languageDetails;

    /**
     * Gets the value of the languageQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageQualifier() {
        return languageQualifier;
    }

    /**
     * Sets the value of the languageQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageQualifier(String value) {
        this.languageQualifier = value;
    }

    /**
     * Gets the value of the languageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDetailsBatchTypeU }
     *     
     */
    public LanguageDetailsBatchTypeU getLanguageDetails() {
        return languageDetails;
    }

    /**
     * Sets the value of the languageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDetailsBatchTypeU }
     *     
     */
    public void setLanguageDetails(LanguageDetailsBatchTypeU value) {
        this.languageDetails = value;
    }

}
