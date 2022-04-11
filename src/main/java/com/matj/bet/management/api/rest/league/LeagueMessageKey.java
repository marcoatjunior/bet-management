package com.matj.bet.management.api.rest.league;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeagueMessageKey {
  
  CREATED("api.success.league.created"),
  UPDATED("api.success.league.updated"),
  DELETED("api.success.league.deleted");

  @Getter
  private final String key;
}
