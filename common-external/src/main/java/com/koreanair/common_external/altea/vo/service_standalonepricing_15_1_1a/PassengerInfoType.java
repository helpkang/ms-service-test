//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:19 AM KST 
//


package com.koreanair.common_external.altea.vo.service_standalonepricing_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for PassengerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TPSSGQ_15_1_1A}SpecificTravellerTypeI"/>
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TPSSGQ_15_1_1A}FareInformationType" minOccurs="0"/>
 *         &lt;element name="serviceRequestDateAndTimeInfo" type="{http://xml.amadeus.com/TPSSGQ_15_1_1A}DateAndTimeInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfoType", propOrder = {
    "specificTravellerDetails",
    "fareInfo",
    "serviceRequestDateAndTimeInfo"
})
public class PassengerInfoType {

    @XmlElement(required = true)
    protected SpecificTravellerTypeI specificTravellerDetails;
    protected FareInformationType fareInfo;
    protected DateAndTimeInformationType serviceRequestDateAndTimeInfo;

    /**
     * Gets the value of the specificTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public SpecificTravellerTypeI getSpecificTravellerDetails() {
        return specificTravellerDetails;
    }

    /**
     * Sets the value of the specificTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public void setSpecificTravellerDetails(SpecificTravellerTypeI value) {
        this.specificTravellerDetails = value;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformationType }
     *     
     */
    public FareInformationType getFareInfo() {
        return fareInfo;
    }

    /**
     * Sets the value of the fareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformationType }
     *     
     */
    public void setFareInfo(FareInformationType value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the serviceRequestDateAndTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public DateAndTimeInformationType getServiceRequestDateAndTimeInfo() {
        return serviceRequestDateAndTimeInfo;
    }

    /**
     * Sets the value of the serviceRequestDateAndTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public void setServiceRequestDateAndTimeInfo(DateAndTimeInformationType value) {
        this.serviceRequestDateAndTimeInfo = value;
    }

}
