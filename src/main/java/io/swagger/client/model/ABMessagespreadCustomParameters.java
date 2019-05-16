package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagespreadCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagespreadCustomParameters   {
  @JsonProperty("TriggerValue")
  private BigDecimal triggerValue = null;

  /**
   * Type of trigger. 1=spread, 11=financeiro 
   */
  public enum TriggerEnum {
    _1(new BigDecimal("1")),
    
    _11(new BigDecimal("11"));

    private BigDecimal value;

    TriggerEnum(BigDecimal value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TriggerEnum fromValue(String text) {
      for (TriggerEnum b : TriggerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Trigger")
  private TriggerEnum trigger = null;

  @JsonProperty("BookDepth")
  private Integer bookDepth = null;

  @JsonProperty("BandPriceRef")
  private BoolFieldNT bandPriceRef = null;

  @JsonProperty("BandPriceSymbol")
  private String bandPriceSymbol = null;

  @JsonProperty("BandPriceExchange")
  private ExchangeT bandPriceExchange = null;

  @JsonProperty("BandPriceHigh")
  private BigDecimal bandPriceHigh = null;

  @JsonProperty("BandPriceLow")
  private BigDecimal bandPriceLow = null;

  @JsonProperty("IgnoreOffersLT")
  private Integer ignoreOffersLT = null;

  /**
   * Type of compensation when unbalanced - 0=No comp, 1=next clip, 2=gradual 
   */
  public enum CompensateExecEnum {
    _0(new BigDecimal("0")),
    
    _1(new BigDecimal("1")),
    
    _2(new BigDecimal("2"));

    private BigDecimal value;

    CompensateExecEnum(BigDecimal value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CompensateExecEnum fromValue(String text) {
      for (CompensateExecEnum b : CompensateExecEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("CompensateExec")
  private CompensateExecEnum compensateExec = null;

  @JsonProperty("SimulateSniperOnResting")
  private BoolFieldNT simulateSniperOnResting = null;

  @JsonProperty("InitSuspended")
  private BoolFieldNT initSuspended = null;

  public ABMessagespreadCustomParameters triggerValue(BigDecimal triggerValue) {
    this.triggerValue = triggerValue;
    return this;
  }

  /**
   * Get triggerValue
   * @return triggerValue
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getTriggerValue() {
    return triggerValue;
  }

  public void setTriggerValue(BigDecimal triggerValue) {
    this.triggerValue = triggerValue;
  }

  public ABMessagespreadCustomParameters trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Type of trigger. 1=spread, 11=financeiro 
   * @return trigger
  **/
  @ApiModelProperty(value = "Type of trigger. 1=spread, 11=financeiro ")

  @Valid
  public TriggerEnum getTrigger() {
    return trigger;
  }

  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  public ABMessagespreadCustomParameters bookDepth(Integer bookDepth) {
    this.bookDepth = bookDepth;
    return this;
  }

  /**
   * Get bookDepth
   * minimum: 1
   * maximum: 5
   * @return bookDepth
  **/
  @ApiModelProperty(example = "3", value = "")

@Min(1) @Max(5)   public Integer getBookDepth() {
    return bookDepth;
  }

  public void setBookDepth(Integer bookDepth) {
    this.bookDepth = bookDepth;
  }

  public ABMessagespreadCustomParameters bandPriceRef(BoolFieldNT bandPriceRef) {
    this.bandPriceRef = bandPriceRef;
    return this;
  }

  /**
   * Get bandPriceRef
   * @return bandPriceRef
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldNT getBandPriceRef() {
    return bandPriceRef;
  }

  public void setBandPriceRef(BoolFieldNT bandPriceRef) {
    this.bandPriceRef = bandPriceRef;
  }

  public ABMessagespreadCustomParameters bandPriceSymbol(String bandPriceSymbol) {
    this.bandPriceSymbol = bandPriceSymbol;
    return this;
  }

  /**
   * Get bandPriceSymbol
   * @return bandPriceSymbol
  **/
  @ApiModelProperty(value = "")

  public String getBandPriceSymbol() {
    return bandPriceSymbol;
  }

  public void setBandPriceSymbol(String bandPriceSymbol) {
    this.bandPriceSymbol = bandPriceSymbol;
  }

  public ABMessagespreadCustomParameters bandPriceExchange(ExchangeT bandPriceExchange) {
    this.bandPriceExchange = bandPriceExchange;
    return this;
  }

  /**
   * Get bandPriceExchange
   * @return bandPriceExchange
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ExchangeT getBandPriceExchange() {
    return bandPriceExchange;
  }

  public void setBandPriceExchange(ExchangeT bandPriceExchange) {
    this.bandPriceExchange = bandPriceExchange;
  }

  public ABMessagespreadCustomParameters bandPriceHigh(BigDecimal bandPriceHigh) {
    this.bandPriceHigh = bandPriceHigh;
    return this;
  }

  /**
   * Get bandPriceHigh
   * @return bandPriceHigh
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getBandPriceHigh() {
    return bandPriceHigh;
  }

  public void setBandPriceHigh(BigDecimal bandPriceHigh) {
    this.bandPriceHigh = bandPriceHigh;
  }

  public ABMessagespreadCustomParameters bandPriceLow(BigDecimal bandPriceLow) {
    this.bandPriceLow = bandPriceLow;
    return this;
  }

  /**
   * Get bandPriceLow
   * @return bandPriceLow
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getBandPriceLow() {
    return bandPriceLow;
  }

  public void setBandPriceLow(BigDecimal bandPriceLow) {
    this.bandPriceLow = bandPriceLow;
  }

  public ABMessagespreadCustomParameters ignoreOffersLT(Integer ignoreOffersLT) {
    this.ignoreOffersLT = ignoreOffersLT;
    return this;
  }

  /**
   * Get ignoreOffersLT
   * minimum: 1
   * @return ignoreOffersLT
  **/
  @ApiModelProperty(example = "1", value = "")

@Min(1)  public Integer getIgnoreOffersLT() {
    return ignoreOffersLT;
  }

  public void setIgnoreOffersLT(Integer ignoreOffersLT) {
    this.ignoreOffersLT = ignoreOffersLT;
  }

  public ABMessagespreadCustomParameters compensateExec(CompensateExecEnum compensateExec) {
    this.compensateExec = compensateExec;
    return this;
  }

  /**
   * Type of compensation when unbalanced - 0=No comp, 1=next clip, 2=gradual 
   * @return compensateExec
  **/
  @ApiModelProperty(example = "2", value = "Type of compensation when unbalanced - 0=No comp, 1=next clip, 2=gradual ")

  @Valid
  public CompensateExecEnum getCompensateExec() {
    return compensateExec;
  }

  public void setCompensateExec(CompensateExecEnum compensateExec) {
    this.compensateExec = compensateExec;
  }

  public ABMessagespreadCustomParameters simulateSniperOnResting(BoolFieldNT simulateSniperOnResting) {
    this.simulateSniperOnResting = simulateSniperOnResting;
    return this;
  }

  /**
   * Get simulateSniperOnResting
   * @return simulateSniperOnResting
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldNT getSimulateSniperOnResting() {
    return simulateSniperOnResting;
  }

  public void setSimulateSniperOnResting(BoolFieldNT simulateSniperOnResting) {
    this.simulateSniperOnResting = simulateSniperOnResting;
  }

  public ABMessagespreadCustomParameters initSuspended(BoolFieldNT initSuspended) {
    this.initSuspended = initSuspended;
    return this;
  }

  /**
   * Get initSuspended
   * @return initSuspended
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldNT getInitSuspended() {
    return initSuspended;
  }

  public void setInitSuspended(BoolFieldNT initSuspended) {
    this.initSuspended = initSuspended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagespreadCustomParameters abMessagespreadCustomParameters = (ABMessagespreadCustomParameters) o;
    return Objects.equals(this.triggerValue, abMessagespreadCustomParameters.triggerValue) &&
        Objects.equals(this.trigger, abMessagespreadCustomParameters.trigger) &&
        Objects.equals(this.bookDepth, abMessagespreadCustomParameters.bookDepth) &&
        Objects.equals(this.bandPriceRef, abMessagespreadCustomParameters.bandPriceRef) &&
        Objects.equals(this.bandPriceSymbol, abMessagespreadCustomParameters.bandPriceSymbol) &&
        Objects.equals(this.bandPriceExchange, abMessagespreadCustomParameters.bandPriceExchange) &&
        Objects.equals(this.bandPriceHigh, abMessagespreadCustomParameters.bandPriceHigh) &&
        Objects.equals(this.bandPriceLow, abMessagespreadCustomParameters.bandPriceLow) &&
        Objects.equals(this.ignoreOffersLT, abMessagespreadCustomParameters.ignoreOffersLT) &&
        Objects.equals(this.compensateExec, abMessagespreadCustomParameters.compensateExec) &&
        Objects.equals(this.simulateSniperOnResting, abMessagespreadCustomParameters.simulateSniperOnResting) &&
        Objects.equals(this.initSuspended, abMessagespreadCustomParameters.initSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerValue, trigger, bookDepth, bandPriceRef, bandPriceSymbol, bandPriceExchange, bandPriceHigh, bandPriceLow, ignoreOffersLT, compensateExec, simulateSniperOnResting, initSuspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagespreadCustomParameters {\n");
    
    sb.append("    triggerValue: ").append(toIndentedString(triggerValue)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    bookDepth: ").append(toIndentedString(bookDepth)).append("\n");
    sb.append("    bandPriceRef: ").append(toIndentedString(bandPriceRef)).append("\n");
    sb.append("    bandPriceSymbol: ").append(toIndentedString(bandPriceSymbol)).append("\n");
    sb.append("    bandPriceExchange: ").append(toIndentedString(bandPriceExchange)).append("\n");
    sb.append("    bandPriceHigh: ").append(toIndentedString(bandPriceHigh)).append("\n");
    sb.append("    bandPriceLow: ").append(toIndentedString(bandPriceLow)).append("\n");
    sb.append("    ignoreOffersLT: ").append(toIndentedString(ignoreOffersLT)).append("\n");
    sb.append("    compensateExec: ").append(toIndentedString(compensateExec)).append("\n");
    sb.append("    simulateSniperOnResting: ").append(toIndentedString(simulateSniperOnResting)).append("\n");
    sb.append("    initSuspended: ").append(toIndentedString(initSuspended)).append("\n");
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
