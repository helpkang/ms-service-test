//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Special requirements data details
 * 
 * <p>Java class for SpecialRequirementsDataDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDataDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementData" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="specialRequirementQualifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="seatCharacteristics" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To2" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDataDetailsType", propOrder = {
    "specialRequirementData",
    "specialRequirementQualifier",
    "seatCharacteristics"
})
public class SpecialRequirementsDataDetailsType {

    protected String specialRequirementData;
    protected String specialRequirementQualifier;
    protected List<String> seatCharacteristics;

    /**
     * Gets the value of the specialRequirementData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementData() {
        return specialRequirementData;
    }

    /**
     * Sets the value of the specialRequirementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementData(String value) {
        this.specialRequirementData = value;
    }

    /**
     * Gets the value of the specialRequirementQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirementQualifier() {
        return specialRequirementQualifier;
    }

    /**
     * Sets the value of the specialRequirementQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirementQualifier(String value) {
        this.specialRequirementQualifier = value;
    }

    /**
     * Gets the value of the seatCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatCharacteristics() {
        if (seatCharacteristics == null) {
            seatCharacteristics = new ArrayList<String>();
        }
        return this.seatCharacteristics;
    }

}
