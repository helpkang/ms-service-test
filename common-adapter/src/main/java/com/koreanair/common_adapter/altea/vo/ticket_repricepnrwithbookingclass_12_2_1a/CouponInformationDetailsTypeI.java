//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:46 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.ticket_repricepnrwithbookingclass_12_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the coupon number, status, value, and other related information.
 * 
 * <p>Java class for CouponInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpnNumber" type="{http://xml.amadeus.com/TARIPQ_12_2_1A}AlphaNumericString_Length1To6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationDetailsTypeI", propOrder = {
    "cpnNumber"
})
public class CouponInformationDetailsTypeI {

    @XmlElement(required = true)
    protected String cpnNumber;

    /**
     * Gets the value of the cpnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /**
     * Sets the value of the cpnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnNumber(String value) {
        this.cpnNumber = value;
    }

}
