//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:09:14 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displayclosedsalesreportlistreply_10_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ItemNumberIdentificationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberTypeI", propOrder = {
    "itemNumberDetails"
})
public class ItemNumberTypeI {

    @XmlElement(required = true)
    protected ItemNumberIdentificationTypeI itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationTypeI }
     *     
     */
    public ItemNumberIdentificationTypeI getItemNumberDetails() {
        return itemNumberDetails;
    }

    /**
     * Sets the value of the itemNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationTypeI }
     *     
     */
    public void setItemNumberDetails(ItemNumberIdentificationTypeI value) {
        this.itemNumberDetails = value;
    }

}
