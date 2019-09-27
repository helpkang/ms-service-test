//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:52 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_repricepnrwithbookingclassreply_12_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDataMainInformation" type="{http://xml.amadeus.com/TARIPR_12_2_1A}MonetaryInformationDetailsType"/>
 *         &lt;element name="fareDataSupInformation" type="{http://xml.amadeus.com/TARIPR_12_2_1A}MonetaryInformationDetailsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType", propOrder = {
    "fareDataMainInformation",
    "fareDataSupInformation"
})
public class MonetaryInformationType {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsType fareDataMainInformation;
    protected List<MonetaryInformationDetailsType> fareDataSupInformation;

    /**
     * Gets the value of the fareDataMainInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsType }
     *     
     */
    public MonetaryInformationDetailsType getFareDataMainInformation() {
        return fareDataMainInformation;
    }

    /**
     * Sets the value of the fareDataMainInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsType }
     *     
     */
    public void setFareDataMainInformation(MonetaryInformationDetailsType value) {
        this.fareDataMainInformation = value;
    }

    /**
     * Gets the value of the fareDataSupInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDataSupInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDataSupInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType> getFareDataSupInformation() {
        if (fareDataSupInformation == null) {
            fareDataSupInformation = new ArrayList<MonetaryInformationDetailsType>();
        }
        return this.fareDataSupInformation;
    }

}
