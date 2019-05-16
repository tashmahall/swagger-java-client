package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ABMessagefxorderCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagefxorderCustomParameters   {
  @JsonProperty("TriggerShot")
  private BigDecimal triggerShot = null;

  @JsonProperty("TriggerShot2")
  private BigDecimal triggerShot2 = null;

  @JsonProperty("TriggerLimit2")
  private BigDecimal triggerLimit2 = null;

  /**
   * Gets or Sets lossType
   */
  public enum LossTypeEnum {
    _1(new BigDecimal("1")),
    
    _2(new BigDecimal("2"));

    private BigDecimal value;

    LossTypeEnum(BigDecimal value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LossTypeEnum fromValue(String text) {
      for (LossTypeEnum b : LossTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("LossType")
  private LossTypeEnum lossType = null;

  @JsonProperty("TargetGain")
  private BoolFieldYT targetGain = null;

  @JsonProperty("TargetLoss")
  private BoolFieldYT targetLoss = null;

  @JsonProperty("CloseOnAuction")
  private BoolFieldYT closeOnAuction = null;

  /**
   * * 1 = Price * 2 = Percent 
   */
  public enum TriggerEntryTypeEnum {
    _1(new BigDecimal("1")),
    
    _2(new BigDecimal("2"));

    private BigDecimal value;

    TriggerEntryTypeEnum(BigDecimal value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TriggerEntryTypeEnum fromValue(String text) {
      for (TriggerEntryTypeEnum b : TriggerEntryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("TriggerEntryType")
  private TriggerEntryTypeEnum triggerEntryType = null;

  @JsonProperty("RefPrice")
  private BigDecimal refPrice = null;

  @JsonProperty("PriceLimit")
  private BigDecimal priceLimit = null;

  public ABMessagefxorderCustomParameters triggerShot(BigDecimal triggerShot) {
    this.triggerShot = triggerShot;
    return this;
  }

  /**
   * Get triggerShot
   * @return triggerShot
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getTriggerShot() {
    return triggerShot;
  }

  public void setTriggerShot(BigDecimal triggerShot) {
    this.triggerShot = triggerShot;
  }

  public ABMessagefxorderCustomParameters triggerShot2(BigDecimal triggerShot2) {
    this.triggerShot2 = triggerShot2;
    return this;
  }

  /**
   * Get triggerShot2
   * @return triggerShot2
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getTriggerShot2() {
    return triggerShot2;
  }

  public void setTriggerShot2(BigDecimal triggerShot2) {
    this.triggerShot2 = triggerShot2;
  }

  public ABMessagefxorderCustomParameters triggerLimit2(BigDecimal triggerLimit2) {
    this.triggerLimit2 = triggerLimit2;
    return this;
  }

  /**
   * Get triggerLimit2
   * @return triggerLimit2
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getTriggerLimit2() {
    return triggerLimit2;
  }

  public void setTriggerLimit2(BigDecimal triggerLimit2) {
    this.triggerLimit2 = triggerLimit2;
  }

  public ABMessagefxorderCustomParameters lossType(LossTypeEnum lossType) {
    this.lossType = lossType;
    return this;
  }

  /**
   * Get lossType
   * @return lossType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LossTypeEnum getLossType() {
    return lossType;
  }

  public void setLossType(LossTypeEnum lossType) {
    this.lossType = lossType;
  }

  public ABMessagefxorderCustomParameters targetGain(BoolFieldYT targetGain) {
    this.targetGain = targetGain;
    return this;
  }

  /**
   * Get targetGain
   * @return targetGain
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getTargetGain() {
    return targetGain;
  }

  public void setTargetGain(BoolFieldYT targetGain) {
    this.targetGain = targetGain;
  }

  public ABMessagefxorderCustomParameters targetLoss(BoolFieldYT targetLoss) {
    this.targetLoss = targetLoss;
    return this;
  }

  /**
   * Get targetLoss
   * @return targetLoss
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getTargetLoss() {
    return targetLoss;
  }

  public void setTargetLoss(BoolFieldYT targetLoss) {
    this.targetLoss = targetLoss;
  }

  public ABMessagefxorderCustomParameters closeOnAuction(BoolFieldYT closeOnAuction) {
    this.closeOnAuction = closeOnAuction;
    return this;
  }

  /**
   * Get closeOnAuction
   * @return closeOnAuction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BoolFieldYT getCloseOnAuction() {
    return closeOnAuction;
  }

  public void setCloseOnAuction(BoolFieldYT closeOnAuction) {
    this.closeOnAuction = closeOnAuction;
  }

  public ABMessagefxorderCustomParameters triggerEntryType(TriggerEntryTypeEnum triggerEntryType) {
    this.triggerEntryType = triggerEntryType;
    return this;
  }

  /**
   * * 1 = Price * 2 = Percent 
   * @return triggerEntryType
  **/
  @ApiModelProperty(value = "* 1 = Price * 2 = Percent ")

  @Valid
  public TriggerEntryTypeEnum getTriggerEntryType() {
    return triggerEntryType;
  }

  public void setTriggerEntryType(TriggerEntryTypeEnum triggerEntryType) {
    this.triggerEntryType = triggerEntryType;
  }

  public ABMessagefxorderCustomParameters refPrice(BigDecimal refPrice) {
    this.refPrice = refPrice;
    return this;
  }

  /**
   * Get refPrice
   * @return refPrice
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getRefPrice() {
    return refPrice;
  }

  public void setRefPrice(BigDecimal refPrice) {
    this.refPrice = refPrice;
  }

  public ABMessagefxorderCustomParameters priceLimit(BigDecimal priceLimit) {
    this.priceLimit = priceLimit;
    return this;
  }

  /**
   * Get priceLimit
   * @return priceLimit
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getPriceLimit() {
    return priceLimit;
  }

  public void setPriceLimit(BigDecimal priceLimit) {
    this.priceLimit = priceLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagefxorderCustomParameters abMessagefxorderCustomParameters = (ABMessagefxorderCustomParameters) o;
    return Objects.equals(this.triggerShot, abMessagefxorderCustomParameters.triggerShot) &&
        Objects.equals(this.triggerShot2, abMessagefxorderCustomParameters.triggerShot2) &&
        Objects.equals(this.triggerLimit2, abMessagefxorderCustomParameters.triggerLimit2) &&
        Objects.equals(this.lossType, abMessagefxorderCustomParameters.lossType) &&
        Objects.equals(this.targetGain, abMessagefxorderCustomParameters.targetGain) &&
        Objects.equals(this.targetLoss, abMessagefxorderCustomParameters.targetLoss) &&
        Objects.equals(this.closeOnAuction, abMessagefxorderCustomParameters.closeOnAuction) &&
        Objects.equals(this.triggerEntryType, abMessagefxorderCustomParameters.triggerEntryType) &&
        Objects.equals(this.refPrice, abMessagefxorderCustomParameters.refPrice) &&
        Objects.equals(this.priceLimit, abMessagefxorderCustomParameters.priceLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerShot, triggerShot2, triggerLimit2, lossType, targetGain, targetLoss, closeOnAuction, triggerEntryType, refPrice, priceLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagefxorderCustomParameters {\n");
    
    sb.append("    triggerShot: ").append(toIndentedString(triggerShot)).append("\n");
    sb.append("    triggerShot2: ").append(toIndentedString(triggerShot2)).append("\n");
    sb.append("    triggerLimit2: ").append(toIndentedString(triggerLimit2)).append("\n");
    sb.append("    lossType: ").append(toIndentedString(lossType)).append("\n");
    sb.append("    targetGain: ").append(toIndentedString(targetGain)).append("\n");
    sb.append("    targetLoss: ").append(toIndentedString(targetLoss)).append("\n");
    sb.append("    closeOnAuction: ").append(toIndentedString(closeOnAuction)).append("\n");
    sb.append("    triggerEntryType: ").append(toIndentedString(triggerEntryType)).append("\n");
    sb.append("    refPrice: ").append(toIndentedString(refPrice)).append("\n");
    sb.append("    priceLimit: ").append(toIndentedString(priceLimit)).append("\n");
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
