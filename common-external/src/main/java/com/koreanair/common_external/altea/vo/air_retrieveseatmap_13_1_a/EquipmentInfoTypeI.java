//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.31 at 09:22:03 ���� KST 
//


package com.koreanair.common_external.altea.vo.air_retrieveseatmap_13_1_a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify configuration details of an aircraft.
 * 
 * <p>Java class for EquipmentInfoTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInfoTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinClassDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}ConfigurationDetailsTypeI" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="iataAircraftTypeCode" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="configVersionDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AdditionalEquipmentInformationTypeI" minOccurs="0"/>
 *         &lt;element name="configVersionDescription" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInfoTypeI", propOrder = {
    "cabinClassDetails",
    "iataAircraftTypeCode",
    "configVersionDetails",
    "configVersionDescription"
})
public class EquipmentInfoTypeI {

    protected List<ConfigurationDetailsTypeI> cabinClassDetails;
    protected String iataAircraftTypeCode;
    protected AdditionalEquipmentInformationTypeI configVersionDetails;
    protected String configVersionDescription;

    /**
     * Gets the value of the cabinClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationDetailsTypeI }
     * 
     * 
     */
    public List<ConfigurationDetailsTypeI> getCabinClassDetails() {
        if (cabinClassDetails == null) {
            cabinClassDetails = new ArrayList<ConfigurationDetailsTypeI>();
        }
        return this.cabinClassDetails;
    }

    /**
     * Gets the value of the iataAircraftTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataAircraftTypeCode() {
        return iataAircraftTypeCode;
    }

    /**
     * Sets the value of the iataAircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataAircraftTypeCode(String value) {
        this.iataAircraftTypeCode = value;
    }

    /**
     * Gets the value of the configVersionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalEquipmentInformationTypeI }
     *     
     */
    public AdditionalEquipmentInformationTypeI getConfigVersionDetails() {
        return configVersionDetails;
    }

    /**
     * Sets the value of the configVersionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalEquipmentInformationTypeI }
     *     
     */
    public void setConfigVersionDetails(AdditionalEquipmentInformationTypeI value) {
        this.configVersionDetails = value;
    }

    /**
     * Gets the value of the configVersionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVersionDescription() {
        return configVersionDescription;
    }

    /**
     * Sets the value of the configVersionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVersionDescription(String value) {
        this.configVersionDescription = value;
    }

}
