package com.matj.bet.management.api.service.league.impl;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.mapper.LeagueMapper;
import com.matj.bet.management.api.repository.league.LeagueRepository;
import com.matj.bet.management.api.service.league.CreateLeagueService;
import com.matj.bet.management.api.service.league.violation.LeagueNameAlreadyRegisteredValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateLeagueServiceImpl implements CreateLeagueService {

  @Autowired
  private LeagueRepository repository;

  @Autowired
  private LeagueMapper mapper;

  @Autowired
  private LeagueNameAlreadyRegisteredValidator validator;

  @Override
  public void execute(LeagueModelDto modelDto) {
    var entity = repository.findByName(modelDto.getName());
    validator.validate(entity);
    repository.insert(mapper.toEntity(modelDto));
  }

}
