//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.common_external.altea.vo.service_integratedpricingreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubItineraryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubItineraryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proposedServicePortionRef" type="{http://xml.amadeus.com/TPISGR_15_1_1A}ActionDetailsType"/>
 *         &lt;element name="travelProductInfo" type="{http://xml.amadeus.com/TPISGR_15_1_1A}TravelProductInformationType_163210S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubItineraryInfoType", propOrder = {
    "proposedServicePortionRef",
    "travelProductInfo"
})
public class SubItineraryInfoType {

    @XmlElement(required = true)
    protected ActionDetailsType proposedServicePortionRef;
    protected TravelProductInformationType163210S travelProductInfo;

    /**
     * Gets the value of the proposedServicePortionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getProposedServicePortionRef() {
        return proposedServicePortionRef;
    }

    /**
     * Sets the value of the proposedServicePortionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setProposedServicePortionRef(ActionDetailsType value) {
        this.proposedServicePortionRef = value;
    }

    /**
     * Gets the value of the travelProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType163210S }
     *     
     */
    public TravelProductInformationType163210S getTravelProductInfo() {
        return travelProductInfo;
    }

    /**
     * Sets the value of the travelProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType163210S }
     *     
     */
    public void setTravelProductInfo(TravelProductInformationType163210S value) {
        this.travelProductInfo = value;
    }

}
