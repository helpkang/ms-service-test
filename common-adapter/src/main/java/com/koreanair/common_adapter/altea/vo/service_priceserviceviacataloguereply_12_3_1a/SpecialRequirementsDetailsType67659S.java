//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_67659S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_67659S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceRequirementsInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}SpecialRequirementsTypeDetailsType_105761C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_67659S", propOrder = {
    "serviceRequirementsInfo"
})
public class SpecialRequirementsDetailsType67659S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType105761C serviceRequirementsInfo;

    /**
     * Gets the value of the serviceRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType105761C }
     *     
     */
    public SpecialRequirementsTypeDetailsType105761C getServiceRequirementsInfo() {
        return serviceRequirementsInfo;
    }

    /**
     * Sets the value of the serviceRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType105761C }
     *     
     */
    public void setServiceRequirementsInfo(SpecialRequirementsTypeDetailsType105761C value) {
        this.serviceRequirementsInfo = value;
    }

}
