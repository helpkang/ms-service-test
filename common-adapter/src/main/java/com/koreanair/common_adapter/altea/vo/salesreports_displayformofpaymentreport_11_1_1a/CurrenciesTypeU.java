//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:12:44 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displayformofpaymentreport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify currencies used in the transaction and relevant details for the rate of exchange.
 * 
 * <p>Java class for CurrenciesTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrenciesTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyDetails" type="{http://xml.amadeus.com/TSRFRQ_11_1_1A}CurrencyDetailsTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrenciesTypeU", propOrder = {
    "currencyDetails"
})
public class CurrenciesTypeU {

    protected CurrencyDetailsTypeU currencyDetails;

    /**
     * Gets the value of the currencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public CurrencyDetailsTypeU getCurrencyDetails() {
        return currencyDetails;
    }

    /**
     * Sets the value of the currencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public void setCurrencyDetails(CurrencyDetailsTypeU value) {
        this.currencyDetails = value;
    }

}
