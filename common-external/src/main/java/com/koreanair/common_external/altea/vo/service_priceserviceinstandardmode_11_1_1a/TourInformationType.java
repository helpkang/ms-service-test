//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information concerning a tour.
 * 
 * <p>Java class for TourInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tourInformationDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}TourDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourInformationType", propOrder = {
    "tourInformationDetails"
})
public class TourInformationType {

    @XmlElement(required = true)
    protected TourDetailsTypeI tourInformationDetails;

    /**
     * Gets the value of the tourInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TourDetailsTypeI }
     *     
     */
    public TourDetailsTypeI getTourInformationDetails() {
        return tourInformationDetails;
    }

    /**
     * Sets the value of the tourInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourDetailsTypeI }
     *     
     */
    public void setTourInformationDetails(TourDetailsTypeI value) {
        this.tourInformationDetails = value;
    }

}
