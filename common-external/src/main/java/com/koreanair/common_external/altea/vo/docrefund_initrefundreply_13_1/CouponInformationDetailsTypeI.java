//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.06 at 08:49:37 ���� KST 
//


package com.koreanair.common_external.altea.vo.docrefund_initrefundreply_13_1;

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
 *         &lt;element name="cpnNumber" type="{http://xml.amadeus.com/TRFSRR_13_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="cpnStatus" type="{http://xml.amadeus.com/TRFSRR_13_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="settlementAuthorization" type="{http://xml.amadeus.com/TRFSRR_13_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
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
    "cpnNumber",
    "cpnStatus",
    "settlementAuthorization"
})
public class CouponInformationDetailsTypeI {

    @XmlElement(required = true)
    protected String cpnNumber;
    @XmlElement(required = true)
    protected String cpnStatus;
    protected String settlementAuthorization;

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

    /**
     * Gets the value of the cpnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnStatus() {
        return cpnStatus;
    }

    /**
     * Sets the value of the cpnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnStatus(String value) {
        this.cpnStatus = value;
    }

    /**
     * Gets the value of the settlementAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthorization() {
        return settlementAuthorization;
    }

    /**
     * Sets the value of the settlementAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthorization(String value) {
        this.settlementAuthorization = value;
    }

}
