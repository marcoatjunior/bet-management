package com.matj.bet.management.api.rest.team;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TeamMessageKey {

  IMPORTED("api.success.team.imported");

  @Getter
  private final String key;
}
