//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Code assigned by the recipient of a message to indicate a data validation error condition.
 * 
 * <p>Java class for ApplicationErrorDetailTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorDetailTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="errorCategory" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="errorCodeOwner" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorDetailTypeI", propOrder = {
    "errorCode",
    "errorCategory",
    "errorCodeOwner"
})
public class ApplicationErrorDetailTypeI {

    @XmlElement(required = true)
    protected String errorCode;
    protected String errorCategory;
    protected String errorCodeOwner;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCategory() {
        return errorCategory;
    }

    /**
     * Sets the value of the errorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCategory(String value) {
        this.errorCategory = value;
    }

    /**
     * Gets the value of the errorCodeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCodeOwner() {
        return errorCodeOwner;
    }

    /**
     * Sets the value of the errorCodeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCodeOwner(String value) {
        this.errorCodeOwner = value;
    }

}
