//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceintegratemode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReissueRefundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReissueRefundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AdditionalPriceInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReissueRefundType", propOrder = {
    "reasonInfo"
})
public class ReissueRefundType {

    @XmlElement(required = true)
    protected AdditionalPriceInformationType reasonInfo;

    /**
     * Gets the value of the reasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPriceInformationType }
     *     
     */
    public AdditionalPriceInformationType getReasonInfo() {
        return reasonInfo;
    }

    /**
     * Sets the value of the reasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPriceInformationType }
     *     
     */
    public void setReasonInfo(AdditionalPriceInformationType value) {
        this.reasonInfo = value;
    }

}
