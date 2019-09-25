
package com.koreanair.eretail.pojo.tripplan.pnr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for posType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="posType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGINATOR_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SYSTEM_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CITY_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="STATE_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRY_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posType", propOrder = {
    "officeid",
    "originatorid",
    "systemcode",
    "location",
    "citycode",
    "countrycode"
})
public class PosType
    implements Serializable
{

    @XmlElement(name = "OFFICE_ID")
    protected String officeid;
    @XmlElement(name = "ORIGINATOR_ID")
    protected String originatorid;
    @XmlElement(name = "SYSTEM_CODE")
    protected String systemcode;
    @XmlElement(name = "LOCATION")
    protected PosType.LOCATION location;
    @XmlElement(name = "CITY_CODE")
    protected String citycode;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFICEID(String value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the originatorid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINATORID() {
        return originatorid;
    }

    /**
     * Sets the value of the originatorid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINATORID(String value) {
        this.originatorid = value;
    }

    /**
     * Gets the value of the systemcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMCODE() {
        return systemcode;
    }

    /**
     * Sets the value of the systemcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMCODE(String value) {
        this.systemcode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link PosType.LOCATION }
     *     
     */
    public PosType.LOCATION getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosType.LOCATION }
     *     
     */
    public void setLOCATION(PosType.LOCATION value) {
        this.location = value;
    }

    /**
     * Gets the value of the citycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYCODE() {
        return citycode;
    }

    /**
     * Sets the value of the citycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYCODE(String value) {
        this.citycode = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CITY_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locationcode",
        "locationname",
        "citycode",
        "cityname",
        "statecode",
        "statename",
        "countrycode",
        "countryname"
    })
    public static class LOCATION
        implements Serializable
    {

        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME")
        protected String locationname;
        @XmlElement(name = "CITY_CODE")
        protected String citycode;
        @XmlElement(name = "CITY_NAME")
        protected String cityname;
        @XmlElement(name = "STATE_CODE")
        protected String statecode;
        @XmlElement(name = "STATE_NAME")
        protected String statename;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "COUNTRY_NAME")
        protected String countryname;

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
        }

        /**
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the cityname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYNAME() {
            return cityname;
        }

        /**
         * Sets the value of the cityname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYNAME(String value) {
            this.cityname = value;
        }

        /**
         * Gets the value of the statecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATECODE() {
            return statecode;
        }

        /**
         * Sets the value of the statecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATECODE(String value) {
            this.statecode = value;
        }

        /**
         * Gets the value of the statename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATENAME() {
            return statename;
        }

        /**
         * Sets the value of the statename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATENAME(String value) {
            this.statename = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the countryname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYNAME() {
            return countryname;
        }

        /**
         * Sets the value of the countryname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYNAME(String value) {
            this.countryname = value;
        }

    }

}
