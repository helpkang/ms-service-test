//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a location by code or name.
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trueLocationId" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="trueLocation" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "trueLocationId",
    "trueLocation"
})
public class LocationType {

    protected String trueLocationId;
    protected String trueLocation;

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

    /**
     * Gets the value of the trueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLocation() {
        return trueLocation;
    }

    /**
     * Sets the value of the trueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueLocation(String value) {
        this.trueLocation = value;
    }

}
