//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:52 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_repricepnrwithbookingclassreply_12_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * <p>Java class for MonetaryInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDataQualifier" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="fareAmount" type="{http://xml.amadeus.com/TARIPR_12_2_1A}NumericDecimal_Length1To35" minOccurs="0"/>
 *         &lt;element name="fareCurrency" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareLocation" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationDetailsType", propOrder = {
    "fareDataQualifier",
    "fareAmount",
    "fareCurrency",
    "fareLocation"
})
public class MonetaryInformationDetailsType {

    @XmlElement(required = true)
    protected String fareDataQualifier;
    protected BigDecimal fareAmount;
    protected String fareCurrency;
    protected String fareLocation;

    /**
     * Gets the value of the fareDataQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDataQualifier() {
        return fareDataQualifier;
    }

    /**
     * Sets the value of the fareDataQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDataQualifier(String value) {
        this.fareDataQualifier = value;
    }

    /**
     * Gets the value of the fareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFareAmount() {
        return fareAmount;
    }

    /**
     * Sets the value of the fareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFareAmount(BigDecimal value) {
        this.fareAmount = value;
    }

    /**
     * Gets the value of the fareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCurrency() {
        return fareCurrency;
    }

    /**
     * Sets the value of the fareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCurrency(String value) {
        this.fareCurrency = value;
    }

    /**
     * Gets the value of the fareLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLocation() {
        return fareLocation;
    }

    /**
     * Sets the value of the fareLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLocation(String value) {
        this.fareLocation = value;
    }

}
