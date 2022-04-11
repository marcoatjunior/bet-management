package com.matj.bet.management.api.service.league.impl;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.entity.LeagueEntity;
import com.matj.bet.management.api.repository.league.LeagueRepository;
import com.matj.bet.management.api.service.league.UpdateLeagueService;
import com.matj.bet.management.api.service.league.violation.LeagueNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLeagueServiceImpl implements UpdateLeagueService {

  @Autowired
  private LeagueRepository repository;

  @Autowired
  private LeagueNotFoundValidator validator;

  @Override
  public void execute(String id, LeagueModelDto modelDto) {
    var entity = validator.validate(repository.findById(id));
    performUpdate(entity, modelDto);
  }

  private void performUpdate(LeagueEntity entity, LeagueModelDto modelDto) {
    entity = updateFields(entity, modelDto);
    repository.save(entity);
  }

  private LeagueEntity updateFields(LeagueEntity entity, LeagueModelDto modelDto) {
    entity.setName(modelDto.getName());
    return entity;
  }
}
