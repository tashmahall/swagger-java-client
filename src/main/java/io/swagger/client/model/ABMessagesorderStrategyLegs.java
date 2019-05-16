package io.swagger.client.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagesorderStrategyLegs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagesorderStrategyLegs   {
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

  /**
   * The type of the order  * 1 = Market * 2 = Limit 
   */
  public enum LegOrdTypeEnum {
    _1("1"),
    
    _2("2");

    private String value;

    LegOrdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LegOrdTypeEnum fromValue(String text) {
      for (LegOrdTypeEnum b : LegOrdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("LegOrdType")
  private LegOrdTypeEnum legOrdType = null;

  public ABMessagesorderStrategyLegs ilegAllocAccount(String ilegAllocAccount) {
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

  public ABMessagesorderStrategyLegs legQuantity(Integer legQuantity) {
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

  public ABMessagesorderStrategyLegs legSecurityExchange(ExchangeT legSecurityExchange) {
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

  public ABMessagesorderStrategyLegs legSide(SideT legSide) {
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

  public ABMessagesorderStrategyLegs legSymbol(String legSymbol) {
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

  public ABMessagesorderStrategyLegs legOrdType(LegOrdTypeEnum legOrdType) {
    this.legOrdType = legOrdType;
    return this;
  }

  /**
   * The type of the order  * 1 = Market * 2 = Limit 
   * @return legOrdType
  **/
  @ApiModelProperty(value = "The type of the order  * 1 = Market * 2 = Limit ")

  public LegOrdTypeEnum getLegOrdType() {
    return legOrdType;
  }

  public void setLegOrdType(LegOrdTypeEnum legOrdType) {
    this.legOrdType = legOrdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagesorderStrategyLegs abMessagesorderStrategyLegs = (ABMessagesorderStrategyLegs) o;
    return Objects.equals(this.ilegAllocAccount, abMessagesorderStrategyLegs.ilegAllocAccount) &&
        Objects.equals(this.legQuantity, abMessagesorderStrategyLegs.legQuantity) &&
        Objects.equals(this.legSecurityExchange, abMessagesorderStrategyLegs.legSecurityExchange) &&
        Objects.equals(this.legSide, abMessagesorderStrategyLegs.legSide) &&
        Objects.equals(this.legSymbol, abMessagesorderStrategyLegs.legSymbol) &&
        Objects.equals(this.legOrdType, abMessagesorderStrategyLegs.legOrdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ilegAllocAccount, legQuantity, legSecurityExchange, legSide, legSymbol, legOrdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagesorderStrategyLegs {\n");
    
    sb.append("    ilegAllocAccount: ").append(toIndentedString(ilegAllocAccount)).append("\n");
    sb.append("    legQuantity: ").append(toIndentedString(legQuantity)).append("\n");
    sb.append("    legSecurityExchange: ").append(toIndentedString(legSecurityExchange)).append("\n");
    sb.append("    legSide: ").append(toIndentedString(legSide)).append("\n");
    sb.append("    legSymbol: ").append(toIndentedString(legSymbol)).append("\n");
    sb.append("    legOrdType: ").append(toIndentedString(legOrdType)).append("\n");
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
