//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 10:02:46 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceintegratemodereply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceTypeInfo" type="{http://xml.amadeus.com/TPISGR_11_1_1A}SelectionDetailsType"/>
 *         &lt;element name="serviceInformationDetailsGroup" type="{http://xml.amadeus.com/TPISGR_11_1_1A}ServiceInfoDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoType", propOrder = {
    "serviceTypeInfo",
    "serviceInformationDetailsGroup"
})
public class ServiceInfoType {

    @XmlElement(required = true)
    protected SelectionDetailsType serviceTypeInfo;
    protected ServiceInfoDetailsType serviceInformationDetailsGroup;

    /**
     * Gets the value of the serviceTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsType }
     *     
     */
    public SelectionDetailsType getServiceTypeInfo() {
        return serviceTypeInfo;
    }

    /**
     * Sets the value of the serviceTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsType }
     *     
     */
    public void setServiceTypeInfo(SelectionDetailsType value) {
        this.serviceTypeInfo = value;
    }

    /**
     * Gets the value of the serviceInformationDetailsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoDetailsType }
     *     
     */
    public ServiceInfoDetailsType getServiceInformationDetailsGroup() {
        return serviceInformationDetailsGroup;
    }

    /**
     * Sets the value of the serviceInformationDetailsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoDetailsType }
     *     
     */
    public void setServiceInformationDetailsGroup(ServiceInfoDetailsType value) {
        this.serviceInformationDetailsGroup = value;
    }

}
