//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 09:23:07 AM KST 
//


package com.koreanair.external.altea.vo.fare_pricepnrwithbookingclassreply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationErrorDetail" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}ApplicationErrorDetailType_48648C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType", propOrder = {
    "applicationErrorDetail"
})
public class ApplicationErrorInformationType {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType48648C applicationErrorDetail;

    /**
     * Gets the value of the applicationErrorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType48648C }
     *     
     */
    public ApplicationErrorDetailType48648C getApplicationErrorDetail() {
        return applicationErrorDetail;
    }

    /**
     * Sets the value of the applicationErrorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType48648C }
     *     
     */
    public void setApplicationErrorDetail(ApplicationErrorDetailType48648C value) {
        this.applicationErrorDetail = value;
    }

}
