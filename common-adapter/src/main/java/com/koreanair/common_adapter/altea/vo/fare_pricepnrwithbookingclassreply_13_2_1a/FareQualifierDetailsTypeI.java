//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 09:23:07 AM KST 
//


package com.koreanair.common_adapter.altea.vo.fare_pricepnrwithbookingclassreply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the fare basis information
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
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AdditionalFareQualifierDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="zapOffDetails" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}DiscountPenaltyInformationTypeI" minOccurs="0"/>
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
    "fareBasisDetails",
    "zapOffDetails"
})
public class FareQualifierDetailsTypeI {

    protected String movementType;
    protected AdditionalFareQualifierDetailsTypeI fareBasisDetails;
    protected DiscountPenaltyInformationTypeI zapOffDetails;

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
     * Gets the value of the fareBasisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public AdditionalFareQualifierDetailsTypeI getFareBasisDetails() {
        return fareBasisDetails;
    }

    /**
     * Sets the value of the fareBasisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public void setFareBasisDetails(AdditionalFareQualifierDetailsTypeI value) {
        this.fareBasisDetails = value;
    }

    /**
     * Gets the value of the zapOffDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyInformationTypeI }
     *     
     */
    public DiscountPenaltyInformationTypeI getZapOffDetails() {
        return zapOffDetails;
    }

    /**
     * Sets the value of the zapOffDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyInformationTypeI }
     *     
     */
    public void setZapOffDetails(DiscountPenaltyInformationTypeI value) {
        this.zapOffDetails = value;
    }

}
