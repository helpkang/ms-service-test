//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceintegratemode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequentFlyerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentFlyerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FrequentTravellerIdentificationCodeType"/>
 *         &lt;element name="segmentQuantitiesInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}QuantityTypeI" minOccurs="0"/>
 *         &lt;element name="passengerSubRangesInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}SpecificTravellerTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyerInfoType", propOrder = {
    "frequentTravellerInfo",
    "segmentQuantitiesInfo",
    "passengerSubRangesInfo"
})
public class FrequentFlyerInfoType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationCodeType frequentTravellerInfo;
    protected QuantityTypeI segmentQuantitiesInfo;
    protected SpecificTravellerTypeI passengerSubRangesInfo;

    /**
     * Gets the value of the frequentTravellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationCodeType }
     *     
     */
    public FrequentTravellerIdentificationCodeType getFrequentTravellerInfo() {
        return frequentTravellerInfo;
    }

    /**
     * Sets the value of the frequentTravellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationCodeType }
     *     
     */
    public void setFrequentTravellerInfo(FrequentTravellerIdentificationCodeType value) {
        this.frequentTravellerInfo = value;
    }

    /**
     * Gets the value of the segmentQuantitiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeI }
     *     
     */
    public QuantityTypeI getSegmentQuantitiesInfo() {
        return segmentQuantitiesInfo;
    }

    /**
     * Sets the value of the segmentQuantitiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeI }
     *     
     */
    public void setSegmentQuantitiesInfo(QuantityTypeI value) {
        this.segmentQuantitiesInfo = value;
    }

    /**
     * Gets the value of the passengerSubRangesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public SpecificTravellerTypeI getPassengerSubRangesInfo() {
        return passengerSubRangesInfo;
    }

    /**
     * Sets the value of the passengerSubRangesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public void setPassengerSubRangesInfo(SpecificTravellerTypeI value) {
        this.passengerSubRangesInfo = value;
    }

}
