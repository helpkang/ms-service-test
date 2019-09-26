//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsType_67619S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsType_67619S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceTicketDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}PricingTicketingInformationType" minOccurs="0"/>
 *         &lt;element name="priceTariffType" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="productDateTimeDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ProductDateTimeTypeI" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="companyNumberDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}CompanyIdentificationNumbersTypeI" minOccurs="0"/>
 *         &lt;element name="sellingLocationDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="ticketingLocationDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="waiver" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsType_67619S", propOrder = {
    "priceTicketDetails",
    "priceTariffType",
    "productDateTimeDetails",
    "companyDetails",
    "companyNumberDetails",
    "sellingLocationDetails",
    "ticketingLocationDetails",
    "waiver",
    "monetaryAmount"
})
public class PricingTicketingDetailsType67619S {

    protected PricingTicketingInformationType priceTicketDetails;
    protected String priceTariffType;
    protected ProductDateTimeTypeI productDateTimeDetails;
    protected CompanyIdentificationTypeI companyDetails;
    protected CompanyIdentificationNumbersTypeI companyNumberDetails;
    protected LocationDetailsTypeI sellingLocationDetails;
    protected LocationDetailsTypeI ticketingLocationDetails;
    protected String waiver;
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

    /**
     * Gets the value of the sellingLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getSellingLocationDetails() {
        return sellingLocationDetails;
    }

    /**
     * Sets the value of the sellingLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setSellingLocationDetails(LocationDetailsTypeI value) {
        this.sellingLocationDetails = value;
    }

    /**
     * Gets the value of the ticketingLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getTicketingLocationDetails() {
        return ticketingLocationDetails;
    }

    /**
     * Sets the value of the ticketingLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setTicketingLocationDetails(LocationDetailsTypeI value) {
        this.ticketingLocationDetails = value;
    }

    /**
     * Gets the value of the waiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiver() {
        return waiver;
    }

    /**
     * Sets the value of the waiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiver(String value) {
        this.waiver = value;
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
