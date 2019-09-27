//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * class, revenue, segment availabilities, NAV, GAV
 * 
 * <p>Java class for AvailabilityCountersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityCountersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netClassAvailability" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15"/>
 *         &lt;element name="segmentAvailability" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15"/>
 *         &lt;element name="netRevenueAvailability" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="classControlledAvailability" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityCountersType", propOrder = {
    "netClassAvailability",
    "segmentAvailability",
    "netRevenueAvailability",
    "classControlledAvailability"
})
public class AvailabilityCountersType {

    @XmlElement(required = true)
    protected BigDecimal netClassAvailability;
    @XmlElement(required = true)
    protected BigDecimal segmentAvailability;
    protected BigDecimal netRevenueAvailability;
    protected BigDecimal classControlledAvailability;

    /**
     * Gets the value of the netClassAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetClassAvailability() {
        return netClassAvailability;
    }

    /**
     * Sets the value of the netClassAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetClassAvailability(BigDecimal value) {
        this.netClassAvailability = value;
    }

    /**
     * Gets the value of the segmentAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSegmentAvailability() {
        return segmentAvailability;
    }

    /**
     * Sets the value of the segmentAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSegmentAvailability(BigDecimal value) {
        this.segmentAvailability = value;
    }

    /**
     * Gets the value of the netRevenueAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetRevenueAvailability() {
        return netRevenueAvailability;
    }

    /**
     * Sets the value of the netRevenueAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetRevenueAvailability(BigDecimal value) {
        this.netRevenueAvailability = value;
    }

    /**
     * Gets the value of the classControlledAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClassControlledAvailability() {
        return classControlledAvailability;
    }

    /**
     * Sets the value of the classControlledAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClassControlledAvailability(BigDecimal value) {
        this.classControlledAvailability = value;
    }

}
