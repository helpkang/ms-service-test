//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for TicketingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}PricingTicketingDetailsType"/>
 *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoType", propOrder = {
    "pricingTicketingDetails",
    "fareQualifierDetails"
})
public class TicketingInfoType {

    @XmlElement(required = true)
    protected PricingTicketingDetailsType pricingTicketingDetails;
    protected FareQualifierDetailsTypeI fareQualifierDetails;

    /**
     * Gets the value of the pricingTicketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsType }
     *     
     */
    public PricingTicketingDetailsType getPricingTicketingDetails() {
        return pricingTicketingDetails;
    }

    /**
     * Sets the value of the pricingTicketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsType }
     *     
     */
    public void setPricingTicketingDetails(PricingTicketingDetailsType value) {
        this.pricingTicketingDetails = value;
    }

    /**
     * Gets the value of the fareQualifierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierDetailsTypeI }
     *     
     */
    public FareQualifierDetailsTypeI getFareQualifierDetails() {
        return fareQualifierDetails;
    }

    /**
     * Sets the value of the fareQualifierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierDetailsTypeI }
     *     
     */
    public void setFareQualifierDetails(FareQualifierDetailsTypeI value) {
        this.fareQualifierDetails = value;
    }

}
