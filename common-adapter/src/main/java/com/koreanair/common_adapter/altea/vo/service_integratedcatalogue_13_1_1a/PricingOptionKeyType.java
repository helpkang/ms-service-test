//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcatalogue_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingOptionKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingOptionKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TPICGQ_13_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingOptionKeyType", propOrder = {
    "pricingOptionKey"
})
public class PricingOptionKeyType {

    @XmlElement(required = true)
    protected String pricingOptionKey;

    /**
     * Gets the value of the pricingOptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingOptionKey() {
        return pricingOptionKey;
    }

    /**
     * Sets the value of the pricingOptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingOptionKey(String value) {
        this.pricingOptionKey = value;
    }

}
