//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To reference a segment cabin
 * 
 * <p>Java class for SegmentCabinIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentCabinIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinCode" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaString_Length1To1"/>
 *         &lt;element name="waitListMax" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="upr" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="bookingsCounter" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="waitList" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="expectedToBoard" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="staffStandbyCounter" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="staffStandbyMax" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentCabinIdentificationType", propOrder = {
    "cabinCode",
    "waitListMax",
    "upr",
    "bookingsCounter",
    "waitList",
    "expectedToBoard",
    "staffStandbyCounter",
    "staffStandbyMax"
})
public class SegmentCabinIdentificationType {

    @XmlElement(required = true)
    protected String cabinCode;
    protected BigInteger waitListMax;
    protected BigDecimal upr;
    protected BigInteger bookingsCounter;
    protected BigInteger waitList;
    protected BigDecimal expectedToBoard;
    protected BigInteger staffStandbyCounter;
    protected BigInteger staffStandbyMax;

    /**
     * Gets the value of the cabinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /**
     * Sets the value of the cabinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCode(String value) {
        this.cabinCode = value;
    }

    /**
     * Gets the value of the waitListMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaitListMax() {
        return waitListMax;
    }

    /**
     * Sets the value of the waitListMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaitListMax(BigInteger value) {
        this.waitListMax = value;
    }

    /**
     * Gets the value of the upr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpr() {
        return upr;
    }

    /**
     * Sets the value of the upr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpr(BigDecimal value) {
        this.upr = value;
    }

    /**
     * Gets the value of the bookingsCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingsCounter() {
        return bookingsCounter;
    }

    /**
     * Sets the value of the bookingsCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingsCounter(BigInteger value) {
        this.bookingsCounter = value;
    }

    /**
     * Gets the value of the waitList property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaitList() {
        return waitList;
    }

    /**
     * Sets the value of the waitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaitList(BigInteger value) {
        this.waitList = value;
    }

    /**
     * Gets the value of the expectedToBoard property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectedToBoard() {
        return expectedToBoard;
    }

    /**
     * Sets the value of the expectedToBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectedToBoard(BigDecimal value) {
        this.expectedToBoard = value;
    }

    /**
     * Gets the value of the staffStandbyCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffStandbyCounter() {
        return staffStandbyCounter;
    }

    /**
     * Sets the value of the staffStandbyCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffStandbyCounter(BigInteger value) {
        this.staffStandbyCounter = value;
    }

    /**
     * Gets the value of the staffStandbyMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffStandbyMax() {
        return staffStandbyMax;
    }

    /**
     * Sets the value of the staffStandbyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffStandbyMax(BigInteger value) {
        this.staffStandbyMax = value;
    }

}
