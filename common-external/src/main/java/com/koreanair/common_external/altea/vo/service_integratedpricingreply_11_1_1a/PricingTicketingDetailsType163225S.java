//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.common_external.altea.vo.service_integratedpricingreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsType_163225S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsType_163225S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDateTimeDetails" type="{http://xml.amadeus.com/TPISGR_15_1_1A}ProductDateTimeTypeI" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TPISGR_15_1_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="companyNumberDetails" type="{http://xml.amadeus.com/TPISGR_15_1_1A}CompanyIdentificationNumbersTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsType_163225S", propOrder = {
    "productDateTimeDetails",
    "companyDetails",
    "companyNumberDetails"
})
public class PricingTicketingDetailsType163225S {

    protected ProductDateTimeTypeI productDateTimeDetails;
    protected CompanyIdentificationTypeI companyDetails;
    protected CompanyIdentificationNumbersTypeI companyNumberDetails;

    /**
     * Gets the value of the productDateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getProductDateTimeDetails() {
        return productDateTimeDetails;
    }

    /**
     * Sets the value of the productDateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setProductDateTimeDetails(ProductDateTimeTypeI value) {
        this.productDateTimeDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the companyNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationNumbersTypeI }
     *     
     */
    public CompanyIdentificationNumbersTypeI getCompanyNumberDetails() {
        return companyNumberDetails;
    }

    /**
     * Sets the value of the companyNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationNumbersTypeI }
     *     
     */
    public void setCompanyNumberDetails(CompanyIdentificationNumbersTypeI value) {
        this.companyNumberDetails = value;
    }

}
