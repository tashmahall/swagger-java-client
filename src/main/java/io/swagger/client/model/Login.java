package io.swagger.client.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Login
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T17:51:38.805Z[GMT]")
public class Login   {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("psswd")
  private String psswd = null;

  public Login user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "flx_pro1", required = true, value = "")
  @NotNull

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Login psswd(String psswd) {
    this.psswd = psswd;
    return this;
  }

  /**
   * Get psswd
   * @return psswd
  **/
  @ApiModelProperty(example = "123456", required = true, value = "")
  @NotNull

  public String getPsswd() {
    return psswd;
  }

  public void setPsswd(String psswd) {
    this.psswd = psswd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.user, login.user) &&
        Objects.equals(this.psswd, login.psswd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, psswd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    psswd: ").append(toIndentedString(psswd)).append("\n");
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
