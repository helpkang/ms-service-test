//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to request special service characteristics
 * 
 * <p>Java class for AttributeType_111528S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType_111528S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaSetType" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AttributeInformationTypeU" maxOccurs="999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType_111528S", propOrder = {
    "criteriaSetType",
    "criteriaDetails"
})
public class AttributeType111528S {

    protected String criteriaSetType;
    @XmlElement(required = true)
    protected List<AttributeInformationTypeU> criteriaDetails;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeInformationTypeU }
     * 
     * 
     */
    public List<AttributeInformationTypeU> getCriteriaDetails() {
        if (criteriaDetails == null) {
            criteriaDetails = new ArrayList<AttributeInformationTypeU>();
        }
        return this.criteriaDetails;
    }

}
