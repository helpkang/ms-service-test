//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 09:23:07 AM KST 
//


package com.koreanair.common_adapter.altea.vo.fare_pricepnrwithbookingclassreply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a location by code or name.
 * 
 * <p>Java class for LocationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trueLocationId" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationTypeI", propOrder = {
    "trueLocationId"
})
public class LocationTypeI {

    protected String trueLocationId;

    /**
     * Gets the value of the trueLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLocationId() {
        return trueLocationId;
    }

    /**
     * Sets the value of the trueLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueLocationId(String value) {
        this.trueLocationId = value;
    }

}
