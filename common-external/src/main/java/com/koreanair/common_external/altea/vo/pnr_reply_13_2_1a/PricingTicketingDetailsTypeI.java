//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceTicketDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PricingTicketingInformationTypeI" minOccurs="0"/>
 *         &lt;element name="priceTariffType" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsTypeI", propOrder = {
    "priceTicketDetails",
    "priceTariffType"
})
public class PricingTicketingDetailsTypeI {

    protected PricingTicketingInformationTypeI priceTicketDetails;
    @XmlElement(required = true)
    protected String priceTariffType;

    /**
     * Gets the value of the priceTicketDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationTypeI }
     *     
     */
    public PricingTicketingInformationTypeI getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /**
     * Sets the value of the priceTicketDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationTypeI }
     *     
     */
    public void setPriceTicketDetails(PricingTicketingInformationTypeI value) {
        this.priceTicketDetails = value;
    }

    /**
     * Gets the value of the priceTariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTariffType() {
        return priceTariffType;
    }

    /**
     * Sets the value of the priceTariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTariffType(String value) {
        this.priceTariffType = value;
    }

}
