//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:13:21 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displayitemizedreport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify which number in a sequence of references and/or the reference number.
 * 
 * <p>Java class for ReferenceTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastItemIdentifier" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceTypeI", propOrder = {
    "lastItemIdentifier"
})
public class ReferenceTypeI {

    protected String lastItemIdentifier;

    /**
     * Gets the value of the lastItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastItemIdentifier() {
        return lastItemIdentifier;
    }

    /**
     * Sets the value of the lastItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastItemIdentifier(String value) {
        this.lastItemIdentifier = value;
    }

}
