package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ErrorMessage;
import com.koreanair.external.dx.vo.WarningMessage;
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

public class Messages  {
  
  @ApiModelProperty(value = "Array of error messages. If at least one error occurs, no data will be returned and the HTTP Status code is 200 for POST and DELETE, instead of 201 and 204 when the operation went well")
 /**
   * Array of error messages. If at least one error occurs, no data will be returned and the HTTP Status code is 200 for POST and DELETE, instead of 201 and 204 when the operation went well
  **/
  private List<ErrorMessage> errors = null;

  @ApiModelProperty(value = "Array of warning messages. A warning message could be raised also in case of successful operation")
 /**
   * Array of warning messages. A warning message could be raised also in case of successful operation
  **/
  private List<WarningMessage> warnings = null;
 /**
   * Array of error messages. If at least one error occurs, no data will be returned and the HTTP Status code is 200 for POST and DELETE, instead of 201 and 204 when the operation went well
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorMessage> errors) {
    this.errors = errors;
  }

  public Messages errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public Messages addErrorsItem(ErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Array of warning messages. A warning message could be raised also in case of successful operation
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<WarningMessage> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
  }

  public Messages warnings(List<WarningMessage> warnings) {
    this.warnings = warnings;
    return this;
  }

  public Messages addWarningsItem(WarningMessage warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Messages {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

