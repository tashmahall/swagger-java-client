package io.swagger.client.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagemitStrategyLegs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagemitStrategyLegs   {
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

  @JsonProperty("LegMaxClipSize")
  private Integer legMaxClipSize = null;

  @JsonProperty("LegMinClipSize")
  private Integer legMinClipSize = null;
  
  @JsonProperty("LegResting")
  private BoolFieldYT legResting = null;

  @JsonProperty("LegFirstTimeOut")
  private Integer legFirstTimeOut = null;
  
  
  
  public ABMessagemitStrategyLegs ilegAllocAccount(String ilegAllocAccount) {
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

  public ABMessagemitStrategyLegs legQuantity(Integer legQuantity) {
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

  public ABMessagemitStrategyLegs legSecurityExchange(ExchangeT legSecurityExchange) {
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

  public ABMessagemitStrategyLegs legSide(SideT legSide) {
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

  public ABMessagemitStrategyLegs legSymbol(String legSymbol) {
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

  public ABMessagemitStrategyLegs legMaxClipSize(Integer legMaxClipSize) {
    this.legMaxClipSize = legMaxClipSize;
    return this;
  }

  /**
   * The max size (qtty) of each order to send 
   * @return legMaxClipSize
  **/
  @ApiModelProperty(example = "500", value = "The max size (qtty) of each order to send ")

  public Integer getLegMaxClipSize() {
    return legMaxClipSize;
  }

  public void setLegMaxClipSize(Integer legMaxClipSize) {
    this.legMaxClipSize = legMaxClipSize;
  }

  public ABMessagemitStrategyLegs legMinClipSize(Integer legMinClipSize) {
    this.legMinClipSize = legMinClipSize;
    return this;
  }

  /**
   * The min size (qtty) of each order to send 
   * @return legMinClipSize
  **/
  @ApiModelProperty(example = "100", value = "The min size (qtty) of each order to send ")

  public Integer getLegMinClipSize() {
    return legMinClipSize;
  }

  public void setLegMinClipSize(Integer legMinClipSize) {
    this.legMinClipSize = legMinClipSize;
  }

  public BoolFieldYT getLegResting() {
	return legResting;
}

public void setLegResting(BoolFieldYT legResting) {
	this.legResting = legResting;
}


public Integer getLegFirstTimeOut() {
	return legFirstTimeOut;
}

public void setLegFirstTimeOut(Integer legFirstTimeOut) {
	this.legFirstTimeOut = legFirstTimeOut;
}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagemitStrategyLegs abMessagemitStrategyLegs = (ABMessagemitStrategyLegs) o;
    return Objects.equals(this.ilegAllocAccount, abMessagemitStrategyLegs.ilegAllocAccount) &&
        Objects.equals(this.legQuantity, abMessagemitStrategyLegs.legQuantity) &&
        Objects.equals(this.legSecurityExchange, abMessagemitStrategyLegs.legSecurityExchange) &&
        Objects.equals(this.legSide, abMessagemitStrategyLegs.legSide) &&
        Objects.equals(this.legSymbol, abMessagemitStrategyLegs.legSymbol) &&
        Objects.equals(this.legMaxClipSize, abMessagemitStrategyLegs.legMaxClipSize) &&
        Objects.equals(this.legMinClipSize, abMessagemitStrategyLegs.legMinClipSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ilegAllocAccount, legQuantity, legSecurityExchange, legSide, legSymbol, legMaxClipSize, legMinClipSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagemitStrategyLegs {\n");
    
    sb.append("    ilegAllocAccount: ").append(toIndentedString(ilegAllocAccount)).append("\n");
    sb.append("    legQuantity: ").append(toIndentedString(legQuantity)).append("\n");
    sb.append("    legSecurityExchange: ").append(toIndentedString(legSecurityExchange)).append("\n");
    sb.append("    legSide: ").append(toIndentedString(legSide)).append("\n");
    sb.append("    legSymbol: ").append(toIndentedString(legSymbol)).append("\n");
    sb.append("    legMaxClipSize: ").append(toIndentedString(legMaxClipSize)).append("\n");
    sb.append("    legMinClipSize: ").append(toIndentedString(legMinClipSize)).append("\n");
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
