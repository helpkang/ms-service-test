//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.common_external.altea.vo.service_integratedpricingreply_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a segment of an itinerary and related details.
 * 
 * <p>Java class for TravellerInsuranceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInsuranceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentItemNumber" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="numericReferenceId" type="{http://xml.amadeus.com/TPISGR_15_1_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="cabinDesignator" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInsuranceInformationType", propOrder = {
    "segmentItemNumber",
    "numericReferenceId",
    "cabinDesignator"
})
public class TravellerInsuranceInformationType {

    protected String segmentItemNumber;
    protected BigInteger numericReferenceId;
    protected String cabinDesignator;

    /**
     * Gets the value of the segmentItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentItemNumber() {
        return segmentItemNumber;
    }

    /**
     * Sets the value of the segmentItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentItemNumber(String value) {
        this.segmentItemNumber = value;
    }

    /**
     * Gets the value of the numericReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumericReferenceId() {
        return numericReferenceId;
    }

    /**
     * Sets the value of the numericReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumericReferenceId(BigInteger value) {
        this.numericReferenceId = value;
    }

    /**
     * Gets the value of the cabinDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinDesignator() {
        return cabinDesignator;
    }

    /**
     * Sets the value of the cabinDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinDesignator(String value) {
        this.cabinDesignator = value;
    }

}
