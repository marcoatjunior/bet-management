package com.matj.bet.management.api.service.team.violation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TeamViolationMessageKey {

  TEAM_NOT_FOUND("api.error.team.not_found");

  @Getter
  private final String key;
}
