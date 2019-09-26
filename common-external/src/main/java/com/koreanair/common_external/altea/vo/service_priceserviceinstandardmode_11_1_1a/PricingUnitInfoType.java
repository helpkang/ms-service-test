//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingUnitInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingUnitInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingUnitIdentInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumberOfUnitsType_67526S"/>
 *         &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FareComponentInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="elementaryTaxSubDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="taxDetailsListInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}TaxDetailsType_67527S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}ConversionRateType_67496S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingUnitInfoType", propOrder = {
    "pricingUnitIdentInfo",
    "fareComponentInfo",
    "elementaryTaxSubDetails",
    "taxDetailsListInfo",
    "conversionRate"
})
public class PricingUnitInfoType {

    @XmlElement(required = true)
    protected NumberOfUnitsType67526S pricingUnitIdentInfo;
    protected List<FareComponentInfoType> fareComponentInfo;
    protected MonetaryInformationType elementaryTaxSubDetails;
    protected List<TaxDetailsType67527S> taxDetailsListInfo;
    protected ConversionRateType67496S conversionRate;

    /**
     * Gets the value of the pricingUnitIdentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType67526S }
     *     
     */
    public NumberOfUnitsType67526S getPricingUnitIdentInfo() {
        return pricingUnitIdentInfo;
    }

    /**
     * Sets the value of the pricingUnitIdentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType67526S }
     *     
     */
    public void setPricingUnitIdentInfo(NumberOfUnitsType67526S value) {
        this.pricingUnitIdentInfo = value;
    }

    /**
     * Gets the value of the fareComponentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentInfoType }
     * 
     * 
     */
    public List<FareComponentInfoType> getFareComponentInfo() {
        if (fareComponentInfo == null) {
            fareComponentInfo = new ArrayList<FareComponentInfoType>();
        }
        return this.fareComponentInfo;
    }

    /**
     * Gets the value of the elementaryTaxSubDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getElementaryTaxSubDetails() {
        return elementaryTaxSubDetails;
    }

    /**
     * Sets the value of the elementaryTaxSubDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setElementaryTaxSubDetails(MonetaryInformationType value) {
        this.elementaryTaxSubDetails = value;
    }

    /**
     * Gets the value of the taxDetailsListInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetailsListInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetailsListInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsType67527S }
     * 
     * 
     */
    public List<TaxDetailsType67527S> getTaxDetailsListInfo() {
        if (taxDetailsListInfo == null) {
            taxDetailsListInfo = new ArrayList<TaxDetailsType67527S>();
        }
        return this.taxDetailsListInfo;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType67496S }
     *     
     */
    public ConversionRateType67496S getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType67496S }
     *     
     */
    public void setConversionRate(ConversionRateType67496S value) {
        this.conversionRate = value;
    }

}
