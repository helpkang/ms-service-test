//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 06:13:51 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.minirule_getfrometicketreply_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify flight product information detail
 * 
 * <p>Java class for FareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalFareDetails" type="{http://xml.amadeus.com/TMRERR_13_1_1A}AdditionalFareQualifierDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsType", propOrder = {
    "additionalFareDetails"
})
public class FareQualifierDetailsType {

    @XmlElement(required = true)
    protected AdditionalFareQualifierDetailsType additionalFareDetails;

    /**
     * Gets the value of the additionalFareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsType }
     *     
     */
    public AdditionalFareQualifierDetailsType getAdditionalFareDetails() {
        return additionalFareDetails;
    }

    /**
     * Sets the value of the additionalFareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsType }
     *     
     */
    public void setAdditionalFareDetails(AdditionalFareQualifierDetailsType value) {
        this.additionalFareDetails = value;
    }

}
