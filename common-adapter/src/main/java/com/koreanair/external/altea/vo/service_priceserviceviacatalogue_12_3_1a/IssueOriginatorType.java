//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssueOriginatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueOriginatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issueTktOriginatorInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}OriginatorOfRequestDetailsTypeI"/>
 *         &lt;element name="firstIssueTktOrigInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}OriginatorOfRequestDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueOriginatorType", propOrder = {
    "issueTktOriginatorInfo",
    "firstIssueTktOrigInfo"
})
public class IssueOriginatorType {

    @XmlElement(required = true)
    protected OriginatorOfRequestDetailsTypeI issueTktOriginatorInfo;
    protected OriginatorOfRequestDetailsTypeI firstIssueTktOrigInfo;

    /**
     * Gets the value of the issueTktOriginatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorOfRequestDetailsTypeI }
     *     
     */
    public OriginatorOfRequestDetailsTypeI getIssueTktOriginatorInfo() {
        return issueTktOriginatorInfo;
    }

    /**
     * Sets the value of the issueTktOriginatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorOfRequestDetailsTypeI }
     *     
     */
    public void setIssueTktOriginatorInfo(OriginatorOfRequestDetailsTypeI value) {
        this.issueTktOriginatorInfo = value;
    }

    /**
     * Gets the value of the firstIssueTktOrigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorOfRequestDetailsTypeI }
     *     
     */
    public OriginatorOfRequestDetailsTypeI getFirstIssueTktOrigInfo() {
        return firstIssueTktOrigInfo;
    }

    /**
     * Sets the value of the firstIssueTktOrigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorOfRequestDetailsTypeI }
     *     
     */
    public void setFirstIssueTktOrigInfo(OriginatorOfRequestDetailsTypeI value) {
        this.firstIssueTktOrigInfo = value;
    }

}
