//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a frequency and the time window in which              it applies
 * 
 * <p>Java class for FrequencyDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequencyDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instalmentsNumber" type="{http://xml.amadeus.com/PNRACC_13_2_1A}NumericInteger_Length1To9"/>
 *         &lt;element name="instalmentsFrequency" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="instalmentsStartDate" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="instalmentsDatrDateFormat" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyDetailsTypeU", propOrder = {
    "instalmentsNumber",
    "instalmentsFrequency",
    "instalmentsStartDate",
    "instalmentsDatrDateFormat"
})
public class FrequencyDetailsTypeU {

    @XmlElement(required = true)
    protected BigInteger instalmentsNumber;
    protected String instalmentsFrequency;
    protected String instalmentsStartDate;
    protected String instalmentsDatrDateFormat;

    /**
     * Gets the value of the instalmentsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstalmentsNumber() {
        return instalmentsNumber;
    }

    /**
     * Sets the value of the instalmentsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstalmentsNumber(BigInteger value) {
        this.instalmentsNumber = value;
    }

    /**
     * Gets the value of the instalmentsFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalmentsFrequency() {
        return instalmentsFrequency;
    }

    /**
     * Sets the value of the instalmentsFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalmentsFrequency(String value) {
        this.instalmentsFrequency = value;
    }

    /**
     * Gets the value of the instalmentsStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalmentsStartDate() {
        return instalmentsStartDate;
    }

    /**
     * Sets the value of the instalmentsStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalmentsStartDate(String value) {
        this.instalmentsStartDate = value;
    }

    /**
     * Gets the value of the instalmentsDatrDateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalmentsDatrDateFormat() {
        return instalmentsDatrDateFormat;
    }

    /**
     * Sets the value of the instalmentsDatrDateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalmentsDatrDateFormat(String value) {
        this.instalmentsDatrDateFormat = value;
    }

}
