//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.common_external.altea.vo.service_integratedpricingreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legDetails" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AdditionalProductTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI", propOrder = {
    "legDetails"
})
public class AdditionalProductDetailsTypeI {

    protected AdditionalProductTypeI legDetails;

    /**
     * Gets the value of the legDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public AdditionalProductTypeI getLegDetails() {
        return legDetails;
    }

    /**
     * Sets the value of the legDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public void setLegDetails(AdditionalProductTypeI value) {
        this.legDetails = value;
    }

}
