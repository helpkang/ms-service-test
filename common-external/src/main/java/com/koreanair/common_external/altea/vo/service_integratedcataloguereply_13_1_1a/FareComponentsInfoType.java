//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FareComponentsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionContextInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}FareComponentInformationType"/>
 *         &lt;element name="pricingUnitInfoGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}PricingUnitDataType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentsInfoType", propOrder = {
    "constructionContextInfo",
    "pricingUnitInfoGroup"
})
public class FareComponentsInfoType {

    @XmlElement(required = true)
    protected FareComponentInformationType constructionContextInfo;
    protected List<PricingUnitDataType> pricingUnitInfoGroup;

    /**
     * Gets the value of the constructionContextInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentInformationType }
     *     
     */
    public FareComponentInformationType getConstructionContextInfo() {
        return constructionContextInfo;
    }

    /**
     * Sets the value of the constructionContextInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentInformationType }
     *     
     */
    public void setConstructionContextInfo(FareComponentInformationType value) {
        this.constructionContextInfo = value;
    }

    /**
     * Gets the value of the pricingUnitInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingUnitInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingUnitInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingUnitDataType }
     * 
     * 
     */
    public List<PricingUnitDataType> getPricingUnitInfoGroup() {
        if (pricingUnitInfoGroup == null) {
            pricingUnitInfoGroup = new ArrayList<PricingUnitDataType>();
        }
        return this.pricingUnitInfoGroup;
    }

}
