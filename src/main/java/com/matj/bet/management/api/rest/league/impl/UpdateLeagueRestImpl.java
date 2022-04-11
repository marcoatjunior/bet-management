package com.matj.bet.management.api.rest.league.impl;

import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import com.matj.bet.management.api.mapper.LeagueMapper;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.league.LeagueMessageKey;
import com.matj.bet.management.api.rest.league.UpdateLeagueRest;
import com.matj.bet.management.api.service.league.UpdateLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateLeagueRestImpl implements UpdateLeagueRest {

  @Autowired
  private UpdateLeagueService service;

  @Autowired
  private LeagueMapper mapper;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String update(String id, LeagueRequestDto requestDto) {
    service.execute(id, mapper.toModelDto(requestDto));
    return messageProvider.get(LeagueMessageKey.UPDATED.getKey());
  }
}
