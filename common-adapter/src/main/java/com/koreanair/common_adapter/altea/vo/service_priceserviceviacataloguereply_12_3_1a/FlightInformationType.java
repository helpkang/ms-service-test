//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

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
 *         &lt;element name="involvedFlightInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TravelProductInformationType"/>
 *         &lt;element name="relatedProductInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}RelatedProductInformationTypeI" minOccurs="0"/>
 *         &lt;element name="additionalFlightInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="itineraryInfoGroup" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ItineraryInfoType" maxOccurs="3" minOccurs="0"/>
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
    "relatedProductInfo",
    "additionalFlightInfo",
    "itineraryInfoGroup"
})
public class FlightInformationType {

    @XmlElement(required = true)
    protected TravelProductInformationType involvedFlightInfo;
    protected RelatedProductInformationTypeI relatedProductInfo;
    protected AdditionalProductDetailsTypeI additionalFlightInfo;
    protected List<ItineraryInfoType> itineraryInfoGroup;

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
     * Gets the value of the relatedProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedProductInformationTypeI }
     *     
     */
    public RelatedProductInformationTypeI getRelatedProductInfo() {
        return relatedProductInfo;
    }

    /**
     * Sets the value of the relatedProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedProductInformationTypeI }
     *     
     */
    public void setRelatedProductInfo(RelatedProductInformationTypeI value) {
        this.relatedProductInfo = value;
    }

    /**
     * Gets the value of the additionalFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsTypeI }
     *     
     */
    public AdditionalProductDetailsTypeI getAdditionalFlightInfo() {
        return additionalFlightInfo;
    }

    /**
     * Sets the value of the additionalFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsTypeI }
     *     
     */
    public void setAdditionalFlightInfo(AdditionalProductDetailsTypeI value) {
        this.additionalFlightInfo = value;
    }

    /**
     * Gets the value of the itineraryInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryInfoType }
     * 
     * 
     */
    public List<ItineraryInfoType> getItineraryInfoGroup() {
        if (itineraryInfoGroup == null) {
            itineraryInfoGroup = new ArrayList<ItineraryInfoType>();
        }
        return this.itineraryInfoGroup;
    }

}
