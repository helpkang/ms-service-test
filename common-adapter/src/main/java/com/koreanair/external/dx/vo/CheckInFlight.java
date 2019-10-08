package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Flight;
import com.koreanair.external.dx.vo.FlightEndPoint;
import com.koreanair.external.dx.vo.FlightPerformanceIndicator;
import com.koreanair.external.dx.vo.FlightStop;
import com.koreanair.external.dx.vo.Meal;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Flight information when within the Departure Control System
 **/
@ApiModel(description="Flight information when within the Departure Control System")
public class CheckInFlight  {
  
  @ApiModelProperty(required = true, value = "IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String marketingAirlineCode = null;

  @ApiModelProperty(value = "IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String operatingAirlineCode = null;

  @ApiModelProperty(value = "Airline name if there is no airline code for the operating carrier")
 /**
   * Airline name if there is no airline code for the operating carrier
  **/
  private String operatingAirlineName = null;

  @ApiModelProperty(example = "123", required = true, value = "Marketing flight number")
 /**
   * Marketing flight number
  **/
  private String marketingFlightNumber = null;

  @ApiModelProperty(example = "123", value = "Operating airline flight number")
 /**
   * Operating airline flight number
  **/
  private String operatingAirlineFlightNumber = null;

  @ApiModelProperty(required = true, value = "")
  private FlightEndPoint departure = null;

  @ApiModelProperty(required = true, value = "")
  private FlightEndPoint arrival = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
  **/
  private String aircraftCode = null;

  @ApiModelProperty(value = "Duration time expressed in seconds")
 /**
   * Duration time expressed in seconds
  **/
  private Integer duration = null;

  @ApiModelProperty(value = "Open segment")
 /**
   * Open segment
  **/
  private Boolean isOpenSegment = false;

  @ApiModelProperty(value = "Flag indicating if some travel documents are needed for this flight")
 /**
   * Flag indicating if some travel documents are needed for this flight
  **/
  private Boolean secureFlightIndicator = false;

  @ApiModelProperty(value = "")
  private FlightPerformanceIndicator performanceIndicator = null;

  @ApiModelProperty(value = "Details of stops for direct or change of gauge flights")
 /**
   * Details of stops for direct or change of gauge flights
  **/
  private List<FlightStop> stops = null;

  @ApiModelProperty(value = "List of meals associated with booked booking class of the flight.")
 /**
   * List of meals associated with booked booking class of the flight.
  **/
  private Meal meals = null;

  @ApiModelProperty(required = true, value = "Id of the CheckInFlight")
 /**
   * Id of the CheckInFlight
  **/
  private String id = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("scheduled") SCHEDULED(String.valueOf("scheduled")), @XmlEnumValue("gated") GATED(String.valueOf("gated")), @XmlEnumValue("departed") DEPARTED(String.valueOf("departed")), @XmlEnumValue("finalized") FINALIZED(String.valueOf("finalized")), @XmlEnumValue("suspended") SUSPENDED(String.valueOf("suspended")), @XmlEnumValue("locked") LOCKED(String.valueOf("locked")), @XmlEnumValue("cancelled") CANCELLED(String.valueOf("cancelled")), @XmlEnumValue("reallocated") REALLOCATED(String.valueOf("reallocated")), @XmlEnumValue("notOperated") NOTOPERATED(String.valueOf("notOperated")), @XmlEnumValue("notOK") NOTOK(String.valueOf("notOK")), @XmlEnumValue("statusNotSupportedInThisVersion") STATUSNOTSUPPORTEDINTHISVERSION(String.valueOf("statusNotSupportedInThisVersion"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Current flight status")
 /**
   * Current flight status
  **/
  private StatusEnum status = null;


@XmlType(name="AcceptanceStatusEnum")
@XmlEnum(String.class)
public enum AcceptanceStatusEnum {

@XmlEnumValue("notOpened") NOTOPENED(String.valueOf("notOpened")), @XmlEnumValue("opened") OPENED(String.valueOf("opened")), @XmlEnumValue("gated") GATED(String.valueOf("gated")), @XmlEnumValue("closed") CLOSED(String.valueOf("closed")), @XmlEnumValue("finalized") FINALIZED(String.valueOf("finalized")), @XmlEnumValue("suspended") SUSPENDED(String.valueOf("suspended")), @XmlEnumValue("notOK") NOTOK(String.valueOf("notOK")), @XmlEnumValue("statusNotSupportedInThisVersion") STATUSNOTSUPPORTEDINTHISVERSION(String.valueOf("statusNotSupportedInThisVersion"));


    private String value;

    AcceptanceStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AcceptanceStatusEnum fromValue(String v) {
        for (AcceptanceStatusEnum b : AcceptanceStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Current acceptance status of the flight for agent check-in at airport. Self-service check-in may have additional limitations, which can be queried at journey level. ")
 /**
   * Current acceptance status of the flight for agent check-in at airport. Self-service check-in may have additional limitations, which can be queried at journey level. 
  **/
  private AcceptanceStatusEnum acceptanceStatus = null;

  @ApiModelProperty(example = "123", value = "Operating flight number")
 /**
   * Operating flight number
  **/
  private String operatingFlightNumber = null;

  @ApiModelProperty(value = "Is the flight an IATCI (Inter Airline Through Check-In) flight - i.e. operated by another airline without a codeshare agreement")
 /**
   * Is the flight an IATCI (Inter Airline Through Check-In) flight - i.e. operated by another airline without a codeshare agreement
  **/
  private Boolean isIATCI = false;

  @ApiModelProperty(value = "Is the flight passive - i.e. managed in another DCS or another partition of Altea DCS Passive flights might have some restrictions, for example seats cannot be changed before acceptance")
 /**
   * Is the flight passive - i.e. managed in another DCS or another partition of Altea DCS Passive flights might have some restrictions, for example seats cannot be changed before acceptance
  **/
  private Boolean isPassive = false;
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
   * @return marketingAirlineCode
  **/
  @JsonProperty("marketingAirlineCode")
  public String getMarketingAirlineCode() {
    return marketingAirlineCode;
  }

  public void setMarketingAirlineCode(String marketingAirlineCode) {
    this.marketingAirlineCode = marketingAirlineCode;
  }

  public CheckInFlight marketingAirlineCode(String marketingAirlineCode) {
    this.marketingAirlineCode = marketingAirlineCode;
    return this;
  }

 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
   * @return operatingAirlineCode
  **/
  @JsonProperty("operatingAirlineCode")
  public String getOperatingAirlineCode() {
    return operatingAirlineCode;
  }

  public void setOperatingAirlineCode(String operatingAirlineCode) {
    this.operatingAirlineCode = operatingAirlineCode;
  }

  public CheckInFlight operatingAirlineCode(String operatingAirlineCode) {
    this.operatingAirlineCode = operatingAirlineCode;
    return this;
  }

 /**
   * Airline name if there is no airline code for the operating carrier
   * @return operatingAirlineName
  **/
  @JsonProperty("operatingAirlineName")
  public String getOperatingAirlineName() {
    return operatingAirlineName;
  }

  public void setOperatingAirlineName(String operatingAirlineName) {
    this.operatingAirlineName = operatingAirlineName;
  }

  public CheckInFlight operatingAirlineName(String operatingAirlineName) {
    this.operatingAirlineName = operatingAirlineName;
    return this;
  }

 /**
   * Marketing flight number
   * @return marketingFlightNumber
  **/
  @JsonProperty("marketingFlightNumber")
  public String getMarketingFlightNumber() {
    return marketingFlightNumber;
  }

  public void setMarketingFlightNumber(String marketingFlightNumber) {
    this.marketingFlightNumber = marketingFlightNumber;
  }

  public CheckInFlight marketingFlightNumber(String marketingFlightNumber) {
    this.marketingFlightNumber = marketingFlightNumber;
    return this;
  }

 /**
   * Operating airline flight number
   * @return operatingAirlineFlightNumber
  **/
  @JsonProperty("operatingAirlineFlightNumber")
  public String getOperatingAirlineFlightNumber() {
    return operatingAirlineFlightNumber;
  }

  public void setOperatingAirlineFlightNumber(String operatingAirlineFlightNumber) {
    this.operatingAirlineFlightNumber = operatingAirlineFlightNumber;
  }

  public CheckInFlight operatingAirlineFlightNumber(String operatingAirlineFlightNumber) {
    this.operatingAirlineFlightNumber = operatingAirlineFlightNumber;
    return this;
  }

 /**
   * Get departure
   * @return departure
  **/
  @JsonProperty("departure")
  public FlightEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(FlightEndPoint departure) {
    this.departure = departure;
  }

  public CheckInFlight departure(FlightEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Get arrival
   * @return arrival
  **/
  @JsonProperty("arrival")
  public FlightEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(FlightEndPoint arrival) {
    this.arrival = arrival;
  }

  public CheckInFlight arrival(FlightEndPoint arrival) {
    this.arrival = arrival;
    return this;
  }

 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
   * @return aircraftCode
  **/
  @JsonProperty("aircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }

  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  public CheckInFlight aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }

 /**
   * Duration time expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public CheckInFlight duration(Integer duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Open segment
   * @return isOpenSegment
  **/
  @JsonProperty("isOpenSegment")
  public Boolean isIsOpenSegment() {
    return isOpenSegment;
  }

  public void setIsOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
  }

  public CheckInFlight isOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
    return this;
  }

 /**
   * Flag indicating if some travel documents are needed for this flight
   * @return secureFlightIndicator
  **/
  @JsonProperty("secureFlightIndicator")
  public Boolean isSecureFlightIndicator() {
    return secureFlightIndicator;
  }

  public void setSecureFlightIndicator(Boolean secureFlightIndicator) {
    this.secureFlightIndicator = secureFlightIndicator;
  }

  public CheckInFlight secureFlightIndicator(Boolean secureFlightIndicator) {
    this.secureFlightIndicator = secureFlightIndicator;
    return this;
  }

 /**
   * Get performanceIndicator
   * @return performanceIndicator
  **/
  @JsonProperty("performanceIndicator")
  public FlightPerformanceIndicator getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(FlightPerformanceIndicator performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }

  public CheckInFlight performanceIndicator(FlightPerformanceIndicator performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

 /**
   * Details of stops for direct or change of gauge flights
   * @return stops
  **/
  @JsonProperty("stops")
  public List<FlightStop> getStops() {
    return stops;
  }

  public void setStops(List<FlightStop> stops) {
    this.stops = stops;
  }

  public CheckInFlight stops(List<FlightStop> stops) {
    this.stops = stops;
    return this;
  }

  public CheckInFlight addStopsItem(FlightStop stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * List of meals associated with booked booking class of the flight.
   * @return meals
  **/
  @JsonProperty("meals")
  public Meal getMeals() {
    return meals;
  }

  public void setMeals(Meal meals) {
    this.meals = meals;
  }

  public CheckInFlight meals(Meal meals) {
    this.meals = meals;
    return this;
  }

 /**
   * Id of the CheckInFlight
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckInFlight id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Current flight status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CheckInFlight status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Current acceptance status of the flight for agent check-in at airport. Self-service check-in may have additional limitations, which can be queried at journey level. 
   * @return acceptanceStatus
  **/
  @JsonProperty("acceptanceStatus")
  public String getAcceptanceStatus() {
    if (acceptanceStatus == null) {
      return null;
    }
    return acceptanceStatus.value();
  }

  public void setAcceptanceStatus(AcceptanceStatusEnum acceptanceStatus) {
    this.acceptanceStatus = acceptanceStatus;
  }

  public CheckInFlight acceptanceStatus(AcceptanceStatusEnum acceptanceStatus) {
    this.acceptanceStatus = acceptanceStatus;
    return this;
  }

 /**
   * Operating flight number
   * @return operatingFlightNumber
  **/
  @JsonProperty("operatingFlightNumber")
  public String getOperatingFlightNumber() {
    return operatingFlightNumber;
  }

  public void setOperatingFlightNumber(String operatingFlightNumber) {
    this.operatingFlightNumber = operatingFlightNumber;
  }

  public CheckInFlight operatingFlightNumber(String operatingFlightNumber) {
    this.operatingFlightNumber = operatingFlightNumber;
    return this;
  }

 /**
   * Is the flight an IATCI (Inter Airline Through Check-In) flight - i.e. operated by another airline without a codeshare agreement
   * @return isIATCI
  **/
  @JsonProperty("isIATCI")
  public Boolean isIsIATCI() {
    return isIATCI;
  }

  public void setIsIATCI(Boolean isIATCI) {
    this.isIATCI = isIATCI;
  }

  public CheckInFlight isIATCI(Boolean isIATCI) {
    this.isIATCI = isIATCI;
    return this;
  }

 /**
   * Is the flight passive - i.e. managed in another DCS or another partition of Altea DCS Passive flights might have some restrictions, for example seats cannot be changed before acceptance
   * @return isPassive
  **/
  @JsonProperty("isPassive")
  public Boolean isIsPassive() {
    return isPassive;
  }

  public void setIsPassive(Boolean isPassive) {
    this.isPassive = isPassive;
  }

  public CheckInFlight isPassive(Boolean isPassive) {
    this.isPassive = isPassive;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInFlight {\n");
    
    sb.append("    marketingAirlineCode: ").append(toIndentedString(marketingAirlineCode)).append("\n");
    sb.append("    operatingAirlineCode: ").append(toIndentedString(operatingAirlineCode)).append("\n");
    sb.append("    operatingAirlineName: ").append(toIndentedString(operatingAirlineName)).append("\n");
    sb.append("    marketingFlightNumber: ").append(toIndentedString(marketingFlightNumber)).append("\n");
    sb.append("    operatingAirlineFlightNumber: ").append(toIndentedString(operatingAirlineFlightNumber)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isOpenSegment: ").append(toIndentedString(isOpenSegment)).append("\n");
    sb.append("    secureFlightIndicator: ").append(toIndentedString(secureFlightIndicator)).append("\n");
    sb.append("    performanceIndicator: ").append(toIndentedString(performanceIndicator)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    meals: ").append(toIndentedString(meals)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    acceptanceStatus: ").append(toIndentedString(acceptanceStatus)).append("\n");
    sb.append("    operatingFlightNumber: ").append(toIndentedString(operatingFlightNumber)).append("\n");
    sb.append("    isIATCI: ").append(toIndentedString(isIATCI)).append("\n");
    sb.append("    isPassive: ").append(toIndentedString(isPassive)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

