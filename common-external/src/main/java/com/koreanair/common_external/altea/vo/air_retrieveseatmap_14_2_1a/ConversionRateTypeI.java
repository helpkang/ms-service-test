//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 11:07:43 AM KST 
//


package com.koreanair.common_external.altea.vo.air_retrieveseatmap_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of a conversion rate related to an amount.
 * 
 * <p>Java class for ConversionRateTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionRateDetails" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}ConversionRateDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateTypeI", propOrder = {
    "conversionRateDetails"
})
public class ConversionRateTypeI {

    @XmlElement(required = true)
    protected ConversionRateDetailsTypeI conversionRateDetails;

    /**
     * Gets the value of the conversionRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public ConversionRateDetailsTypeI getConversionRateDetails() {
        return conversionRateDetails;
    }

    /**
     * Sets the value of the conversionRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public void setConversionRateDetails(ConversionRateDetailsTypeI value) {
        this.conversionRateDetails = value;
    }

}
