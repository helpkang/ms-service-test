//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 10:02:46 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceintegratemodereply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for TaxDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxDetailsListInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}TaxDetailsType_107483S"/>
 *         &lt;element name="discountAndPenaltynfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *         &lt;element name="elementaryTaxSubDetails" type="{http://xml.amadeus.com/TPISGR_11_1_1A}MonetaryInformationType_67627S" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailsInfoType", propOrder = {
    "taxDetailsListInfo",
    "discountAndPenaltynfo",
    "elementaryTaxSubDetails"
})
public class TaxDetailsInfoType {

    @XmlElement(required = true)
    protected TaxDetailsType107483S taxDetailsListInfo;
    protected DiscountAndPenaltyInformationType discountAndPenaltynfo;
    protected List<MonetaryInformationType67627S> elementaryTaxSubDetails;

    /**
     * Gets the value of the taxDetailsListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsType107483S }
     *     
     */
    public TaxDetailsType107483S getTaxDetailsListInfo() {
        return taxDetailsListInfo;
    }

    /**
     * Sets the value of the taxDetailsListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsType107483S }
     *     
     */
    public void setTaxDetailsListInfo(TaxDetailsType107483S value) {
        this.taxDetailsListInfo = value;
    }

    /**
     * Gets the value of the discountAndPenaltynfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAndPenaltyInformationType }
     *     
     */
    public DiscountAndPenaltyInformationType getDiscountAndPenaltynfo() {
        return discountAndPenaltynfo;
    }

    /**
     * Sets the value of the discountAndPenaltynfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAndPenaltyInformationType }
     *     
     */
    public void setDiscountAndPenaltynfo(DiscountAndPenaltyInformationType value) {
        this.discountAndPenaltynfo = value;
    }

    /**
     * Gets the value of the elementaryTaxSubDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementaryTaxSubDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementaryTaxSubDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationType67627S }
     * 
     * 
     */
    public List<MonetaryInformationType67627S> getElementaryTaxSubDetails() {
        if (elementaryTaxSubDetails == null) {
            elementaryTaxSubDetails = new ArrayList<MonetaryInformationType67627S>();
        }
        return this.elementaryTaxSubDetails;
    }

}
