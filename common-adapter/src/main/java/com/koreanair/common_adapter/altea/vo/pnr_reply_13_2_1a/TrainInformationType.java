//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group together rail segment business data
 * 
 * <p>Java class for TrainInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}CompanyInformationType_132975S"/>
 *         &lt;element name="keyValueTree" type="{http://xml.amadeus.com/PNRACC_13_2_1A}CodedAttributeType_132972S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="tripDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TrainDataType_150774G"/>
 *         &lt;element name="openSegment" type="{http://xml.amadeus.com/PNRACC_13_2_1A}StatusTypeI_132979S" minOccurs="0"/>
 *         &lt;element name="journeyDirection" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravelItineraryInformationTypeI_129342S" minOccurs="0"/>
 *         &lt;element name="classInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ClassConfigurationDetailsType_132973S"/>
 *         &lt;element name="reservableStatus" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityAndActionTypeU_132977S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInformationType", propOrder = {
    "companyInfo",
    "keyValueTree",
    "tripDetails",
    "openSegment",
    "journeyDirection",
    "classInfo",
    "reservableStatus"
})
public class TrainInformationType {

    @XmlElement(required = true)
    protected CompanyInformationType132975S companyInfo;
    protected List<CodedAttributeType132972S> keyValueTree;
    @XmlElement(required = true)
    protected TrainDataType150774G tripDetails;
    protected StatusTypeI132979S openSegment;
    protected TravelItineraryInformationTypeI129342S journeyDirection;
    @XmlElement(required = true)
    protected ClassConfigurationDetailsType132973S classInfo;
    protected QuantityAndActionTypeU132977S reservableStatus;

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType132975S }
     *     
     */
    public CompanyInformationType132975S getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType132975S }
     *     
     */
    public void setCompanyInfo(CompanyInformationType132975S value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the keyValueTree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueTree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueTree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeType132972S }
     * 
     * 
     */
    public List<CodedAttributeType132972S> getKeyValueTree() {
        if (keyValueTree == null) {
            keyValueTree = new ArrayList<CodedAttributeType132972S>();
        }
        return this.keyValueTree;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDataType150774G }
     *     
     */
    public TrainDataType150774G getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDataType150774G }
     *     
     */
    public void setTripDetails(TrainDataType150774G value) {
        this.tripDetails = value;
    }

    /**
     * Gets the value of the openSegment property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypeI132979S }
     *     
     */
    public StatusTypeI132979S getOpenSegment() {
        return openSegment;
    }

    /**
     * Sets the value of the openSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypeI132979S }
     *     
     */
    public void setOpenSegment(StatusTypeI132979S value) {
        this.openSegment = value;
    }

    /**
     * Gets the value of the journeyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryInformationTypeI129342S }
     *     
     */
    public TravelItineraryInformationTypeI129342S getJourneyDirection() {
        return journeyDirection;
    }

    /**
     * Sets the value of the journeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryInformationTypeI129342S }
     *     
     */
    public void setJourneyDirection(TravelItineraryInformationTypeI129342S value) {
        this.journeyDirection = value;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClassConfigurationDetailsType132973S }
     *     
     */
    public ClassConfigurationDetailsType132973S getClassInfo() {
        return classInfo;
    }

    /**
     * Sets the value of the classInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassConfigurationDetailsType132973S }
     *     
     */
    public void setClassInfo(ClassConfigurationDetailsType132973S value) {
        this.classInfo = value;
    }

    /**
     * Gets the value of the reservableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionTypeU132977S }
     *     
     */
    public QuantityAndActionTypeU132977S getReservableStatus() {
        return reservableStatus;
    }

    /**
     * Sets the value of the reservableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionTypeU132977S }
     *     
     */
    public void setReservableStatus(QuantityAndActionTypeU132977S value) {
        this.reservableStatus = value;
    }

}
