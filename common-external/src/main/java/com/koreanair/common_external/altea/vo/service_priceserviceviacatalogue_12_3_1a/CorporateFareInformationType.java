//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify corporate fare information
 * 
 * <p>Java class for CorporateFareInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateFareInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateFareIdentifiers" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}CorporateFareIdentifiersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateFareInformationType", propOrder = {
    "corporateFareIdentifiers"
})
public class CorporateFareInformationType {

    protected CorporateFareIdentifiersType corporateFareIdentifiers;

    /**
     * Gets the value of the corporateFareIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareIdentifiersType }
     *     
     */
    public CorporateFareIdentifiersType getCorporateFareIdentifiers() {
        return corporateFareIdentifiers;
    }

    /**
     * Sets the value of the corporateFareIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareIdentifiersType }
     *     
     */
    public void setCorporateFareIdentifiers(CorporateFareIdentifiersType value) {
        this.corporateFareIdentifiers = value;
    }

}
