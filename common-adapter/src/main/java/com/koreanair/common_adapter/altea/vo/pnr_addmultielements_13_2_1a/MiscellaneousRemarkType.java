//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_addmultielements_13_2_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Miscellaneous remarks
 * 
 * <p>Java class for MiscellaneousRemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="category" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="freetext" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To127" minOccurs="0"/>
 *         &lt;element name="providerType" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/PNRADD_13_2_1A}NumericDecimal_Length1To11" minOccurs="0"/>
 *         &lt;element name="officeId" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length9To9" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarkType", propOrder = {
    "type",
    "category",
    "freetext",
    "providerType",
    "currency",
    "amount",
    "officeId"
})
public class MiscellaneousRemarkType {

    @XmlElement(required = true)
    protected String type;
    protected String category;
    protected String freetext;
    protected String providerType;
    protected String currency;
    protected BigDecimal amount;
    protected List<String> officeId;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreetext() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreetext(String value) {
        this.freetext = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the officeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfficeId() {
        if (officeId == null) {
            officeId = new ArrayList<String>();
        }
        return this.officeId;
    }

}
