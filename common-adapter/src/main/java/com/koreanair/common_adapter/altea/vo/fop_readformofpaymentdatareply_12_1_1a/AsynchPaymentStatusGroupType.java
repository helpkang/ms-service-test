//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:46 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_readformofpaymentdatareply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsynchPaymentStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsynchPaymentStatusGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalReferenceNumber" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}GenericAuthorisationResultType_68631S"/>
 *         &lt;element name="asyncPaymentUrl" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}CommunicationContactType_90051S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsynchPaymentStatusGroupType", propOrder = {
    "approvalReferenceNumber",
    "asyncPaymentUrl"
})
public class AsynchPaymentStatusGroupType {

    @XmlElement(required = true)
    protected GenericAuthorisationResultType68631S approvalReferenceNumber;
    protected CommunicationContactType90051S asyncPaymentUrl;

    /**
     * Gets the value of the approvalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAuthorisationResultType68631S }
     *     
     */
    public GenericAuthorisationResultType68631S getApprovalReferenceNumber() {
        return approvalReferenceNumber;
    }

    /**
     * Sets the value of the approvalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAuthorisationResultType68631S }
     *     
     */
    public void setApprovalReferenceNumber(GenericAuthorisationResultType68631S value) {
        this.approvalReferenceNumber = value;
    }

    /**
     * Gets the value of the asyncPaymentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType90051S }
     *     
     */
    public CommunicationContactType90051S getAsyncPaymentUrl() {
        return asyncPaymentUrl;
    }

    /**
     * Sets the value of the asyncPaymentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType90051S }
     *     
     */
    public void setAsyncPaymentUrl(CommunicationContactType90051S value) {
        this.asyncPaymentUrl = value;
    }

}
