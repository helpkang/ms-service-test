//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the action to be taken and the selection criteria.
 * 
 * <p>Java class for ProcessingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionQualifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfItems" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingInformationType", propOrder = {
    "actionQualifier",
    "referenceQualifier",
    "numberOfItems"
})
public class ProcessingInformationType {

    protected String actionQualifier;
    protected String referenceQualifier;
    protected String numberOfItems;

    /**
     * Gets the value of the actionQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionQualifier() {
        return actionQualifier;
    }

    /**
     * Sets the value of the actionQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionQualifier(String value) {
        this.actionQualifier = value;
    }

    /**
     * Gets the value of the referenceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /**
     * Sets the value of the referenceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceQualifier(String value) {
        this.referenceQualifier = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfItems(String value) {
        this.numberOfItems = value;
    }

}
