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
 * To convey the Ferry passenger type.
 * 
 * <p>Java class for AttributeTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeFunction" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AttributeInformationTypeU_188164C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeTypeU", propOrder = {
    "attributeFunction",
    "attributeDetails"
})
public class AttributeTypeU {

    @XmlElement(required = true)
    protected String attributeFunction;
    @XmlElement(required = true)
    protected AttributeInformationTypeU188164C attributeDetails;

    /**
     * Gets the value of the attributeFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeFunction() {
        return attributeFunction;
    }

    /**
     * Sets the value of the attributeFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeFunction(String value) {
        this.attributeFunction = value;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeInformationTypeU188164C }
     *     
     */
    public AttributeInformationTypeU188164C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU188164C }
     *     
     */
    public void setAttributeDetails(AttributeInformationTypeU188164C value) {
        this.attributeDetails = value;
    }

}
