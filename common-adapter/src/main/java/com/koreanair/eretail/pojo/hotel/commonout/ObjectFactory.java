
package com.koreanair.eretail.pojo.hotel.commonout;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.GDSCABINCODEType;
import com.koreanair.eretail.pojo.common.common.LISTTRIPREASONtype;
import com.koreanair.eretail.pojo.common.common.OperationalDataType;
import com.koreanair.eretail.pojo.hotel.commonelementsout.BEDTYPE1;
import com.koreanair.eretail.pojo.hotel.commonelementsout.BLOCATIONITEMTYPE5;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HOTELNEGOTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HOTELSTANDARDTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HTLAREATYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HTLPOLICIESTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.HTLPOLICYTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.LISTROOMITEMTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.LISTTERMITEMTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.LISTTRAVELLERPREFERENCETYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.MEALTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.PREFERENCETYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.ROOMTYPE1;
import com.koreanair.eretail.pojo.hotel.commonelementsout.STRUTUREDPOITYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.TRANSPORTATIONTYPE;
import com.koreanair.eretail.pojo.hotel.commonelementsout.TRAVELLERPREFERENCETYPE;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.hotel.commonout package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DISCOUNTCODE_QNAME = new QName("", "DISCOUNT_CODE");
    private final static QName _LISTFIELDERROR_QNAME = new QName("", "LIST_FIELD_ERROR");
    private final static QName _EXCHANGERATE_QNAME = new QName("", "EXCHANGE_RATE");
    private final static QName _DIRECTLOGIN_QNAME = new QName("", "DIRECT_LOGIN");
    private final static QName _DIRECTLOGINAGENT_QNAME = new QName("", "DIRECT_LOGIN_AGENT");
    private final static QName _EXTERNALLOGIN_QNAME = new QName("", "EXTERNAL_LOGIN");
    private final static QName _EXTERNALDIRECTLOGIN_QNAME = new QName("", "EXTERNAL_DIRECT_LOGIN");
    private final static QName _ISSTRUCTUREDXML_QNAME = new QName("", "IS_STRUCTURED_XML");
    private final static QName _NUMBEROFPROFILES_QNAME = new QName("", "NUMBER_OF_PROFILES");
    private final static QName _OFFICEID_QNAME = new QName("", "OFFICE_ID");
    private final static QName _TRIPREASONCODE_QNAME = new QName("", "TRIP_REASON_CODE");
    private final static QName _BOOLISOUTOFPOLICY_QNAME = new QName("", "BOOL_IS_OUT_OF_POLICY");
    private final static QName _DISPLAYRANK_QNAME = new QName("", "DISPLAY_RANK");
    private final static QName _PAGETICKET_QNAME = new QName("", "PAGE_TICKET");
    private final static QName _LISTTRIPREASON_QNAME = new QName("", "LIST_TRIP_REASON");
    private final static QName _RELATIONSHIP_QNAME = new QName("", "RELATIONSHIP");
    private final static QName _OPERATIONALDATA_QNAME = new QName("", "OPERATIONAL_DATA");
    private final static QName _MOREINFORMATIONAVAILABLE_QNAME = new QName("", "MORE_INFORMATION_AVAILABLE");
    private final static QName _AIRGDSCABINCODE_QNAME = new QName("", "AIR_GDS_CABIN_CODE");
    private final static QName _ROOMCLASSID_QNAME = new QName("", "ROOM_CLASS_ID");
    private final static QName _PORCOUNTRYCODE_QNAME = new QName("", "POR_COUNTRY_CODE");
    private final static QName _PORSTATECODE_QNAME = new QName("", "POR_STATE_CODE");
    private final static QName _PORCATEGORY_QNAME = new QName("", "POR_CATEGORY");
    private final static QName _LISTFACILITY_QNAME = new QName("", "LIST_FACILITY");
    private final static QName _LISTHOTELNAME_QNAME = new QName("", "LIST_HOTEL_NAME");
    private final static QName _STREETADDRESS_QNAME = new QName("", "STREET_ADDRESS");
    private final static QName _ZIPCODE_QNAME = new QName("", "ZIP_CODE");
    private final static QName _COUNTRYCODE_QNAME = new QName("", "COUNTRY_CODE");
    private final static QName _MULTIPLICITY_QNAME = new QName("", "MULTIPLICITY");
    private final static QName _TARGET_QNAME = new QName("", "TARGET");
    private final static QName _POLICYAGENCY_QNAME = new QName("", "POLICY_AGENCY");
    private final static QName _TRAVELLERPREFERENCES_QNAME = new QName("", "TRAVELLER_PREFERENCES");
    private final static QName _POLICIES_QNAME = new QName("", "POLICIES");
    private final static QName _POLICYCOMPANY_QNAME = new QName("", "POLICY_COMPANY");
    private final static QName _LISTHOTELCHAINS_QNAME = new QName("", "LIST_HOTEL_CHAINS");
    private final static QName _HOTELNAME_QNAME = new QName("", "HOTEL_NAME");
    private final static QName _LISTFACILITIES_QNAME = new QName("", "LIST_FACILITIES");
    private final static QName _MAXIMUMPRICE_QNAME = new QName("", "MAXIMUM_PRICE");
    private final static QName _TRAVELLERROOMTYPE_QNAME = new QName("", "TRAVELLER_ROOM_TYPE");
    private final static QName _LISTTRAVELLERPREFERENCES_QNAME = new QName("", "LIST_TRAVELLER_PREFERENCES");
    private final static QName _AREA_QNAME = new QName("", "AREA");
    private final static QName _BEDTYPE_QNAME = new QName("", "BED_TYPE");
    private final static QName _BEDCOUNT_QNAME = new QName("", "BED_COUNT");
    private final static QName _CHECKSELLRULES_QNAME = new QName("", "CHECK_SELL_RULES");
    private final static QName _CORPORATEIDREQUIRED_QNAME = new QName("", "CORPORATE_ID_REQUIRED");
    private final static QName _DEPOSITREQUIRED_QNAME = new QName("", "DEPOSIT_REQUIRED");
    private final static QName _GUARANTEEREQUIRED_QNAME = new QName("", "GUARANTEE_REQUIRED");
    private final static QName _MAXBUDGET_QNAME = new QName("", "MAX_BUDGET");
    private final static QName _MINBUDGET_QNAME = new QName("", "MIN_BUDGET");
    private final static QName _MEAL_QNAME = new QName("", "MEAL");
    private final static QName _OCCUPANCY_QNAME = new QName("", "OCCUPANCY");
    private final static QName _PRICE_QNAME = new QName("", "PRICE");
    private final static QName _RATECHANGE_QNAME = new QName("", "RATE_CHANGE");
    private final static QName _ROOMTYPE_QNAME = new QName("", "ROOM_TYPE");
    private final static QName _SORTCRITERIA_QNAME = new QName("", "SORT_CRITERIA");
    private final static QName _TRANSPORTATION_QNAME = new QName("", "TRANSPORTATION");
    private final static QName _LISTHOTEL_QNAME = new QName("", "LIST_HOTEL");
    private final static QName _LISTNEGOHOTEL_QNAME = new QName("", "LIST_NEGO_HOTEL");
    private final static QName _PORLATITUDE_QNAME = new QName("", "POR_LATITUDE");
    private final static QName _PORLONGITUDE_QNAME = new QName("", "POR_LONGITUDE");
    private final static QName _LISTPOI_QNAME = new QName("", "LIST_POI");
    private final static QName _LISTSTRUCTUREDPOI_QNAME = new QName("", "LIST_STRUCTURED_POI");
    private final static QName _LISTSPECIALRATE_QNAME = new QName("", "LIST_SPECIAL_RATE");
    private final static QName _SPECIALRATEMODE_QNAME = new QName("", "SPECIAL_RATE_MODE");
    private final static QName _USERSPECIALRATEMODE_QNAME = new QName("", "USER_SPECIAL_RATE_MODE");
    private final static QName _LISTUSERSPECIALRATE_QNAME = new QName("", "LIST_USER_SPECIAL_RATE");
    private final static QName _LISTUSERSPECIALRATEPROFILE_QNAME = new QName("", "LIST_USER_SPECIAL_RATE_PROFILE");
    private final static QName _LISTAVAILABLERATE_QNAME = new QName("", "LIST_AVAILABLE_RATE");
    private final static QName _BESTAVAILABLERATE_QNAME = new QName("", "BEST_AVAILABLE_RATE");
    private final static QName _LISTROOM_QNAME = new QName("", "LIST_ROOM");
    private final static QName _LISTTERM_QNAME = new QName("", "LIST_TERM");
    private final static QName _BOOKINGCODE_QNAME = new QName("", "BOOKING_CODE");
    private final static QName _ROOMID_QNAME = new QName("", "ROOM_ID");
    private final static QName _AVAILABILITY_QNAME = new QName("", "AVAILABILITY");
    private final static QName _GDSCODE_QNAME = new QName("", "GDS_CODE");
    private final static QName _ACCESSLEVEL_QNAME = new QName("", "ACCESS_LEVEL");
    private final static QName _PROVIDERDESCRIPTION_QNAME = new QName("", "PROVIDER_DESCRIPTION");
    private final static QName _AMOUNTWITHOUTMARKUP_QNAME = new QName("", "AMOUNT_WITHOUT_MARKUP");
    private final static QName _MARKUPOVERRIDABLE_QNAME = new QName("", "MARKUP_OVERRIDABLE");
    private final static QName _PRICEWITHMARKUP_QNAME = new QName("", "PRICE_WITH_MARKUP");
    private final static QName _MARKUPINDICATOR_QNAME = new QName("", "MARKUP_INDICATOR");
    private final static QName _POOLID_QNAME = new QName("", "POOL_ID");
    private final static QName _RULESDRIVENHOTELTYPEISCAPLUS_QNAME = new QName("", "IS_CA_PLUS");
    private final static QName _RULESDRIVENHOTELTYPERULEMAXBUDGET_QNAME = new QName("", "RULE_MAX_BUDGET");
    private final static QName _RULESDRIVENHOTELTYPELISTPROVIDERSPECIFICINFORMATION_QNAME = new QName("", "LIST_PROVIDER_SPECIFIC_INFORMATION");
    private final static QName _RULESDRIVENHOTELTYPEBDATE_QNAME = new QName("", "B_DATE");
    private final static QName _RULESDRIVENHOTELTYPEEDATE_QNAME = new QName("", "E_DATE");
    private final static QName _RULESDRIVENHOTELTYPEBLOCATION_QNAME = new QName("", "B_LOCATION");
    private final static QName _RULESDRIVENHOTELTYPELOWESTNEGOTIATEDRATE_QNAME = new QName("", "LOWEST_NEGOTIATED_RATE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.hotel.commonout
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HOTELSPECIALPRICETYPE }
     * 
     */
    public HOTELSPECIALPRICETYPE createHOTELSPECIALPRICETYPE() {
        return new HOTELSPECIALPRICETYPE();
    }

    /**
     * Create an instance of {@link HOTELSESSIONTYPE }
     * 
     */
    public HOTELSESSIONTYPE createHOTELSESSIONTYPE() {
        return new HOTELSESSIONTYPE();
    }

    /**
     * Create an instance of {@link RULESDRIVENHOTELTYPE }
     * 
     */
    public RULESDRIVENHOTELTYPE createRULESDRIVENHOTELTYPE() {
        return new RULESDRIVENHOTELTYPE();
    }

    /**
     * Create an instance of {@link HOTELDUPETYPE }
     * 
     */
    public HOTELDUPETYPE createHOTELDUPETYPE() {
        return new HOTELDUPETYPE();
    }

    /**
     * Create an instance of {@link HOTELHBPTYPE }
     * 
     */
    public HOTELHBPTYPE createHOTELHBPTYPE() {
        return new HOTELHBPTYPE();
    }

    /**
     * Create an instance of {@link HOTELMULTISOURCETYPE }
     * 
     */
    public HOTELMULTISOURCETYPE createHOTELMULTISOURCETYPE() {
        return new HOTELMULTISOURCETYPE();
    }

    /**
     * Create an instance of {@link RULESDRIVENROOMTYPE }
     * 
     */
    public RULESDRIVENROOMTYPE createRULESDRIVENROOMTYPE() {
        return new RULESDRIVENROOMTYPE();
    }

    /**
     * Create an instance of {@link ROOMMULTISOURCETYPE }
     * 
     */
    public ROOMMULTISOURCETYPE createROOMMULTISOURCETYPE() {
        return new ROOMMULTISOURCETYPE();
    }

    /**
     * Create an instance of {@link HOTELSPECIALPRICETYPE.BESTPRICE }
     * 
     */
    public HOTELSPECIALPRICETYPE.BESTPRICE createHOTELSPECIALPRICETYPEBESTPRICE() {
        return new HOTELSPECIALPRICETYPE.BESTPRICE();
    }

    /**
     * Create an instance of {@link HOTELSPECIALPRICETYPE.WORSTPRICE }
     * 
     */
    public HOTELSPECIALPRICETYPE.WORSTPRICE createHOTELSPECIALPRICETYPEWORSTPRICE() {
        return new HOTELSPECIALPRICETYPE.WORSTPRICE();
    }

    /**
     * Create an instance of {@link HOTELSESSIONTYPE.LISTROOM }
     * 
     */
    public HOTELSESSIONTYPE.LISTROOM createHOTELSESSIONTYPELISTROOM() {
        return new HOTELSESSIONTYPE.LISTROOM();
    }

    /**
     * Create an instance of {@link RULESDRIVENHOTELTYPE.RULEMAXBUDGET }
     * 
     */
    public RULESDRIVENHOTELTYPE.RULEMAXBUDGET createRULESDRIVENHOTELTYPERULEMAXBUDGET() {
        return new RULESDRIVENHOTELTYPE.RULEMAXBUDGET();
    }

    /**
     * Create an instance of {@link RULESDRIVENHOTELTYPE.BDATE }
     * 
     */
    public RULESDRIVENHOTELTYPE.BDATE createRULESDRIVENHOTELTYPEBDATE() {
        return new RULESDRIVENHOTELTYPE.BDATE();
    }

    /**
     * Create an instance of {@link RULESDRIVENHOTELTYPE.EDATE }
     * 
     */
    public RULESDRIVENHOTELTYPE.EDATE createRULESDRIVENHOTELTYPEEDATE() {
        return new RULESDRIVENHOTELTYPE.EDATE();
    }

    /**
     * Create an instance of {@link RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE }
     * 
     */
    public RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE createRULESDRIVENHOTELTYPELOWESTNEGOTIATEDRATE() {
        return new RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISCOUNT_CODE")
    public JAXBElement<String> createDISCOUNTCODE(String value) {
        return new JAXBElement<String>(_DISCOUNTCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FIELD_ERROR")
    public JAXBElement<String> createLISTFIELDERROR(String value) {
        return new JAXBElement<String>(_LISTFIELDERROR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXCHANGE_RATE")
    public JAXBElement<BigDecimal> createEXCHANGERATE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EXCHANGERATE_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIRECT_LOGIN")
    public JAXBElement<String> createDIRECTLOGIN(String value) {
        return new JAXBElement<String>(_DIRECTLOGIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIRECT_LOGIN_AGENT")
    public JAXBElement<String> createDIRECTLOGINAGENT(String value) {
        return new JAXBElement<String>(_DIRECTLOGINAGENT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXTERNAL_LOGIN")
    public JAXBElement<String> createEXTERNALLOGIN(String value) {
        return new JAXBElement<String>(_EXTERNALLOGIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXTERNAL_DIRECT_LOGIN")
    public JAXBElement<String> createEXTERNALDIRECTLOGIN(String value) {
        return new JAXBElement<String>(_EXTERNALDIRECTLOGIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_STRUCTURED_XML")
    public JAXBElement<String> createISSTRUCTUREDXML(String value) {
        return new JAXBElement<String>(_ISSTRUCTUREDXML_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NUMBER_OF_PROFILES")
    public JAXBElement<BigInteger> createNUMBEROFPROFILES(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBEROFPROFILES_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OFFICE_ID")
    public JAXBElement<String> createOFFICEID(String value) {
        return new JAXBElement<String>(_OFFICEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRIP_REASON_CODE")
    public JAXBElement<String> createTRIPREASONCODE(String value) {
        return new JAXBElement<String>(_TRIPREASONCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_IS_OUT_OF_POLICY")
    public JAXBElement<Boolean> createBOOLISOUTOFPOLICY(Boolean value) {
        return new JAXBElement<Boolean>(_BOOLISOUTOFPOLICY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISPLAY_RANK")
    public JAXBElement<String> createDISPLAYRANK(String value) {
        return new JAXBElement<String>(_DISPLAYRANK_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAGE_TICKET")
    public JAXBElement<String> createPAGETICKET(String value) {
        return new JAXBElement<String>(_PAGETICKET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRIPREASONtype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRIP_REASON")
    public JAXBElement<LISTTRIPREASONtype> createLISTTRIPREASON(LISTTRIPREASONtype value) {
        return new JAXBElement<LISTTRIPREASONtype>(_LISTTRIPREASON_QNAME, LISTTRIPREASONtype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RELATIONSHIP")
    public JAXBElement<String> createRELATIONSHIP(String value) {
        return new JAXBElement<String>(_RELATIONSHIP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OPERATIONAL_DATA")
    public JAXBElement<OperationalDataType> createOPERATIONALDATA(OperationalDataType value) {
        return new JAXBElement<OperationalDataType>(_OPERATIONALDATA_QNAME, OperationalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MORE_INFORMATION_AVAILABLE")
    public JAXBElement<Boolean> createMOREINFORMATIONAVAILABLE(Boolean value) {
        return new JAXBElement<Boolean>(_MOREINFORMATIONAVAILABLE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDSCABINCODEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIR_GDS_CABIN_CODE")
    public JAXBElement<GDSCABINCODEType> createAIRGDSCABINCODE(GDSCABINCODEType value) {
        return new JAXBElement<GDSCABINCODEType>(_AIRGDSCABINCODE_QNAME, GDSCABINCODEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROOM_CLASS_ID")
    public JAXBElement<String> createROOMCLASSID(String value) {
        return new JAXBElement<String>(_ROOMCLASSID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_COUNTRY_CODE")
    public JAXBElement<String> createPORCOUNTRYCODE(String value) {
        return new JAXBElement<String>(_PORCOUNTRYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_STATE_CODE")
    public JAXBElement<String> createPORSTATECODE(String value) {
        return new JAXBElement<String>(_PORSTATECODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_CATEGORY")
    public JAXBElement<String> createPORCATEGORY(String value) {
        return new JAXBElement<String>(_PORCATEGORY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FACILITY")
    public JAXBElement<String> createLISTFACILITY(String value) {
        return new JAXBElement<String>(_LISTFACILITY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_HOTEL_NAME")
    public JAXBElement<String> createLISTHOTELNAME(String value) {
        return new JAXBElement<String>(_LISTHOTELNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STREET_ADDRESS")
    public JAXBElement<String> createSTREETADDRESS(String value) {
        return new JAXBElement<String>(_STREETADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ZIP_CODE")
    public JAXBElement<String> createZIPCODE(String value) {
        return new JAXBElement<String>(_ZIPCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COUNTRY_CODE")
    public JAXBElement<String> createCOUNTRYCODE(String value) {
        return new JAXBElement<String>(_COUNTRYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MULTIPLICITY")
    public JAXBElement<BigInteger> createMULTIPLICITY(BigInteger value) {
        return new JAXBElement<BigInteger>(_MULTIPLICITY_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TARGET", defaultValue = "DISTRIBUTION")
    public JAXBElement<String> createTARGET(String value) {
        return new JAXBElement<String>(_TARGET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLPOLICYTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POLICY_AGENCY")
    public JAXBElement<HTLPOLICYTYPE> createPOLICYAGENCY(HTLPOLICYTYPE value) {
        return new JAXBElement<HTLPOLICYTYPE>(_POLICYAGENCY_QNAME, HTLPOLICYTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRAVELLERPREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_PREFERENCES")
    public JAXBElement<TRAVELLERPREFERENCETYPE> createTRAVELLERPREFERENCES(TRAVELLERPREFERENCETYPE value) {
        return new JAXBElement<TRAVELLERPREFERENCETYPE>(_TRAVELLERPREFERENCES_QNAME, TRAVELLERPREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLPOLICIESTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POLICIES")
    public JAXBElement<HTLPOLICIESTYPE> createPOLICIES(HTLPOLICIESTYPE value) {
        return new JAXBElement<HTLPOLICIESTYPE>(_POLICIES_QNAME, HTLPOLICIESTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLPOLICYTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POLICY_COMPANY")
    public JAXBElement<HTLPOLICYTYPE> createPOLICYCOMPANY(HTLPOLICYTYPE value) {
        return new JAXBElement<HTLPOLICYTYPE>(_POLICYCOMPANY_QNAME, HTLPOLICYTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_HOTEL_CHAINS")
    public JAXBElement<PREFERENCETYPE> createLISTHOTELCHAINS(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_LISTHOTELCHAINS_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HOTEL_NAME")
    public JAXBElement<PREFERENCETYPE> createHOTELNAME(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_HOTELNAME_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FACILITIES")
    public JAXBElement<PREFERENCETYPE> createLISTFACILITIES(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_LISTFACILITIES_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAXIMUM_PRICE")
    public JAXBElement<PREFERENCETYPE> createMAXIMUMPRICE(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_MAXIMUMPRICE_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_ROOM_TYPE")
    public JAXBElement<PREFERENCETYPE> createTRAVELLERROOMTYPE(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_TRAVELLERROOMTYPE_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVELLERPREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_PREFERENCES")
    public JAXBElement<LISTTRAVELLERPREFERENCETYPE> createLISTTRAVELLERPREFERENCES(LISTTRAVELLERPREFERENCETYPE value) {
        return new JAXBElement<LISTTRAVELLERPREFERENCETYPE>(_LISTTRAVELLERPREFERENCES_QNAME, LISTTRAVELLERPREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLAREATYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AREA")
    public JAXBElement<HTLAREATYPE> createAREA(HTLAREATYPE value) {
        return new JAXBElement<HTLAREATYPE>(_AREA_QNAME, HTLAREATYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BEDTYPE1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BED_TYPE")
    public JAXBElement<BEDTYPE1> createBEDTYPE(BEDTYPE1 value) {
        return new JAXBElement<BEDTYPE1>(_BEDTYPE_QNAME, BEDTYPE1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BED_COUNT")
    public JAXBElement<BigInteger> createBEDCOUNT(BigInteger value) {
        return new JAXBElement<BigInteger>(_BEDCOUNT_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CHECK_SELL_RULES")
    public JAXBElement<Boolean> createCHECKSELLRULES(Boolean value) {
        return new JAXBElement<Boolean>(_CHECKSELLRULES_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CORPORATE_ID_REQUIRED")
    public JAXBElement<Boolean> createCORPORATEIDREQUIRED(Boolean value) {
        return new JAXBElement<Boolean>(_CORPORATEIDREQUIRED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEPOSIT_REQUIRED")
    public JAXBElement<Boolean> createDEPOSITREQUIRED(Boolean value) {
        return new JAXBElement<Boolean>(_DEPOSITREQUIRED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GUARANTEE_REQUIRED")
    public JAXBElement<Boolean> createGUARANTEEREQUIRED(Boolean value) {
        return new JAXBElement<Boolean>(_GUARANTEEREQUIRED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAX_BUDGET")
    public JAXBElement<BigInteger> createMAXBUDGET(BigInteger value) {
        return new JAXBElement<BigInteger>(_MAXBUDGET_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MIN_BUDGET")
    public JAXBElement<BigInteger> createMINBUDGET(BigInteger value) {
        return new JAXBElement<BigInteger>(_MINBUDGET_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEALTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MEAL")
    public JAXBElement<MEALTYPE> createMEAL(MEALTYPE value) {
        return new JAXBElement<MEALTYPE>(_MEAL_QNAME, MEALTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OCCUPANCY")
    public JAXBElement<BigInteger> createOCCUPANCY(BigInteger value) {
        return new JAXBElement<BigInteger>(_OCCUPANCY_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE")
    public JAXBElement<Float> createPRICE(Float value) {
        return new JAXBElement<Float>(_PRICE_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RATE_CHANGE")
    public JAXBElement<Boolean> createRATECHANGE(Boolean value) {
        return new JAXBElement<Boolean>(_RATECHANGE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ROOMTYPE1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROOM_TYPE")
    public JAXBElement<ROOMTYPE1> createROOMTYPE(ROOMTYPE1 value) {
        return new JAXBElement<ROOMTYPE1>(_ROOMTYPE_QNAME, ROOMTYPE1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SORT_CRITERIA")
    public JAXBElement<String> createSORTCRITERIA(String value) {
        return new JAXBElement<String>(_SORTCRITERIA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRANSPORTATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRANSPORTATION")
    public JAXBElement<TRANSPORTATIONTYPE> createTRANSPORTATION(TRANSPORTATIONTYPE value) {
        return new JAXBElement<TRANSPORTATIONTYPE>(_TRANSPORTATION_QNAME, TRANSPORTATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HOTELSTANDARDTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_HOTEL")
    public JAXBElement<HOTELSTANDARDTYPE> createLISTHOTEL(HOTELSTANDARDTYPE value) {
        return new JAXBElement<HOTELSTANDARDTYPE>(_LISTHOTEL_QNAME, HOTELSTANDARDTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HOTELNEGOTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_NEGO_HOTEL")
    public JAXBElement<HOTELNEGOTYPE> createLISTNEGOHOTEL(HOTELNEGOTYPE value) {
        return new JAXBElement<HOTELNEGOTYPE>(_LISTNEGOHOTEL_QNAME, HOTELNEGOTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_LATITUDE")
    public JAXBElement<BigInteger> createPORLATITUDE(BigInteger value) {
        return new JAXBElement<BigInteger>(_PORLATITUDE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_LONGITUDE")
    public JAXBElement<BigInteger> createPORLONGITUDE(BigInteger value) {
        return new JAXBElement<BigInteger>(_PORLONGITUDE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_POI")
    public JAXBElement<String> createLISTPOI(String value) {
        return new JAXBElement<String>(_LISTPOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STRUTUREDPOITYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_STRUCTURED_POI")
    public JAXBElement<STRUTUREDPOITYPE> createLISTSTRUCTUREDPOI(STRUTUREDPOITYPE value) {
        return new JAXBElement<STRUTUREDPOITYPE>(_LISTSTRUCTUREDPOI_QNAME, STRUTUREDPOITYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_SPECIAL_RATE")
    public JAXBElement<String> createLISTSPECIALRATE(String value) {
        return new JAXBElement<String>(_LISTSPECIALRATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SPECIAL_RATE_MODE")
    public JAXBElement<String> createSPECIALRATEMODE(String value) {
        return new JAXBElement<String>(_SPECIALRATEMODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USER_SPECIAL_RATE_MODE")
    public JAXBElement<String> createUSERSPECIALRATEMODE(String value) {
        return new JAXBElement<String>(_USERSPECIALRATEMODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_USER_SPECIAL_RATE")
    public JAXBElement<String> createLISTUSERSPECIALRATE(String value) {
        return new JAXBElement<String>(_LISTUSERSPECIALRATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_USER_SPECIAL_RATE_PROFILE")
    public JAXBElement<String> createLISTUSERSPECIALRATEPROFILE(String value) {
        return new JAXBElement<String>(_LISTUSERSPECIALRATEPROFILE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_AVAILABLE_RATE")
    public JAXBElement<String> createLISTAVAILABLERATE(String value) {
        return new JAXBElement<String>(_LISTAVAILABLERATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BEST_AVAILABLE_RATE")
    public JAXBElement<Boolean> createBESTAVAILABLERATE(Boolean value) {
        return new JAXBElement<Boolean>(_BESTAVAILABLERATE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTROOMITEMTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ROOM")
    public JAXBElement<LISTROOMITEMTYPE> createLISTROOM(LISTROOMITEMTYPE value) {
        return new JAXBElement<LISTROOMITEMTYPE>(_LISTROOM_QNAME, LISTROOMITEMTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTERMITEMTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TERM")
    public JAXBElement<LISTTERMITEMTYPE> createLISTTERM(LISTTERMITEMTYPE value) {
        return new JAXBElement<LISTTERMITEMTYPE>(_LISTTERM_QNAME, LISTTERMITEMTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOKING_CODE")
    public JAXBElement<String> createBOOKINGCODE(String value) {
        return new JAXBElement<String>(_BOOKINGCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROOM_ID")
    public JAXBElement<String> createROOMID(String value) {
        return new JAXBElement<String>(_ROOMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVAILABILITY")
    public JAXBElement<Object> createAVAILABILITY(Object value) {
        return new JAXBElement<Object>(_AVAILABILITY_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GDS_CODE")
    public JAXBElement<Object> createGDSCODE(Object value) {
        return new JAXBElement<Object>(_GDSCODE_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACCESS_LEVEL")
    public JAXBElement<String> createACCESSLEVEL(String value) {
        return new JAXBElement<String>(_ACCESSLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROVIDER_DESCRIPTION")
    public JAXBElement<String> createPROVIDERDESCRIPTION(String value) {
        return new JAXBElement<String>(_PROVIDERDESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_WITHOUT_MARKUP")
    public JAXBElement<Object> createAMOUNTWITHOUTMARKUP(Object value) {
        return new JAXBElement<Object>(_AMOUNTWITHOUTMARKUP_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MARKUP_OVERRIDABLE")
    public JAXBElement<Object> createMARKUPOVERRIDABLE(Object value) {
        return new JAXBElement<Object>(_MARKUPOVERRIDABLE_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_WITH_MARKUP")
    public JAXBElement<Object> createPRICEWITHMARKUP(Object value) {
        return new JAXBElement<Object>(_PRICEWITHMARKUP_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MARKUP_INDICATOR")
    public JAXBElement<Object> createMARKUPINDICATOR(Object value) {
        return new JAXBElement<Object>(_MARKUPINDICATOR_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POOL_ID")
    public JAXBElement<String> createPOOLID(String value) {
        return new JAXBElement<String>(_POOLID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_CA_PLUS", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<Boolean> createRULESDRIVENHOTELTYPEISCAPLUS(Boolean value) {
        return new JAXBElement<Boolean>(_RULESDRIVENHOTELTYPEISCAPLUS_QNAME, Boolean.class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.RULEMAXBUDGET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RULE_MAX_BUDGET", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<RULESDRIVENHOTELTYPE.RULEMAXBUDGET> createRULESDRIVENHOTELTYPERULEMAXBUDGET(RULESDRIVENHOTELTYPE.RULEMAXBUDGET value) {
        return new JAXBElement<RULESDRIVENHOTELTYPE.RULEMAXBUDGET>(_RULESDRIVENHOTELTYPERULEMAXBUDGET_QNAME, RULESDRIVENHOTELTYPE.RULEMAXBUDGET.class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PROVIDER_SPECIFIC_INFORMATION", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<String> createRULESDRIVENHOTELTYPELISTPROVIDERSPECIFICINFORMATION(String value) {
        return new JAXBElement<String>(_RULESDRIVENHOTELTYPELISTPROVIDERSPECIFICINFORMATION_QNAME, String.class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.BDATE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_DATE", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<RULESDRIVENHOTELTYPE.BDATE> createRULESDRIVENHOTELTYPEBDATE(RULESDRIVENHOTELTYPE.BDATE value) {
        return new JAXBElement<RULESDRIVENHOTELTYPE.BDATE>(_RULESDRIVENHOTELTYPEBDATE_QNAME, RULESDRIVENHOTELTYPE.BDATE.class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.EDATE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_DATE", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<RULESDRIVENHOTELTYPE.EDATE> createRULESDRIVENHOTELTYPEEDATE(RULESDRIVENHOTELTYPE.EDATE value) {
        return new JAXBElement<RULESDRIVENHOTELTYPE.EDATE>(_RULESDRIVENHOTELTYPEEDATE_QNAME, RULESDRIVENHOTELTYPE.EDATE.class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BEST_AVAILABLE_RATE", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<Boolean> createRULESDRIVENHOTELTYPEBESTAVAILABLERATE(Boolean value) {
        return new JAXBElement<Boolean>(_BESTAVAILABLERATE_QNAME, Boolean.class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BLOCATIONITEMTYPE5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_LOCATION", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<BLOCATIONITEMTYPE5> createRULESDRIVENHOTELTYPEBLOCATION(BLOCATIONITEMTYPE5 value) {
        return new JAXBElement<BLOCATIONITEMTYPE5>(_RULESDRIVENHOTELTYPEBLOCATION_QNAME, BLOCATIONITEMTYPE5 .class, RULESDRIVENHOTELTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOWEST_NEGOTIATED_RATE", scope = RULESDRIVENHOTELTYPE.class)
    public JAXBElement<RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE> createRULESDRIVENHOTELTYPELOWESTNEGOTIATEDRATE(RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE value) {
        return new JAXBElement<RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE>(_RULESDRIVENHOTELTYPELOWESTNEGOTIATEDRATE_QNAME, RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE.class, RULESDRIVENHOTELTYPE.class, value);
    }

}
