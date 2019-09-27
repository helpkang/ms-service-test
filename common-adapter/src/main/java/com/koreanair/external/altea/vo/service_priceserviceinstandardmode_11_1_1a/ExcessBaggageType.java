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
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * <p>Java class for ExcessBaggageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="excessBaggageDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}ExcessBaggageDetailsType" minOccurs="0"/>
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}BaggageDetailsType" minOccurs="0"/>
 *         &lt;element name="otherBaggageDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="extraBaggageDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="bagTagDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}BagtagDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageType", propOrder = {
    "excessBaggageDetails",
    "baggageDetails",
    "otherBaggageDetails",
    "extraBaggageDetails",
    "bagTagDetails"
})
public class ExcessBaggageType {

    protected ExcessBaggageDetailsType excessBaggageDetails;
    protected BaggageDetailsType baggageDetails;
    protected BaggageDetailsTypeI otherBaggageDetails;
    protected BaggageDetailsTypeI extraBaggageDetails;
    protected List<BagtagDetailsTypeI> bagTagDetails;

    /**
     * Gets the value of the excessBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessBaggageDetailsType }
     *     
     */
    public ExcessBaggageDetailsType getExcessBaggageDetails() {
        return excessBaggageDetails;
    }

    /**
     * Sets the value of the excessBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessBaggageDetailsType }
     *     
     */
    public void setExcessBaggageDetails(ExcessBaggageDetailsType value) {
        this.excessBaggageDetails = value;
    }

    /**
     * Gets the value of the baggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsType }
     *     
     */
    public BaggageDetailsType getBaggageDetails() {
        return baggageDetails;
    }

    /**
     * Sets the value of the baggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsType }
     *     
     */
    public void setBaggageDetails(BaggageDetailsType value) {
        this.baggageDetails = value;
    }

    /**
     * Gets the value of the otherBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getOtherBaggageDetails() {
        return otherBaggageDetails;
    }

    /**
     * Sets the value of the otherBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setOtherBaggageDetails(BaggageDetailsTypeI value) {
        this.otherBaggageDetails = value;
    }

    /**
     * Gets the value of the extraBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getExtraBaggageDetails() {
        return extraBaggageDetails;
    }

    /**
     * Sets the value of the extraBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setExtraBaggageDetails(BaggageDetailsTypeI value) {
        this.extraBaggageDetails = value;
    }

    /**
     * Gets the value of the bagTagDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagtagDetailsTypeI }
     * 
     * 
     */
    public List<BagtagDetailsTypeI> getBagTagDetails() {
        if (bagTagDetails == null) {
            bagTagDetails = new ArrayList<BagtagDetailsTypeI>();
        }
        return this.bagTagDetails;
    }

}
