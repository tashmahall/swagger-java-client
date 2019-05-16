package io.swagger.client.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagesniperStrategyLegs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagesniperStrategyLegs   {
  @JsonProperty("ILegAllocAccount")
  private String ilegAllocAccount = null;

  @JsonProperty("LegQuantity")
  private Integer legQuantity = null;

  @JsonProperty("LegSecurityExchange")
  private ExchangeT legSecurityExchange = null;

  @JsonProperty("LegSide")
  private SideT legSide = null;

  @JsonProperty("LegSymbol")
  private String legSymbol = null;

  public ABMessagesniperStrategyLegs ilegAllocAccount(String ilegAllocAccount) {
    this.ilegAllocAccount = ilegAllocAccount;
    return this;
  }

  /**
   * Get ilegAllocAccount
   * @return ilegAllocAccount
  **/
  @ApiModelProperty(value = "")

  public String getIlegAllocAccount() {
    return ilegAllocAccount;
  }

  public void setIlegAllocAccount(String ilegAllocAccount) {
    this.ilegAllocAccount = ilegAllocAccount;
  }

  public ABMessagesniperStrategyLegs legQuantity(Integer legQuantity) {
    this.legQuantity = legQuantity;
    return this;
  }

  /**
   * Get legQuantity
   * @return legQuantity
  **/
  @ApiModelProperty(example = "100", value = "")

  public Integer getLegQuantity() {
    return legQuantity;
  }

  public void setLegQuantity(Integer legQuantity) {
    this.legQuantity = legQuantity;
  }

  public ABMessagesniperStrategyLegs legSecurityExchange(ExchangeT legSecurityExchange) {
    this.legSecurityExchange = legSecurityExchange;
    return this;
  }

  /**
   * Get legSecurityExchange
   * @return legSecurityExchange
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ExchangeT getLegSecurityExchange() {
    return legSecurityExchange;
  }

  public void setLegSecurityExchange(ExchangeT legSecurityExchange) {
    this.legSecurityExchange = legSecurityExchange;
  }

  public ABMessagesniperStrategyLegs legSide(SideT legSide) {
    this.legSide = legSide;
    return this;
  }

  /**
   * Get legSide
   * @return legSide
  **/
  @ApiModelProperty(value = "")

  @Valid
  public SideT getLegSide() {
    return legSide;
  }

  public void setLegSide(SideT legSide) {
    this.legSide = legSide;
  }

  public ABMessagesniperStrategyLegs legSymbol(String legSymbol) {
    this.legSymbol = legSymbol;
    return this;
  }

  /**
   * Get legSymbol
   * @return legSymbol
  **/
  @ApiModelProperty(value = "")

  public String getLegSymbol() {
    return legSymbol;
  }

  public void setLegSymbol(String legSymbol) {
    this.legSymbol = legSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagesniperStrategyLegs abMessagesniperStrategyLegs = (ABMessagesniperStrategyLegs) o;
    return Objects.equals(this.ilegAllocAccount, abMessagesniperStrategyLegs.ilegAllocAccount) &&
        Objects.equals(this.legQuantity, abMessagesniperStrategyLegs.legQuantity) &&
        Objects.equals(this.legSecurityExchange, abMessagesniperStrategyLegs.legSecurityExchange) &&
        Objects.equals(this.legSide, abMessagesniperStrategyLegs.legSide) &&
        Objects.equals(this.legSymbol, abMessagesniperStrategyLegs.legSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ilegAllocAccount, legQuantity, legSecurityExchange, legSide, legSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagesniperStrategyLegs {\n");
    
    sb.append("    ilegAllocAccount: ").append(toIndentedString(ilegAllocAccount)).append("\n");
    sb.append("    legQuantity: ").append(toIndentedString(legQuantity)).append("\n");
    sb.append("    legSecurityExchange: ").append(toIndentedString(legSecurityExchange)).append("\n");
    sb.append("    legSide: ").append(toIndentedString(legSide)).append("\n");
    sb.append("    legSymbol: ").append(toIndentedString(legSymbol)).append("\n");
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
