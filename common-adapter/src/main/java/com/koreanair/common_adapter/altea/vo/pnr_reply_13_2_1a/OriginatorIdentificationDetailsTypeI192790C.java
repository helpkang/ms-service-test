//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI_192790C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI_192790C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatorId" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="inHouseIdentification1" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To9"/>
 *         &lt;element name="inHouseIdentification2" type="{http://xml.amadeus.com/PNRACC_13_2_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI_192790C", propOrder = {
    "originatorId",
    "inHouseIdentification1",
    "inHouseIdentification2"
})
public class OriginatorIdentificationDetailsTypeI192790C {

    protected String originatorId;
    @XmlElement(required = true)
    protected String inHouseIdentification1;
    protected BigInteger inHouseIdentification2;

    /**
     * Gets the value of the originatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorId() {
        return originatorId;
    }

    /**
     * Sets the value of the originatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorId(String value) {
        this.originatorId = value;
    }

    /**
     * Gets the value of the inHouseIdentification1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /**
     * Sets the value of the inHouseIdentification1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseIdentification1(String value) {
        this.inHouseIdentification1 = value;
    }

    /**
     * Gets the value of the inHouseIdentification2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /**
     * Sets the value of the inHouseIdentification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInHouseIdentification2(BigInteger value) {
        this.inHouseIdentification2 = value;
    }

}
