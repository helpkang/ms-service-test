//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 10:34:25 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_search_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inHouseIdentification1" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}AlphaNumericString_Length1To9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsType", propOrder = {
    "inHouseIdentification1"
})
public class OriginatorIdentificationDetailsType {

    @XmlElement(required = true)
    protected String inHouseIdentification1;

    /**
     * Gets the value of the inHouseIdentification1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /**
     * Sets the value of the inHouseIdentification1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseIdentification1(String value) {
        this.inHouseIdentification1 = value;
    }

}
