//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_external.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeDetailsTypeI_272157C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsTypeI_272157C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="date" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="time" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="delayInformation" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="timeOffset" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsTypeI_272157C", propOrder = {
    "qualifier",
    "date",
    "time",
    "delayInformation",
    "timeOffset",
    "delayReason"
})
public class DateAndTimeDetailsTypeI272157C {

    protected String qualifier;
    protected String date;
    protected String time;
    protected String delayInformation;
    protected String timeOffset;
    protected String delayReason;

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
     * Gets the value of the delayInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayInformation() {
        return delayInformation;
    }

    /**
     * Sets the value of the delayInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayInformation(String value) {
        this.delayInformation = value;
    }

    /**
     * Gets the value of the timeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOffset() {
        return timeOffset;
    }

    /**
     * Sets the value of the timeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOffset(String value) {
        this.timeOffset = value;
    }

    /**
     * Gets the value of the delayReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayReason() {
        return delayReason;
    }

    /**
     * Sets the value of the delayReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayReason(String value) {
        this.delayReason = value;
    }

}
