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
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_67655S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_67655S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}SpecialRequirementsTypeDetailsType"/>
 *         &lt;element name="specialRequirementsDataDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}SpecialRequirementsDataDetailsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_67655S", propOrder = {
    "specialRequirementsDetails",
    "specialRequirementsDataDetails"
})
public class SpecialRequirementsDetailsType67655S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType specialRequirementsDetails;
    protected List<SpecialRequirementsDataDetailsType> specialRequirementsDataDetails;

    /**
     * Gets the value of the specialRequirementsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType }
     *     
     */
    public SpecialRequirementsTypeDetailsType getSpecialRequirementsDetails() {
        return specialRequirementsDetails;
    }

    /**
     * Sets the value of the specialRequirementsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType }
     *     
     */
    public void setSpecialRequirementsDetails(SpecialRequirementsTypeDetailsType value) {
        this.specialRequirementsDetails = value;
    }

    /**
     * Gets the value of the specialRequirementsDataDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRequirementsDataDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRequirementsDataDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequirementsDataDetailsType }
     * 
     * 
     */
    public List<SpecialRequirementsDataDetailsType> getSpecialRequirementsDataDetails() {
        if (specialRequirementsDataDetails == null) {
            specialRequirementsDataDetails = new ArrayList<SpecialRequirementsDataDetailsType>();
        }
        return this.specialRequirementsDataDetails;
    }

}
