//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys data of the credit card authentication
 * 
 * <p>Java class for CreditCardSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardSecurityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationDataDetails" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AuthenticationDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardSecurityType", propOrder = {
    "authenticationDataDetails"
})
public class CreditCardSecurityType {

    protected AuthenticationDataType authenticationDataDetails;

    /**
     * Gets the value of the authenticationDataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationDataType }
     *     
     */
    public AuthenticationDataType getAuthenticationDataDetails() {
        return authenticationDataDetails;
    }

    /**
     * Sets the value of the authenticationDataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationDataType }
     *     
     */
    public void setAuthenticationDataDetails(AuthenticationDataType value) {
        this.authenticationDataDetails = value;
    }

}
