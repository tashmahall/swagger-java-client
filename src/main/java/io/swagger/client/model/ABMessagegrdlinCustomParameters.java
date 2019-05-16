package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagegrdlinCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagegrdlinCustomParameters   {
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

  public ABMessagegrdlinCustomParameters entrancePrice(BigDecimal entrancePrice) {
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

  public ABMessagegrdlinCustomParameters numberOfEntrances(BigDecimal numberOfEntrances) {
    this.numberOfEntrances = numberOfEntrances;
    return this;
  }

  /**
   * Get numberOfEntrances
   * @return numberOfEntrances
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getNumberOfEntrances() {
    return numberOfEntrances;
  }

  public void setNumberOfEntrances(BigDecimal numberOfEntrances) {
    this.numberOfEntrances = numberOfEntrances;
  }

  public ABMessagegrdlinCustomParameters stopLossFinance(BigDecimal stopLossFinance) {
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

  public ABMessagegrdlinCustomParameters incrementPriceStopGain(BigDecimal incrementPriceStopGain) {
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

  public ABMessagegrdlinCustomParameters stopGainGlobalFinance(BigDecimal stopGainGlobalFinance) {
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

  public ABMessagegrdlinCustomParameters useStopGainGlobalFinance(BoolFieldYT useStopGainGlobalFinance) {
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

  public ABMessagegrdlinCustomParameters sendStopLossOnEnd(BoolFieldYT sendStopLossOnEnd) {
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

  public ABMessagegrdlinCustomParameters numberOfMinPriceIncrementsToStart(BigDecimal numberOfMinPriceIncrementsToStart) {
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

  public ABMessagegrdlinCustomParameters incrementPriceStepEntrance(BigDecimal incrementPriceStepEntrance) {
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

  public ABMessagegrdlinCustomParameters orderQuantity(BigDecimal orderQuantity) {
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

  public ABMessagegrdlinCustomParameters usePreservation(BoolFieldYT usePreservation) {
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

  public ABMessagegrdlinCustomParameters preservationStartTrigger(BigDecimal preservationStartTrigger) {
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

  public ABMessagegrdlinCustomParameters preservationPercentual(BigDecimal preservationPercentual) {
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

  public ABMessagegrdlinCustomParameters preservationStep(BigDecimal preservationStep) {
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

  public ABMessagegrdlinCustomParameters zerarStopLoss(BoolFieldYT zerarStopLoss) {
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

  public ABMessagegrdlinCustomParameters useSecurityStop(BoolFieldYT useSecurityStop) {
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

  public ABMessagegrdlinCustomParameters initSuspended(BoolFieldNT initSuspended) {
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
    ABMessagegrdlinCustomParameters abMessagegrdlinCustomParameters = (ABMessagegrdlinCustomParameters) o;
    return Objects.equals(this.entrancePrice, abMessagegrdlinCustomParameters.entrancePrice) &&
        Objects.equals(this.numberOfEntrances, abMessagegrdlinCustomParameters.numberOfEntrances) &&
        Objects.equals(this.stopLossFinance, abMessagegrdlinCustomParameters.stopLossFinance) &&
        Objects.equals(this.incrementPriceStopGain, abMessagegrdlinCustomParameters.incrementPriceStopGain) &&
        Objects.equals(this.stopGainGlobalFinance, abMessagegrdlinCustomParameters.stopGainGlobalFinance) &&
        Objects.equals(this.useStopGainGlobalFinance, abMessagegrdlinCustomParameters.useStopGainGlobalFinance) &&
        Objects.equals(this.sendStopLossOnEnd, abMessagegrdlinCustomParameters.sendStopLossOnEnd) &&
        Objects.equals(this.numberOfMinPriceIncrementsToStart, abMessagegrdlinCustomParameters.numberOfMinPriceIncrementsToStart) &&
        Objects.equals(this.incrementPriceStepEntrance, abMessagegrdlinCustomParameters.incrementPriceStepEntrance) &&
        Objects.equals(this.orderQuantity, abMessagegrdlinCustomParameters.orderQuantity) &&
        Objects.equals(this.usePreservation, abMessagegrdlinCustomParameters.usePreservation) &&
        Objects.equals(this.preservationStartTrigger, abMessagegrdlinCustomParameters.preservationStartTrigger) &&
        Objects.equals(this.preservationPercentual, abMessagegrdlinCustomParameters.preservationPercentual) &&
        Objects.equals(this.preservationStep, abMessagegrdlinCustomParameters.preservationStep) &&
        Objects.equals(this.zerarStopLoss, abMessagegrdlinCustomParameters.zerarStopLoss) &&
        Objects.equals(this.useSecurityStop, abMessagegrdlinCustomParameters.useSecurityStop) &&
        Objects.equals(this.initSuspended, abMessagegrdlinCustomParameters.initSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrancePrice, numberOfEntrances, stopLossFinance, incrementPriceStopGain, stopGainGlobalFinance, useStopGainGlobalFinance, sendStopLossOnEnd, numberOfMinPriceIncrementsToStart, incrementPriceStepEntrance, orderQuantity, usePreservation, preservationStartTrigger, preservationPercentual, preservationStep, zerarStopLoss, useSecurityStop, initSuspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagegrdlinCustomParameters {\n");
    
    sb.append("    entrancePrice: ").append(toIndentedString(entrancePrice)).append("\n");
    sb.append("    numberOfEntrances: ").append(toIndentedString(numberOfEntrances)).append("\n");
    sb.append("    stopLossFinance: ").append(toIndentedString(stopLossFinance)).append("\n");
    sb.append("    incrementPriceStopGain: ").append(toIndentedString(incrementPriceStopGain)).append("\n");
    sb.append("    stopGainGlobalFinance: ").append(toIndentedString(stopGainGlobalFinance)).append("\n");
    sb.append("    useStopGainGlobalFinance: ").append(toIndentedString(useStopGainGlobalFinance)).append("\n");
    sb.append("    sendStopLossOnEnd: ").append(toIndentedString(sendStopLossOnEnd)).append("\n");
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
