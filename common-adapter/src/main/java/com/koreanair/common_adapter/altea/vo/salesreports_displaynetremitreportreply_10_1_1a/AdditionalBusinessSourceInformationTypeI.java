//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:14:45 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displaynetremitreportreply_10_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional originator and source information.
 * 
 * <p>Java class for AdditionalBusinessSourceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceType" type="{http://xml.amadeus.com/TSRNRR_10_1_1A}SourceTypeDetailsTypeI"/>
 *         &lt;element name="originatorDetails" type="{http://xml.amadeus.com/TSRNRR_10_1_1A}OriginatorIdentificationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationTypeI", propOrder = {
    "sourceType",
    "originatorDetails"
})
public class AdditionalBusinessSourceInformationTypeI {

    @XmlElement(required = true)
    protected SourceTypeDetailsTypeI sourceType;
    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI originatorDetails;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeDetailsTypeI }
     *     
     */
    public SourceTypeDetailsTypeI getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeDetailsTypeI }
     *     
     */
    public void setSourceType(SourceTypeDetailsTypeI value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the originatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public OriginatorIdentificationDetailsTypeI getOriginatorDetails() {
        return originatorDetails;
    }

    /**
     * Sets the value of the originatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI value) {
        this.originatorDetails = value;
    }

}
