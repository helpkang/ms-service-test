//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To designate non-system specific combinations of fare types.
 * 
 * <p>Java class for FareCategoryCodesTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCategoryCodesTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareType" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To20"/>
 *         &lt;element name="otherFareType" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}AlphaNumericString_Length1To20" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCategoryCodesTypeI", propOrder = {
    "fareType",
    "otherFareType"
})
public class FareCategoryCodesTypeI {

    @XmlElement(required = true)
    protected String fareType;
    protected List<String> otherFareType;

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the otherFareType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFareType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherFareType() {
        if (otherFareType == null) {
            otherFareType = new ArrayList<String>();
        }
        return this.otherFareType;
    }

}
