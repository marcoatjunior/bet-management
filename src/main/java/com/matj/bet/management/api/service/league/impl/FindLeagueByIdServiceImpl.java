package com.matj.bet.management.api.service.league.impl;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.mapper.LeagueMapper;
import com.matj.bet.management.api.repository.league.LeagueRepository;
import com.matj.bet.management.api.service.league.FindLeagueByIdService;
import com.matj.bet.management.api.service.league.violation.LeagueNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindLeagueByIdServiceImpl implements FindLeagueByIdService {

  @Autowired
  private LeagueRepository repository;

  @Autowired
  private LeagueMapper mapper;

  @Autowired
  private LeagueNotFoundValidator validator;

  @Override
  public LeagueModelDto execute(String id) {
    var entity = validator.validate(repository.findById(id));
    return mapper.toModel(entity);
  }

}
