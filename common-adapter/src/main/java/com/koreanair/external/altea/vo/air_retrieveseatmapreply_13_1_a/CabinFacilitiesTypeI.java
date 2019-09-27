//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.31 at 09:21:21 ���� KST 
//


package com.koreanair.external.altea.vo.air_retrieveseatmapreply_13_1_a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate facilities within a cabin class or cabin compartment.
 * 
 * <p>Java class for CabinFacilitiesTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinFacilitiesTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowLocation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaString_Length1To1"/>
 *         &lt;element name="cabinFacilityDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesDetailsTypeI"/>
 *         &lt;element name="otherCabinFacilityDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}CabinFacilitiesDetailsTypeI" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinFacilitiesTypeI", propOrder = {
    "rowLocation",
    "cabinFacilityDetails",
    "otherCabinFacilityDetails"
})
public class CabinFacilitiesTypeI {

    @XmlElement(required = true)
    protected String rowLocation;
    @XmlElement(required = true)
    protected CabinFacilitiesDetailsTypeI cabinFacilityDetails;
    protected List<CabinFacilitiesDetailsTypeI> otherCabinFacilityDetails;

    /**
     * Gets the value of the rowLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowLocation() {
        return rowLocation;
    }

    /**
     * Sets the value of the rowLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowLocation(String value) {
        this.rowLocation = value;
    }

    /**
     * Gets the value of the cabinFacilityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CabinFacilitiesDetailsTypeI }
     *     
     */
    public CabinFacilitiesDetailsTypeI getCabinFacilityDetails() {
        return cabinFacilityDetails;
    }

    /**
     * Sets the value of the cabinFacilityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinFacilitiesDetailsTypeI }
     *     
     */
    public void setCabinFacilityDetails(CabinFacilitiesDetailsTypeI value) {
        this.cabinFacilityDetails = value;
    }

    /**
     * Gets the value of the otherCabinFacilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCabinFacilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCabinFacilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinFacilitiesDetailsTypeI }
     * 
     * 
     */
    public List<CabinFacilitiesDetailsTypeI> getOtherCabinFacilityDetails() {
        if (otherCabinFacilityDetails == null) {
            otherCabinFacilityDetails = new ArrayList<CabinFacilitiesDetailsTypeI>();
        }
        return this.otherCabinFacilityDetails;
    }

}
