//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:23 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_upgraderedemptionreply_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorInfo" type="{http://xml.amadeus.com/FFURES_13_1_1A}ApplicationErrorInformationTypeI"/>
 *         &lt;element name="errorText" type="{http://xml.amadeus.com/FFURES_13_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGroupType", propOrder = {
    "errorInfo",
    "errorText"
})
public class ErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationTypeI errorInfo;
    protected InteractiveFreeTextTypeI errorText;

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public ApplicationErrorInformationTypeI getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public void setErrorInfo(ApplicationErrorInformationTypeI value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public InteractiveFreeTextTypeI getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public void setErrorText(InteractiveFreeTextTypeI value) {
        this.errorText = value;
    }

}
