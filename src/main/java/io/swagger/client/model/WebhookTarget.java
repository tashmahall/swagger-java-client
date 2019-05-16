package io.swagger.client.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * WebhookTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class WebhookTarget   {
  @JsonProperty("id")
  private String id = null;

  /**
   * The target of the webhook (sponsor, user, account, algo) It indicates on which dimension the webhook will be notified Input parameter. Must be informed by requester 
   */
  public enum TypeEnum {
    SPONSOR("sponsor"),
    
    USER("user"),
    
    ACCOUNT("account"),
    
    ALGO("algo");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  public WebhookTarget id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the webhook target of the webhook Input parameter. Must be informed by requester 
   * @return id
  **/
  @ApiModelProperty(example = "account001", value = "Identifier of the webhook target of the webhook Input parameter. Must be informed by requester ")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WebhookTarget type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The target of the webhook (sponsor, user, account, algo) It indicates on which dimension the webhook will be notified Input parameter. Must be informed by requester 
   * @return type
  **/
  @ApiModelProperty(example = "user", value = "The target of the webhook (sponsor, user, account, algo) It indicates on which dimension the webhook will be notified Input parameter. Must be informed by requester ")

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookTarget webhookTarget = (WebhookTarget) o;
    return Objects.equals(this.id, webhookTarget.id) &&
        Objects.equals(this.type, webhookTarget.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookTarget {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
