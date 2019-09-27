//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceRequestSegmentsInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ActionDetailsType"/>
 *         &lt;element name="serviceRequestDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="serviceRequestDetailsGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ServiceRequestDetailsType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestType", propOrder = {
    "serviceRequestSegmentsInfo",
    "serviceRequestDetails",
    "serviceRequestDetailsGroup"
})
public class ServiceRequestType {

    @XmlElement(required = true)
    protected ActionDetailsType serviceRequestSegmentsInfo;
    protected SpecialRequirementsDetailsType serviceRequestDetails;
    protected List<ServiceRequestDetailsType> serviceRequestDetailsGroup;

    /**
     * Gets the value of the serviceRequestSegmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getServiceRequestSegmentsInfo() {
        return serviceRequestSegmentsInfo;
    }

    /**
     * Sets the value of the serviceRequestSegmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setServiceRequestSegmentsInfo(ActionDetailsType value) {
        this.serviceRequestSegmentsInfo = value;
    }

    /**
     * Gets the value of the serviceRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType }
     *     
     */
    public SpecialRequirementsDetailsType getServiceRequestDetails() {
        return serviceRequestDetails;
    }

    /**
     * Sets the value of the serviceRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType }
     *     
     */
    public void setServiceRequestDetails(SpecialRequirementsDetailsType value) {
        this.serviceRequestDetails = value;
    }

    /**
     * Gets the value of the serviceRequestDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequestDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequestDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequestDetailsType }
     * 
     * 
     */
    public List<ServiceRequestDetailsType> getServiceRequestDetailsGroup() {
        if (serviceRequestDetailsGroup == null) {
            serviceRequestDetailsGroup = new ArrayList<ServiceRequestDetailsType>();
        }
        return this.serviceRequestDetailsGroup;
    }

}
