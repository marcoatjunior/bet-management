package com.matj.bet.management.api.rest.bet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BetMessageKey {
  
  CREATED("api.success.bet.created");

  @Getter
  private final String key;
}
