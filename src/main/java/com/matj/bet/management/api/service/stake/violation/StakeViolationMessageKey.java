package com.matj.bet.management.api.service.stake.violation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StakeViolationMessageKey {

  STAKE_ALREADY_REGISTERED("api.error.stake.already_registered"),
  SIZE_ALREADY_REGISTERED("api.error.stake.size.already_registered"),
  STAKE_NOT_FOUND("api.error.stake.not_found");

  @Getter
  private final String key;
}
