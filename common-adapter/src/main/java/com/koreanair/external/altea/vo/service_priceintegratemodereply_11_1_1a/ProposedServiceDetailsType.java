//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 10:02:46 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemodereply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposedServiceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedServiceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proposedServiceDetails" type="{http://xml.amadeus.com/TPISGR_11_1_1A}SpecialRequirementsDetailsType"/>
 *         &lt;element name="proposedServiceRefInformation" type="{http://xml.amadeus.com/TPISGR_11_1_1A}ReferenceInfoType" minOccurs="0"/>
 *         &lt;element name="proposedServiceProductInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}ProductInformationType" minOccurs="0"/>
 *         &lt;element name="proposedServiceParameters" type="{http://xml.amadeus.com/TPISGR_11_1_1A}SeatRequestParametersTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposedServiceDetailsType", propOrder = {
    "proposedServiceDetails",
    "proposedServiceRefInformation",
    "proposedServiceProductInfo",
    "proposedServiceParameters"
})
public class ProposedServiceDetailsType {

    @XmlElement(required = true)
    protected SpecialRequirementsDetailsType proposedServiceDetails;
    protected ReferenceInfoType proposedServiceRefInformation;
    protected ProductInformationType proposedServiceProductInfo;
    protected SeatRequestParametersTypeI proposedServiceParameters;

    /**
     * Gets the value of the proposedServiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType }
     *     
     */
    public SpecialRequirementsDetailsType getProposedServiceDetails() {
        return proposedServiceDetails;
    }

    /**
     * Sets the value of the proposedServiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType }
     *     
     */
    public void setProposedServiceDetails(SpecialRequirementsDetailsType value) {
        this.proposedServiceDetails = value;
    }

    /**
     * Gets the value of the proposedServiceRefInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getProposedServiceRefInformation() {
        return proposedServiceRefInformation;
    }

    /**
     * Sets the value of the proposedServiceRefInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setProposedServiceRefInformation(ReferenceInfoType value) {
        this.proposedServiceRefInformation = value;
    }

    /**
     * Gets the value of the proposedServiceProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType }
     *     
     */
    public ProductInformationType getProposedServiceProductInfo() {
        return proposedServiceProductInfo;
    }

    /**
     * Sets the value of the proposedServiceProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType }
     *     
     */
    public void setProposedServiceProductInfo(ProductInformationType value) {
        this.proposedServiceProductInfo = value;
    }

    /**
     * Gets the value of the proposedServiceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public SeatRequestParametersTypeI getProposedServiceParameters() {
        return proposedServiceParameters;
    }

    /**
     * Sets the value of the proposedServiceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public void setProposedServiceParameters(SeatRequestParametersTypeI value) {
        this.proposedServiceParameters = value;
    }

}
