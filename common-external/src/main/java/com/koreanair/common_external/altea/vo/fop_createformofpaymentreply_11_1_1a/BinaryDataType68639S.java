//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to carry binary data within an Edifact segment
 * 
 * <p>Java class for BinaryDataType_68639S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryDataType_68639S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataLength" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}NumericInteger_Length1To15"/>
 *         &lt;element name="dataType" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="binaryData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AlphaNumericString_Length1To99999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryDataType_68639S", propOrder = {
    "dataLength",
    "dataType",
    "binaryData"
})
public class BinaryDataType68639S {

    @XmlElement(required = true)
    protected BigInteger dataLength;
    protected String dataType;
    @XmlElement(required = true)
    protected String binaryData;

    /**
     * Gets the value of the dataLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataLength() {
        return dataLength;
    }

    /**
     * Sets the value of the dataLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataLength(BigInteger value) {
        this.dataLength = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryData(String value) {
        this.binaryData = value;
    }

}
