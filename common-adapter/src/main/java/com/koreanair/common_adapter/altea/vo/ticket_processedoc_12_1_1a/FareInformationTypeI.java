//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:57:48 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.ticket_processedoc_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare details.
 * 
 * <p>Java class for FareInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueQualifier" type="{http://xml.amadeus.com/TATREQ_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareTypeGrouping" type="{http://xml.amadeus.com/TATREQ_12_1_1A}FareTypeGroupingInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationTypeI", propOrder = {
    "valueQualifier",
    "fareTypeGrouping"
})
public class FareInformationTypeI {

    protected String valueQualifier;
    protected FareTypeGroupingInformationTypeI fareTypeGrouping;

    /**
     * Gets the value of the valueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueQualifier() {
        return valueQualifier;
    }

    /**
     * Sets the value of the valueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueQualifier(String value) {
        this.valueQualifier = value;
    }

    /**
     * Gets the value of the fareTypeGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeGroupingInformationTypeI }
     *     
     */
    public FareTypeGroupingInformationTypeI getFareTypeGrouping() {
        return fareTypeGrouping;
    }

    /**
     * Sets the value of the fareTypeGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeGroupingInformationTypeI }
     *     
     */
    public void setFareTypeGrouping(FareTypeGroupingInformationTypeI value) {
        this.fareTypeGrouping = value;
    }

}
