//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:39 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_readformofpaymentdata_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details relating to the sequence.
 * 
 * <p>Java class for SequenceDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceDetails" type="{http://xml.amadeus.com/TFOPRQ_12_1_1A}SequenceInformationTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceDetailsTypeU", propOrder = {
    "sequenceDetails"
})
public class SequenceDetailsTypeU {

    protected SequenceInformationTypeU sequenceDetails;

    /**
     * Gets the value of the sequenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceInformationTypeU }
     *     
     */
    public SequenceInformationTypeU getSequenceDetails() {
        return sequenceDetails;
    }

    /**
     * Sets the value of the sequenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceInformationTypeU }
     *     
     */
    public void setSequenceDetails(SequenceInformationTypeU value) {
        this.sequenceDetails = value;
    }

}
