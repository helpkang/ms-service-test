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
 * To indicate commercial agreements related to the service being provided.
 * 
 * <p>Java class for CompanyRoleIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyRoleIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineDesignator" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="operationalSuffix" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyRoleIdentificationType", propOrder = {
    "airlineDesignator",
    "flightNumber",
    "operationalSuffix"
})
public class CompanyRoleIdentificationType {

    protected String airlineDesignator;
    protected String flightNumber;
    protected String operationalSuffix;

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value) {
        this.airlineDesignator = value;
    }

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

}
