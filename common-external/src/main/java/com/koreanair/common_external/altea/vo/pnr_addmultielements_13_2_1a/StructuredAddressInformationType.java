//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_addmultielements_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structured address information
 * 
 * <p>Java class for StructuredAddressInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredAddressInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionA1" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To2"/>
 *         &lt;element name="optionTextA1" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAddressInformationType", propOrder = {
    "optionA1",
    "optionTextA1"
})
public class StructuredAddressInformationType {

    @XmlElement(required = true)
    protected String optionA1;
    @XmlElement(required = true)
    protected String optionTextA1;

    /**
     * Gets the value of the optionA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionA1() {
        return optionA1;
    }

    /**
     * Sets the value of the optionA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionA1(String value) {
        this.optionA1 = value;
    }

    /**
     * Gets the value of the optionTextA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionTextA1() {
        return optionTextA1;
    }

    /**
     * Sets the value of the optionTextA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionTextA1(String value) {
        this.optionTextA1 = value;
    }

}
