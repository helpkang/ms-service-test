//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:32 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedpricing_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify currencies used in the transaction and relevant details for the rate of exchange.
 * 
 * <p>Java class for CurrenciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrenciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstCurrencyDetails" type="{http://xml.amadeus.com/TPISGQ_15_1_1A}CurrencyDetailsTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrenciesType", propOrder = {
    "firstCurrencyDetails"
})
public class CurrenciesType {

    protected CurrencyDetailsTypeU firstCurrencyDetails;

    /**
     * Gets the value of the firstCurrencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public CurrencyDetailsTypeU getFirstCurrencyDetails() {
        return firstCurrencyDetails;
    }

    /**
     * Sets the value of the firstCurrencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetailsTypeU }
     *     
     */
    public void setFirstCurrencyDetails(CurrencyDetailsTypeU value) {
        this.firstCurrencyDetails = value;
    }

}
