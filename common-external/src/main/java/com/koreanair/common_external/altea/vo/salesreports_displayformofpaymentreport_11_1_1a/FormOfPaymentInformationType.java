//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:12:44 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displayformofpaymentreport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations related to the form of payment specific to reporting
 * 
 * <p>Java class for FormOfPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopCode" type="{http://xml.amadeus.com/TSRFRQ_11_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="fopBillingCode" type="{http://xml.amadeus.com/TSRFRQ_11_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentInformationType", propOrder = {
    "fopCode",
    "fopBillingCode"
})
public class FormOfPaymentInformationType {

    protected String fopCode;
    protected String fopBillingCode;

    /**
     * Gets the value of the fopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopCode() {
        return fopCode;
    }

    /**
     * Sets the value of the fopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopCode(String value) {
        this.fopCode = value;
    }

    /**
     * Gets the value of the fopBillingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopBillingCode() {
        return fopBillingCode;
    }

    /**
     * Sets the value of the fopBillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopBillingCode(String value) {
        this.fopBillingCode = value;
    }

}
