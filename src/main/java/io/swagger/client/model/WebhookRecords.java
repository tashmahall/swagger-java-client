package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * WebhookRecords
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class WebhookRecords   {
  @JsonProperty("records")
  @Valid
  private List<Webhook> records = null;

  public WebhookRecords records(List<Webhook> records) {
    this.records = records;
    return this;
  }

  public WebhookRecords addRecordsItem(Webhook recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Webhook>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Webhook> getRecords() {
    return records;
  }

  public void setRecords(List<Webhook> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRecords webhookRecords = (WebhookRecords) o;
    return Objects.equals(this.records, webhookRecords.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRecords {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
