//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:26 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_createformofpayment_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an address
 * 
 * <p>Java class for AddressType_68644S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType_68644S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressUsageDetails" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AddressUsageTypeU" minOccurs="0"/>
 *         &lt;element name="addressDetails" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AddressDetailsTypeU"/>
 *         &lt;element name="city" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="regionDetails" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}CountrySubEntityDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}LocationIdentificationTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType_68644S", propOrder = {
    "addressUsageDetails",
    "addressDetails",
    "city",
    "zipCode",
    "regionDetails",
    "locationDetails"
})
public class AddressType68644S {

    protected AddressUsageTypeU addressUsageDetails;
    @XmlElement(required = true)
    protected AddressDetailsTypeU addressDetails;
    protected String city;
    protected String zipCode;
    protected CountrySubEntityDetailsTypeU regionDetails;
    protected LocationIdentificationTypeU locationDetails;

    /**
     * Gets the value of the addressUsageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUsageTypeU }
     *     
     */
    public AddressUsageTypeU getAddressUsageDetails() {
        return addressUsageDetails;
    }

    /**
     * Sets the value of the addressUsageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUsageTypeU }
     *     
     */
    public void setAddressUsageDetails(AddressUsageTypeU value) {
        this.addressUsageDetails = value;
    }

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsTypeU }
     *     
     */
    public AddressDetailsTypeU getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsTypeU }
     *     
     */
    public void setAddressDetails(AddressDetailsTypeU value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the regionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubEntityDetailsTypeU }
     *     
     */
    public CountrySubEntityDetailsTypeU getRegionDetails() {
        return regionDetails;
    }

    /**
     * Sets the value of the regionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubEntityDetailsTypeU }
     *     
     */
    public void setRegionDetails(CountrySubEntityDetailsTypeU value) {
        this.regionDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationTypeU }
     *     
     */
    public LocationIdentificationTypeU getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationTypeU }
     *     
     */
    public void setLocationDetails(LocationIdentificationTypeU value) {
        this.locationDetails = value;
    }

}
