//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 11:07:43 AM KST 
//


package com.koreanair.common_adapter.altea.vo.air_retrieveseatmap_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the fare basis and ticket designator codes.
 * 
 * <p>Java class for AdditionalFareQualifierDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFareQualifierDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateClass" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="commodityCategory" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}AlphaNumericString_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFareQualifierDetailsTypeI", propOrder = {
    "rateClass",
    "commodityCategory"
})
public class AdditionalFareQualifierDetailsTypeI {

    protected String rateClass;
    protected String commodityCategory;

    /**
     * Gets the value of the rateClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateClass() {
        return rateClass;
    }

    /**
     * Sets the value of the rateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateClass(String value) {
        this.rateClass = value;
    }

    /**
     * Gets the value of the commodityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCategory() {
        return commodityCategory;
    }

    /**
     * Sets the value of the commodityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCategory(String value) {
        this.commodityCategory = value;
    }

}
