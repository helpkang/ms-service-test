//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:12 ���� KST 
//


package com.koreanair.common_external.altea.vo.docissuance_issueticket_09_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details releated to stock
 * 
 * <p>Java class for StockInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockTicketNumberDetails" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}StockTicketNumberDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockInformationType", propOrder = {
    "stockTicketNumberDetails"
})
public class StockInformationType {

    @XmlElement(required = true)
    protected StockTicketNumberDetailsType stockTicketNumberDetails;

    /**
     * Gets the value of the stockTicketNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StockTicketNumberDetailsType }
     *     
     */
    public StockTicketNumberDetailsType getStockTicketNumberDetails() {
        return stockTicketNumberDetails;
    }

    /**
     * Sets the value of the stockTicketNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockTicketNumberDetailsType }
     *     
     */
    public void setStockTicketNumberDetails(StockTicketNumberDetailsType value) {
        this.stockTicketNumberDetails = value;
    }

}
