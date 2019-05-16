package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagegrddinCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagegrddinCustomParameters   {
  @JsonProperty("EntrancePrice")
  private BigDecimal entrancePrice = null;

  @JsonProperty("NumberOfEntrances")
  private BigDecimal numberOfEntrances = null;

  @JsonProperty("StopLossFinance")
  private BigDecimal stopLossFinance = null;

  @JsonProperty("IncrementPriceStopGain")
  private BigDecimal incrementPriceStopGain = null;

  @JsonProperty("StopGainGlobalFinance")
  private BigDecimal stopGainGlobalFinance = null;

  @JsonProperty("UseStopGainGlobalFinance")
  private BoolFieldYT useStopGainGlobalFinance = null;

  @JsonProperty("SendStopLossOnEnd")
  private BoolFieldYT sendStopLossOnEnd = null;

  @JsonProperty("UseRetroaliment")
  private BoolFieldYT useRetroaliment = null;

  @JsonProperty("RetroalimentType")
  private BigDecimal retroalimentType = null;

  @JsonProperty("RetroalimentTimeWindow")
  private BigDecimal retroalimentTimeWindow = null;

  @JsonProperty("MaximumZeroTimeWindow")
  private BigDecimal maximumZeroTimeWindow = null;

  @JsonProperty("RetroalimentParam1")
  private BigDecimal retroalimentParam1 = null;

  @JsonProperty("NumberOfMinPriceIncrementsToStart")
  private BigDecimal numberOfMinPriceIncrementsToStart = null;

  @JsonProperty("IncrementPriceStepEntrance")
  private BigDecimal incrementPriceStepEntrance = null;

  @JsonProperty("OrderQuantity")
  private BigDecimal orderQuantity = null;

  @JsonProperty("UsePreservation")
  private BoolFieldYT usePreservation = null;

  @JsonProperty("PreservationStartTrigger")
  private BigDecimal preservationStartTrigger = null;

  @JsonProperty("PreservationPercentual")
  private BigDecimal preservationPercentual = null;

  @JsonProperty("PreservationStep")
  private BigDecimal preservationStep = null;

  @JsonProperty("ZerarStopLoss")
  private BoolFieldYT zerarStopLoss = null;

  @JsonProperty("UseSecurityStop")
  private BoolFieldYT useSecurityStop = null;

  @JsonProperty("InitSuspended")
  private BoolFieldNT initSuspended = null;

  public ABMessagegrddinCustomParameters entrancePrice(BigDecimal entrancePrice) {
    this.entrancePrice = entrancePrice;
    return this;
  }

  /**
   * Get entrancePrice
   * @return entrancePrice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getEntrancePrice() {
    return entrancePrice;
  }

  public void setEntrancePrice(BigDecimal entrancePrice) {
    this.entrancePrice = entrancePrice;
  }

  public ABMessagegrddinCustomParameters numberOfEntrances(BigDecimal numberOfEntrances) {
    this.numberOfEntrances = numberOfEntrances;
    return this;
  }

  /**
   * Number of entrance orders to place on order book
   * @return numberOfEntrances
  **/
  @ApiModelProperty(example = "10", required = true, value = "Number of entrance orders to place on order book")
  @NotNull

  @Valid
  public BigDecimal getNumberOfEntrances() {
    return numberOfEntrances;
  }

  public void setNumberOfEntrances(BigDecimal numberOfEntrances) {
    this.numberOfEntrances = numberOfEntrances;
  }

  public ABMessagegrddinCustomParameters stopLossFinance(BigDecimal stopLossFinance) {
    this.stopLossFinance = stopLossFinance;
    return this;
  }

  /**
   * Get stopLossFinance
   * @return stopLossFinance
  **/
  @ApiModelProperty(example = "100", required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getStopLossFinance() {
    return stopLossFinance;
  }

  public void setStopLossFinance(BigDecimal stopLossFinance) {
    this.stopLossFinance = stopLossFinance;
  }

  public ABMessagegrddinCustomParameters incrementPriceStopGain(BigDecimal incrementPriceStopGain) {
    this.incrementPriceStopGain = incrementPriceStopGain;
    return this;
  }

  /**
   * Get incrementPriceStopGain
   * @return incrementPriceStopGain
  **/
  @ApiModelProperty(example = "20", required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getIncrementPriceStopGain() {
    return incrementPriceStopGain;
  }

  public void setIncrementPriceStopGain(BigDecimal incrementPriceStopGain) {
    this.incrementPriceStopGain = incrementPriceStopGain;
  }

  public ABMessagegrddinCustomParameters stopGainGlobalFinance(BigDecimal stopGainGlobalFinance) {
    this.stopGainGlobalFinance = stopGainGlobalFinance;
    return this;
  }

  /**
   * Get stopGainGlobalFinance
   * @return stopGainGlobalFinance
  **/
  @ApiModelProperty(example = "1000", value = "")

  @Valid
  public BigDecimal getStopGainGlobalFinance() {
    return stopGainGlobalFinance;
  }

  public void setStopGainGlobalFinance(BigDecimal stopGainGlobalFinance) {
    this.stopGainGlobalFinance = stopGainGlobalFinance;
  }

  public ABMessagegrddinCustomParameters useStopGainGlobalFinance(BoolFieldYT useStopGainGlobalFinance) {
    this.useStopGainGlobalFinance = useStopGainGlobalFinance;
    return this;
  }

  /**
   * Get useStopGainGlobalFinance
   * @return useStopGainGlobalFinance
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getUseStopGainGlobalFinance() {
    return useStopGainGlobalFinance;
  }

  public void setUseStopGainGlobalFinance(BoolFieldYT useStopGainGlobalFinance) {
    this.useStopGainGlobalFinance = useStopGainGlobalFinance;
  }

  public ABMessagegrddinCustomParameters sendStopLossOnEnd(BoolFieldYT sendStopLossOnEnd) {
    this.sendStopLossOnEnd = sendStopLossOnEnd;
    return this;
  }

  /**
   * Get sendStopLossOnEnd
   * @return sendStopLossOnEnd
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getSendStopLossOnEnd() {
    return sendStopLossOnEnd;
  }

  public void setSendStopLossOnEnd(BoolFieldYT sendStopLossOnEnd) {
    this.sendStopLossOnEnd = sendStopLossOnEnd;
  }

  public ABMessagegrddinCustomParameters useRetroaliment(BoolFieldYT useRetroaliment) {
    this.useRetroaliment = useRetroaliment;
    return this;
  }

  /**
   * Get useRetroaliment
   * @return useRetroaliment
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getUseRetroaliment() {
    return useRetroaliment;
  }

  public void setUseRetroaliment(BoolFieldYT useRetroaliment) {
    this.useRetroaliment = useRetroaliment;
  }

  public ABMessagegrddinCustomParameters retroalimentType(BigDecimal retroalimentType) {
    this.retroalimentType = retroalimentType;
    return this;
  }

  /**
   * Get retroalimentType
   * @return retroalimentType
  **/
  @ApiModelProperty(example = "5", value = "")

  @Valid
  public BigDecimal getRetroalimentType() {
    return retroalimentType;
  }

  public void setRetroalimentType(BigDecimal retroalimentType) {
    this.retroalimentType = retroalimentType;
  }

  public ABMessagegrddinCustomParameters retroalimentTimeWindow(BigDecimal retroalimentTimeWindow) {
    this.retroalimentTimeWindow = retroalimentTimeWindow;
    return this;
  }

  /**
   * Get retroalimentTimeWindow
   * @return retroalimentTimeWindow
  **/
  @ApiModelProperty(example = "60", value = "")

  @Valid
  public BigDecimal getRetroalimentTimeWindow() {
    return retroalimentTimeWindow;
  }

  public void setRetroalimentTimeWindow(BigDecimal retroalimentTimeWindow) {
    this.retroalimentTimeWindow = retroalimentTimeWindow;
  }

  public ABMessagegrddinCustomParameters maximumZeroTimeWindow(BigDecimal maximumZeroTimeWindow) {
    this.maximumZeroTimeWindow = maximumZeroTimeWindow;
    return this;
  }

  /**
   * Get maximumZeroTimeWindow
   * @return maximumZeroTimeWindow
  **/
  @ApiModelProperty(example = "10", value = "")

  @Valid
  public BigDecimal getMaximumZeroTimeWindow() {
    return maximumZeroTimeWindow;
  }

  public void setMaximumZeroTimeWindow(BigDecimal maximumZeroTimeWindow) {
    this.maximumZeroTimeWindow = maximumZeroTimeWindow;
  }

  public ABMessagegrddinCustomParameters retroalimentParam1(BigDecimal retroalimentParam1) {
    this.retroalimentParam1 = retroalimentParam1;
    return this;
  }

  /**
   * Get retroalimentParam1
   * @return retroalimentParam1
  **/
  @ApiModelProperty(example = "1", value = "")

  @Valid
  public BigDecimal getRetroalimentParam1() {
    return retroalimentParam1;
  }

  public void setRetroalimentParam1(BigDecimal retroalimentParam1) {
    this.retroalimentParam1 = retroalimentParam1;
  }

  public ABMessagegrddinCustomParameters numberOfMinPriceIncrementsToStart(BigDecimal numberOfMinPriceIncrementsToStart) {
    this.numberOfMinPriceIncrementsToStart = numberOfMinPriceIncrementsToStart;
    return this;
  }

  /**
   * Get numberOfMinPriceIncrementsToStart
   * @return numberOfMinPriceIncrementsToStart
  **/
  @ApiModelProperty(example = "10", value = "")

  @Valid
  public BigDecimal getNumberOfMinPriceIncrementsToStart() {
    return numberOfMinPriceIncrementsToStart;
  }

  public void setNumberOfMinPriceIncrementsToStart(BigDecimal numberOfMinPriceIncrementsToStart) {
    this.numberOfMinPriceIncrementsToStart = numberOfMinPriceIncrementsToStart;
  }

  public ABMessagegrddinCustomParameters incrementPriceStepEntrance(BigDecimal incrementPriceStepEntrance) {
    this.incrementPriceStepEntrance = incrementPriceStepEntrance;
    return this;
  }

  /**
   * Get incrementPriceStepEntrance
   * @return incrementPriceStepEntrance
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getIncrementPriceStepEntrance() {
    return incrementPriceStepEntrance;
  }

  public void setIncrementPriceStepEntrance(BigDecimal incrementPriceStepEntrance) {
    this.incrementPriceStepEntrance = incrementPriceStepEntrance;
  }

  public ABMessagegrddinCustomParameters orderQuantity(BigDecimal orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

  /**
   * Get orderQuantity
   * @return orderQuantity
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getOrderQuantity() {
    return orderQuantity;
  }

  public void setOrderQuantity(BigDecimal orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  public ABMessagegrddinCustomParameters usePreservation(BoolFieldYT usePreservation) {
    this.usePreservation = usePreservation;
    return this;
  }

  /**
   * Get usePreservation
   * @return usePreservation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getUsePreservation() {
    return usePreservation;
  }

  public void setUsePreservation(BoolFieldYT usePreservation) {
    this.usePreservation = usePreservation;
  }

  public ABMessagegrddinCustomParameters preservationStartTrigger(BigDecimal preservationStartTrigger) {
    this.preservationStartTrigger = preservationStartTrigger;
    return this;
  }

  /**
   * Get preservationStartTrigger
   * @return preservationStartTrigger
  **/
  @ApiModelProperty(example = "10", value = "")

  @Valid
  public BigDecimal getPreservationStartTrigger() {
    return preservationStartTrigger;
  }

  public void setPreservationStartTrigger(BigDecimal preservationStartTrigger) {
    this.preservationStartTrigger = preservationStartTrigger;
  }

  public ABMessagegrddinCustomParameters preservationPercentual(BigDecimal preservationPercentual) {
    this.preservationPercentual = preservationPercentual;
    return this;
  }

  /**
   * Get preservationPercentual
   * @return preservationPercentual
  **/
  @ApiModelProperty(example = "20", value = "")

  @Valid
  public BigDecimal getPreservationPercentual() {
    return preservationPercentual;
  }

  public void setPreservationPercentual(BigDecimal preservationPercentual) {
    this.preservationPercentual = preservationPercentual;
  }

  public ABMessagegrddinCustomParameters preservationStep(BigDecimal preservationStep) {
    this.preservationStep = preservationStep;
    return this;
  }

  /**
   * Get preservationStep
   * @return preservationStep
  **/
  @ApiModelProperty(example = "20", value = "")

  @Valid
  public BigDecimal getPreservationStep() {
    return preservationStep;
  }

  public void setPreservationStep(BigDecimal preservationStep) {
    this.preservationStep = preservationStep;
  }

  public ABMessagegrddinCustomParameters zerarStopLoss(BoolFieldYT zerarStopLoss) {
    this.zerarStopLoss = zerarStopLoss;
    return this;
  }

  /**
   * Get zerarStopLoss
   * @return zerarStopLoss
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getZerarStopLoss() {
    return zerarStopLoss;
  }

  public void setZerarStopLoss(BoolFieldYT zerarStopLoss) {
    this.zerarStopLoss = zerarStopLoss;
  }

  public ABMessagegrddinCustomParameters useSecurityStop(BoolFieldYT useSecurityStop) {
    this.useSecurityStop = useSecurityStop;
    return this;
  }

  /**
   * Get useSecurityStop
   * @return useSecurityStop
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getUseSecurityStop() {
    return useSecurityStop;
  }

  public void setUseSecurityStop(BoolFieldYT useSecurityStop) {
    this.useSecurityStop = useSecurityStop;
  }

  public ABMessagegrddinCustomParameters initSuspended(BoolFieldNT initSuspended) {
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
    ABMessagegrddinCustomParameters abMessagegrddinCustomParameters = (ABMessagegrddinCustomParameters) o;
    return Objects.equals(this.entrancePrice, abMessagegrddinCustomParameters.entrancePrice) &&
        Objects.equals(this.numberOfEntrances, abMessagegrddinCustomParameters.numberOfEntrances) &&
        Objects.equals(this.stopLossFinance, abMessagegrddinCustomParameters.stopLossFinance) &&
        Objects.equals(this.incrementPriceStopGain, abMessagegrddinCustomParameters.incrementPriceStopGain) &&
        Objects.equals(this.stopGainGlobalFinance, abMessagegrddinCustomParameters.stopGainGlobalFinance) &&
        Objects.equals(this.useStopGainGlobalFinance, abMessagegrddinCustomParameters.useStopGainGlobalFinance) &&
        Objects.equals(this.sendStopLossOnEnd, abMessagegrddinCustomParameters.sendStopLossOnEnd) &&
        Objects.equals(this.useRetroaliment, abMessagegrddinCustomParameters.useRetroaliment) &&
        Objects.equals(this.retroalimentType, abMessagegrddinCustomParameters.retroalimentType) &&
        Objects.equals(this.retroalimentTimeWindow, abMessagegrddinCustomParameters.retroalimentTimeWindow) &&
        Objects.equals(this.maximumZeroTimeWindow, abMessagegrddinCustomParameters.maximumZeroTimeWindow) &&
        Objects.equals(this.retroalimentParam1, abMessagegrddinCustomParameters.retroalimentParam1) &&
        Objects.equals(this.numberOfMinPriceIncrementsToStart, abMessagegrddinCustomParameters.numberOfMinPriceIncrementsToStart) &&
        Objects.equals(this.incrementPriceStepEntrance, abMessagegrddinCustomParameters.incrementPriceStepEntrance) &&
        Objects.equals(this.orderQuantity, abMessagegrddinCustomParameters.orderQuantity) &&
        Objects.equals(this.usePreservation, abMessagegrddinCustomParameters.usePreservation) &&
        Objects.equals(this.preservationStartTrigger, abMessagegrddinCustomParameters.preservationStartTrigger) &&
        Objects.equals(this.preservationPercentual, abMessagegrddinCustomParameters.preservationPercentual) &&
        Objects.equals(this.preservationStep, abMessagegrddinCustomParameters.preservationStep) &&
        Objects.equals(this.zerarStopLoss, abMessagegrddinCustomParameters.zerarStopLoss) &&
        Objects.equals(this.useSecurityStop, abMessagegrddinCustomParameters.useSecurityStop) &&
        Objects.equals(this.initSuspended, abMessagegrddinCustomParameters.initSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrancePrice, numberOfEntrances, stopLossFinance, incrementPriceStopGain, stopGainGlobalFinance, useStopGainGlobalFinance, sendStopLossOnEnd, useRetroaliment, retroalimentType, retroalimentTimeWindow, maximumZeroTimeWindow, retroalimentParam1, numberOfMinPriceIncrementsToStart, incrementPriceStepEntrance, orderQuantity, usePreservation, preservationStartTrigger, preservationPercentual, preservationStep, zerarStopLoss, useSecurityStop, initSuspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagegrddinCustomParameters {\n");
    
    sb.append("    entrancePrice: ").append(toIndentedString(entrancePrice)).append("\n");
    sb.append("    numberOfEntrances: ").append(toIndentedString(numberOfEntrances)).append("\n");
    sb.append("    stopLossFinance: ").append(toIndentedString(stopLossFinance)).append("\n");
    sb.append("    incrementPriceStopGain: ").append(toIndentedString(incrementPriceStopGain)).append("\n");
    sb.append("    stopGainGlobalFinance: ").append(toIndentedString(stopGainGlobalFinance)).append("\n");
    sb.append("    useStopGainGlobalFinance: ").append(toIndentedString(useStopGainGlobalFinance)).append("\n");
    sb.append("    sendStopLossOnEnd: ").append(toIndentedString(sendStopLossOnEnd)).append("\n");
    sb.append("    useRetroaliment: ").append(toIndentedString(useRetroaliment)).append("\n");
    sb.append("    retroalimentType: ").append(toIndentedString(retroalimentType)).append("\n");
    sb.append("    retroalimentTimeWindow: ").append(toIndentedString(retroalimentTimeWindow)).append("\n");
    sb.append("    maximumZeroTimeWindow: ").append(toIndentedString(maximumZeroTimeWindow)).append("\n");
    sb.append("    retroalimentParam1: ").append(toIndentedString(retroalimentParam1)).append("\n");
    sb.append("    numberOfMinPriceIncrementsToStart: ").append(toIndentedString(numberOfMinPriceIncrementsToStart)).append("\n");
    sb.append("    incrementPriceStepEntrance: ").append(toIndentedString(incrementPriceStepEntrance)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    usePreservation: ").append(toIndentedString(usePreservation)).append("\n");
    sb.append("    preservationStartTrigger: ").append(toIndentedString(preservationStartTrigger)).append("\n");
    sb.append("    preservationPercentual: ").append(toIndentedString(preservationPercentual)).append("\n");
    sb.append("    preservationStep: ").append(toIndentedString(preservationStep)).append("\n");
    sb.append("    zerarStopLoss: ").append(toIndentedString(zerarStopLoss)).append("\n");
    sb.append("    useSecurityStop: ").append(toIndentedString(useSecurityStop)).append("\n");
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
