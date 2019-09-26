//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountPenaltyQualifier" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="discountPenaltyDetails" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}DiscountPenaltyMonetaryInformationType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationType", propOrder = {
    "discountPenaltyQualifier",
    "discountPenaltyDetails"
})
public class DiscountAndPenaltyInformationType {

    protected String discountPenaltyQualifier;
    protected List<DiscountPenaltyMonetaryInformationType> discountPenaltyDetails;

    /**
     * Gets the value of the discountPenaltyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPenaltyQualifier() {
        return discountPenaltyQualifier;
    }

    /**
     * Sets the value of the discountPenaltyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPenaltyQualifier(String value) {
        this.discountPenaltyQualifier = value;
    }

    /**
     * Gets the value of the discountPenaltyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountPenaltyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPenaltyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyMonetaryInformationType }
     * 
     * 
     */
    public List<DiscountPenaltyMonetaryInformationType> getDiscountPenaltyDetails() {
        if (discountPenaltyDetails == null) {
            discountPenaltyDetails = new ArrayList<DiscountPenaltyMonetaryInformationType>();
        }
        return this.discountPenaltyDetails;
    }

}
