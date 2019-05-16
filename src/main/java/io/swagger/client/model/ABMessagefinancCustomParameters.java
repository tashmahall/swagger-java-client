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
 * ABMessagefinancCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagefinancCustomParameters   {
  @JsonProperty("TriggerValue")
  private BigDecimal triggerValue = null;

  /**
   * Type of trigger.  * 16=taxa de financiamento 
   */
  public enum TriggerEnum {
    _16(new BigDecimal("16"));

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

  @JsonProperty("InitSuspended")
  private BoolFieldNT initSuspended = null;

  public ABMessagefinancCustomParameters triggerValue(BigDecimal triggerValue) {
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

  public ABMessagefinancCustomParameters trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Type of trigger.  * 16=taxa de financiamento 
   * @return trigger
  **/
  @ApiModelProperty(value = "Type of trigger.  * 16=taxa de financiamento ")

  @Valid
  public TriggerEnum getTrigger() {
    return trigger;
  }

  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  public ABMessagefinancCustomParameters bookDepth(Integer bookDepth) {
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

  public ABMessagefinancCustomParameters compensateExec(CompensateExecEnum compensateExec) {
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

  public ABMessagefinancCustomParameters initSuspended(BoolFieldNT initSuspended) {
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
    ABMessagefinancCustomParameters abMessagefinancCustomParameters = (ABMessagefinancCustomParameters) o;
    return Objects.equals(this.triggerValue, abMessagefinancCustomParameters.triggerValue) &&
        Objects.equals(this.trigger, abMessagefinancCustomParameters.trigger) &&
        Objects.equals(this.bookDepth, abMessagefinancCustomParameters.bookDepth) &&
        Objects.equals(this.compensateExec, abMessagefinancCustomParameters.compensateExec) &&
        Objects.equals(this.initSuspended, abMessagefinancCustomParameters.initSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerValue, trigger, bookDepth, compensateExec, initSuspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagefinancCustomParameters {\n");
    
    sb.append("    triggerValue: ").append(toIndentedString(triggerValue)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    bookDepth: ").append(toIndentedString(bookDepth)).append("\n");
    sb.append("    compensateExec: ").append(toIndentedString(compensateExec)).append("\n");
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
