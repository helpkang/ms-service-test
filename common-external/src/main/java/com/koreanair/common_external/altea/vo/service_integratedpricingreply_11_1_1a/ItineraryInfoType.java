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
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for ItineraryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travelItineraryInfo" type="{http://xml.amadeus.com/TPISGR_15_1_1A}TravellerInsuranceInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryInfoType", propOrder = {
    "travelItineraryInfo"
})
public class ItineraryInfoType {

    @XmlElement(required = true)
    protected TravellerInsuranceInformationType travelItineraryInfo;

    /**
     * Gets the value of the travelItineraryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInsuranceInformationType }
     *     
     */
    public TravellerInsuranceInformationType getTravelItineraryInfo() {
        return travelItineraryInfo;
    }

    /**
     * Sets the value of the travelItineraryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInsuranceInformationType }
     *     
     */
    public void setTravelItineraryInfo(TravellerInsuranceInformationType value) {
        this.travelItineraryInfo = value;
    }

}
