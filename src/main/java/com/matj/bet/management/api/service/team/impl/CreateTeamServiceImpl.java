package com.matj.bet.management.api.service.team.impl;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import com.matj.bet.management.api.entity.TeamEntity;
import com.matj.bet.management.api.mapper.TeamApiMapper;
import com.matj.bet.management.api.repository.team.TeamRepository;
import com.matj.bet.management.api.service.team.CreateTeamService;
import java.util.Optional;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTeamServiceImpl implements CreateTeamService {

  @Autowired
  private TeamRepository repository;

  @Autowired
  private TeamApiMapper mapper;

  @Override
  public void execute(@NotNull TeamApiModelDto modelDto) {
    findByApiId(modelDto).orElse(createTeam(modelDto));
  }

  private Optional<TeamEntity> findByApiId(TeamApiModelDto modelDto) {
    return repository.findByApiId(modelDto.getId());
  }

  private TeamEntity createTeam(TeamApiModelDto modelDto) {
    return repository.insert(mapper.toEntity(modelDto));
  }
}
