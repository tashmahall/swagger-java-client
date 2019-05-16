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
 * ABMessagearbintfCustomParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class ABMessagearbintfCustomParameters   {
  @JsonProperty("Variation")
  private BigDecimal variation = null;

  @JsonProperty("Tunnel")
  private BigDecimal tunnel = null;

  @JsonProperty("MaxDifSpreadInteiro")
  private BigDecimal maxDifSpreadInteiro = null;

  @JsonProperty("TimeOutZeracao")
  private Integer timeOutZeracao = null;

  /**
   * 1=Passivo, 2=Ativo, 3=Ambos 
   */
  public enum SniperTypeEnum {
    _1(new BigDecimal("1")),
    
    _2(new BigDecimal("2")),
    
    _3(new BigDecimal("3"));

    private BigDecimal value;

    SniperTypeEnum(BigDecimal value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SniperTypeEnum fromValue(String text) {
      for (SniperTypeEnum b : SniperTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("SniperType")
  private SniperTypeEnum sniperType = null;

  public ABMessagearbintfCustomParameters variation(BigDecimal variation) {
    this.variation = variation;
    return this;
  }

  /**
   * Get variation
   * @return variation
  **/
  @ApiModelProperty(example = "0.05", value = "")

  @Valid
  public BigDecimal getVariation() {
    return variation;
  }

  public void setVariation(BigDecimal variation) {
    this.variation = variation;
  }

  public ABMessagearbintfCustomParameters tunnel(BigDecimal tunnel) {
    this.tunnel = tunnel;
    return this;
  }

  /**
   * Get tunnel
   * @return tunnel
  **/
  @ApiModelProperty(example = "2", value = "")

  @Valid
  public BigDecimal getTunnel() {
    return tunnel;
  }

  public void setTunnel(BigDecimal tunnel) {
    this.tunnel = tunnel;
  }

  public ABMessagearbintfCustomParameters maxDifSpreadInteiro(BigDecimal maxDifSpreadInteiro) {
    this.maxDifSpreadInteiro = maxDifSpreadInteiro;
    return this;
  }

  /**
   * Get maxDifSpreadInteiro
   * @return maxDifSpreadInteiro
  **/
  @ApiModelProperty(example = "1", value = "")

  @Valid
  public BigDecimal getMaxDifSpreadInteiro() {
    return maxDifSpreadInteiro;
  }

  public void setMaxDifSpreadInteiro(BigDecimal maxDifSpreadInteiro) {
    this.maxDifSpreadInteiro = maxDifSpreadInteiro;
  }

  public ABMessagearbintfCustomParameters timeOutZeracao(Integer timeOutZeracao) {
    this.timeOutZeracao = timeOutZeracao;
    return this;
  }

  /**
   * Get timeOutZeracao
   * @return timeOutZeracao
  **/
  @ApiModelProperty(example = "15", value = "")

  public Integer getTimeOutZeracao() {
    return timeOutZeracao;
  }

  public void setTimeOutZeracao(Integer timeOutZeracao) {
    this.timeOutZeracao = timeOutZeracao;
  }

  public ABMessagearbintfCustomParameters sniperType(SniperTypeEnum sniperType) {
    this.sniperType = sniperType;
    return this;
  }

  /**
   * 1=Passivo, 2=Ativo, 3=Ambos 
   * @return sniperType
  **/
  @ApiModelProperty(example = "2", value = "1=Passivo, 2=Ativo, 3=Ambos ")

  @Valid
  public SniperTypeEnum getSniperType() {
    return sniperType;
  }

  public void setSniperType(SniperTypeEnum sniperType) {
    this.sniperType = sniperType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABMessagearbintfCustomParameters abMessagearbintfCustomParameters = (ABMessagearbintfCustomParameters) o;
    return Objects.equals(this.variation, abMessagearbintfCustomParameters.variation) &&
        Objects.equals(this.tunnel, abMessagearbintfCustomParameters.tunnel) &&
        Objects.equals(this.maxDifSpreadInteiro, abMessagearbintfCustomParameters.maxDifSpreadInteiro) &&
        Objects.equals(this.timeOutZeracao, abMessagearbintfCustomParameters.timeOutZeracao) &&
        Objects.equals(this.sniperType, abMessagearbintfCustomParameters.sniperType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variation, tunnel, maxDifSpreadInteiro, timeOutZeracao, sniperType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABMessagearbintfCustomParameters {\n");
    
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    tunnel: ").append(toIndentedString(tunnel)).append("\n");
    sb.append("    maxDifSpreadInteiro: ").append(toIndentedString(maxDifSpreadInteiro)).append("\n");
    sb.append("    timeOutZeracao: ").append(toIndentedString(timeOutZeracao)).append("\n");
    sb.append("    sniperType: ").append(toIndentedString(sniperType)).append("\n");
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
