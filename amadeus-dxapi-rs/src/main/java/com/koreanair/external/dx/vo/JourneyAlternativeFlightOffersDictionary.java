package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CheckInFlight;
import com.koreanair.external.dx.vo.CheckInFlightDictionary;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyAlternativeFlightOffersDictionary  {
  
  @ApiModelProperty(value = "Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CheckInFlight> flight = null;

  @ApiModelProperty(value = "Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> airline = null;

  @ApiModelProperty(value = "Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> aircraft = null;

  @ApiModelProperty(value = "Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, LocationDictionaryItem> location = null;

  @ApiModelProperty(value = "Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> country = null;
 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return flight
  **/
  @JsonProperty("flight")
  public Map<String, CheckInFlight> getFlight() {
    return flight;
  }

  public void setFlight(Map<String, CheckInFlight> flight) {
    this.flight = flight;
  }

  public JourneyAlternativeFlightOffersDictionary flight(Map<String, CheckInFlight> flight) {
    this.flight = flight;
    return this;
  }

  public JourneyAlternativeFlightOffersDictionary putFlightItem(String key, CheckInFlight flightItem) {
    this.flight.put(key, flightItem);
    return this;
  }

 /**
   * Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return airline
  **/
  @JsonProperty("airline")
  public Map<String, String> getAirline() {
    return airline;
  }

  public void setAirline(Map<String, String> airline) {
    this.airline = airline;
  }

  public JourneyAlternativeFlightOffersDictionary airline(Map<String, String> airline) {
    this.airline = airline;
    return this;
  }

  public JourneyAlternativeFlightOffersDictionary putAirlineItem(String key, String airlineItem) {
    this.airline.put(key, airlineItem);
    return this;
  }

 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return aircraft
  **/
  @JsonProperty("aircraft")
  public Map<String, String> getAircraft() {
    return aircraft;
  }

  public void setAircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
  }

  public JourneyAlternativeFlightOffersDictionary aircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
    return this;
  }

  public JourneyAlternativeFlightOffersDictionary putAircraftItem(String key, String aircraftItem) {
    this.aircraft.put(key, aircraftItem);
    return this;
  }

 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return location
  **/
  @JsonProperty("location")
  public Map<String, LocationDictionaryItem> getLocation() {
    return location;
  }

  public void setLocation(Map<String, LocationDictionaryItem> location) {
    this.location = location;
  }

  public JourneyAlternativeFlightOffersDictionary location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public JourneyAlternativeFlightOffersDictionary putLocationItem(String key, LocationDictionaryItem locationItem) {
    this.location.put(key, locationItem);
    return this;
  }

 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return country
  **/
  @JsonProperty("country")
  public Map<String, String> getCountry() {
    return country;
  }

  public void setCountry(Map<String, String> country) {
    this.country = country;
  }

  public JourneyAlternativeFlightOffersDictionary country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public JourneyAlternativeFlightOffersDictionary putCountryItem(String key, String countryItem) {
    this.country.put(key, countryItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAlternativeFlightOffersDictionary {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

