//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:52 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.ticket_repricepnrwithbookingclassreply_12_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationTypeI_74387S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationTypeI_74387S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penDisData" type="{http://xml.amadeus.com/TARIPR_12_2_1A}DiscountPenaltyMonetaryInformationTypeI_115079C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationTypeI_74387S", propOrder = {
    "penDisData"
})
public class DiscountAndPenaltyInformationTypeI74387S {

    protected DiscountPenaltyMonetaryInformationTypeI115079C penDisData;

    /**
     * Gets the value of the penDisData property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyMonetaryInformationTypeI115079C }
     *     
     */
    public DiscountPenaltyMonetaryInformationTypeI115079C getPenDisData() {
        return penDisData;
    }

    /**
     * Sets the value of the penDisData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyMonetaryInformationTypeI115079C }
     *     
     */
    public void setPenDisData(DiscountPenaltyMonetaryInformationTypeI115079C value) {
        this.penDisData = value;
    }

}
