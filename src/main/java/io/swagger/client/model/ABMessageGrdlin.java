package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessageGrdlin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessageGrdlin   {
  @JsonProperty("Name")
  private String  name = null;

  @JsonProperty("InitTime")
  private String  initTime = null;

  @JsonProperty("EndTime")
  private String  endTime = null;

  @JsonProperty("ExpireDate")
  private String  expireDate = null;

  @JsonProperty("Text")
  private String  text = null;

  @JsonProperty("BasketId")
  private String  basketId = null;

  @JsonProperty("StrategyCode")
  private String strategyCode = null;

  @JsonProperty("CustomParameters")
  private ABMessagegrdlinCustomParameters customParameters = null;

  @JsonProperty("StrategyLegs")
  @Valid
  private List<ABMessagegrddinStrategyLegs> strategyLegs = null;

  public ABMessageGrdlin name(String  name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  @Valid
  public String  getName() {
    return name;
  }

  public void setName(String  name) {
    this.name = name;
  }

  public ABMessageGrdlin initTime(String  initTime) {
    this.initTime = initTime;
    return this;
  }

  /**
   * Get initTime
   * @return initTime
  **/
  @ApiModelProperty(value = "")

  @Valid
  public String  getInitTime() {
    return initTime;
  }

  public void setInitTime(String  initTime) {
    this.initTime = initTime;
  }

  public ABMessageGrdlin endTime(String  endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid
  public String  getEndTime() {
    return endTime;
  }

  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  public ABMessageGrdlin expireDate(String  expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public String  getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(String  expireDate) {
    this.expireDate = expireDate;
  }

  public ABMessageGrdlin text(String  text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")

  @Valid
  public String  getText() {
    return text;
  }

  public void setText(String  text) {
    this.text = text;
  }

  public ABMessageGrdlin basketId(String  basketId) {
    this.basketId = basketId;
    return this;
  }

  /**
   * Get basketId
   * @return basketId
  **/
  @ApiModelProperty(value = "")

  @Valid
  public String  getBasketId() {
    return basketId;
  }

  public void setBasketId(String  basketId) {
    this.basketId = basketId;
  }

  public ABMessageGrdlin strategyCode(String strategyCode) {
    this.strategyCode = strategyCode;
    return this;
  }

  /**
   * Strategy code for Gradiente Linear strategy (grdlin)
   * @return strategyCode
  **/
  @ApiModelProperty(example = "grdlin", value = "Strategy code for Gradiente Linear strategy (grdlin)")

  public String getStrategyCode() {
    return strategyCode;
  }

  public void setStrategyCode(String strategyCode) {
    this.strategyCode = strategyCode;
  }

  public ABMessageGrdlin customParameters(ABMessagegrdlinCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ABMessagegrdlinCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(ABMessagegrdlinCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public ABMessageGrdlin strategyLegs(List<ABMessagegrddinStrategyLegs> strategyLegs) {
    this.strategyLegs = strategyLegs;
    return this;
  }

  public ABMessageGrdlin addStrategyLegsItem(ABMessagegrddinStrategyLegs strategyLegsItem) {
    if (this.strategyLegs == null) {
      this.strategyLegs = new ArrayList<ABMessagegrddinStrategyLegs>();
    }
    this.strategyLegs.add(strategyLegsItem);
    return this;
  }

  /**
   * Get strategyLegs
   * @return strategyLegs
  **/
  @ApiModelProperty(value = "")
  @Valid
@Size(min=1,max=1)   public List<ABMessagegrddinStrategyLegs> getStrategyLegs() {
    return strategyLegs;
  }

  public void setStrategyLegs(List<ABMessagegrddinStrategyLegs> strategyLegs) {
    this.strategyLegs = strategyLegs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessageGrdlin abMessageGrdlin = (ABMessageGrdlin) o;
    return Objects.equals(this.name, abMessageGrdlin.name) &&
        Objects.equals(this.initTime, abMessageGrdlin.initTime) &&
        Objects.equals(this.endTime, abMessageGrdlin.endTime) &&
        Objects.equals(this.expireDate, abMessageGrdlin.expireDate) &&
        Objects.equals(this.text, abMessageGrdlin.text) &&
        Objects.equals(this.basketId, abMessageGrdlin.basketId) &&
        Objects.equals(this.strategyCode, abMessageGrdlin.strategyCode) &&
        Objects.equals(this.customParameters, abMessageGrdlin.customParameters) &&
        Objects.equals(this.strategyLegs, abMessageGrdlin.strategyLegs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, initTime, endTime, expireDate, text, basketId, strategyCode, customParameters, strategyLegs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessageGrdlin {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    initTime: ").append(toIndentedString(initTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    strategyCode: ").append(toIndentedString(strategyCode)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    strategyLegs: ").append(toIndentedString(strategyLegs)).append("\n");
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
