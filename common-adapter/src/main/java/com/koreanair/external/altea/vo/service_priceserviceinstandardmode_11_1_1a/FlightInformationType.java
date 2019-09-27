//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FlightInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="involvedFlightInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}TravelProductInformationType"/>
 *         &lt;element name="relatedFlightInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}RelatedProductInformationTypeI" minOccurs="0"/>
 *         &lt;element name="seatRequestParameters" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SeatRequestParametersTypeI" minOccurs="0"/>
 *         &lt;element name="additionalFlightInfoGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AdditionalProductInfoType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="travelItineraryInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}TravellerInsuranceInformationType" minOccurs="0"/>
 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}ProductInformationType_67517S" minOccurs="0"/>
 *         &lt;element name="routingInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}RoutingInformationTypeI" minOccurs="0"/>
 *         &lt;element name="psgInfoPerFlightGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}PassengerFlightInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInformationType", propOrder = {
    "involvedFlightInfo",
    "relatedFlightInfo",
    "seatRequestParameters",
    "additionalFlightInfoGroup",
    "monetaryInfo",
    "travelItineraryInfo",
    "productInfo",
    "routingInfo",
    "psgInfoPerFlightGroup"
})
public class FlightInformationType {

    @XmlElement(required = true)
    protected TravelProductInformationType involvedFlightInfo;
    protected RelatedProductInformationTypeI relatedFlightInfo;
    protected SeatRequestParametersTypeI seatRequestParameters;
    protected List<AdditionalProductInfoType> additionalFlightInfoGroup;
    protected MonetaryInformationType monetaryInfo;
    protected TravellerInsuranceInformationType travelItineraryInfo;
    protected ProductInformationType67517S productInfo;
    protected RoutingInformationTypeI routingInfo;
    protected List<PassengerFlightInfoType> psgInfoPerFlightGroup;

    /**
     * Gets the value of the involvedFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType }
     *     
     */
    public TravelProductInformationType getInvolvedFlightInfo() {
        return involvedFlightInfo;
    }

    /**
     * Sets the value of the involvedFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType }
     *     
     */
    public void setInvolvedFlightInfo(TravelProductInformationType value) {
        this.involvedFlightInfo = value;
    }

    /**
     * Gets the value of the relatedFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedProductInformationTypeI }
     *     
     */
    public RelatedProductInformationTypeI getRelatedFlightInfo() {
        return relatedFlightInfo;
    }

    /**
     * Sets the value of the relatedFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedProductInformationTypeI }
     *     
     */
    public void setRelatedFlightInfo(RelatedProductInformationTypeI value) {
        this.relatedFlightInfo = value;
    }

    /**
     * Gets the value of the seatRequestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public SeatRequestParametersTypeI getSeatRequestParameters() {
        return seatRequestParameters;
    }

    /**
     * Sets the value of the seatRequestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public void setSeatRequestParameters(SeatRequestParametersTypeI value) {
        this.seatRequestParameters = value;
    }

    /**
     * Gets the value of the additionalFlightInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFlightInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFlightInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalProductInfoType }
     * 
     * 
     */
    public List<AdditionalProductInfoType> getAdditionalFlightInfoGroup() {
        if (additionalFlightInfoGroup == null) {
            additionalFlightInfoGroup = new ArrayList<AdditionalProductInfoType>();
        }
        return this.additionalFlightInfoGroup;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType value) {
        this.monetaryInfo = value;
    }

    /**
     * Gets the value of the travelItineraryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInsuranceInformationType }
     *     
     */
    public TravellerInsuranceInformationType getTravelItineraryInfo() {
        return travelItineraryInfo;
    }

    /**
     * Sets the value of the travelItineraryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInsuranceInformationType }
     *     
     */
    public void setTravelItineraryInfo(TravellerInsuranceInformationType value) {
        this.travelItineraryInfo = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType67517S }
     *     
     */
    public ProductInformationType67517S getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType67517S }
     *     
     */
    public void setProductInfo(ProductInformationType67517S value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the routingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public RoutingInformationTypeI getRoutingInfo() {
        return routingInfo;
    }

    /**
     * Sets the value of the routingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public void setRoutingInfo(RoutingInformationTypeI value) {
        this.routingInfo = value;
    }

    /**
     * Gets the value of the psgInfoPerFlightGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psgInfoPerFlightGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsgInfoPerFlightGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFlightInfoType }
     * 
     * 
     */
    public List<PassengerFlightInfoType> getPsgInfoPerFlightGroup() {
        if (psgInfoPerFlightGroup == null) {
            psgInfoPerFlightGroup = new ArrayList<PassengerFlightInfoType>();
        }
        return this.psgInfoPerFlightGroup;
    }

}
