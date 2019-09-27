//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceintegratemode_11_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a segment of an itinerary and related details.
 * 
 * <p>Java class for TravellerInsuranceInformationType_67570S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInsuranceInformationType_67570S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="numericReferenceId" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ProductDateTimeTypeI_105646C" minOccurs="0"/>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cabinDesignator" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="productTypeDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ProductTypeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To25" maxOccurs="15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInsuranceInformationType_67570S", propOrder = {
    "itemNumber",
    "numericReferenceId",
    "productDetails",
    "movementType",
    "cabinDesignator",
    "productTypeDetails",
    "location"
})
public class TravellerInsuranceInformationType67570S {

    protected String itemNumber;
    protected BigInteger numericReferenceId;
    protected ProductDateTimeTypeI105646C productDetails;
    protected String movementType;
    protected String cabinDesignator;
    protected ProductTypeDetailsTypeI productTypeDetails;
    protected List<String> location;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the numericReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumericReferenceId() {
        return numericReferenceId;
    }

    /**
     * Sets the value of the numericReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumericReferenceId(BigInteger value) {
        this.numericReferenceId = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI105646C }
     *     
     */
    public ProductDateTimeTypeI105646C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI105646C }
     *     
     */
    public void setProductDetails(ProductDateTimeTypeI105646C value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the cabinDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinDesignator() {
        return cabinDesignator;
    }

    /**
     * Sets the value of the cabinDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinDesignator(String value) {
        this.cabinDesignator = value;
    }

    /**
     * Gets the value of the productTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getProductTypeDetails() {
        return productTypeDetails;
    }

    /**
     * Sets the value of the productTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setProductTypeDetails(ProductTypeDetailsTypeI value) {
        this.productTypeDetails = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocation() {
        if (location == null) {
            location = new ArrayList<String>();
        }
        return this.location;
    }

}
