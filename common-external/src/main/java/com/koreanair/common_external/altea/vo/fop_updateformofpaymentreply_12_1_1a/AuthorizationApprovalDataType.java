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
 * will convey the approval data
 * 
 * <p>Java class for AuthorizationApprovalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationApprovalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalCode" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}AlphaNumericString_Length1To12"/>
 *         &lt;element name="sourceOfApproval" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationApprovalDataType", propOrder = {
    "approvalCode",
    "sourceOfApproval"
})
public class AuthorizationApprovalDataType {

    @XmlElement(required = true)
    protected String approvalCode;
    protected String sourceOfApproval;

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the sourceOfApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfApproval() {
        return sourceOfApproval;
    }

    /**
     * Sets the value of the sourceOfApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfApproval(String value) {
        this.sourceOfApproval = value;
    }

}
