package com.matj.bet.management.api.rest.league.impl;

import com.matj.bet.management.api.converter.response.LeagueResponseConverter;
import com.matj.bet.management.api.dto.response.league.LeagueResponseDto;
import com.matj.bet.management.api.rest.league.FindLeagueByIdRest;
import com.matj.bet.management.api.service.league.FindLeagueByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindLeagueByIdRestImpl implements FindLeagueByIdRest {

  @Autowired
  private FindLeagueByIdService service;

  @Autowired
  private LeagueResponseConverter converter;

  @Override
  public LeagueResponseDto findById(String id) {
    return converter.toResponse(service.execute(id));
  }

}
