//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinInformation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}SegmentCabinIdentificationType"/>
 *         &lt;element name="subClassInformation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}SubclassIdentificationType" minOccurs="0"/>
 *         &lt;element name="subClassClassification" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AdditionalBusinessSourceInformationType_132962S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDataType", propOrder = {
    "cabinInformation",
    "subClassInformation",
    "subClassClassification"
})
public class InventoryDataType {

    @XmlElement(required = true)
    protected SegmentCabinIdentificationType cabinInformation;
    protected SubclassIdentificationType subClassInformation;
    protected AdditionalBusinessSourceInformationType132962S subClassClassification;

    /**
     * Gets the value of the cabinInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentCabinIdentificationType }
     *     
     */
    public SegmentCabinIdentificationType getCabinInformation() {
        return cabinInformation;
    }

    /**
     * Sets the value of the cabinInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentCabinIdentificationType }
     *     
     */
    public void setCabinInformation(SegmentCabinIdentificationType value) {
        this.cabinInformation = value;
    }

    /**
     * Gets the value of the subClassInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubclassIdentificationType }
     *     
     */
    public SubclassIdentificationType getSubClassInformation() {
        return subClassInformation;
    }

    /**
     * Sets the value of the subClassInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubclassIdentificationType }
     *     
     */
    public void setSubClassInformation(SubclassIdentificationType value) {
        this.subClassInformation = value;
    }

    /**
     * Gets the value of the subClassClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessSourceInformationType132962S }
     *     
     */
    public AdditionalBusinessSourceInformationType132962S getSubClassClassification() {
        return subClassClassification;
    }

    /**
     * Sets the value of the subClassClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessSourceInformationType132962S }
     *     
     */
    public void setSubClassClassification(AdditionalBusinessSourceInformationType132962S value) {
        this.subClassClassification = value;
    }

}
