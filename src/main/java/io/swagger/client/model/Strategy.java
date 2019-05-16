package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Strategy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class Strategy   {
  @JsonProperty("ClOrdID")
  private UUID clOrdID = null;

  @JsonProperty("StrategyID")
  private UUID strategyID = null;

  @JsonProperty("Sponsor")
  private String sponsor = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Accounts")
  @Valid
  private List<String> accounts = null;

  @JsonProperty("Legs")
  @Valid
  private List<Leg> legs = null;

  @JsonProperty("CreateDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("TargetStrategy")
  private Integer targetStrategy = null;

  @JsonProperty("StrategyCode")
  private StrategyCodeT strategyCode = null;

  @JsonProperty("UserName")
  private String userName = null;

  @JsonProperty("ServiceGroup")
  private String serviceGroup = null;

  @JsonProperty("Status")
  private Integer status = null;

  @JsonProperty("LegDesc")
  private String legDesc = null;

  @JsonProperty("CustomParameters")
  private Object customParameters = null;

  public Strategy clOrdID(UUID clOrdID) {
    this.clOrdID = clOrdID;
    return this;
  }

  /**
   * Get clOrdID
   * @return clOrdID
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public UUID getClOrdID() {
    return clOrdID;
  }

  public void setClOrdID(UUID clOrdID) {
    this.clOrdID = clOrdID;
  }

  public Strategy strategyID(UUID strategyID) {
    this.strategyID = strategyID;
    return this;
  }

  /**
   * Get strategyID
   * @return strategyID
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public UUID getStrategyID() {
    return strategyID;
  }

  public void setStrategyID(UUID strategyID) {
    this.strategyID = strategyID;
  }

  public Strategy sponsor(String sponsor) {
    this.sponsor = sponsor;
    return this;
  }

  /**
   * Get sponsor
   * @return sponsor
  **/
  @ApiModelProperty(example = "flx", value = "")

  public String getSponsor() {
    return sponsor;
  }

  public void setSponsor(String sponsor) {
    this.sponsor = sponsor;
  }

  public Strategy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Estrategia tendencia PETR4", value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Strategy accounts(List<String> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Strategy addAccountsItem(String accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<String>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(example = "[\"88003BVSP\",\"88004BVSP\"]", value = "")

  public List<String> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<String> accounts) {
    this.accounts = accounts;
  }

  public Strategy legs(List<Leg> legs) {
    this.legs = legs;
    return this;
  }

  public Strategy addLegsItem(Leg legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<Leg>();
    }
    this.legs.add(legsItem);
    return this;
  }

  /**
   * Get legs
   * @return legs
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Leg> getLegs() {
    return legs;
  }

  public void setLegs(List<Leg> legs) {
    this.legs = legs;
  }

  public Strategy createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public Strategy targetStrategy(Integer targetStrategy) {
    this.targetStrategy = targetStrategy;
    return this;
  }

  /**
   * Get targetStrategy
   * @return targetStrategy
  **/
  @ApiModelProperty(example = "1032", value = "")

  public Integer getTargetStrategy() {
    return targetStrategy;
  }

  public void setTargetStrategy(Integer targetStrategy) {
    this.targetStrategy = targetStrategy;
  }

  public Strategy strategyCode(StrategyCodeT strategyCode) {
    this.strategyCode = strategyCode;
    return this;
  }

  /**
   * Get strategyCode
   * @return strategyCode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public StrategyCodeT getStrategyCode() {
    return strategyCode;
  }

  public void setStrategyCode(StrategyCodeT strategyCode) {
    this.strategyCode = strategyCode;
  }

  public Strategy userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "flx_user01", value = "")

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Strategy serviceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
    return this;
  }

  /**
   * Get serviceGroup
   * @return serviceGroup
  **/
  @ApiModelProperty(example = "default", value = "")

  public String getServiceGroup() {
    return serviceGroup;
  }

  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

  public Strategy status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "7", value = "")

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Strategy legDesc(String legDesc) {
    this.legDesc = legDesc;
    return this;
  }

  /**
   * Get legDesc
   * @return legDesc
  **/
  @ApiModelProperty(example = "V 100 PETR4 C 100 VALE3", value = "")

  public String getLegDesc() {
    return legDesc;
  }

  public void setLegDesc(String legDesc) {
    this.legDesc = legDesc;
  }

  public Strategy customParameters(Object customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  **/
  @ApiModelProperty(example = "{\"value\":\"22\",\"EntrancePrice\":\"8.56\",\"IncrementPriceStepEntrance\":\"5\",\"IncrementPriceStopGain\":\"10\",\"InitSuspended\":\"N\",\"MaximumZeroTimeWindow\":\"10\",\"NumberOfEntrances\":\"5\",\"NumberOfMinPriceIncrementsToStart\":\"5\",\"OrderQuantity\":\"10\",\"PreservationPercentual\":\"45\",\"PreservationStartTrigger\":\"30\",\"PreservationStep\":\"35\",\"RetroalimentParam1\":\"5\",\"RetroalimentTimeWindow\":\"15\",\"RetroalimentType\":\"1\",\"SendStopLossOnEnd\":\"Y\",\"StopGainGlobalFinance\":\"5000\",\"StopLossFinance\":\"1000\",\"UsePreservation\":\"Y\",\"UseRetroaliment\":\"Y\",\"UseSecurityStop\":\"value\",\"UseStopGainGlobalFinance\":\"Y\",\"ZerarStopLoss\":\"Y\"}", value = "")

  public Object getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(Object customParameters) {
    this.customParameters = customParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Strategy strategy = (Strategy) o;
    return Objects.equals(this.clOrdID, strategy.clOrdID) &&
        Objects.equals(this.strategyID, strategy.strategyID) &&
        Objects.equals(this.sponsor, strategy.sponsor) &&
        Objects.equals(this.name, strategy.name) &&
        Objects.equals(this.accounts, strategy.accounts) &&
        Objects.equals(this.legs, strategy.legs) &&
        Objects.equals(this.createDate, strategy.createDate) &&
        Objects.equals(this.targetStrategy, strategy.targetStrategy) &&
        Objects.equals(this.strategyCode, strategy.strategyCode) &&
        Objects.equals(this.userName, strategy.userName) &&
        Objects.equals(this.serviceGroup, strategy.serviceGroup) &&
        Objects.equals(this.status, strategy.status) &&
        Objects.equals(this.legDesc, strategy.legDesc) &&
        Objects.equals(this.customParameters, strategy.customParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clOrdID, strategyID, sponsor, name, accounts, legs, createDate, targetStrategy, strategyCode, userName, serviceGroup, status, legDesc, customParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Strategy {\n");
    
    sb.append("    clOrdID: ").append(toIndentedString(clOrdID)).append("\n");
    sb.append("    strategyID: ").append(toIndentedString(strategyID)).append("\n");
    sb.append("    sponsor: ").append(toIndentedString(sponsor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    targetStrategy: ").append(toIndentedString(targetStrategy)).append("\n");
    sb.append("    strategyCode: ").append(toIndentedString(strategyCode)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    legDesc: ").append(toIndentedString(legDesc)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
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
