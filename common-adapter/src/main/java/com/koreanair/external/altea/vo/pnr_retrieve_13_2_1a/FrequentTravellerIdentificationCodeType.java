//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:20:59 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Frequent traveller information
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTraveller" type="{http://xml.amadeus.com/PNRRET_13_2_1A}FrequentTravellerIdentificationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType", propOrder = {
    "frequentTraveller"
})
public class FrequentTravellerIdentificationCodeType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationTypeI frequentTraveller;

    /**
     * Gets the value of the frequentTraveller property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public FrequentTravellerIdentificationTypeI getFrequentTraveller() {
        return frequentTraveller;
    }

    /**
     * Sets the value of the frequentTraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public void setFrequentTraveller(FrequentTravellerIdentificationTypeI value) {
        this.frequentTraveller = value;
    }

}
