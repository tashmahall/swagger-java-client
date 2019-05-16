package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagemitCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagemitCustomParameters   {
  @JsonProperty("PriceLimit")
  private BigDecimal priceLimit = null;

  @JsonProperty("RestingPrice")
  private BigDecimal restingPrice = null;

  @JsonProperty("RestingQuantity")
  private Integer restingQuantity = null;

  public ABMessagemitCustomParameters priceLimit(BigDecimal priceLimit) {
    this.priceLimit = priceLimit;
    return this;
  }

  /**
   * Limit Price to place the orders
   * @return priceLimit
  **/
  @ApiModelProperty(example = "42", value = "Limit Price to place the orders")

  @Valid
  public BigDecimal getPriceLimit() {
    return priceLimit;
  }

  public void setPriceLimit(BigDecimal priceLimit) {
    this.priceLimit = priceLimit;
  }

  public ABMessagemitCustomParameters restingPrice(BigDecimal restingPrice) {
    this.restingPrice = restingPrice;
    return this;
  }

  /**
   * Get restingPrice
   * @return restingPrice
  **/
  @ApiModelProperty(example = "12.42", value = "")

  @Valid
  public BigDecimal getRestingPrice() {
    return restingPrice;
  }

  public void setRestingPrice(BigDecimal restingPrice) {
    this.restingPrice = restingPrice;
  }

  public ABMessagemitCustomParameters restingQuantity(Integer restingQuantity) {
    this.restingQuantity = restingQuantity;
    return this;
  }

  /**
   * Get restingQuantity
   * @return restingQuantity
  **/
  @ApiModelProperty(example = "100", value = "")

  public Integer getRestingQuantity() {
    return restingQuantity;
  }

  public void setRestingQuantity(Integer restingQuantity) {
    this.restingQuantity = restingQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagemitCustomParameters abMessagemitCustomParameters = (ABMessagemitCustomParameters) o;
    return Objects.equals(this.priceLimit, abMessagemitCustomParameters.priceLimit) &&
        Objects.equals(this.restingPrice, abMessagemitCustomParameters.restingPrice) &&
        Objects.equals(this.restingQuantity, abMessagemitCustomParameters.restingQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceLimit, restingPrice, restingQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagemitCustomParameters {\n");
    
    sb.append("    priceLimit: ").append(toIndentedString(priceLimit)).append("\n");
    sb.append("    restingPrice: ").append(toIndentedString(restingPrice)).append("\n");
    sb.append("    restingQuantity: ").append(toIndentedString(restingQuantity)).append("\n");
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
