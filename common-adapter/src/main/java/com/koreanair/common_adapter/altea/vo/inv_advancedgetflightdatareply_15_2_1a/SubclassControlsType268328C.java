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
import javax.xml.bind.annotation.XmlType;


/**
 * min, max, upr, mno, notification levels
 * 
 * <p>Java class for SubclassControlsType_268328C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubclassControlsType_268328C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="upr" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="parentSubclassId" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="nettedProtection" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubclassControlsType_268328C", propOrder = {
    "max",
    "upr",
    "parentSubclassId",
    "nettedProtection"
})
public class SubclassControlsType268328C {

    protected BigInteger max;
    protected BigDecimal upr;
    protected String parentSubclassId;
    protected BigInteger nettedProtection;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMax(BigInteger value) {
        this.max = value;
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
     * Gets the value of the parentSubclassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSubclassId() {
        return parentSubclassId;
    }

    /**
     * Sets the value of the parentSubclassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSubclassId(String value) {
        this.parentSubclassId = value;
    }

    /**
     * Gets the value of the nettedProtection property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNettedProtection() {
        return nettedProtection;
    }

    /**
     * Sets the value of the nettedProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNettedProtection(BigInteger value) {
        this.nettedProtection = value;
    }

}
