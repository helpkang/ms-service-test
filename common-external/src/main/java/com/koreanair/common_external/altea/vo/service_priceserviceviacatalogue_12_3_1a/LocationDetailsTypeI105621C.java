//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a location and related country.
 * 
 * <p>Java class for LocationDetailsTypeI_105621C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDetailsTypeI_105621C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pointOfTicketingOverrideCity" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="country" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetailsTypeI_105621C", propOrder = {
    "pointOfTicketingOverrideCity",
    "country"
})
public class LocationDetailsTypeI105621C {

    protected String pointOfTicketingOverrideCity;
    protected String country;

    /**
     * Gets the value of the pointOfTicketingOverrideCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfTicketingOverrideCity() {
        return pointOfTicketingOverrideCity;
    }

    /**
     * Sets the value of the pointOfTicketingOverrideCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfTicketingOverrideCity(String value) {
        this.pointOfTicketingOverrideCity = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
