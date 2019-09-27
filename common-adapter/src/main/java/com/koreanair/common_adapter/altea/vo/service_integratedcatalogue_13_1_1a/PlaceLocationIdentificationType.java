//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcatalogue_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationType" type="{http://xml.amadeus.com/TPICGQ_13_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/TPICGQ_13_1_1A}RelatedLocationOneIdentificationType" minOccurs="0"/>
 *         &lt;element name="secondLocationDetails" type="{http://xml.amadeus.com/TPICGQ_13_1_1A}RelatedLocationTwoIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentificationType", propOrder = {
    "locationType",
    "firstLocationDetails",
    "secondLocationDetails"
})
public class PlaceLocationIdentificationType {

    @XmlElement(required = true)
    protected String locationType;
    protected RelatedLocationOneIdentificationType firstLocationDetails;
    protected RelatedLocationTwoIdentificationType secondLocationDetails;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationType }
     *     
     */
    public RelatedLocationOneIdentificationType getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationType }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationType value) {
        this.firstLocationDetails = value;
    }

    /**
     * Gets the value of the secondLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationTwoIdentificationType }
     *     
     */
    public RelatedLocationTwoIdentificationType getSecondLocationDetails() {
        return secondLocationDetails;
    }

    /**
     * Sets the value of the secondLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationTwoIdentificationType }
     *     
     */
    public void setSecondLocationDetails(RelatedLocationTwoIdentificationType value) {
        this.secondLocationDetails = value;
    }

}
