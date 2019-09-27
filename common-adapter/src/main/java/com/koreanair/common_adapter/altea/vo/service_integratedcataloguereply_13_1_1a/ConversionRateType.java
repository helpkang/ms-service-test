//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of a conversion rate related to an amount.
 * 
 * <p>Java class for ConversionRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionRateDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ConversionRateDetailsType"/>
 *         &lt;element name="otherConvRateDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ConversionRateDetailsType" maxOccurs="19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateType", propOrder = {
    "conversionRateDetails",
    "otherConvRateDetails"
})
public class ConversionRateType {

    @XmlElement(required = true)
    protected ConversionRateDetailsType conversionRateDetails;
    protected List<ConversionRateDetailsType> otherConvRateDetails;

    /**
     * Gets the value of the conversionRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsType }
     *     
     */
    public ConversionRateDetailsType getConversionRateDetails() {
        return conversionRateDetails;
    }

    /**
     * Sets the value of the conversionRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsType }
     *     
     */
    public void setConversionRateDetails(ConversionRateDetailsType value) {
        this.conversionRateDetails = value;
    }

    /**
     * Gets the value of the otherConvRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherConvRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherConvRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionRateDetailsType }
     * 
     * 
     */
    public List<ConversionRateDetailsType> getOtherConvRateDetails() {
        if (otherConvRateDetails == null) {
            otherConvRateDetails = new ArrayList<ConversionRateDetailsType>();
        }
        return this.otherConvRateDetails;
    }

}
