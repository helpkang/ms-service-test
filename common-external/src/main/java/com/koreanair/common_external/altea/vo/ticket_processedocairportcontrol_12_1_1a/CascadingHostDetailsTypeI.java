//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:09 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_processedocairportcontrol_12_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information that is required  from one host to another host via an intermediary host.
 * 
 * <p>Java class for CascadingHostDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CascadingHostDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostDetails" type="{http://xml.amadeus.com/TACREQ_12_1_1A}HostDefinitionTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CascadingHostDetailsTypeI", propOrder = {
    "hostDetails"
})
public class CascadingHostDetailsTypeI {

    protected List<HostDefinitionTypeI> hostDetails;

    /**
     * Gets the value of the hostDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDefinitionTypeI }
     * 
     * 
     */
    public List<HostDefinitionTypeI> getHostDetails() {
        if (hostDetails == null) {
            hostDetails = new ArrayList<HostDefinitionTypeI>();
        }
        return this.hostDetails;
    }

}
