//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:26 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_createformofpayment_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for AttributeType_84807S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType_84807S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaSetType" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AttributeInformationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType_84807S", propOrder = {
    "criteriaSetType",
    "criteriaDetails"
})
public class AttributeType84807S {

    protected String criteriaSetType;
    @XmlElement(required = true)
    protected AttributeInformationTypeU criteriaDetails;

    /**
     * Gets the value of the criteriaSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /**
     * Sets the value of the criteriaSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaSetType(String value) {
        this.criteriaSetType = value;
    }

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeInformationTypeU }
     *     
     */
    public AttributeInformationTypeU getCriteriaDetails() {
        return criteriaDetails;
    }

    /**
     * Sets the value of the criteriaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU }
     *     
     */
    public void setCriteriaDetails(AttributeInformationTypeU value) {
        this.criteriaDetails = value;
    }

}
