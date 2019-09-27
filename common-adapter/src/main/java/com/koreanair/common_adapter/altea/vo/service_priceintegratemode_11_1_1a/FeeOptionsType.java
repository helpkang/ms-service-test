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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="markerFeeOptions" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="feeOptionInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FeeOptionInfoType" maxOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeOptionsType", propOrder = {
    "markerFeeOptions",
    "feeOptionInfoGroup"
})
public class FeeOptionsType {

    @XmlElement(required = true)
    protected DummySegmentTypeI markerFeeOptions;
    @XmlElement(required = true)
    protected List<FeeOptionInfoType> feeOptionInfoGroup;

    /**
     * Gets the value of the markerFeeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getMarkerFeeOptions() {
        return markerFeeOptions;
    }

    /**
     * Sets the value of the markerFeeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setMarkerFeeOptions(DummySegmentTypeI value) {
        this.markerFeeOptions = value;
    }

    /**
     * Gets the value of the feeOptionInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeOptionInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeOptionInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeOptionInfoType }
     * 
     * 
     */
    public List<FeeOptionInfoType> getFeeOptionInfoGroup() {
        if (feeOptionInfoGroup == null) {
            feeOptionInfoGroup = new ArrayList<FeeOptionInfoType>();
        }
        return this.feeOptionInfoGroup;
    }

}
