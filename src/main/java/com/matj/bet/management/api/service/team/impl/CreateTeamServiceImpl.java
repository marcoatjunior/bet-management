package com.matj.bet.management.api.service.team.impl;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.model.team.api.TeamApiResponseModelDto;
import com.matj.bet.management.api.mapper.TeamApiMapper;
import com.matj.bet.management.api.mapper.TeamMapper;
import com.matj.bet.management.api.provider.RestExecutorProvider;
import com.matj.bet.management.api.repository.team.TeamRepository;
import com.matj.bet.management.api.rest.client.rapid.football.FootballTeamsRestClient;
import com.matj.bet.management.api.service.team.CreateTeamService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTeamServiceImpl implements CreateTeamService {

  @Autowired
  private TeamRepository repository;

  @Autowired
  private FootballTeamsRestClient restClient;

  @Autowired
  private TeamApiMapper apiMapper;

  @Autowired
  private TeamMapper mapper;

  @Override
  public TeamModelDto execute(Long id) {
    var teams = RestExecutorProvider.execute(restClient.findById(id));
    var response = Optional.ofNullable(teams.getResponse()).orElse(List.of());
    var team = response.stream().map(TeamApiResponseModelDto::getTeam)
        .findFirst().orElse(null);
    var entity = repository.insert(apiMapper.toEntity(team));
    return mapper.toModelDto(entity);
  }
}
