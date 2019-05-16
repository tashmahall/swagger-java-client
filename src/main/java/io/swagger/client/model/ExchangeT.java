package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The code representing the Exchange
 */
public enum ExchangeT {
  XBSP("XBSP"),
    XBMF("XBMF"),
    NYSE("NYSE");

  private String value;

  ExchangeT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExchangeT fromValue(String text) {
    for (ExchangeT b : ExchangeT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
