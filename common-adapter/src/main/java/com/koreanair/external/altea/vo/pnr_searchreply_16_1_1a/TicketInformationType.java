//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 10:34:16 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_searchreply_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queueingOfficeId" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To69" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketInformationType", propOrder = {
    "queueingOfficeId",
    "location"
})
public class TicketInformationType {

    protected String queueingOfficeId;
    protected String location;

    /**
     * Gets the value of the queueingOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueingOfficeId() {
        return queueingOfficeId;
    }

    /**
     * Sets the value of the queueingOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueingOfficeId(String value) {
        this.queueingOfficeId = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
