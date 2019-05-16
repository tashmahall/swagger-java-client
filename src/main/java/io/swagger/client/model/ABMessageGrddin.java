package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Body definition for Gradiente Dinamico Strategy.  
 */
@ApiModel(description = "Body definition for Gradiente Dinamico Strategy.  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessageGrddin   {
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
  private ABMessagegrddinCustomParameters customParameters = null;

  @JsonProperty("StrategyLegs")
  @Valid
  private List<ABMessagegrddinStrategyLegs> strategyLegs = null;

  public ABMessageGrddin name(String  name) {
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

  public ABMessageGrddin initTime(String  initTime) {
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

  public ABMessageGrddin endTime(String  endTime) {
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

  public ABMessageGrddin expireDate(String  expireDate) {
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

  public ABMessageGrddin text(String  text) {
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

  public ABMessageGrddin basketId(String  basketId) {
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

  public ABMessageGrddin strategyCode(String strategyCode) {
    this.strategyCode = strategyCode;
    return this;
  }

  /**
   * Strategy code for Gradiente Dinamico strategy (grddin)
   * @return strategyCode
  **/
  @ApiModelProperty(example = "grddin", value = "Strategy code for Gradiente Dinamico strategy (grddin)")

  public String getStrategyCode() {
    return strategyCode;
  }

  public void setStrategyCode(String strategyCode) {
    this.strategyCode = strategyCode;
  }

  public ABMessageGrddin customParameters(ABMessagegrddinCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ABMessagegrddinCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(ABMessagegrddinCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public ABMessageGrddin strategyLegs(List<ABMessagegrddinStrategyLegs> strategyLegs) {
    this.strategyLegs = strategyLegs;
    return this;
  }

  public ABMessageGrddin addStrategyLegsItem(ABMessagegrddinStrategyLegs strategyLegsItem) {
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
    ABMessageGrddin abMessageGrddin = (ABMessageGrddin) o;
    return Objects.equals(this.name, abMessageGrddin.name) &&
        Objects.equals(this.initTime, abMessageGrddin.initTime) &&
        Objects.equals(this.endTime, abMessageGrddin.endTime) &&
        Objects.equals(this.expireDate, abMessageGrddin.expireDate) &&
        Objects.equals(this.text, abMessageGrddin.text) &&
        Objects.equals(this.basketId, abMessageGrddin.basketId) &&
        Objects.equals(this.strategyCode, abMessageGrddin.strategyCode) &&
        Objects.equals(this.customParameters, abMessageGrddin.customParameters) &&
        Objects.equals(this.strategyLegs, abMessageGrddin.strategyLegs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, initTime, endTime, expireDate, text, basketId, strategyCode, customParameters, strategyLegs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessageGrddin {\n");
    
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
