//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_external.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the type of vehicle being used.
 * 
 * <p>Java class for EquipmentIdentificationTypeS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentIdentificationTypeS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircraftType" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length3To3"/>
 *         &lt;element name="eqtRegistrationNumber" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentIdentificationTypeS", propOrder = {
    "aircraftType",
    "eqtRegistrationNumber"
})
public class EquipmentIdentificationTypeS {

    @XmlElement(required = true)
    protected String aircraftType;
    protected String eqtRegistrationNumber;

    /**
     * Gets the value of the aircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the value of the aircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * Gets the value of the eqtRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqtRegistrationNumber() {
        return eqtRegistrationNumber;
    }

    /**
     * Sets the value of the eqtRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqtRegistrationNumber(String value) {
        this.eqtRegistrationNumber = value;
    }

}
