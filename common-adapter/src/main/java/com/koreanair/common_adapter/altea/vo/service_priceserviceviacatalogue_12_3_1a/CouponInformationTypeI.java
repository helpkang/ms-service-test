//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="couponDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}CouponInformationDetailsTypeI"/>
 *         &lt;element name="otherCouponDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}CouponInformationDetailsTypeI" maxOccurs="3" minOccurs="0"/>
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
    "couponDetails",
    "otherCouponDetails"
})
public class CouponInformationTypeI {

    @XmlElement(required = true)
    protected CouponInformationDetailsTypeI couponDetails;
    protected List<CouponInformationDetailsTypeI> otherCouponDetails;

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
     * {@link CouponInformationDetailsTypeI }
     * 
     * 
     */
    public List<CouponInformationDetailsTypeI> getOtherCouponDetails() {
        if (otherCouponDetails == null) {
            otherCouponDetails = new ArrayList<CouponInformationDetailsTypeI>();
        }
        return this.otherCouponDetails;
    }

}
