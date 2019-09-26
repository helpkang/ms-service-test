//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SelectionDetailsType"/>
 *         &lt;element name="feeDetailsInfoGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FeeDetailsInfoType_86910G" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeBreakdownType", propOrder = {
    "feeTypeInfo",
    "feeDetailsInfoGroup"
})
public class FeeBreakdownType {

    @XmlElement(required = true)
    protected SelectionDetailsType feeTypeInfo;
    protected List<FeeDetailsInfoType86910G> feeDetailsInfoGroup;

    /**
     * Gets the value of the feeTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsType }
     *     
     */
    public SelectionDetailsType getFeeTypeInfo() {
        return feeTypeInfo;
    }

    /**
     * Sets the value of the feeTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsType }
     *     
     */
    public void setFeeTypeInfo(SelectionDetailsType value) {
        this.feeTypeInfo = value;
    }

    /**
     * Gets the value of the feeDetailsInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeDetailsInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeDetailsInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDetailsInfoType86910G }
     * 
     * 
     */
    public List<FeeDetailsInfoType86910G> getFeeDetailsInfoGroup() {
        if (feeDetailsInfoGroup == null) {
            feeDetailsInfoGroup = new ArrayList<FeeDetailsInfoType86910G>();
        }
        return this.feeDetailsInfoGroup;
    }

}
