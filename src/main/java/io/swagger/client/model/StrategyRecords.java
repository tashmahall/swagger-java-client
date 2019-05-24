package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StrategyRecords
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class StrategyRecords   {
  @JsonProperty("records")
  @Valid
  private List<Strategy> records = null;

  
  
  
	@JsonProperty("ClOrdID")
	private UUID clOrdID = null;

	@JsonProperty("StrategyID")
	private UUID strategyID = null;

	@JsonProperty("StrategyId")
	private String strategyId = null;
	
	@JsonProperty("Sponsor")
	private String sponsor = null;

	@JsonProperty("Name")
	private String name = null;

	@JsonProperty("Accounts2")
	@Valid
	private List<String> accounts2 = null;

	@JsonProperty("Legs")
	@Valid
	private List<Leg> legs = null;

	@JsonProperty("CreateDate")
	private String createDate = null;

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

	@JsonProperty("LegsDesc")
	private String legsDesc = null;

	@JsonProperty("CustomParameters")
	private Object customParameters = null;

//Daqui

	@JsonProperty("Accounts")
	private String accounts = null;

	@JsonProperty("OrdStatus")
	private String ordStatus = null;

	@JsonProperty("InitTime")
	private String initTime = null;

	@JsonProperty("Host")
	private String host = null;

	@JsonProperty("CustomMetrics")
	private String customMetrics = null;

	@JsonProperty("TimeStamp")
	private String timeStamp = null;

	@JsonProperty("Text")
	private String text = null;

	@JsonProperty("StatusDate")
	private String statusDate = null;

	@JsonProperty("Pid")
	private Integer pid = null;

	@JsonProperty("TargetDesc")
	private String targetDesc = null;

	@JsonProperty("ServiceClass")
	private String serviceClass = null;

	@JsonProperty("UserIp")
	private String userIp = null;

	@JsonProperty("EndTime")
	private String endTime = null;
  
	@JsonProperty("ExecutedQtty")
	private Integer executedQtty= null; 
	
	@JsonProperty("CumQttyPerc")
	private BigDecimal cumQttyPerc = null;
  
	@JsonProperty("AvgPrice")
	private BigDecimal avgPrice = null;
	
	@JsonProperty("SentOrders")
	private Integer sentOrders = null;
	
	@JsonProperty("TargetQtty")
	private Integer targetQtty = null;
	
	@JsonProperty("ExecutedOrders")
	private Integer executedOrders = null;
	
  public StrategyRecords records(List<Strategy> records) {
    this.records = records;
    return this;
  }

  public StrategyRecords addRecordsItem(Strategy recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Strategy>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Strategy> getRecords() {
    return records;
  }

  public void setSource(List<Strategy> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrategyRecords strategyRecords = (StrategyRecords) o;
    return Objects.equals(this.records, strategyRecords.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrategyRecords {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
public UUID getClOrdID() {
	return clOrdID;
}

public void setClOrdID(UUID clOrdID) {
	this.clOrdID = clOrdID;
}

public UUID getStrategyID() {
	return strategyID;
}

public void setStrategyID(UUID strategyID) {
	this.strategyID = strategyID;
}

public String getSponsor() {
	return sponsor;
}

public void setSponsor(String sponsor) {
	this.sponsor = sponsor;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<String> getAccounts2() {
	return accounts2;
}

public void setAccounts2(List<String> accounts2) {
	this.accounts2 = accounts2;
}

public List<Leg> getLegs() {
	return legs;
}

public void setLegs(List<Leg> legs) {
	this.legs = legs;
}

public String getCreateDate() {
	return createDate;
}

public void setCreateDate(String createDate) {
	this.createDate = createDate;
}

public Integer getTargetStrategy() {
	return targetStrategy;
}

public void setTargetStrategy(Integer targetStrategy) {
	this.targetStrategy = targetStrategy;
}

public StrategyCodeT getStrategyCode() {
	return strategyCode;
}

public void setStrategyCode(StrategyCodeT strategyCode) {
	this.strategyCode = strategyCode;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getServiceGroup() {
	return serviceGroup;
}

public void setServiceGroup(String serviceGroup) {
	this.serviceGroup = serviceGroup;
}

public Integer getStatus() {
	return status;
}

public void setStatus(Integer status) {
	this.status = status;
}

public String getLegsDesc() {
	return legsDesc;
}

public void setLegsDesc(String legsDesc) {
	this.legsDesc = legsDesc;
}

public Object getCustomParameters() {
	return customParameters;
}

public void setCustomParameters(Object customParameters) {
	this.customParameters = customParameters;
}

public String getAccounts() {
	return accounts;
}

public void setAccounts(String accounts) {
	this.accounts = accounts;
}

public String getOrdStatus() {
	return ordStatus;
}

public void setOrdStatus(String ordStatus) {
	this.ordStatus = ordStatus;
}

public String getInitTime() {
	return initTime;
}

public void setInitTime(String initTime) {
	this.initTime = initTime;
}

public String getHost() {
	return host;
}

public void setHost(String host) {
	this.host = host;
}

public String getCustomMetrics() {
	return customMetrics;
}

public void setCustomMetrics(String customMetrics) {
	this.customMetrics = customMetrics;
}

public String getTimeStamp() {
	return timeStamp;
}

public void setTimeStamp(String timeStamp) {
	this.timeStamp = timeStamp;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public String getStatusDate() {
	return statusDate;
}

public void setStatusDate(String statusDate) {
	this.statusDate = statusDate;
}

public Integer getPid() {
	return pid;
}

public void setPid(Integer pid) {
	this.pid = pid;
}

public String getTargetDesc() {
	return targetDesc;
}

public void setTargetDesc(String targetDesc) {
	this.targetDesc = targetDesc;
}

public String getServiceClass() {
	return serviceClass;
}

public void setServiceClass(String serviceClass) {
	this.serviceClass = serviceClass;
}

public String getUserIp() {
	return userIp;
}

public void setUserIp(String userIp) {
	this.userIp = userIp;
}

public String getEndTime() {
	return endTime;
}

public void setEndTime(String endTime) {
	this.endTime = endTime;
}

public Integer getExecutedQtty() {
	return executedQtty;
}

public void setExecutedQtty(Integer executedQtty) {
	this.executedQtty = executedQtty;
}

public BigDecimal getCumQttyPerc() {
	return cumQttyPerc;
}

public void setCumQttyPerc(BigDecimal cumQttyPerc) {
	this.cumQttyPerc = cumQttyPerc;
}

public String getStrategyId() {
	return strategyId;
}

public void setStrategyId(String strategyId) {
	this.strategyId = strategyId;
}

public BigDecimal getAvgPrice() {
	return avgPrice;
}

public void setAvgPrice(BigDecimal avgPrice) {
	this.avgPrice = avgPrice;
}

public Integer getSentOrders() {
	return sentOrders;
}

public void setSentOrders(Integer sentOrders) {
	this.sentOrders = sentOrders;
}

public Integer getTargetQtty() {
	return targetQtty;
}

public void setTargetQtty(Integer targetQtty) {
	this.targetQtty = targetQtty;
}

public Integer getExecutedOrders() {
	return executedOrders;
}

public void setExecutedOrders(Integer executedOrders) {
	this.executedOrders = executedOrders;
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
