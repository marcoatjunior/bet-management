package com.matj.bet.management.api.service.league.violation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeagueViolationMessageKey {

  LEAGUE_ALREADY_REGISTERED("api.error.league.already_registered"),
  LEAGUE_NAME_ALREADY_REGISTERED("api.error.league.name.already_registered"),
  LEAGUE_NOT_FOUND("api.error.league.not_found");

  @Getter
  private final String key;
}
