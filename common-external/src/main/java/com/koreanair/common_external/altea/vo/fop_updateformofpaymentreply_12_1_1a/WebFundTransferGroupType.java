//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:59 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_updateformofpaymentreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all MOP specific data for Web Fund Transfer
 * 
 * <p>Java class for WebFundTransferGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebFundTransferGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuerId" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ReferenceInfoType_68624S"/>
 *         &lt;element name="paymentProvider" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}CompanyInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFundTransferGroupType", propOrder = {
    "issuerId",
    "paymentProvider"
})
public class WebFundTransferGroupType {

    @XmlElement(required = true)
    protected ReferenceInfoType68624S issuerId;
    @XmlElement(required = true)
    protected CompanyInformationType paymentProvider;

    /**
     * Gets the value of the issuerId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType68624S }
     *     
     */
    public ReferenceInfoType68624S getIssuerId() {
        return issuerId;
    }

    /**
     * Sets the value of the issuerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType68624S }
     *     
     */
    public void setIssuerId(ReferenceInfoType68624S value) {
        this.issuerId = value;
    }

    /**
     * Gets the value of the paymentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType }
     *     
     */
    public CompanyInformationType getPaymentProvider() {
        return paymentProvider;
    }

    /**
     * Sets the value of the paymentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType }
     *     
     */
    public void setPaymentProvider(CompanyInformationType value) {
        this.paymentProvider = value;
    }

}
