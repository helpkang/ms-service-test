//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a frequency and the time window in which it applies.
 * 
 * <p>Java class for FrequencyTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequencyTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendedPaymentDetails" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FrequencyDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyTypeU", propOrder = {
    "extendedPaymentDetails"
})
public class FrequencyTypeU {

    @XmlElement(required = true)
    protected FrequencyDetailsTypeU extendedPaymentDetails;

    /**
     * Gets the value of the extendedPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDetailsTypeU }
     *     
     */
    public FrequencyDetailsTypeU getExtendedPaymentDetails() {
        return extendedPaymentDetails;
    }

    /**
     * Sets the value of the extendedPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDetailsTypeU }
     *     
     */
    public void setExtendedPaymentDetails(FrequencyDetailsTypeU value) {
        this.extendedPaymentDetails = value;
    }

}
