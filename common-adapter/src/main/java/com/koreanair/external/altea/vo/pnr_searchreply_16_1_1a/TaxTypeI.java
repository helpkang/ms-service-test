//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 10:34:16 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_searchreply_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details relating to tax(es).
 * 
 * <p>Java class for TaxTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxCategory" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TaxDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTypeI", propOrder = {
    "taxCategory",
    "taxDetails"
})
public class TaxTypeI {

    @XmlElement(required = true)
    protected String taxCategory;
    protected TaxDetailsTypeI taxDetails;

    /**
     * Gets the value of the taxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the value of the taxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCategory(String value) {
        this.taxCategory = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsTypeI }
     *     
     */
    public TaxDetailsTypeI getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsTypeI }
     *     
     */
    public void setTaxDetails(TaxDetailsTypeI value) {
        this.taxDetails = value;
    }

}
