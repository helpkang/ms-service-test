//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcataloguereply_13_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingUnitDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingUnitDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingUnitIdentInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}NumberOfUnitsType_153070S"/>
 *         &lt;element name="fareComponentInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}FareComponentInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingUnitDataType", propOrder = {
    "pricingUnitIdentInfo",
    "fareComponentInfo"
})
public class PricingUnitDataType {

    @XmlElement(required = true)
    protected NumberOfUnitsType153070S pricingUnitIdentInfo;
    protected List<FareComponentInfoType> fareComponentInfo;

    /**
     * Gets the value of the pricingUnitIdentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType153070S }
     *     
     */
    public NumberOfUnitsType153070S getPricingUnitIdentInfo() {
        return pricingUnitIdentInfo;
    }

    /**
     * Sets the value of the pricingUnitIdentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType153070S }
     *     
     */
    public void setPricingUnitIdentInfo(NumberOfUnitsType153070S value) {
        this.pricingUnitIdentInfo = value;
    }

    /**
     * Gets the value of the fareComponentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentInfoType }
     * 
     * 
     */
    public List<FareComponentInfoType> getFareComponentInfo() {
        if (fareComponentInfo == null) {
            fareComponentInfo = new ArrayList<FareComponentInfoType>();
        }
        return this.fareComponentInfo;
    }

}
