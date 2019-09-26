//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information.
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FrequentTravellerIdentificationType"/>
 *         &lt;element name="otherFrequentTravellerDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FrequentTravellerIdentificationType_105630C" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType", propOrder = {
    "frequentTravellerDetails",
    "otherFrequentTravellerDetails"
})
public class FrequentTravellerIdentificationCodeType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationType frequentTravellerDetails;
    protected List<FrequentTravellerIdentificationType105630C> otherFrequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public FrequentTravellerIdentificationType getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * Sets the value of the frequentTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public void setFrequentTravellerDetails(FrequentTravellerIdentificationType value) {
        this.frequentTravellerDetails = value;
    }

    /**
     * Gets the value of the otherFrequentTravellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFrequentTravellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFrequentTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentTravellerIdentificationType105630C }
     * 
     * 
     */
    public List<FrequentTravellerIdentificationType105630C> getOtherFrequentTravellerDetails() {
        if (otherFrequentTravellerDetails == null) {
            otherFrequentTravellerDetails = new ArrayList<FrequentTravellerIdentificationType105630C>();
        }
        return this.otherFrequentTravellerDetails;
    }

}
