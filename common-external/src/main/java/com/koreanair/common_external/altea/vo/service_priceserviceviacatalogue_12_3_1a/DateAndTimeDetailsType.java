//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="date" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="time" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="otherQualifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="otherTime" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsType", propOrder = {
    "qualifier",
    "date",
    "time",
    "otherQualifier",
    "otherTime",
    "movementType",
    "location"
})
public class DateAndTimeDetailsType {

    protected String qualifier;
    protected String date;
    protected String time;
    protected String otherQualifier;
    protected String otherTime;
    protected String movementType;
    protected String location;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the otherQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherQualifier() {
        return otherQualifier;
    }

    /**
     * Sets the value of the otherQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherQualifier(String value) {
        this.otherQualifier = value;
    }

    /**
     * Gets the value of the otherTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTime() {
        return otherTime;
    }

    /**
     * Sets the value of the otherTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTime(String value) {
        this.otherTime = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
