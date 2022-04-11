package com.matj.bet.management.api.rest.league.impl;

import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.league.DeleteLeagueRest;
import com.matj.bet.management.api.rest.league.LeagueMessageKey;
import com.matj.bet.management.api.service.league.DeleteLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteLeagueRestImpl implements DeleteLeagueRest {

  @Autowired
  private DeleteLeagueService service;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String delete(String id) {
    service.execute(id);
    return messageProvider.get(LeagueMessageKey.DELETED.getKey());
  }
}
