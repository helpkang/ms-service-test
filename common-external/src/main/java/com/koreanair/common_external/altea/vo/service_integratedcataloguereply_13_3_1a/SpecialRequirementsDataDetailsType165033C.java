//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_integratedcataloguereply_13_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Special requirements data details
 * 
 * <p>Java class for SpecialRequirementsDataDetailsType_165033C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDataDetailsType_165033C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatNumber" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="measureUnitQualifier" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="crossRef" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="seatCharacteristics" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To2" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDataDetailsType_165033C", propOrder = {
    "seatNumber",
    "measureUnitQualifier",
    "crossRef",
    "seatCharacteristics"
})
public class SpecialRequirementsDataDetailsType165033C {

    protected String seatNumber;
    protected String measureUnitQualifier;
    protected String crossRef;
    protected List<String> seatCharacteristics;

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
