//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of a conversion rate related to an amount.
 * 
 * <p>Java class for ConversionRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionRateDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ConversionRateDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateType", propOrder = {
    "conversionRateDetails"
})
public class ConversionRateType {

    @XmlElement(required = true)
    protected ConversionRateDetailsType conversionRateDetails;

    /**
     * Gets the value of the conversionRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsType }
     *     
     */
    public ConversionRateDetailsType getConversionRateDetails() {
        return conversionRateDetails;
    }

    /**
     * Sets the value of the conversionRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsType }
     *     
     */
    public void setConversionRateDetails(ConversionRateDetailsType value) {
        this.conversionRateDetails = value;
    }

}
