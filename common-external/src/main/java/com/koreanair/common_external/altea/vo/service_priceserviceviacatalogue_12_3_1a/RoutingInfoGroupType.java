//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for RoutingInfoGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInfoGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routingInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}RoutingInformationTypeI"/>
 *         &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInfoGroupType", propOrder = {
    "routingInfo",
    "dateAndTimeInfo"
})
public class RoutingInfoGroupType {

    @XmlElement(required = true)
    protected RoutingInformationTypeI routingInfo;
    protected DateAndTimeInformationTypeI dateAndTimeInfo;

    /**
     * Gets the value of the routingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public RoutingInformationTypeI getRoutingInfo() {
        return routingInfo;
    }

    /**
     * Sets the value of the routingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public void setRoutingInfo(RoutingInformationTypeI value) {
        this.routingInfo = value;
    }

    /**
     * Gets the value of the dateAndTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationTypeI }
     *     
     */
    public DateAndTimeInformationTypeI getDateAndTimeInfo() {
        return dateAndTimeInfo;
    }

    /**
     * Sets the value of the dateAndTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationTypeI }
     *     
     */
    public void setDateAndTimeInfo(DateAndTimeInformationTypeI value) {
        this.dateAndTimeInfo = value;
    }

}
