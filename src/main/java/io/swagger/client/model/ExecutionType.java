package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ExecutionType {
	ENTRY(0),
	GAIN_LOSS(1);
	
	private Integer value;
	
	ExecutionType(Integer value){
		this.value=value;
	}
	public Integer getValue() {
		return value;
	}
    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ExecutionType fromValue(Integer value) {
      for (ExecutionType b : ExecutionType.values()) {
        if (String.valueOf(b.value).equals(value)) {
          return b;
        }
      }
      return null;
    }
  
}
