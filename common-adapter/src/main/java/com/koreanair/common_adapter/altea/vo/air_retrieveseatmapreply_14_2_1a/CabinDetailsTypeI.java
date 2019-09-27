//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 11:07:25 AM KST 
//


package com.koreanair.common_adapter.altea.vo.air_retrieveseatmapreply_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the physical layout of a cabin area for seating.
 * 
 * <p>Java class for CabinDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classDetails" type="{http://xml.amadeus.com/SMPRES_14_2_1A}CabinClassDesignationTypeI" minOccurs="0"/>
 *         &lt;element name="seatRowRange" type="{http://xml.amadeus.com/SMPRES_14_2_1A}CabinClassSeatRowRangeDetailsTypeI"/>
 *         &lt;element name="cabinZoneCode" type="{http://xml.amadeus.com/SMPRES_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="smokingSeatRowRange" type="{http://xml.amadeus.com/SMPRES_14_2_1A}SmokingAreaSeatRowRangeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="defaultSeatOccupation" type="{http://xml.amadeus.com/SMPRES_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="overwingSeatRowRange" type="{http://xml.amadeus.com/SMPRES_14_2_1A}OverwingSeatRowRangeTypeI" minOccurs="0"/>
 *         &lt;element name="columnDetails" type="{http://xml.amadeus.com/SMPRES_14_2_1A}CabinWidthAndColumnDetailsTypeI" maxOccurs="12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetailsTypeI", propOrder = {
    "classDetails",
    "seatRowRange",
    "cabinZoneCode",
    "smokingSeatRowRange",
    "defaultSeatOccupation",
    "overwingSeatRowRange",
    "columnDetails"
})
public class CabinDetailsTypeI {

    protected CabinClassDesignationTypeI classDetails;
    @XmlElement(required = true)
    protected CabinClassSeatRowRangeDetailsTypeI seatRowRange;
    protected String cabinZoneCode;
    protected SmokingAreaSeatRowRangeDetailsTypeI smokingSeatRowRange;
    protected String defaultSeatOccupation;
    protected OverwingSeatRowRangeTypeI overwingSeatRowRange;
    protected List<CabinWidthAndColumnDetailsTypeI> columnDetails;

    /**
     * Gets the value of the classDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassDesignationTypeI }
     *     
     */
    public CabinClassDesignationTypeI getClassDetails() {
        return classDetails;
    }

    /**
     * Sets the value of the classDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassDesignationTypeI }
     *     
     */
    public void setClassDetails(CabinClassDesignationTypeI value) {
        this.classDetails = value;
    }

    /**
     * Gets the value of the seatRowRange property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassSeatRowRangeDetailsTypeI }
     *     
     */
    public CabinClassSeatRowRangeDetailsTypeI getSeatRowRange() {
        return seatRowRange;
    }

    /**
     * Sets the value of the seatRowRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassSeatRowRangeDetailsTypeI }
     *     
     */
    public void setSeatRowRange(CabinClassSeatRowRangeDetailsTypeI value) {
        this.seatRowRange = value;
    }

    /**
     * Gets the value of the cabinZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinZoneCode() {
        return cabinZoneCode;
    }

    /**
     * Sets the value of the cabinZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinZoneCode(String value) {
        this.cabinZoneCode = value;
    }

    /**
     * Gets the value of the smokingSeatRowRange property.
     * 
     * @return
     *     possible object is
     *     {@link SmokingAreaSeatRowRangeDetailsTypeI }
     *     
     */
    public SmokingAreaSeatRowRangeDetailsTypeI getSmokingSeatRowRange() {
        return smokingSeatRowRange;
    }

    /**
     * Sets the value of the smokingSeatRowRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingAreaSeatRowRangeDetailsTypeI }
     *     
     */
    public void setSmokingSeatRowRange(SmokingAreaSeatRowRangeDetailsTypeI value) {
        this.smokingSeatRowRange = value;
    }

    /**
     * Gets the value of the defaultSeatOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSeatOccupation() {
        return defaultSeatOccupation;
    }

    /**
     * Sets the value of the defaultSeatOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSeatOccupation(String value) {
        this.defaultSeatOccupation = value;
    }

    /**
     * Gets the value of the overwingSeatRowRange property.
     * 
     * @return
     *     possible object is
     *     {@link OverwingSeatRowRangeTypeI }
     *     
     */
    public OverwingSeatRowRangeTypeI getOverwingSeatRowRange() {
        return overwingSeatRowRange;
    }

    /**
     * Sets the value of the overwingSeatRowRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverwingSeatRowRangeTypeI }
     *     
     */
    public void setOverwingSeatRowRange(OverwingSeatRowRangeTypeI value) {
        this.overwingSeatRowRange = value;
    }

    /**
     * Gets the value of the columnDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinWidthAndColumnDetailsTypeI }
     * 
     * 
     */
    public List<CabinWidthAndColumnDetailsTypeI> getColumnDetails() {
        if (columnDetails == null) {
            columnDetails = new ArrayList<CabinWidthAndColumnDetailsTypeI>();
        }
        return this.columnDetails;
    }

}
