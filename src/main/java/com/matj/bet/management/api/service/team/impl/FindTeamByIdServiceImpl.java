package com.matj.bet.management.api.service.team.impl;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.mapper.TeamMapper;
import com.matj.bet.management.api.repository.team.TeamRepository;
import com.matj.bet.management.api.service.team.FindTeamByIdService;
import com.matj.bet.management.api.service.team.violation.TeamNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindTeamByIdServiceImpl implements FindTeamByIdService {

  @Autowired
  private TeamRepository repository;

  @Autowired
  private TeamMapper mapper;

  @Autowired
  private TeamNotFoundValidator validator;

  @Override
  public TeamModelDto execute(String id) {
    var entity = validator.validate(repository.findById(id));
    return mapper.toModel(entity);
  }

}
