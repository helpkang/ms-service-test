//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.external.altea.vo.service_integratedpricingreply_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRequirementsTypeDetailsType_231319C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsTypeDetailsType_231319C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementType" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="numberOfInstances" type="{http://xml.amadeus.com/TPISGR_15_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="firstGeographicalPoint" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="secondGeographicalPoint" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsTypeDetailsType_231319C", propOrder = {
    "specialRequirementType",
    "numberOfInstances",
    "firstGeographicalPoint",
    "secondGeographicalPoint"
})
public class SpecialRequirementsTypeDetailsType231319C {

    @XmlElement(required = true)
    protected String specialRequirementType;
    protected BigInteger numberOfInstances;
    protected String firstGeographicalPoint;
    protected String secondGeographicalPoint;

    /**
     * Gets the value of the specialRequirementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementType() {
        return specialRequirementType;
    }

    /**
     * Sets the value of the specialRequirementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementType(String value) {
        this.specialRequirementType = value;
    }

    /**
     * Gets the value of the numberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * Sets the value of the numberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInstances(BigInteger value) {
        this.numberOfInstances = value;
    }

    /**
     * Gets the value of the firstGeographicalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstGeographicalPoint() {
        return firstGeographicalPoint;
    }

    /**
     * Sets the value of the firstGeographicalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstGeographicalPoint(String value) {
        this.firstGeographicalPoint = value;
    }

    /**
     * Gets the value of the secondGeographicalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondGeographicalPoint() {
        return secondGeographicalPoint;
    }

    /**
     * Sets the value of the secondGeographicalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondGeographicalPoint(String value) {
        this.secondGeographicalPoint = value;
    }

}
