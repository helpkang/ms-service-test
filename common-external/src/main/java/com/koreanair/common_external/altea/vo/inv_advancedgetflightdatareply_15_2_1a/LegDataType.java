//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_external.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cross cabin info
 * 
 * <p>Java class for LegDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crossCabinConfigInfo" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}CrossCabinConfigurationsType"/>
 *         &lt;element name="crossCabinControls" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaNumericString_Length1To3" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegDataType", propOrder = {
    "crossCabinConfigInfo",
    "crossCabinControls"
})
public class LegDataType {

    @XmlElement(required = true)
    protected CrossCabinConfigurationsType crossCabinConfigInfo;
    @XmlElement(required = true)
    protected List<String> crossCabinControls;

    /**
     * Gets the value of the crossCabinConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CrossCabinConfigurationsType }
     *     
     */
    public CrossCabinConfigurationsType getCrossCabinConfigInfo() {
        return crossCabinConfigInfo;
    }

    /**
     * Sets the value of the crossCabinConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossCabinConfigurationsType }
     *     
     */
    public void setCrossCabinConfigInfo(CrossCabinConfigurationsType value) {
        this.crossCabinConfigInfo = value;
    }

    /**
     * Gets the value of the crossCabinControls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossCabinControls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossCabinControls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCrossCabinControls() {
        if (crossCabinControls == null) {
            crossCabinControls = new ArrayList<String>();
        }
        return this.crossCabinControls;
    }

}
