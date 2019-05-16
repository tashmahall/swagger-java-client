package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The side of the execution   * 1 = Buy   * 2 = Sell 
 */
public enum SideT {
  _1("1"),
    _2("2");

  private String value;

  SideT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SideT fromValue(String text) {
    for (SideT b : SideT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
