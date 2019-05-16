package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Subset of Type of Derivatives
 */
public enum DerivativesSecurityClassT {
  FOPT("FOPT"),
    SOPT("SOPT"),
    CASH("CASH"),
    CS("CS"),
    ETF("ETF"),
    FORWARD("FORWARD"),
    INDEX("INDEX"),
    INDEXOPT("INDEXOPT"),
    OPT("OPT"),
    OPTEXER("OPTEXER"),
    PS("PS");

  private String value;

  DerivativesSecurityClassT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DerivativesSecurityClassT fromValue(String text) {
    for (DerivativesSecurityClassT b : DerivativesSecurityClassT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
