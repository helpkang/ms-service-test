//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify which number in a sequence of references and/or the reference number.
 * 
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfItems" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="firstItemIdentifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="lastItemIdentifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", propOrder = {
    "numberOfItems",
    "firstItemIdentifier",
    "lastItemIdentifier"
})
public class ReferenceType {

    protected String numberOfItems;
    protected BigInteger firstItemIdentifier;
    protected BigInteger lastItemIdentifier;

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfItems(String value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the firstItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstItemIdentifier() {
        return firstItemIdentifier;
    }

    /**
     * Sets the value of the firstItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstItemIdentifier(BigInteger value) {
        this.firstItemIdentifier = value;
    }

    /**
     * Gets the value of the lastItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastItemIdentifier() {
        return lastItemIdentifier;
    }

    /**
     * Sets the value of the lastItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastItemIdentifier(BigInteger value) {
        this.lastItemIdentifier = value;
    }

}
