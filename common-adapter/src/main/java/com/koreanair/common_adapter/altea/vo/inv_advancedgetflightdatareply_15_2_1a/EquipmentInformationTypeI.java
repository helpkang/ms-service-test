//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify configuration details of an aircraft.
 * 
 * <p>Java class for EquipmentInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configurationCode" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="configurationDescription" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInformationTypeI", propOrder = {
    "configurationCode",
    "configurationDescription"
})
public class EquipmentInformationTypeI {

    protected String configurationCode;
    protected String configurationDescription;

    /**
     * Gets the value of the configurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationCode() {
        return configurationCode;
    }

    /**
     * Sets the value of the configurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationCode(String value) {
        this.configurationCode = value;
    }

    /**
     * Gets the value of the configurationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationDescription() {
        return configurationDescription;
    }

    /**
     * Sets the value of the configurationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationDescription(String value) {
        this.configurationDescription = value;
    }

}
