//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsType_67548S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsType_67548S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceTicketDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}PricingTicketingInformationType" minOccurs="0"/>
 *         &lt;element name="priceTariffType" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="productDateTimeDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ProductDateTimeType_105617C" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="companyNumberDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}CompanyIdentificationNumbersTypeI" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}LocationDetailsTypeI_105620C" minOccurs="0"/>
 *         &lt;element name="otherLocationDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}LocationDetailsTypeI_105621C" minOccurs="0"/>
 *         &lt;element name="idNumber" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsType_67548S", propOrder = {
    "priceTicketDetails",
    "priceTariffType",
    "productDateTimeDetails",
    "companyDetails",
    "companyNumberDetails",
    "locationDetails",
    "otherLocationDetails",
    "idNumber",
    "monetaryAmount"
})
public class PricingTicketingDetailsType67548S {

    protected PricingTicketingInformationType priceTicketDetails;
    protected String priceTariffType;
    protected ProductDateTimeType105617C productDateTimeDetails;
    protected CompanyIdentificationTypeI companyDetails;
    protected CompanyIdentificationNumbersTypeI companyNumberDetails;
    protected LocationDetailsTypeI105620C locationDetails;
    protected LocationDetailsTypeI105621C otherLocationDetails;
    protected String idNumber;
    protected BigDecimal monetaryAmount;

    /**
     * Gets the value of the priceTicketDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public PricingTicketingInformationType getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /**
     * Sets the value of the priceTicketDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationType }
     *     
     */
    public void setPriceTicketDetails(PricingTicketingInformationType value) {
        this.priceTicketDetails = value;
    }

    /**
     * Gets the value of the priceTariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTariffType() {
        return priceTariffType;
    }

    /**
     * Sets the value of the priceTariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTariffType(String value) {
        this.priceTariffType = value;
    }

    /**
     * Gets the value of the productDateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeType105617C }
     *     
     */
    public ProductDateTimeType105617C getProductDateTimeDetails() {
        return productDateTimeDetails;
    }

    /**
     * Sets the value of the productDateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeType105617C }
     *     
     */
    public void setProductDateTimeDetails(ProductDateTimeType105617C value) {
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

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI105620C }
     *     
     */
    public LocationDetailsTypeI105620C getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI105620C }
     *     
     */
    public void setLocationDetails(LocationDetailsTypeI105620C value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the otherLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI105621C }
     *     
     */
    public LocationDetailsTypeI105621C getOtherLocationDetails() {
        return otherLocationDetails;
    }

    /**
     * Sets the value of the otherLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI105621C }
     *     
     */
    public void setOtherLocationDetails(LocationDetailsTypeI105621C value) {
        this.otherLocationDetails = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryAmount(BigDecimal value) {
        this.monetaryAmount = value;
    }

}
