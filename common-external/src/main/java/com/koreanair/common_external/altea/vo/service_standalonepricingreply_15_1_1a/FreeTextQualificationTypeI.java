//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:25 AM KST 
//


package com.koreanair.common_external.altea.vo.service_standalonepricingreply_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type, purpose, and language of free text and whether any action is required.
 * 
 * <p>Java class for FreeTextQualificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextQualificationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textSubjectQualifier" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="informationType" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextQualificationTypeI", propOrder = {
    "textSubjectQualifier",
    "informationType"
})
public class FreeTextQualificationTypeI {

    @XmlElement(required = true)
    protected String textSubjectQualifier;
    protected String informationType;

    /**
     * Gets the value of the textSubjectQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /**
     * Sets the value of the textSubjectQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextSubjectQualifier(String value) {
        this.textSubjectQualifier = value;
    }

    /**
     * Gets the value of the informationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationType() {
        return informationType;
    }

    /**
     * Sets the value of the informationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationType(String value) {
        this.informationType = value;
    }

}
