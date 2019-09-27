//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRequirementsTypeDetailsType_105615C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsTypeDetailsType_105615C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementType" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="specialRequirementStatus" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfInstances" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="specialRequirementAirlineCode" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="specialRequirementInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="otherSpecialRequirementInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="firstGeographicalPoint" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="secondGeographicalPoint" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="specialRequirementFreeText" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To70" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsTypeDetailsType_105615C", propOrder = {
    "specialRequirementType",
    "specialRequirementStatus",
    "numberOfInstances",
    "specialRequirementAirlineCode",
    "specialRequirementInfo",
    "otherSpecialRequirementInfo",
    "firstGeographicalPoint",
    "secondGeographicalPoint",
    "specialRequirementFreeText"
})
public class SpecialRequirementsTypeDetailsType105615C {

    @XmlElement(required = true)
    protected String specialRequirementType;
    protected String specialRequirementStatus;
    protected BigInteger numberOfInstances;
    protected String specialRequirementAirlineCode;
    protected String specialRequirementInfo;
    protected String otherSpecialRequirementInfo;
    protected String firstGeographicalPoint;
    protected String secondGeographicalPoint;
    protected List<String> specialRequirementFreeText;

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
     * Gets the value of the specialRequirementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementStatus() {
        return specialRequirementStatus;
    }

    /**
     * Sets the value of the specialRequirementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementStatus(String value) {
        this.specialRequirementStatus = value;
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
     * Gets the value of the specialRequirementAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementAirlineCode() {
        return specialRequirementAirlineCode;
    }

    /**
     * Sets the value of the specialRequirementAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementAirlineCode(String value) {
        this.specialRequirementAirlineCode = value;
    }

    /**
     * Gets the value of the specialRequirementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementInfo() {
        return specialRequirementInfo;
    }

    /**
     * Sets the value of the specialRequirementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementInfo(String value) {
        this.specialRequirementInfo = value;
    }

    /**
     * Gets the value of the otherSpecialRequirementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSpecialRequirementInfo() {
        return otherSpecialRequirementInfo;
    }

    /**
     * Sets the value of the otherSpecialRequirementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSpecialRequirementInfo(String value) {
        this.otherSpecialRequirementInfo = value;
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

    /**
     * Gets the value of the specialRequirementFreeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRequirementFreeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRequirementFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialRequirementFreeText() {
        if (specialRequirementFreeText == null) {
            specialRequirementFreeText = new ArrayList<String>();
        }
        return this.specialRequirementFreeText;
    }

}
