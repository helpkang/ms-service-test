//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:57:54 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_processedocreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare component data.
 * 
 * <p>Java class for FareComponentInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareComponentDetails" type="{http://xml.amadeus.com/TATRES_12_1_1A}FareComponentDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/TATRES_12_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentInformationTypeI", propOrder = {
    "fareComponentDetails",
    "ticketNumber"
})
public class FareComponentInformationTypeI {

    protected FareComponentDetailsTypeI fareComponentDetails;
    protected String ticketNumber;

    /**
     * Gets the value of the fareComponentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentDetailsTypeI }
     *     
     */
    public FareComponentDetailsTypeI getFareComponentDetails() {
        return fareComponentDetails;
    }

    /**
     * Sets the value of the fareComponentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentDetailsTypeI }
     *     
     */
    public void setFareComponentDetails(FareComponentDetailsTypeI value) {
        this.fareComponentDetails = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

}
