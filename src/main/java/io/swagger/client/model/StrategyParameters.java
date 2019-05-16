package io.swagger.client.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StrategyParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class StrategyParameters   {
  @JsonProperty("BasketId")
  private String basketId = null;

  @JsonProperty("ExpireDate")
  private LocalDate expireDate = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("InitTime")
  private String initTime = "09:00:00";

  @JsonProperty("EndTime")
  private String endTime = "17:53:00";

  @JsonProperty("Text")
  private String text = null;

  public StrategyParameters basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  /**
   * If this strategy is part of a Basket, put the string that identifies the basket on this field
   * @return basketId
  **/
  @ApiModelProperty(example = "my-basket", value = "If this strategy is part of a Basket, put the string that identifies the basket on this field")

  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  public StrategyParameters expireDate(LocalDate expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Not used on this version. All strategy will have expiration date equal to currente day on this version (any value on this field will be ignored)
   * @return expireDate
  **/
  @ApiModelProperty(value = "Not used on this version. All strategy will have expiration date equal to currente day on this version (any value on this field will be ignored)")

  @Valid
  public LocalDate getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(LocalDate expireDate) {
    this.expireDate = expireDate;
  }

  public StrategyParameters name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the strategy defined by the user
   * @return name
  **/
  @ApiModelProperty(example = "Estrategia com PETR4", required = true, value = "The name of the strategy defined by the user")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StrategyParameters initTime(String initTime) {
    this.initTime = initTime;
    return this;
  }

  /**
   * Time the Strategy will start. Strategy will be waiting in SCHEDULED status if InitTIme is ahead of current time or will start imediately if InitTime is behinf current time 
   * @return initTime
  **/
  @ApiModelProperty(example = "09:00:00", required = true, value = "Time the Strategy will start. Strategy will be waiting in SCHEDULED status if InitTIme is ahead of current time or will start imediately if InitTime is behinf current time ")
  @NotNull

  public String getInitTime() {
    return initTime;
  }

  public void setInitTime(String initTime) {
    this.initTime = initTime;
  }

  public StrategyParameters endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time this strategy will be stopped. Must be greater then InitTime  
   * @return endTime
  **/
  @ApiModelProperty(example = "17:53:00", required = true, value = "The time this strategy will be stopped. Must be greater then InitTime  ")
  @NotNull

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public StrategyParameters text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "A comment for my strategy", value = "")

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrategyParameters strategyParameters = (StrategyParameters) o;
    return Objects.equals(this.basketId, strategyParameters.basketId) &&
        Objects.equals(this.expireDate, strategyParameters.expireDate) &&
        Objects.equals(this.name, strategyParameters.name) &&
        Objects.equals(this.initTime, strategyParameters.initTime) &&
        Objects.equals(this.endTime, strategyParameters.endTime) &&
        Objects.equals(this.text, strategyParameters.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basketId, expireDate, name, initTime, endTime, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrategyParameters {\n");
    
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    initTime: ").append(toIndentedString(initTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
