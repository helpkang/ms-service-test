//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceRequestReferenceInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ReferenceInfoType"/>
 *         &lt;element name="serviceRequestDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SpecialRequirementsDetailsType_67547S" minOccurs="0"/>
 *         &lt;element name="serviceRequestDateAndTimeInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}DateAndTimeInformationType" minOccurs="0"/>
 *         &lt;element name="serviceRequestProductInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ProductInformationType_67517S" minOccurs="0"/>
 *         &lt;element name="serviceRequestParameters" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SeatRequestParametersTypeI" minOccurs="0"/>
 *         &lt;element name="quantitiesInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestDetailsType", propOrder = {
    "serviceRequestReferenceInfo",
    "serviceRequestDetails",
    "serviceRequestDateAndTimeInfo",
    "serviceRequestProductInfo",
    "serviceRequestParameters",
    "quantitiesInfo"
})
public class ServiceRequestDetailsType {

    @XmlElement(required = true)
    protected ReferenceInfoType serviceRequestReferenceInfo;
    protected SpecialRequirementsDetailsType67547S serviceRequestDetails;
    protected DateAndTimeInformationType serviceRequestDateAndTimeInfo;
    protected ProductInformationType67517S serviceRequestProductInfo;
    protected SeatRequestParametersTypeI serviceRequestParameters;
    protected QuantityType quantitiesInfo;

    /**
     * Gets the value of the serviceRequestReferenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getServiceRequestReferenceInfo() {
        return serviceRequestReferenceInfo;
    }

    /**
     * Sets the value of the serviceRequestReferenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setServiceRequestReferenceInfo(ReferenceInfoType value) {
        this.serviceRequestReferenceInfo = value;
    }

    /**
     * Gets the value of the serviceRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType67547S }
     *     
     */
    public SpecialRequirementsDetailsType67547S getServiceRequestDetails() {
        return serviceRequestDetails;
    }

    /**
     * Sets the value of the serviceRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType67547S }
     *     
     */
    public void setServiceRequestDetails(SpecialRequirementsDetailsType67547S value) {
        this.serviceRequestDetails = value;
    }

    /**
     * Gets the value of the serviceRequestDateAndTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public DateAndTimeInformationType getServiceRequestDateAndTimeInfo() {
        return serviceRequestDateAndTimeInfo;
    }

    /**
     * Sets the value of the serviceRequestDateAndTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public void setServiceRequestDateAndTimeInfo(DateAndTimeInformationType value) {
        this.serviceRequestDateAndTimeInfo = value;
    }

    /**
     * Gets the value of the serviceRequestProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType67517S }
     *     
     */
    public ProductInformationType67517S getServiceRequestProductInfo() {
        return serviceRequestProductInfo;
    }

    /**
     * Sets the value of the serviceRequestProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType67517S }
     *     
     */
    public void setServiceRequestProductInfo(ProductInformationType67517S value) {
        this.serviceRequestProductInfo = value;
    }

    /**
     * Gets the value of the serviceRequestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public SeatRequestParametersTypeI getServiceRequestParameters() {
        return serviceRequestParameters;
    }

    /**
     * Sets the value of the serviceRequestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public void setServiceRequestParameters(SeatRequestParametersTypeI value) {
        this.serviceRequestParameters = value;
    }

    /**
     * Gets the value of the quantitiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantitiesInfo() {
        return quantitiesInfo;
    }

    /**
     * Sets the value of the quantitiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantitiesInfo(QuantityType value) {
        this.quantitiesInfo = value;
    }

}
