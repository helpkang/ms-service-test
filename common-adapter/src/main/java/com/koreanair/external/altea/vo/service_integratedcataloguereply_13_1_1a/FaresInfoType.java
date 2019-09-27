//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FaresInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaresInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="markerAllFares" type="{http://xml.amadeus.com/TPICGR_13_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="responseTypeInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}StatusType_67578S" minOccurs="0"/>
 *         &lt;element name="responseIdentInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ItemNumberType" minOccurs="0"/>
 *         &lt;element name="involvedCurrenciesInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ConversionRateType" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}MonetaryInformationType_67590S" minOccurs="0"/>
 *         &lt;element name="computedTaxInfoGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}GeneralTaxInfoType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ticketingInfoGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}TicketingInfoType" minOccurs="0"/>
 *         &lt;element name="flightInfoGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}FlightInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="serviceInformationGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ServiceInfoType" minOccurs="0"/>
 *         &lt;element name="fareProductInfoGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}FareProductDataType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="serviceRequestRejectGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ServiceRequestRejectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaresInfoType", propOrder = {
    "markerAllFares",
    "responseTypeInfo",
    "responseIdentInfo",
    "involvedCurrenciesInfo",
    "monetaryInfo",
    "computedTaxInfoGroup",
    "ticketingInfoGroup",
    "flightInfoGroup",
    "serviceInformationGroup",
    "fareProductInfoGroup",
    "serviceRequestRejectGroup"
})
public class FaresInfoType {

    @XmlElement(required = true)
    protected DummySegmentTypeI markerAllFares;
    protected StatusType67578S responseTypeInfo;
    protected ItemNumberType responseIdentInfo;
    protected ConversionRateType involvedCurrenciesInfo;
    protected MonetaryInformationType67590S monetaryInfo;
    protected List<GeneralTaxInfoType> computedTaxInfoGroup;
    protected TicketingInfoType ticketingInfoGroup;
    protected List<FlightInformationType> flightInfoGroup;
    protected ServiceInfoType serviceInformationGroup;
    protected List<FareProductDataType> fareProductInfoGroup;
    protected ServiceRequestRejectType serviceRequestRejectGroup;

    /**
     * Gets the value of the markerAllFares property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getMarkerAllFares() {
        return markerAllFares;
    }

    /**
     * Sets the value of the markerAllFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setMarkerAllFares(DummySegmentTypeI value) {
        this.markerAllFares = value;
    }

    /**
     * Gets the value of the responseTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType67578S }
     *     
     */
    public StatusType67578S getResponseTypeInfo() {
        return responseTypeInfo;
    }

    /**
     * Sets the value of the responseTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType67578S }
     *     
     */
    public void setResponseTypeInfo(StatusType67578S value) {
        this.responseTypeInfo = value;
    }

    /**
     * Gets the value of the responseIdentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType }
     *     
     */
    public ItemNumberType getResponseIdentInfo() {
        return responseIdentInfo;
    }

    /**
     * Sets the value of the responseIdentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType }
     *     
     */
    public void setResponseIdentInfo(ItemNumberType value) {
        this.responseIdentInfo = value;
    }

    /**
     * Gets the value of the involvedCurrenciesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType }
     *     
     */
    public ConversionRateType getInvolvedCurrenciesInfo() {
        return involvedCurrenciesInfo;
    }

    /**
     * Sets the value of the involvedCurrenciesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType }
     *     
     */
    public void setInvolvedCurrenciesInfo(ConversionRateType value) {
        this.involvedCurrenciesInfo = value;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67590S }
     *     
     */
    public MonetaryInformationType67590S getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67590S }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType67590S value) {
        this.monetaryInfo = value;
    }

    /**
     * Gets the value of the computedTaxInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computedTaxInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputedTaxInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralTaxInfoType }
     * 
     * 
     */
    public List<GeneralTaxInfoType> getComputedTaxInfoGroup() {
        if (computedTaxInfoGroup == null) {
            computedTaxInfoGroup = new ArrayList<GeneralTaxInfoType>();
        }
        return this.computedTaxInfoGroup;
    }

    /**
     * Gets the value of the ticketingInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType }
     *     
     */
    public TicketingInfoType getTicketingInfoGroup() {
        return ticketingInfoGroup;
    }

    /**
     * Sets the value of the ticketingInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType }
     *     
     */
    public void setTicketingInfoGroup(TicketingInfoType value) {
        this.ticketingInfoGroup = value;
    }

    /**
     * Gets the value of the flightInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInformationType }
     * 
     * 
     */
    public List<FlightInformationType> getFlightInfoGroup() {
        if (flightInfoGroup == null) {
            flightInfoGroup = new ArrayList<FlightInformationType>();
        }
        return this.flightInfoGroup;
    }

    /**
     * Gets the value of the serviceInformationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoType }
     *     
     */
    public ServiceInfoType getServiceInformationGroup() {
        return serviceInformationGroup;
    }

    /**
     * Sets the value of the serviceInformationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoType }
     *     
     */
    public void setServiceInformationGroup(ServiceInfoType value) {
        this.serviceInformationGroup = value;
    }

    /**
     * Gets the value of the fareProductInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareProductInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductDataType }
     * 
     * 
     */
    public List<FareProductDataType> getFareProductInfoGroup() {
        if (fareProductInfoGroup == null) {
            fareProductInfoGroup = new ArrayList<FareProductDataType>();
        }
        return this.fareProductInfoGroup;
    }

    /**
     * Gets the value of the serviceRequestRejectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestRejectType }
     *     
     */
    public ServiceRequestRejectType getServiceRequestRejectGroup() {
        return serviceRequestRejectGroup;
    }

    /**
     * Sets the value of the serviceRequestRejectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestRejectType }
     *     
     */
    public void setServiceRequestRejectGroup(ServiceRequestRejectType value) {
        this.serviceRequestRejectGroup = value;
    }

}
