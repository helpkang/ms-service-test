//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number and weight of baggage.
 * 
 * <p>Java class for BaggageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeAllowance" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}NumericInteger_Length1To5" minOccurs="0"/>
 *         &lt;element name="measurement" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="quantityCode" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="processIndicator" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailsType", propOrder = {
    "freeAllowance",
    "measurement",
    "quantityCode",
    "unitQualifier",
    "processIndicator"
})
public class BaggageDetailsType {

    protected BigInteger freeAllowance;
    protected BigInteger measurement;
    protected String quantityCode;
    protected String unitQualifier;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurement(BigInteger value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the quantityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityCode() {
        return quantityCode;
    }

    /**
     * Sets the value of the quantityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityCode(String value) {
        this.quantityCode = value;
    }

    /**
     * Gets the value of the unitQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /**
     * Sets the value of the unitQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQualifier(String value) {
        this.unitQualifier = value;
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
