package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.MultiCurrencyAirPricingRecords;
import com.koreanair.external.dx.vo.RichMedia;
import com.koreanair.external.dx.vo.ServiceDescription;
import com.koreanair.external.dx.vo.ServiceDetail;
import com.koreanair.external.dx.vo.ServiceItemCommon;
import com.koreanair.external.dx.vo.ServiceParameter;
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
  * This object contains a list of detailed information for each service item retrieved from Services catalogue 
 **/
@ApiModel(description="This object contains a list of detailed information for each service item retrieved from Services catalogue ")
public class OrderServiceItem  {
  
  @ApiModelProperty(value = "Service id, as defined in services dictionary")
 /**
   * Service id, as defined in services dictionary
  **/
  private String id = null;

  @ApiModelProperty(value = "temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.")
 /**
   * temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.
  **/
  private String tid = null;

  @ApiModelProperty(value = "List of exhaustive descriptions available for the service")
 /**
   * List of exhaustive descriptions available for the service
  **/
  private List<ServiceDescription> descriptions = null;

  @ApiModelProperty(value = "Quantity of service requested (e.g. Number of bags).  In an Order the details of quantity of service for each flights is available in details field. ")
 /**
   * Quantity of service requested (e.g. Number of bags).  In an Order the details of quantity of service for each flights is available in details field. 
  **/
  private Integer quantity = null;

  @ApiModelProperty(value = "Number of remaining services. Quota is returned only at shopping time")
 /**
   * Number of remaining services. Quota is returned only at shopping time
  **/
  private Integer quota = null;

  @ApiModelProperty(value = "Used to specify the tags associated to the service. The tags might refer to the category (e.g. Baggage, Meal, etc.). ")
 /**
   * Used to specify the tags associated to the service. The tags might refer to the category (e.g. Baggage, Meal, etc.). 
  **/
  private List<String> tags = null;

  @ApiModelProperty(value = "Flights to which this service is associated to")
 /**
   * Flights to which this service is associated to
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. Status code is not returned at shopping time")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. Status code is not returned at shopping time
  **/
  private String statusCode = null;

  @ApiModelProperty(value = "List of parameters defining the service structure")
 /**
   * List of parameters defining the service structure
  **/
  private List<ServiceParameter> parameters = null;

  @ApiModelProperty(value = "List of associated sub-services ids. A service can represent a pack of services and this list will contain the corresponding ids.")
 /**
   * List of associated sub-services ids. A service can represent a pack of services and this list will contain the corresponding ids.
  **/
  private List<String> subServiceIds = null;

  @ApiModelProperty(value = "Display recommendation ; true if the service is recommended to be highlighted")
 /**
   * Display recommendation ; true if the service is recommended to be highlighted
  **/
  private Boolean isHighlighted = null;

  @ApiModelProperty(value = "Display recommendation provided by [AAM](http://www.amadeus.com/web/amadeus/en_1A-corporate/Airlines/Airline-Needs/Serve/Differentiate-your-offer/Amadeus-Anytime-Merchandising/1319660801962-Solution_C-AMAD_ProductDetailPpal-1319637765525?industrySegment=1259068355670&level2=1332980613390&level3=1319616835064). This number represents the display order of the services (the lower the number, the more important the service is) ")
 /**
   * Display recommendation provided by [AAM](http://www.amadeus.com/web/amadeus/en_1A-corporate/Airlines/Airline-Needs/Serve/Differentiate-your-offer/Amadeus-Anytime-Merchandising/1319660801962-Solution_C-AMAD_ProductDetailPpal-1319637765525?industrySegment=1259068355670&level2=1332980613390&level3=1319616835064). This number represents the display order of the services (the lower the number, the more important the service is) 
  **/
  private Integer displayOrder = null;

  @ApiModelProperty(value = "List of media associated to the service")
 /**
   * List of media associated to the service
  **/
  private List<RichMedia> media = null;

  @ApiModelProperty(value = "Traveler who benefits of this service. The traveler id refer to the traveler dictionary. ")
 /**
   * Traveler who benefits of this service. The traveler id refer to the traveler dictionary. 
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "Display recommendation ; true if the service is exempted")
 /**
   * Display recommendation ; true if the service is exempted
  **/
  private Boolean isExempted = null;

  @ApiModelProperty(value = "Price for the service item")
 /**
   * Price for the service item
  **/
  private MultiCurrencyAirPricingRecords prices = null;

  @ApiModelProperty(value = "Detailed information about the service usage (i.e. quantity per flight)")
 /**
   * Detailed information about the service usage (i.e. quantity per flight)
  **/
  private List<ServiceDetail> details = null;
 /**
   * Service id, as defined in services dictionary
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderServiceItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * temporary id that can be used to associate requested and returned services. It is only valid the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public OrderServiceItem tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * List of exhaustive descriptions available for the service
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<ServiceDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<ServiceDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public OrderServiceItem descriptions(List<ServiceDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public OrderServiceItem addDescriptionsItem(ServiceDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
   * Quantity of service requested (e.g. Number of bags).  In an Order the details of quantity of service for each flights is available in details field. 
   * minimum: 1
   * maximum: 99
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderServiceItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Number of remaining services. Quota is returned only at shopping time
   * @return quota
  **/
  @JsonProperty("quota")
  public Integer getQuota() {
    return quota;
  }

  public void setQuota(Integer quota) {
    this.quota = quota;
  }

  public OrderServiceItem quota(Integer quota) {
    this.quota = quota;
    return this;
  }

 /**
   * Used to specify the tags associated to the service. The tags might refer to the category (e.g. Baggage, Meal, etc.). 
   * @return tags
  **/
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public OrderServiceItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public OrderServiceItem addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
   * Flights to which this service is associated to
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public OrderServiceItem flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public OrderServiceItem addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken. Status code is not returned at shopping time
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public OrderServiceItem statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * List of parameters defining the service structure
   * @return parameters
  **/
  @JsonProperty("parameters")
  public List<ServiceParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ServiceParameter> parameters) {
    this.parameters = parameters;
  }

  public OrderServiceItem parameters(List<ServiceParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public OrderServiceItem addParametersItem(ServiceParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

 /**
   * List of associated sub-services ids. A service can represent a pack of services and this list will contain the corresponding ids.
   * @return subServiceIds
  **/
  @JsonProperty("subServiceIds")
  public List<String> getSubServiceIds() {
    return subServiceIds;
  }

  public void setSubServiceIds(List<String> subServiceIds) {
    this.subServiceIds = subServiceIds;
  }

  public OrderServiceItem subServiceIds(List<String> subServiceIds) {
    this.subServiceIds = subServiceIds;
    return this;
  }

  public OrderServiceItem addSubServiceIdsItem(String subServiceIdsItem) {
    this.subServiceIds.add(subServiceIdsItem);
    return this;
  }

 /**
   * Display recommendation ; true if the service is recommended to be highlighted
   * @return isHighlighted
  **/
  @JsonProperty("isHighlighted")
  public Boolean isIsHighlighted() {
    return isHighlighted;
  }

  public void setIsHighlighted(Boolean isHighlighted) {
    this.isHighlighted = isHighlighted;
  }

  public OrderServiceItem isHighlighted(Boolean isHighlighted) {
    this.isHighlighted = isHighlighted;
    return this;
  }

 /**
   * Display recommendation provided by [AAM](http://www.amadeus.com/web/amadeus/en_1A-corporate/Airlines/Airline-Needs/Serve/Differentiate-your-offer/Amadeus-Anytime-Merchandising/1319660801962-Solution_C-AMAD_ProductDetailPpal-1319637765525?industrySegment&#x3D;1259068355670&amp;level2&#x3D;1332980613390&amp;level3&#x3D;1319616835064). This number represents the display order of the services (the lower the number, the more important the service is) 
   * @return displayOrder
  **/
  @JsonProperty("displayOrder")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public OrderServiceItem displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

 /**
   * List of media associated to the service
   * @return media
  **/
  @JsonProperty("media")
  public List<RichMedia> getMedia() {
    return media;
  }

  public void setMedia(List<RichMedia> media) {
    this.media = media;
  }

  public OrderServiceItem media(List<RichMedia> media) {
    this.media = media;
    return this;
  }

  public OrderServiceItem addMediaItem(RichMedia mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

 /**
   * Traveler who benefits of this service. The traveler id refer to the traveler dictionary. 
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public OrderServiceItem travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Display recommendation ; true if the service is exempted
   * @return isExempted
  **/
  @JsonProperty("isExempted")
  public Boolean isIsExempted() {
    return isExempted;
  }

  public void setIsExempted(Boolean isExempted) {
    this.isExempted = isExempted;
  }

  public OrderServiceItem isExempted(Boolean isExempted) {
    this.isExempted = isExempted;
    return this;
  }

 /**
   * Price for the service item
   * @return prices
  **/
  @JsonProperty("prices")
  public MultiCurrencyAirPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(MultiCurrencyAirPricingRecords prices) {
    this.prices = prices;
  }

  public OrderServiceItem prices(MultiCurrencyAirPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Detailed information about the service usage (i.e. quantity per flight)
   * @return details
  **/
  @JsonProperty("details")
  public List<ServiceDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ServiceDetail> details) {
    this.details = details;
  }

  public OrderServiceItem details(List<ServiceDetail> details) {
    this.details = details;
    return this;
  }

  public OrderServiceItem addDetailsItem(ServiceDetail detailsItem) {
    this.details.add(detailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderServiceItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    subServiceIds: ").append(toIndentedString(subServiceIds)).append("\n");
    sb.append("    isHighlighted: ").append(toIndentedString(isHighlighted)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    isExempted: ").append(toIndentedString(isExempted)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

