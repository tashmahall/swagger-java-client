package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Webhook
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class Webhook   {
  @JsonProperty("target")
  private WebhookTarget target = null;

  @JsonProperty("url")
  private String url = null;

  /**
   * The type of event that will activate the webhook Currently is only supportes algo.changed event trigger Input parameter. Must be informed by requester 
   */
  public enum TriggersEnum {
    CHANGED("algo.changed");

    private String value;

    TriggersEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TriggersEnum fromValue(String text) {
      for (TriggersEnum b : TriggersEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("triggers")
  @Valid
  private List<TriggersEnum> triggers = null;

  @JsonProperty("remove_previous")
  private Integer removePrevious = 0;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("id")
  private UUID id = null;

  public Webhook target(WebhookTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")

  @Valid
  public WebhookTarget getTarget() {
    return target;
  }

  public void setTarget(WebhookTarget target) {
    this.target = target;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The address that will be called back when an event for the trigger specified happens A POST request will be made with the appropriate object on this url Input parameter. Must be informed by requester 
   * @return url
  **/
  @ApiModelProperty(example = "https://domainname/callback", value = "The address that will be called back when an event for the trigger specified happens A POST request will be made with the appropriate object on this url Input parameter. Must be informed by requester ")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook triggers(List<TriggersEnum> triggers) {
    this.triggers = triggers;
    return this;
  }

  public Webhook addTriggersItem(TriggersEnum triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<TriggersEnum>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

  /**
   * Get triggers
   * @return triggers
  **/
  @ApiModelProperty(value = "")

  public List<TriggersEnum> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<TriggersEnum> triggers) {
    this.triggers = triggers;
  }

  public Webhook removePrevious(Integer removePrevious) {
    this.removePrevious = removePrevious;
    return this;
  }

  /**
   * Forza a remoção de webhooks previos se existirem para este usuário 
   * minimum: 0
   * maximum: 1
   * @return removePrevious
  **/
  @ApiModelProperty(value = "Forza a remoção de webhooks previos se existirem para este usuário ")

@Min(0) @Max(1)   public Integer getRemovePrevious() {
    return removePrevious;
  }

  public void setRemovePrevious(Integer removePrevious) {
    this.removePrevious = removePrevious;
  }

  public Webhook createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Webhook creation datetime Output parameter. Will be generated internally 
   * @return createdAt
  **/
  @ApiModelProperty(value = "Webhook creation datetime Output parameter. Will be generated internally ")

  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Webhook createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Username who created the webhook Output parameter. Will be generated internally 
   * @return createdBy
  **/
  @ApiModelProperty(example = "flx_pro1", value = "Username who created the webhook Output parameter. Will be generated internally ")

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Webhook id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the webhook Output parameter. Will be generated internally        
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "Unique identifier of the webhook Output parameter. Will be generated internally        ")

  @Valid
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.target, webhook.target) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.triggers, webhook.triggers) &&
        Objects.equals(this.removePrevious, webhook.removePrevious) &&
        Objects.equals(this.createdAt, webhook.createdAt) &&
        Objects.equals(this.createdBy, webhook.createdBy) &&
        Objects.equals(this.id, webhook.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, url, triggers, removePrevious, createdAt, createdBy, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    removePrevious: ").append(toIndentedString(removePrevious)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
