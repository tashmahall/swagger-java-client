package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BoolFieldY_t
 */
public enum BoolFieldYT {
  Y("Y"),
    N("N");

  private String value;

  BoolFieldYT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BoolFieldYT fromValue(String text) {
    for (BoolFieldYT b : BoolFieldYT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
