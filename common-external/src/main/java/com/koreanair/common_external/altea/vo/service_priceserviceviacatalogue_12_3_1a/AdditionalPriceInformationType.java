//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information concerning pricing related to class of trade, price multiplier, and reason for change.
 * 
 * <p>Java class for AdditionalPriceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalPriceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonForChangeDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ReasonForChangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalPriceInformationType", propOrder = {
    "reasonForChangeDetails"
})
public class AdditionalPriceInformationType {

    protected ReasonForChangeType reasonForChangeDetails;

    /**
     * Gets the value of the reasonForChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonForChangeType }
     *     
     */
    public ReasonForChangeType getReasonForChangeDetails() {
        return reasonForChangeDetails;
    }

    /**
     * Sets the value of the reasonForChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonForChangeType }
     *     
     */
    public void setReasonForChangeDetails(ReasonForChangeType value) {
        this.reasonForChangeDetails = value;
    }

}
