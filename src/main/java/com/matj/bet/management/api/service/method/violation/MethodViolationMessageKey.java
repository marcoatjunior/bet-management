package com.matj.bet.management.api.service.method.violation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MethodViolationMessageKey {

  METHOD_ALREADY_REGISTERED("api.error.method.already_registered"),
  NAME_ALREADY_REGISTERED("api.error.method.name.already_registered"),
  METHOD_NOT_FOUND("api.error.method.not_found");

  @Getter
  private final String key;
}
