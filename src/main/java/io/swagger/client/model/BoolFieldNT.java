package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BoolFieldN_t
 */
public enum BoolFieldNT {
  Y("Y"),
    N("N");

  private String value;

  BoolFieldNT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BoolFieldNT fromValue(String text) {
    for (BoolFieldNT b : BoolFieldNT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
