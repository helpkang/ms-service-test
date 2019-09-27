//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the dates and times associated with a product.
 * 
 * <p>Java class for ProductDateTimeTypeI_105646C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeTypeI_105646C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureDate" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="dateVariation" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeTypeI_105646C", propOrder = {
    "departureDate",
    "departureTime",
    "arrivalDate",
    "arrivalTime",
    "dateVariation"
})
public class ProductDateTimeTypeI105646C {

    protected String departureDate;
    protected String departureTime;
    protected String arrivalDate;
    protected String arrivalTime;
    protected BigInteger dateVariation;

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the dateVariation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDateVariation() {
        return dateVariation;
    }

    /**
     * Sets the value of the dateVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDateVariation(BigInteger value) {
        this.dateVariation = value;
    }

}
