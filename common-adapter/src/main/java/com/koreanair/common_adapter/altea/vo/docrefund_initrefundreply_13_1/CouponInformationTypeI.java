//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.06 at 08:49:37 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.docrefund_initrefundreply_13_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify data specific to a value (flight) coupon.
 * 
 * <p>Java class for CouponInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponDetails" type="{http://xml.amadeus.com/TRFSRR_13_1_1A}CouponInformationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationTypeI", propOrder = {
    "couponDetails"
})
public class CouponInformationTypeI {

    @XmlElement(required = true)
    protected CouponInformationDetailsTypeI couponDetails;

    /**
     * Gets the value of the couponDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationDetailsTypeI }
     *     
     */
    public CouponInformationDetailsTypeI getCouponDetails() {
        return couponDetails;
    }

    /**
     * Sets the value of the couponDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationDetailsTypeI }
     *     
     */
    public void setCouponDetails(CouponInformationDetailsTypeI value) {
        this.couponDetails = value;
    }

}
