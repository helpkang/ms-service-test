//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:11:03 ���� KST 
//


package com.koreanair.external.altea.vo.salesreports_displaycrossreferencereport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the action that should be taken on a selected reference number.
 * 
 * <p>Java class for ActionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfItemsDetails" type="{http://xml.amadeus.com/TSRXRQ_11_1_1A}ProcessingInformationTypeI" minOccurs="0"/>
 *         &lt;element name="lastItemsDetails" type="{http://xml.amadeus.com/TSRXRQ_11_1_1A}ReferenceTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDetailsTypeI", propOrder = {
    "numberOfItemsDetails",
    "lastItemsDetails"
})
public class ActionDetailsTypeI {

    protected ProcessingInformationTypeI numberOfItemsDetails;
    protected ReferenceTypeI lastItemsDetails;

    /**
     * Gets the value of the numberOfItemsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInformationTypeI }
     *     
     */
    public ProcessingInformationTypeI getNumberOfItemsDetails() {
        return numberOfItemsDetails;
    }

    /**
     * Sets the value of the numberOfItemsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInformationTypeI }
     *     
     */
    public void setNumberOfItemsDetails(ProcessingInformationTypeI value) {
        this.numberOfItemsDetails = value;
    }

    /**
     * Gets the value of the lastItemsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTypeI }
     *     
     */
    public ReferenceTypeI getLastItemsDetails() {
        return lastItemsDetails;
    }

    /**
     * Sets the value of the lastItemsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTypeI }
     *     
     */
    public void setLastItemsDetails(ReferenceTypeI value) {
        this.lastItemsDetails = value;
    }

}
