package com.matj.bet.management.api.rest.league.impl;

import com.matj.bet.management.api.dto.response.league.LeagueResponseDto;
import com.matj.bet.management.api.mapper.LeagueMapper;
import com.matj.bet.management.api.rest.league.ListLeagueRest;
import com.matj.bet.management.api.service.league.ListLeagueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListLeagueRestImpl implements ListLeagueRest {

  @Autowired
  private ListLeagueService service;

  @Autowired
  private LeagueMapper mapper;

  @Override
  public List<LeagueResponseDto> list() {
    return service.execute().stream().map(mapper::toResponseDto).toList();
  }

}
