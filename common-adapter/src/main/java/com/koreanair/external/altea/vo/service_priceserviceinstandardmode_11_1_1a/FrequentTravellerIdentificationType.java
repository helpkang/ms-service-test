//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the frequent traveller number by company code with the capability to reference a specific traveller.
 * 
 * <p>Java class for FrequentTravellerIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerCompany" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="frequentTravellerNumber" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="travellerRefNumber" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="travellerStatus" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="tierLevel" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="travellerPriorityCode" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="tierDescription" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="travellerPriorityValue" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationType", propOrder = {
    "frequentTravellerCompany",
    "frequentTravellerNumber",
    "travellerRefNumber",
    "travellerStatus",
    "tierLevel",
    "travellerPriorityCode",
    "tierDescription",
    "travellerPriorityValue"
})
public class FrequentTravellerIdentificationType {

    @XmlElement(required = true)
    protected String frequentTravellerCompany;
    @XmlElement(required = true)
    protected String frequentTravellerNumber;
    protected String travellerRefNumber;
    protected String travellerStatus;
    protected String tierLevel;
    protected String travellerPriorityCode;
    protected String tierDescription;
    protected BigInteger travellerPriorityValue;

    /**
     * Gets the value of the frequentTravellerCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentTravellerCompany() {
        return frequentTravellerCompany;
    }

    /**
     * Sets the value of the frequentTravellerCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentTravellerCompany(String value) {
        this.frequentTravellerCompany = value;
    }

    /**
     * Gets the value of the frequentTravellerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentTravellerNumber() {
        return frequentTravellerNumber;
    }

    /**
     * Sets the value of the frequentTravellerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentTravellerNumber(String value) {
        this.frequentTravellerNumber = value;
    }

    /**
     * Gets the value of the travellerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerRefNumber() {
        return travellerRefNumber;
    }

    /**
     * Sets the value of the travellerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerRefNumber(String value) {
        this.travellerRefNumber = value;
    }

    /**
     * Gets the value of the travellerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerStatus() {
        return travellerStatus;
    }

    /**
     * Sets the value of the travellerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerStatus(String value) {
        this.travellerStatus = value;
    }

    /**
     * Gets the value of the tierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevel() {
        return tierLevel;
    }

    /**
     * Sets the value of the tierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevel(String value) {
        this.tierLevel = value;
    }

    /**
     * Gets the value of the travellerPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerPriorityCode() {
        return travellerPriorityCode;
    }

    /**
     * Sets the value of the travellerPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerPriorityCode(String value) {
        this.travellerPriorityCode = value;
    }

    /**
     * Gets the value of the tierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierDescription() {
        return tierDescription;
    }

    /**
     * Sets the value of the tierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierDescription(String value) {
        this.tierDescription = value;
    }

    /**
     * Gets the value of the travellerPriorityValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravellerPriorityValue() {
        return travellerPriorityValue;
    }

    /**
     * Sets the value of the travellerPriorityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravellerPriorityValue(BigInteger value) {
        this.travellerPriorityValue = value;
    }

}
