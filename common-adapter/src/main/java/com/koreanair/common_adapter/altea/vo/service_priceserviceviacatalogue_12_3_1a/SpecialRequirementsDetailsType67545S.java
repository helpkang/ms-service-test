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
 * To specify special requests or services information relating to a traveler.
 * 
 * <p>Java class for SpecialRequirementsDetailsType_67545S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_67545S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SpecialRequirementsTypeDetailsType_105612C"/>
 *         &lt;element name="seatDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SpecialRequirementsDataDetailsTypeI" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_67545S", propOrder = {
    "specialRequirementsInfo",
    "seatDetails"
})
public class SpecialRequirementsDetailsType67545S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType105612C specialRequirementsInfo;
    protected List<SpecialRequirementsDataDetailsTypeI> seatDetails;

    /**
     * Gets the value of the specialRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType105612C }
     *     
     */
    public SpecialRequirementsTypeDetailsType105612C getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /**
     * Sets the value of the specialRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType105612C }
     *     
     */
    public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsType105612C value) {
        this.specialRequirementsInfo = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequirementsDataDetailsTypeI }
     * 
     * 
     */
    public List<SpecialRequirementsDataDetailsTypeI> getSeatDetails() {
        if (seatDetails == null) {
            seatDetails = new ArrayList<SpecialRequirementsDataDetailsTypeI>();
        }
        return this.seatDetails;
    }

}
