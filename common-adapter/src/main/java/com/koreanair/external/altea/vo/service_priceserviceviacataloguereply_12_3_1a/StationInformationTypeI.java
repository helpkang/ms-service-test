//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify departure/arrival information concerning a means of transport.
 * 
 * <p>Java class for StationInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gateDescription" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="terminal" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="concourse" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationInformationTypeI", propOrder = {
    "gateDescription",
    "terminal",
    "concourse"
})
public class StationInformationTypeI {

    protected String gateDescription;
    protected String terminal;
    protected String concourse;

    /**
     * Gets the value of the gateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateDescription() {
        return gateDescription;
    }

    /**
     * Sets the value of the gateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateDescription(String value) {
        this.gateDescription = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the concourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcourse() {
        return concourse;
    }

    /**
     * Sets the value of the concourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcourse(String value) {
        this.concourse = value;
    }

}
