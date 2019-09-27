//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 09:23:07 AM KST 
//


package com.koreanair.common_adapter.altea.vo.fare_pricepnrwithbookingclassreply_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amount information.
 * 
 * <p>Java class for MonetaryInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDataMainInformation" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}MonetaryInformationDetailsTypeI"/>
 *         &lt;element name="fareDataSupInformation" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}MonetaryInformationDetailsTypeI" maxOccurs="19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationTypeI", propOrder = {
    "fareDataMainInformation",
    "fareDataSupInformation"
})
public class MonetaryInformationTypeI {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI fareDataMainInformation;
    protected List<MonetaryInformationDetailsTypeI> fareDataSupInformation;

    /**
     * Gets the value of the fareDataMainInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI }
     *     
     */
    public MonetaryInformationDetailsTypeI getFareDataMainInformation() {
        return fareDataMainInformation;
    }

    /**
     * Sets the value of the fareDataMainInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI }
     *     
     */
    public void setFareDataMainInformation(MonetaryInformationDetailsTypeI value) {
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
     * {@link MonetaryInformationDetailsTypeI }
     * 
     * 
     */
    public List<MonetaryInformationDetailsTypeI> getFareDataSupInformation() {
        if (fareDataSupInformation == null) {
            fareDataSupInformation = new ArrayList<MonetaryInformationDetailsTypeI>();
        }
        return this.fareDataSupInformation;
    }

}
