//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

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
 *         &lt;element name="textSubjectQualifier" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="informationType" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
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
    "informationType",
    "status",
    "companyId"
})
public class FreeTextQualificationTypeI {

    @XmlElement(required = true)
    protected String textSubjectQualifier;
    protected String informationType;
    protected String status;
    protected String companyId;

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

}
