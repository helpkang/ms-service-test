//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsynchPaymentGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsynchPaymentGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asunchronousPaymentDetails" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FormOfPaymentTypeI_69625S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsynchPaymentGroupType", propOrder = {
    "asunchronousPaymentDetails"
})
public class AsynchPaymentGroupType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI69625S asunchronousPaymentDetails;

    /**
     * Gets the value of the asunchronousPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI69625S }
     *     
     */
    public FormOfPaymentTypeI69625S getAsunchronousPaymentDetails() {
        return asunchronousPaymentDetails;
    }

    /**
     * Sets the value of the asunchronousPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI69625S }
     *     
     */
    public void setAsunchronousPaymentDetails(FormOfPaymentTypeI69625S value) {
        this.asunchronousPaymentDetails = value;
    }

}
