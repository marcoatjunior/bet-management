package com.matj.bet.management.api.rest.method;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MethodMessageKey {
  
  CREATED("api.success.method.created"),
  UPDATED("api.success.method.updated"),
  DELETED("api.success.method.deleted");

  @Getter
  private final String key;
}
