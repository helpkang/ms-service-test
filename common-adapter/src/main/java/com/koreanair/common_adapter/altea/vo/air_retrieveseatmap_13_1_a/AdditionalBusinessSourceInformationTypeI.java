//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.31 at 09:22:03 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.air_retrieveseatmap_13_1_a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional originator and source information.
 * 
 * <p>Java class for AdditionalBusinessSourceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceType" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}SourceTypeDetailsTypeI"/>
 *         &lt;element name="originatorDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}OriginatorIdentificationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="systemCode" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationTypeI", propOrder = {
    "sourceType",
    "originatorDetails",
    "locationDetails",
    "countryCode",
    "systemCode"
})
public class AdditionalBusinessSourceInformationTypeI {

    @XmlElement(required = true)
    protected SourceTypeDetailsTypeI sourceType;
    protected OriginatorIdentificationDetailsTypeI originatorDetails;
    protected LocationTypeI locationDetails;
    protected String countryCode;
    protected String systemCode;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeDetailsTypeI }
     *     
     */
    public SourceTypeDetailsTypeI getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeDetailsTypeI }
     *     
     */
    public void setSourceType(SourceTypeDetailsTypeI value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the originatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public OriginatorIdentificationDetailsTypeI getOriginatorDetails() {
        return originatorDetails;
    }

    /**
     * Sets the value of the originatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI value) {
        this.originatorDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setLocationDetails(LocationTypeI value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

}
