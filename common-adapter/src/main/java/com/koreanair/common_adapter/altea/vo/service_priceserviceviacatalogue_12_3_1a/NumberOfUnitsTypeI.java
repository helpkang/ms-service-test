//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number of units required.
 * 
 * <p>Java class for NumberOfUnitsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}NumberOfUnitDetailsTypeI"/>
 *         &lt;element name="otherQuantityDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}NumberOfUnitDetailsTypeI" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitsTypeI", propOrder = {
    "quantityDetails",
    "otherQuantityDetails"
})
public class NumberOfUnitsTypeI {

    @XmlElement(required = true)
    protected NumberOfUnitDetailsTypeI quantityDetails;
    protected List<NumberOfUnitDetailsTypeI> otherQuantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitDetailsTypeI }
     *     
     */
    public NumberOfUnitDetailsTypeI getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitDetailsTypeI }
     *     
     */
    public void setQuantityDetails(NumberOfUnitDetailsTypeI value) {
        this.quantityDetails = value;
    }

    /**
     * Gets the value of the otherQuantityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherQuantityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherQuantityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsTypeI }
     * 
     * 
     */
    public List<NumberOfUnitDetailsTypeI> getOtherQuantityDetails() {
        if (otherQuantityDetails == null) {
            otherQuantityDetails = new ArrayList<NumberOfUnitDetailsTypeI>();
        }
        return this.otherQuantityDetails;
    }

}
