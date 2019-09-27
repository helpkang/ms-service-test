//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 11:07:43 AM KST 
//


package com.koreanair.external.altea.vo.air_retrieveseatmap_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify equipment configuration, registration number, and cabin facilities.
 * 
 * <p>Java class for AdditionalEquipmentInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalEquipmentInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fittedConfigurationCode" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="defaultConfigurationCode" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="airlineDetails" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="code" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="characteristic" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To3" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalEquipmentInformationTypeI", propOrder = {
    "fittedConfigurationCode",
    "defaultConfigurationCode",
    "airlineDetails",
    "code",
    "characteristic"
})
public class AdditionalEquipmentInformationTypeI {

    protected String fittedConfigurationCode;
    protected String defaultConfigurationCode;
    protected String airlineDetails;
    protected String code;
    protected List<String> characteristic;

    /**
     * Gets the value of the fittedConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFittedConfigurationCode() {
        return fittedConfigurationCode;
    }

    /**
     * Sets the value of the fittedConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFittedConfigurationCode(String value) {
        this.fittedConfigurationCode = value;
    }

    /**
     * Gets the value of the defaultConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultConfigurationCode() {
        return defaultConfigurationCode;
    }

    /**
     * Sets the value of the defaultConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultConfigurationCode(String value) {
        this.defaultConfigurationCode = value;
    }

    /**
     * Gets the value of the airlineDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDetails() {
        return airlineDetails;
    }

    /**
     * Sets the value of the airlineDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDetails(String value) {
        this.airlineDetails = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<String>();
        }
        return this.characteristic;
    }

}
