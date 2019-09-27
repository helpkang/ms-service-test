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
 * To specify the details which qualify a fare
 * 
 * <p>Java class for FareQualifierDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareCategories" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}FareCategoryCodesTypeI" minOccurs="0"/>
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}FareDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="additionalFareDetails" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AdditionalFareQualifierDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}DiscountPenaltyInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsTypeI", propOrder = {
    "movementType",
    "fareCategories",
    "fareDetails",
    "additionalFareDetails",
    "discountDetails"
})
public class FareQualifierDetailsTypeI {

    protected String movementType;
    protected FareCategoryCodesTypeI fareCategories;
    protected FareDetailsTypeI fareDetails;
    protected AdditionalFareQualifierDetailsTypeI additionalFareDetails;
    protected DiscountPenaltyInformationTypeI discountDetails;

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the fareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public FareCategoryCodesTypeI getFareCategories() {
        return fareCategories;
    }

    /**
     * Sets the value of the fareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public void setFareCategories(FareCategoryCodesTypeI value) {
        this.fareCategories = value;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public FareDetailsTypeI getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public void setFareDetails(FareDetailsTypeI value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the additionalFareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public AdditionalFareQualifierDetailsTypeI getAdditionalFareDetails() {
        return additionalFareDetails;
    }

    /**
     * Sets the value of the additionalFareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public void setAdditionalFareDetails(AdditionalFareQualifierDetailsTypeI value) {
        this.additionalFareDetails = value;
    }

    /**
     * Gets the value of the discountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyInformationTypeI }
     *     
     */
    public DiscountPenaltyInformationTypeI getDiscountDetails() {
        return discountDetails;
    }

    /**
     * Sets the value of the discountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyInformationTypeI }
     *     
     */
    public void setDiscountDetails(DiscountPenaltyInformationTypeI value) {
        this.discountDetails = value;
    }

}
