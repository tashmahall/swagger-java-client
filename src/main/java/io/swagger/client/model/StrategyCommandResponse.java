package io.swagger.client.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Error
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class StrategyCommandResponse   {
  @JsonProperty("CommandID")
  private String commandID = null;

  @JsonProperty("response")
  private String response = null;

  public StrategyCommandResponse commandID(String commandID) {
    this.commandID = commandID;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getCommandID() {
    return commandID;
  }

  public void setCommandID(String commandID) {
    this.commandID = commandID;
  }

  public StrategyCommandResponse message(String response) {
    this.response = response;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrategyCommandResponse error = (StrategyCommandResponse) o;
    return Objects.equals(this.commandID, error.commandID) &&
        Objects.equals(this.response, error.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandID, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(commandID)).append("\n");
    sb.append("    message: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
