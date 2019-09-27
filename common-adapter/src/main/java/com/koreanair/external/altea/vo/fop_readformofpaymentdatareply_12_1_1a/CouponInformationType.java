//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:46 ���� KST 
//


package com.koreanair.external.altea.vo.fop_readformofpaymentdatareply_12_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify data specific to a value (flight) coupon.
 * 
 * <p>Java class for CouponInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponDetails" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}CouponInformationDetailsType" minOccurs="0"/>
 *         &lt;element name="otherCouponDetails" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}CouponInformationDetailsType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationType", propOrder = {
    "couponDetails",
    "otherCouponDetails"
})
public class CouponInformationType {

    protected CouponInformationDetailsType couponDetails;
    protected List<CouponInformationDetailsType> otherCouponDetails;

    /**
     * Gets the value of the couponDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationDetailsType }
     *     
     */
    public CouponInformationDetailsType getCouponDetails() {
        return couponDetails;
    }

    /**
     * Sets the value of the couponDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationDetailsType }
     *     
     */
    public void setCouponDetails(CouponInformationDetailsType value) {
        this.couponDetails = value;
    }

    /**
     * Gets the value of the otherCouponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCouponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponInformationDetailsType }
     * 
     * 
     */
    public List<CouponInformationDetailsType> getOtherCouponDetails() {
        if (otherCouponDetails == null) {
            otherCouponDetails = new ArrayList<CouponInformationDetailsType>();
        }
        return this.otherCouponDetails;
    }

}
