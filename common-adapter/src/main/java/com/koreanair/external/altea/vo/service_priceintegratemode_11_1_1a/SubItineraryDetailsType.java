//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubItineraryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubItineraryDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includedSegmentsInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ActionDetailsType"/>
 *         &lt;element name="travelProductInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TravelProductInformationType_67536S" minOccurs="0"/>
 *         &lt;element name="pricedSurchargeInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TariffInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubItineraryDetailsType", propOrder = {
    "includedSegmentsInfo",
    "travelProductInfo",
    "pricedSurchargeInfo"
})
public class SubItineraryDetailsType {

    @XmlElement(required = true)
    protected ActionDetailsType includedSegmentsInfo;
    protected TravelProductInformationType67536S travelProductInfo;
    protected TariffInformationType pricedSurchargeInfo;

    /**
     * Gets the value of the includedSegmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getIncludedSegmentsInfo() {
        return includedSegmentsInfo;
    }

    /**
     * Sets the value of the includedSegmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setIncludedSegmentsInfo(ActionDetailsType value) {
        this.includedSegmentsInfo = value;
    }

    /**
     * Gets the value of the travelProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType67536S }
     *     
     */
    public TravelProductInformationType67536S getTravelProductInfo() {
        return travelProductInfo;
    }

    /**
     * Sets the value of the travelProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType67536S }
     *     
     */
    public void setTravelProductInfo(TravelProductInformationType67536S value) {
        this.travelProductInfo = value;
    }

    /**
     * Gets the value of the pricedSurchargeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationType }
     *     
     */
    public TariffInformationType getPricedSurchargeInfo() {
        return pricedSurchargeInfo;
    }

    /**
     * Sets the value of the pricedSurchargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationType }
     *     
     */
    public void setPricedSurchargeInfo(TariffInformationType value) {
        this.pricedSurchargeInfo = value;
    }

}
