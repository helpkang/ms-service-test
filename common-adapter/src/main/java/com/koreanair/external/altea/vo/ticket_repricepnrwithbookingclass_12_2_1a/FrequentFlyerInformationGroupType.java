//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:46 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_repricepnrwithbookingclass_12_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequentFlyerInformationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentFlyerInformationGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flequentFlyerdetails" type="{http://xml.amadeus.com/TARIPQ_12_2_1A}FrequentTravellerIdentificationCodeType"/>
 *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TARIPQ_12_2_1A}ReferenceInformationType" minOccurs="0"/>
 *         &lt;element name="flightReference" type="{http://xml.amadeus.com/TARIPQ_12_2_1A}ReferenceInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyerInformationGroupType", propOrder = {
    "flequentFlyerdetails",
    "passengerReference",
    "flightReference"
})
public class FrequentFlyerInformationGroupType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationCodeType flequentFlyerdetails;
    protected ReferenceInformationType passengerReference;
    protected ReferenceInfoType flightReference;

    /**
     * Gets the value of the flequentFlyerdetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationCodeType }
     *     
     */
    public FrequentTravellerIdentificationCodeType getFlequentFlyerdetails() {
        return flequentFlyerdetails;
    }

    /**
     * Sets the value of the flequentFlyerdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationCodeType }
     *     
     */
    public void setFlequentFlyerdetails(FrequentTravellerIdentificationCodeType value) {
        this.flequentFlyerdetails = value;
    }

    /**
     * Gets the value of the passengerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationType }
     *     
     */
    public ReferenceInformationType getPassengerReference() {
        return passengerReference;
    }

    /**
     * Sets the value of the passengerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationType }
     *     
     */
    public void setPassengerReference(ReferenceInformationType value) {
        this.passengerReference = value;
    }

    /**
     * Gets the value of the flightReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getFlightReference() {
        return flightReference;
    }

    /**
     * Sets the value of the flightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setFlightReference(ReferenceInfoType value) {
        this.flightReference = value;
    }

}
