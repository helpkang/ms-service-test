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
 * To specify additional details about a particular traveller.
 * 
 * <p>Java class for SpecificTravellerTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificTravellerTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travellerDetails" type="{http://xml.amadeus.com/TPSSGQ_15_1_1A}SpecificTravellerDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificTravellerTypeI", propOrder = {
    "travellerDetails"
})
public class SpecificTravellerTypeI {

    @XmlElement(required = true)
    protected SpecificTravellerDetailsTypeI travellerDetails;

    /**
     * Gets the value of the travellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerDetailsTypeI }
     *     
     */
    public SpecificTravellerDetailsTypeI getTravellerDetails() {
        return travellerDetails;
    }

    /**
     * Sets the value of the travellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerDetailsTypeI }
     *     
     */
    public void setTravellerDetails(SpecificTravellerDetailsTypeI value) {
        this.travellerDetails = value;
    }

}
