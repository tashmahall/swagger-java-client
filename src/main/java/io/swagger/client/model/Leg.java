package io.swagger.client.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Leg
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class Leg   {
  @JsonProperty("ILegAllocAccount")
  private String ilegAllocAccount = null;

  @JsonProperty("LegQuantity")
  private Integer legQuantity = null;

  @JsonProperty("LegResting")
  private String legResting = null;

  @JsonProperty("LegSecurityExchange")
  private String legSecurityExchange = null;

  @JsonProperty("LegSide")
  private String legSide = null;

  @JsonProperty("LegSymbol")
  private String legSymbol = null;

  public Leg ilegAllocAccount(String ilegAllocAccount) {
    this.ilegAllocAccount = ilegAllocAccount;
    return this;
  }

  /**
   * Get ilegAllocAccount
   * @return ilegAllocAccount
  **/
  @ApiModelProperty(example = "88004BVSP", value = "")

  public String getIlegAllocAccount() {
    return ilegAllocAccount;
  }

  public void setIlegAllocAccount(String ilegAllocAccount) {
    this.ilegAllocAccount = ilegAllocAccount;
  }

  public Leg legQuantity(Integer legQuantity) {
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

  public Leg legResting(String legResting) {
    this.legResting = legResting;
    return this;
  }

  /**
   * Get legResting
   * @return legResting
  **/
  @ApiModelProperty(example = "Y", value = "")

  public String getLegResting() {
    return legResting;
  }

  public void setLegResting(String legResting) {
    this.legResting = legResting;
  }

  public Leg legSecurityExchange(String legSecurityExchange) {
    this.legSecurityExchange = legSecurityExchange;
    return this;
  }

  /**
   * Get legSecurityExchange
   * @return legSecurityExchange
  **/
  @ApiModelProperty(example = "XBMF", value = "")

  public String getLegSecurityExchange() {
    return legSecurityExchange;
  }

  public void setLegSecurityExchange(String legSecurityExchange) {
    this.legSecurityExchange = legSecurityExchange;
  }

  public Leg legSide(String legSide) {
    this.legSide = legSide;
    return this;
  }

  /**
   * Get legSide
   * @return legSide
  **/
  @ApiModelProperty(example = "2", value = "")

  public String getLegSide() {
    return legSide;
  }

  public void setLegSide(String legSide) {
    this.legSide = legSide;
  }

  public Leg legSymbol(String legSymbol) {
    this.legSymbol = legSymbol;
    return this;
  }

  /**
   * Get legSymbol
   * @return legSymbol
  **/
  @ApiModelProperty(example = "PETR4", value = "")

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
    Leg leg = (Leg) o;
    return Objects.equals(this.ilegAllocAccount, leg.ilegAllocAccount) &&
        Objects.equals(this.legQuantity, leg.legQuantity) &&
        Objects.equals(this.legResting, leg.legResting) &&
        Objects.equals(this.legSecurityExchange, leg.legSecurityExchange) &&
        Objects.equals(this.legSide, leg.legSide) &&
        Objects.equals(this.legSymbol, leg.legSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ilegAllocAccount, legQuantity, legResting, legSecurityExchange, legSide, legSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leg {\n");
    
    sb.append("    ilegAllocAccount: ").append(toIndentedString(ilegAllocAccount)).append("\n");
    sb.append("    legQuantity: ").append(toIndentedString(legQuantity)).append("\n");
    sb.append("    legResting: ").append(toIndentedString(legResting)).append("\n");
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
