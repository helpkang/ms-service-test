//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the approval data of the transaction
 * 
 * <p>Java class for GenericAuthorisationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericAuthorisationResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalCodeData" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AuthorizationApprovalDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAuthorisationResultType", propOrder = {
    "approvalCodeData"
})
public class GenericAuthorisationResultType {

    @XmlElement(required = true)
    protected AuthorizationApprovalDataType approvalCodeData;

    /**
     * Gets the value of the approvalCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationApprovalDataType }
     *     
     */
    public AuthorizationApprovalDataType getApprovalCodeData() {
        return approvalCodeData;
    }

    /**
     * Sets the value of the approvalCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationApprovalDataType }
     *     
     */
    public void setApprovalCodeData(AuthorizationApprovalDataType value) {
        this.approvalCodeData = value;
    }

}
