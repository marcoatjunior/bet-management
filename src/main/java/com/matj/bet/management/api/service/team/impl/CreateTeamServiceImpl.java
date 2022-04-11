package com.matj.bet.management.api.service.team.impl;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.mapper.TeamMapper;
import com.matj.bet.management.api.repository.team.TeamRepository;
import com.matj.bet.management.api.service.team.CreateTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTeamServiceImpl implements CreateTeamService {

  @Autowired
  private TeamRepository repository;

  @Autowired
  private TeamMapper mapper;

  @Override
  public TeamModelDto execute(TeamModelDto modelDto) {
    var entity = repository.insert(mapper.toEntity(modelDto));
    return mapper.toModelDto(entity);
  }
}
