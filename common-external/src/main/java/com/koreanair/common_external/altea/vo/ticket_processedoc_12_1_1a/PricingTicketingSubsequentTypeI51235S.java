//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:57:48 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_processedoc_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket.
 * 
 * <p>Java class for PricingTicketingSubsequentTypeI_51235S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentTypeI_51235S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TATREQ_12_1_1A}RateTariffClassInformationTypeI_83791C" minOccurs="0"/>
 *         &lt;element name="specialCondition" type="{http://xml.amadeus.com/TATREQ_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="otherSpecialCondition" type="{http://xml.amadeus.com/TATREQ_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentTypeI_51235S", propOrder = {
    "fareBasisDetails",
    "specialCondition",
    "otherSpecialCondition"
})
public class PricingTicketingSubsequentTypeI51235S {

    protected RateTariffClassInformationTypeI83791C fareBasisDetails;
    protected String specialCondition;
    protected String otherSpecialCondition;

    /**
     * Gets the value of the fareBasisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RateTariffClassInformationTypeI83791C }
     *     
     */
    public RateTariffClassInformationTypeI83791C getFareBasisDetails() {
        return fareBasisDetails;
    }

    /**
     * Sets the value of the fareBasisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTariffClassInformationTypeI83791C }
     *     
     */
    public void setFareBasisDetails(RateTariffClassInformationTypeI83791C value) {
        this.fareBasisDetails = value;
    }

    /**
     * Gets the value of the specialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCondition() {
        return specialCondition;
    }

    /**
     * Sets the value of the specialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCondition(String value) {
        this.specialCondition = value;
    }

    /**
     * Gets the value of the otherSpecialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSpecialCondition() {
        return otherSpecialCondition;
    }

    /**
     * Sets the value of the otherSpecialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSpecialCondition(String value) {
        this.otherSpecialCondition = value;
    }

}
