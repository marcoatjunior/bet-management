package com.matj.bet.management.api.service.league.impl;

import com.matj.bet.management.api.repository.league.LeagueRepository;
import com.matj.bet.management.api.service.league.DeleteLeagueService;
import com.matj.bet.management.api.service.league.violation.LeagueNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteLeagueServiceImpl implements DeleteLeagueService {

  @Autowired
  private LeagueRepository repository;

  @Autowired
  private LeagueNotFoundValidator validator;

  @Override
  public void execute(String id) {
    var entity = validator.validate(repository.findById(id));
    repository.deleteById(entity.getId());
  }
}
