package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagesorderCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagesorderCustomParameters   {
  @JsonProperty("PriceLimit")
  private BigDecimal priceLimit = null;

  public ABMessagesorderCustomParameters priceLimit(BigDecimal priceLimit) {
    this.priceLimit = priceLimit;
    return this;
  }

  /**
   * Price to place the order
   * @return priceLimit
  **/
  @ApiModelProperty(example = "42", value = "Price to place the order")

  @Valid
  public BigDecimal getPriceLimit() {
    return priceLimit;
  }

  public void setPriceLimit(BigDecimal priceLimit) {
    this.priceLimit = priceLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagesorderCustomParameters abMessagesorderCustomParameters = (ABMessagesorderCustomParameters) o;
    return Objects.equals(this.priceLimit, abMessagesorderCustomParameters.priceLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagesorderCustomParameters {\n");
    
    sb.append("    priceLimit: ").append(toIndentedString(priceLimit)).append("\n");
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
