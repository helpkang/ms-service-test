//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_addmultielements_13_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravellerNameInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerNameInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/PNRADD_13_2_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="otherType" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="infantIndicator" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="travellerIdentificationCode" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerNameInfoType", propOrder = {
    "qualifier",
    "quantity",
    "type",
    "otherType",
    "infantIndicator",
    "travellerIdentificationCode"
})
public class TravellerNameInfoType {

    protected String qualifier;
    protected BigInteger quantity;
    protected String type;
    protected String otherType;
    protected String infantIndicator;
    protected String travellerIdentificationCode;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the travellerIdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerIdentificationCode() {
        return travellerIdentificationCode;
    }

    /**
     * Sets the value of the travellerIdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerIdentificationCode(String value) {
        this.travellerIdentificationCode = value;
    }

}
