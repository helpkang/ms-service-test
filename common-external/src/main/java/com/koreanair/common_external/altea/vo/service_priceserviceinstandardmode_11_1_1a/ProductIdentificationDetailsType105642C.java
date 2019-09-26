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
 * Code, number or name to identify a specific product or service.
 * 
 * <p>Java class for ProductIdentificationDetailsType_105642C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationDetailsType_105642C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightNumber" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To5"/>
 *         &lt;element name="bookingClass" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length0To1" minOccurs="0"/>
 *         &lt;element name="operationalSuffix" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length0To1" minOccurs="0"/>
 *         &lt;element name="modifier" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To7" minOccurs="0"/>
 *         &lt;element name="availabilityContext" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To7" minOccurs="0"/>
 *         &lt;element name="flightQualifier" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationDetailsType_105642C", propOrder = {
    "flightNumber",
    "bookingClass",
    "operationalSuffix",
    "modifier",
    "availabilityContext",
    "flightQualifier"
})
public class ProductIdentificationDetailsType105642C {

    @XmlElement(required = true)
    protected String flightNumber;
    protected String bookingClass;
    protected String operationalSuffix;
    protected String modifier;
    protected String availabilityContext;
    protected String flightQualifier;

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClass(String value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the operationalSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /**
     * Sets the value of the operationalSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalSuffix(String value) {
        this.operationalSuffix = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(String value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the availabilityContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityContext() {
        return availabilityContext;
    }

    /**
     * Sets the value of the availabilityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityContext(String value) {
        this.availabilityContext = value;
    }

    /**
     * Gets the value of the flightQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightQualifier() {
        return flightQualifier;
    }

    /**
     * Sets the value of the flightQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightQualifier(String value) {
        this.flightQualifier = value;
    }

}
