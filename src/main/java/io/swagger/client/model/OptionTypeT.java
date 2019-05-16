package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Option types data type
 */
public enum OptionTypeT {
  CALL("call"),
    PUT("put");

  private String value;

  OptionTypeT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OptionTypeT fromValue(String text) {
    for (OptionTypeT b : OptionTypeT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
