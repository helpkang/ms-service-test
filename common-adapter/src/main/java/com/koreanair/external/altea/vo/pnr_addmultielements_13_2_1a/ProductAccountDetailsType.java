//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_addmultielements_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product or account details
 * 
 * <p>Java class for ProductAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberQualifier" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To27"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAccountDetailsType", propOrder = {
    "numberQualifier",
    "number"
})
public class ProductAccountDetailsType {

    protected String numberQualifier;
    @XmlElement(required = true)
    protected String number;

    /**
     * Gets the value of the numberQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberQualifier() {
        return numberQualifier;
    }

    /**
     * Sets the value of the numberQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberQualifier(String value) {
        this.numberQualifier = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
