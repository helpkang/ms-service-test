//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 09:23:07 AM KST 
//


package com.koreanair.common_external.altea.vo.fare_pricepnrwithbookingclassreply_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationTypeI_6128S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationTypeI_6128S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoQualifier" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="penDisData" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}DiscountPenaltyMonetaryInformationTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationTypeI_6128S", propOrder = {
    "infoQualifier",
    "penDisData"
})
public class DiscountAndPenaltyInformationTypeI6128S {

    protected String infoQualifier;
    protected List<DiscountPenaltyMonetaryInformationTypeI> penDisData;

    /**
     * Gets the value of the infoQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoQualifier() {
        return infoQualifier;
    }

    /**
     * Sets the value of the infoQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoQualifier(String value) {
        this.infoQualifier = value;
    }

    /**
     * Gets the value of the penDisData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penDisData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenDisData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyMonetaryInformationTypeI }
     * 
     * 
     */
    public List<DiscountPenaltyMonetaryInformationTypeI> getPenDisData() {
        if (penDisData == null) {
            penDisData = new ArrayList<DiscountPenaltyMonetaryInformationTypeI>();
        }
        return this.penDisData;
    }

}
