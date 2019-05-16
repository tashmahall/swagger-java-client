package io.swagger.client.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class InlineResponse200   {
  @JsonProperty("auth_token")
  private String authToken = null;

  public InlineResponse200 authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

  /**
   * Authentication token 
   * @return token
  **/
  @ApiModelProperty(example = "6db71f99-4dc8-4d0d-9d75-00cdeb484319", value = "Authentication token ")

  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String token) {
    this.authToken = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.authToken, inlineResponse200.authToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    auth_token: ").append(toIndentedString(authToken)).append("\n");
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
