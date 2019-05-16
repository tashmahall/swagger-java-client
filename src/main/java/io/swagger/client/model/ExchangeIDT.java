package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * exchange unique identifier
 */
public enum ExchangeIDT {
  BVMF("BVMF"),
    NYSE("NYSE");

  private String value;

  ExchangeIDT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExchangeIDT fromValue(String text) {
    for (ExchangeIDT b : ExchangeIDT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
