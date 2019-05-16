package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets StrategyCode_t
 */
public enum StrategyCodeT {
  GRDDIN("grddin"),
    GRDLIN("grdlin"),
    SORDER("sorder"),
    SPREAD("spread"),
    LGSHORT("lgshort"),
    FINANC("financ"),
    VWAP("vwap"),
    TWAP("twap"),
    POV("pov"),
    ICEBERG("iceberg"),
    BOFFER("boffer"),
    MIT("mit"),
    PEG("peg"),
    SKEW("skew"),
    CVVOL("cvvol");

  private String value;

  StrategyCodeT(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StrategyCodeT fromValue(String text) {
    for (StrategyCodeT b : StrategyCodeT.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
