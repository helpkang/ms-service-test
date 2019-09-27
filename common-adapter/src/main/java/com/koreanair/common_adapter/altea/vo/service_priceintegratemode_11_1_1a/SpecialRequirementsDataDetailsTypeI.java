//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional requirements concerning a special request/requirement and to reference to a traveller.
 * 
 * <p>Java class for SpecialRequirementsDataDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDataDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatNumber" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="measureUnitQualifier" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="crossRef" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="seatCharacteristic" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To2" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDataDetailsTypeI", propOrder = {
    "seatNumber",
    "measureUnitQualifier",
    "crossRef",
    "seatCharacteristic"
})
public class SpecialRequirementsDataDetailsTypeI {

    protected String seatNumber;
    protected String measureUnitQualifier;
    protected String crossRef;
    protected List<String> seatCharacteristic;

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the measureUnitQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /**
     * Sets the value of the measureUnitQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnitQualifier(String value) {
        this.measureUnitQualifier = value;
    }

    /**
     * Gets the value of the crossRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossRef() {
        return crossRef;
    }

    /**
     * Sets the value of the crossRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossRef(String value) {
        this.crossRef = value;
    }

    /**
     * Gets the value of the seatCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatCharacteristic() {
        if (seatCharacteristic == null) {
            seatCharacteristic = new ArrayList<String>();
        }
        return this.seatCharacteristic;
    }

}
