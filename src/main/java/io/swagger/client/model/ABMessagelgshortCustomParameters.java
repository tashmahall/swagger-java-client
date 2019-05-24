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
 * ABMessagelgshortCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagelgshortCustomParameters   {
  @JsonProperty("TriggerValue")
  private BigDecimal triggerValue = null;

  /**
   * Type of trigger.  * 2=ratio,buy/sell,  * 3=ratio sell/buy, * 4=price diff buy/sell, * 5=price diff sell/buy, * 11=financeiro 
   */
  public enum TriggerEnum {
    _2(new Integer("2")),
    
    _3(new Integer("3")),
    
    _4(new Integer("4")),
    
    _5(new Integer("5")),
    
    _11(new Integer("11"));

    private Integer value;

    TriggerEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
    public Integer getValue() {
    	return value;
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
  private Integer trigger = null;

  @JsonProperty("BookDepth")
  private Integer bookDepth = null;

  @JsonProperty("IgnoreOffersLT")
  private Integer ignoreOffersLT = null;
  
  @JsonProperty("ExecutionType")
  private Integer executionType = null;

  /**
   * Type of compensation when unbalanced - 0=No comp, 1=next clip, 2=gradual 
   */
  public enum CompensateExecEnum {
    _0(new Integer("0")),
    
    _1(new Integer("1")),
    
    _2(new Integer("2"));

    private Integer value;

    CompensateExecEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
    public Integer getValue() {
    	return value;
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
  private Integer compensateExec = null;

  @JsonProperty("InitSuspended")
  private BoolFieldNT initSuspended = null;

  public ABMessagelgshortCustomParameters triggerValue(BigDecimal triggerValue) {
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

  public ABMessagelgshortCustomParameters trigger(TriggerEnum trigger) {
    this.trigger = trigger.getValue();
    return this;
  }

  /**
   * Type of trigger.  * 2=ratio,buy/sell,  * 3=ratio sell/buy, * 4=price diff buy/sell, * 5=price diff sell/buy, * 11=financeiro 
   * @return trigger
  **/
  @ApiModelProperty(value = "Type of trigger.  * 2=ratio,buy/sell,  * 3=ratio sell/buy, * 4=price diff buy/sell, * 5=price diff sell/buy, * 11=financeiro ")

  @Valid
  public Integer getTrigger() {
    return trigger;
  }

  public void setTrigger(Integer trigger) {
    this.trigger = trigger;
  }

  public ABMessagelgshortCustomParameters bookDepth(Integer bookDepth) {
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

  public ABMessagelgshortCustomParameters ignoreOffersLT(Integer ignoreOffersLT) {
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

  public ABMessagelgshortCustomParameters compensateExec(CompensateExecEnum compensateExec) {
    this.compensateExec = compensateExec.value;
    return this;
  }

  /**
   * Type of compensation when unbalanced - 0=No comp, 1=next clip, 2=gradual 
   * @return compensateExec
  **/
  @ApiModelProperty(example = "2", value = "Type of compensation when unbalanced - 0=No comp, 1=next clip, 2=gradual ")

  @Valid
  public Integer getCompensateExec() {
    return compensateExec;
  }

  public void setCompensateExec(Integer compensateExec) {
    this.compensateExec = compensateExec;
  }

  public ABMessagelgshortCustomParameters initSuspended(BoolFieldNT initSuspended) {
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
    ABMessagelgshortCustomParameters abMessagelgshortCustomParameters = (ABMessagelgshortCustomParameters) o;
    return Objects.equals(this.triggerValue, abMessagelgshortCustomParameters.triggerValue) &&
        Objects.equals(this.trigger, abMessagelgshortCustomParameters.trigger) &&
        Objects.equals(this.bookDepth, abMessagelgshortCustomParameters.bookDepth) &&
        Objects.equals(this.ignoreOffersLT, abMessagelgshortCustomParameters.ignoreOffersLT) &&
        Objects.equals(this.compensateExec, abMessagelgshortCustomParameters.compensateExec) &&
        Objects.equals(this.initSuspended, abMessagelgshortCustomParameters.initSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerValue, trigger, bookDepth, ignoreOffersLT, compensateExec, initSuspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagelgshortCustomParameters {\n");
    
    sb.append("    triggerValue: ").append(toIndentedString(triggerValue)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    bookDepth: ").append(toIndentedString(bookDepth)).append("\n");
    sb.append("    ignoreOffersLT: ").append(toIndentedString(ignoreOffersLT)).append("\n");
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

public Integer getExecutionType() {
	return executionType;
}

public void setExecutionType(Integer executionType) {
	this.executionType = executionType;
}
  
}
