//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information related to a specific ticket.
 * 
 * <p>Java class for TicketNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}TicketNumberDetailsTypeI"/>
 *         &lt;element name="status" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberType", propOrder = {
    "documentDetails",
    "status"
})
public class TicketNumberType {

    @XmlElement(required = true)
    protected TicketNumberDetailsTypeI documentDetails;
    protected String status;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberDetailsTypeI }
     *     
     */
    public TicketNumberDetailsTypeI getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberDetailsTypeI }
     *     
     */
    public void setDocumentDetails(TicketNumberDetailsTypeI value) {
        this.documentDetails = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
