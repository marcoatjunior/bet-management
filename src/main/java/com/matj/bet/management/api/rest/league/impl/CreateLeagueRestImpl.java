package com.matj.bet.management.api.rest.league.impl;

import com.matj.bet.management.api.converter.request.LeagueRequestConverter;
import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.league.CreateLeagueRest;
import com.matj.bet.management.api.rest.league.LeagueMessageKey;
import com.matj.bet.management.api.service.league.CreateLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateLeagueRestImpl implements CreateLeagueRest {

  @Autowired
  private CreateLeagueService service;

  @Autowired
  private LeagueRequestConverter converter;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String create(LeagueRequestDto requestDto) {
    service.execute(converter.toModel(requestDto));
    return messageProvider.get(LeagueMessageKey.CREATED.getKey());
  }
}
