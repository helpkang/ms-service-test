//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To designate non-system specific combinations of fare types.
 * 
 * <p>Java class for FareCategoryCodesTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCategoryCodesTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareType" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCategoryCodesTypeI", propOrder = {
    "fareType"
})
public class FareCategoryCodesTypeI {

    @XmlElement(required = true)
    protected String fareType;

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

}
