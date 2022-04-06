package com.matj.bet.management.api.rest.stake;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StakeMessageKey {
  
  CREATED("api.success.stake.created"),
  UPDATED("api.success.stake.updated"),
  DELETED("api.success.stake.deleted");

  @Getter
  private final String key;
}
