//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 11:07:25 AM KST 
//


package com.koreanair.common_adapter.altea.vo.air_retrieveseatmapreply_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the warning(s) resulting from processing.
 * 
 * <p>Java class for WarningInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarningInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warningDetails" type="{http://xml.amadeus.com/SMPRES_14_2_1A}WarningDetailsTypeI"/>
 *         &lt;element name="otherWarningDetails" type="{http://xml.amadeus.com/SMPRES_14_2_1A}WarningDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningInformationTypeI", propOrder = {
    "warningDetails",
    "otherWarningDetails"
})
public class WarningInformationTypeI {

    @XmlElement(required = true)
    protected WarningDetailsTypeI warningDetails;
    protected List<WarningDetailsTypeI> otherWarningDetails;

    /**
     * Gets the value of the warningDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WarningDetailsTypeI }
     *     
     */
    public WarningDetailsTypeI getWarningDetails() {
        return warningDetails;
    }

    /**
     * Sets the value of the warningDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningDetailsTypeI }
     *     
     */
    public void setWarningDetails(WarningDetailsTypeI value) {
        this.warningDetails = value;
    }

    /**
     * Gets the value of the otherWarningDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherWarningDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherWarningDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningDetailsTypeI }
     * 
     * 
     */
    public List<WarningDetailsTypeI> getOtherWarningDetails() {
        if (otherWarningDetails == null) {
            otherWarningDetails = new ArrayList<WarningDetailsTypeI>();
        }
        return this.otherWarningDetails;
    }

}
