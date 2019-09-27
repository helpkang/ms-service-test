//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedpricingreply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposedServiceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedServiceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicePricingAggregation" type="{http://xml.amadeus.com/TPISGR_15_1_1A}AttributeType_67628S"/>
 *         &lt;element name="serviceParameterValueInfo" type="{http://xml.amadeus.com/TPISGR_15_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *         &lt;element name="dateAndTimeAggregation" type="{http://xml.amadeus.com/TPISGR_15_1_1A}DateAndTimeInformationType_67653S" minOccurs="0"/>
 *         &lt;element name="corporateInfo" type="{http://xml.amadeus.com/TPISGR_15_1_1A}CorporateFareInformationType" minOccurs="0"/>
 *         &lt;element name="proposedServiceReqPortionInfo" type="{http://xml.amadeus.com/TPISGR_15_1_1A}PortionProposedServiceInfoType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposedServiceInfoType", propOrder = {
    "servicePricingAggregation",
    "serviceParameterValueInfo",
    "dateAndTimeAggregation",
    "corporateInfo",
    "proposedServiceReqPortionInfo"
})
public class ProposedServiceInfoType {

    @XmlElement(required = true)
    protected AttributeType67628S servicePricingAggregation;
    protected NumberOfUnitsType serviceParameterValueInfo;
    protected DateAndTimeInformationType67653S dateAndTimeAggregation;
    protected CorporateFareInformationType corporateInfo;
    protected List<PortionProposedServiceInfoType> proposedServiceReqPortionInfo;

    /**
     * Gets the value of the servicePricingAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType67628S }
     *     
     */
    public AttributeType67628S getServicePricingAggregation() {
        return servicePricingAggregation;
    }

    /**
     * Sets the value of the servicePricingAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType67628S }
     *     
     */
    public void setServicePricingAggregation(AttributeType67628S value) {
        this.servicePricingAggregation = value;
    }

    /**
     * Gets the value of the serviceParameterValueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getServiceParameterValueInfo() {
        return serviceParameterValueInfo;
    }

    /**
     * Sets the value of the serviceParameterValueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setServiceParameterValueInfo(NumberOfUnitsType value) {
        this.serviceParameterValueInfo = value;
    }

    /**
     * Gets the value of the dateAndTimeAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationType67653S }
     *     
     */
    public DateAndTimeInformationType67653S getDateAndTimeAggregation() {
        return dateAndTimeAggregation;
    }

    /**
     * Sets the value of the dateAndTimeAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationType67653S }
     *     
     */
    public void setDateAndTimeAggregation(DateAndTimeInformationType67653S value) {
        this.dateAndTimeAggregation = value;
    }

    /**
     * Gets the value of the corporateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public CorporateFareInformationType getCorporateInfo() {
        return corporateInfo;
    }

    /**
     * Sets the value of the corporateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public void setCorporateInfo(CorporateFareInformationType value) {
        this.corporateInfo = value;
    }

    /**
     * Gets the value of the proposedServiceReqPortionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposedServiceReqPortionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposedServiceReqPortionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortionProposedServiceInfoType }
     * 
     * 
     */
    public List<PortionProposedServiceInfoType> getProposedServiceReqPortionInfo() {
        if (proposedServiceReqPortionInfo == null) {
            proposedServiceReqPortionInfo = new ArrayList<PortionProposedServiceInfoType>();
        }
        return this.proposedServiceReqPortionInfo;
    }

}
