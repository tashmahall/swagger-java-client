package io.swagger.client.model;

import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse202
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class InlineResponse202   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("snapshot_url")
  private String snapshotUrl = null;

  @JsonProperty("ClOrdID")
  private UUID clOrdID = null;

  @JsonProperty("CommandID")
  private UUID commandID = null;

  public InlineResponse202 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "PENDING NEW", value = "")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse202 desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(example = "Strategy sent to exec engine. Please check the snapshot url for status updates.' ", value = "")

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public InlineResponse202 snapshotUrl(String snapshotUrl) {
    this.snapshotUrl = snapshotUrl;
    return this;
  }

  /**
   * Get snapshotUrl
   * @return snapshotUrl
  **/
  @ApiModelProperty(example = "http://api.flexscan.com.br/v1/algos/6db71f99-4dc8-4d0d-9d75-00cdeb484319", value = "")

  public String getSnapshotUrl() {
    return snapshotUrl;
  }

  public void setSnapshotUrl(String snapshotUrl) {
    this.snapshotUrl = snapshotUrl;
  }

  public InlineResponse202 clOrdID(UUID clOrdID) {
    this.clOrdID = clOrdID;
    return this;
  }

  /**
   * Get clOrdID
   * @return clOrdID
  **/
  @ApiModelProperty(value = "")

  @Valid
  public UUID getClOrdID() {
    return clOrdID;
  }

  public void setClOrdID(UUID clOrdID) {
    this.clOrdID = clOrdID;
  }

  public InlineResponse202 commandID(UUID commandID) {
    this.commandID = commandID;
    return this;
  }

  /**
   * Get commandID
   * @return commandID
  **/
  @ApiModelProperty(value = "")

  @Valid
  public UUID getCommandID() {
    return commandID;
  }

  public void setCommandID(UUID commandID) {
    this.commandID = commandID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse202 inlineResponse202 = (InlineResponse202) o;
    return Objects.equals(this.status, inlineResponse202.status) &&
        Objects.equals(this.desc, inlineResponse202.desc) &&
        Objects.equals(this.snapshotUrl, inlineResponse202.snapshotUrl) &&
        Objects.equals(this.clOrdID, inlineResponse202.clOrdID) &&
        Objects.equals(this.commandID, inlineResponse202.commandID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, desc, snapshotUrl, clOrdID, commandID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse202 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    snapshotUrl: ").append(toIndentedString(snapshotUrl)).append("\n");
    sb.append("    clOrdID: ").append(toIndentedString(clOrdID)).append("\n");
    sb.append("    commandID: ").append(toIndentedString(commandID)).append("\n");
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
