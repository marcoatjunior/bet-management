package com.matj.bet.management.api.service.team.impl;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import com.matj.bet.management.api.dto.model.team.api.TeamApiResponseModelDto;
import com.matj.bet.management.api.provider.RestExecutorProvider;
import com.matj.bet.management.api.rest.client.rapid.football.FootballTeamsRestClient;
import com.matj.bet.management.api.service.team.FindTeamByNameService;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindTeamByNameServiceImpl implements FindTeamByNameService {

  @Autowired
  private FootballTeamsRestClient restClient;

  @Override
  public List<TeamApiModelDto> execute(String name) {
    var teams = RestExecutorProvider.execute(restClient.findByName(name));
    var response = Optional.ofNullable(teams.getResponse()).orElse(List.of());
    return response.stream()
      .map(TeamApiResponseModelDto::getTeam)
      .sorted(Comparator.comparing(TeamApiModelDto::getName))
      .toList();
  }
}
