//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcataloguereply_13_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a component of a data structure (e.g. an array or table).
 * 
 * <p>Java class for StructureComponentDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructureComponentDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="function" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="componentId" type="{http://xml.amadeus.com/TPICGR_13_3_1A}StructureComponentIdentificationType"/>
 *         &lt;element name="status" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="position" type="{http://xml.amadeus.com/TPICGR_13_3_1A}PositionIdentificationBatchTypeU" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/TPICGR_13_3_1A}CharacteristicDescriptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureComponentDefinitionType", propOrder = {
    "function",
    "componentId",
    "status",
    "position",
    "description"
})
public class StructureComponentDefinitionType {

    @XmlElement(required = true)
    protected String function;
    @XmlElement(required = true)
    protected StructureComponentIdentificationType componentId;
    protected String status;
    protected PositionIdentificationBatchTypeU position;
    @XmlElement(required = true)
    protected CharacteristicDescriptionType description;

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link StructureComponentIdentificationType }
     *     
     */
    public StructureComponentIdentificationType getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureComponentIdentificationType }
     *     
     */
    public void setComponentId(StructureComponentIdentificationType value) {
        this.componentId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionIdentificationBatchTypeU }
     *     
     */
    public PositionIdentificationBatchTypeU getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionIdentificationBatchTypeU }
     *     
     */
    public void setPosition(PositionIdentificationBatchTypeU value) {
        this.position = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicDescriptionType }
     *     
     */
    public CharacteristicDescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicDescriptionType }
     *     
     */
    public void setDescription(CharacteristicDescriptionType value) {
        this.description = value;
    }

}
