package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of Security
 */
public enum SecurityClassT {
  CORP("CORP"),
    DTERM("DTERM"),
    EQUITY("EQUITY"),
    FOPT("FOPT"),
    FUT("FUT"),
    MLEG("MLEG"),
    SOPT("SOPT"),
    SPOT("SPOT"),
    EQUITY_CASH("EQUITY:CASH"),
    EQUITY_CS("EQUITY:CS"),
    EQUITY_ETF("EQUITY:ETF"),
    EQUITY_FORWARD("EQUITY:FORWARD"),
    EQUITY_INDEX("EQUITY:INDEX"),
    EQUITY_INDEXOPT("EQUITY:INDEXOPT"),
    EQUITY_INDEXOPT_CALL("EQUITY:INDEXOPT:CALL"),
    EQUITY_INDEXOPT_PUT("EQUITY:INDEXOPT:PUT"),
    EQUITY_OPT("EQUITY:OPT"),
    EQUITY_OPT_CALL("EQUITY:OPT:CALL"),
    EQUITY_OPT_PUT("EQUITY:OPT:PUT"),
    EQUITY_OPTEXER("EQUITY:OPTEXER"),
    EQUITY_PS("EQUITY:PS");

  private String value;

  SecurityClassT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SecurityClassT fromValue(String text) {
    for (SecurityClassT b : SecurityClassT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
