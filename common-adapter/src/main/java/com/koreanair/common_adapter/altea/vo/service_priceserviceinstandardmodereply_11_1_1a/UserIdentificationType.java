//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to identify a user.
 * 
 * <p>Java class for UserIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}OriginatorIdentificationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="originatorTypeCode" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="originator" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificationType", propOrder = {
    "originIdentification",
    "originatorTypeCode",
    "originator"
})
public class UserIdentificationType {

    protected OriginatorIdentificationDetailsTypeI originIdentification;
    protected String originatorTypeCode;
    protected String originator;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public OriginatorIdentificationDetailsTypeI getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI value) {
        this.originIdentification = value;
    }

    /**
     * Gets the value of the originatorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /**
     * Sets the value of the originatorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTypeCode(String value) {
        this.originatorTypeCode = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

}
