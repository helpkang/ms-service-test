//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:17 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_upgraderedemption_13_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * <p>Java class for TravellerDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://xml.amadeus.com/FFUREQ_13_1_1A}AlphaNumericString_Length1To56"/>
 *         &lt;element name="uniqueCustomerIdentifier" type="{http://xml.amadeus.com/FFUREQ_13_1_1A}NumericInteger_Length1To5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDetailsTypeI", propOrder = {
    "givenName",
    "uniqueCustomerIdentifier"
})
public class TravellerDetailsTypeI {

    @XmlElement(required = true)
    protected String givenName;
    @XmlElement(required = true)
    protected BigInteger uniqueCustomerIdentifier;

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the uniqueCustomerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /**
     * Sets the value of the uniqueCustomerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUniqueCustomerIdentifier(BigInteger value) {
        this.uniqueCustomerIdentifier = value;
    }

}
