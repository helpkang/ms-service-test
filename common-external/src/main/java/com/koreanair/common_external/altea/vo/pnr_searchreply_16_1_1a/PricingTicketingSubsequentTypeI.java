//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 10:34:16 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_searchreply_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket.
 * 
 * <p>Java class for PricingTicketingSubsequentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mdNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentTypeI", propOrder = {
    "mdNumber"
})
public class PricingTicketingSubsequentTypeI {

    @XmlElement(required = true)
    protected String mdNumber;

    /**
     * Gets the value of the mdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdNumber() {
        return mdNumber;
    }

    /**
     * Sets the value of the mdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdNumber(String value) {
        this.mdNumber = value;
    }

}
