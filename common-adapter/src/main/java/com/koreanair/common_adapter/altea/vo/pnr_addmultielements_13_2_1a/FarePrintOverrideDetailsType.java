//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_addmultielements_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare print override
 * 
 * <p>Java class for FarePrintOverrideDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarePrintOverrideDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseFare" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To11"/>
 *         &lt;element name="totalFare" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To11" minOccurs="0"/>
 *         &lt;element name="equivalentFare" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To11" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To11" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePrintOverrideDetailsType", propOrder = {
    "baseFare",
    "totalFare",
    "equivalentFare",
    "taxAmount"
})
public class FarePrintOverrideDetailsType {

    @XmlElement(required = true)
    protected String baseFare;
    protected String totalFare;
    protected String equivalentFare;
    protected List<String> taxAmount;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFare(String value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the equivalentFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentFare() {
        return equivalentFare;
    }

    /**
     * Sets the value of the equivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentFare(String value) {
        this.equivalentFare = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxAmount() {
        if (taxAmount == null) {
            taxAmount = new ArrayList<String>();
        }
        return this.taxAmount;
    }

}
