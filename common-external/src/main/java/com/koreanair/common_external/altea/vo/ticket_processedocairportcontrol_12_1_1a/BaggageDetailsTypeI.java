//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:09 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_processedocairportcontrol_12_1_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number and weight of baggage.
 * 
 * <p>Java class for BaggageDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeAllowance" type="{http://xml.amadeus.com/TACREQ_12_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="measurement" type="{http://xml.amadeus.com/TACREQ_12_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="quantityCode" type="{http://xml.amadeus.com/TACREQ_12_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="processIndicator" type="{http://xml.amadeus.com/TACREQ_12_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailsTypeI", propOrder = {
    "freeAllowance",
    "measurement",
    "quantityCode",
    "processIndicator"
})
public class BaggageDetailsTypeI {

    protected BigInteger freeAllowance;
    protected BigDecimal measurement;
    protected BigInteger quantityCode;
    protected String processIndicator;

    /**
     * Gets the value of the freeAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFreeAllowance() {
        return freeAllowance;
    }

    /**
     * Sets the value of the freeAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFreeAllowance(BigInteger value) {
        this.freeAllowance = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasurement(BigDecimal value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the quantityCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityCode() {
        return quantityCode;
    }

    /**
     * Sets the value of the quantityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityCode(BigInteger value) {
        this.quantityCode = value;
    }

    /**
     * Gets the value of the processIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIndicator() {
        return processIndicator;
    }

    /**
     * Sets the value of the processIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIndicator(String value) {
        this.processIndicator = value;
    }

}
