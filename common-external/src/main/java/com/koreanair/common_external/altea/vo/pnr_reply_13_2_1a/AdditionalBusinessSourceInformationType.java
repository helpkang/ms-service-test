//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify ownership and creator of a PNR
 * 
 * <p>Java class for AdditionalBusinessSourceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatorDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}OriginatorIdentificationDetailsTypeI_192823C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationType", propOrder = {
    "originatorDetails"
})
public class AdditionalBusinessSourceInformationType {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI192823C originatorDetails;

    /**
     * Gets the value of the originatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI192823C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI192823C getOriginatorDetails() {
        return originatorDetails;
    }

    /**
     * Sets the value of the originatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI192823C }
     *     
     */
    public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI192823C value) {
        this.originatorDetails = value;
    }

}
