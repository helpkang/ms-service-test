//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:25 AM KST 
//


package com.koreanair.external.altea.vo.service_standalonepricingreply_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType_163213S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType_163213S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}ItemNumberIdentificationType_231296C" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType_163213S", propOrder = {
    "itemNumberDetails"
})
public class ItemNumberType163213S {

    @XmlElement(required = true)
    protected List<ItemNumberIdentificationType231296C> itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemNumberIdentificationType231296C }
     * 
     * 
     */
    public List<ItemNumberIdentificationType231296C> getItemNumberDetails() {
        if (itemNumberDetails == null) {
            itemNumberDetails = new ArrayList<ItemNumberIdentificationType231296C>();
        }
        return this.itemNumberDetails;
    }

}
