//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestRejectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestRejectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceRequestRejectErrorCode" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ApplicationErrorInformationTypeI"/>
 *         &lt;element name="serviceRequestErrorFreeText" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestRejectType", propOrder = {
    "serviceRequestRejectErrorCode",
    "serviceRequestErrorFreeText"
})
public class ServiceRequestRejectType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationTypeI serviceRequestRejectErrorCode;
    protected InteractiveFreeTextTypeI serviceRequestErrorFreeText;

    /**
     * Gets the value of the serviceRequestRejectErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public ApplicationErrorInformationTypeI getServiceRequestRejectErrorCode() {
        return serviceRequestRejectErrorCode;
    }

    /**
     * Sets the value of the serviceRequestRejectErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public void setServiceRequestRejectErrorCode(ApplicationErrorInformationTypeI value) {
        this.serviceRequestRejectErrorCode = value;
    }

    /**
     * Gets the value of the serviceRequestErrorFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public InteractiveFreeTextTypeI getServiceRequestErrorFreeText() {
        return serviceRequestErrorFreeText;
    }

    /**
     * Sets the value of the serviceRequestErrorFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public void setServiceRequestErrorFreeText(InteractiveFreeTextTypeI value) {
        this.serviceRequestErrorFreeText = value;
    }

}
