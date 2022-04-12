package com.matj.bet.management.api.service.team.impl;

import static java.util.Optional.ofNullable;
import com.matj.bet.management.api.dto.model.team.api.TeamApiResponseModelDto;
import com.matj.bet.management.api.provider.RestExecutorProvider;
import com.matj.bet.management.api.rest.client.rapid.football.FootballTeamsRestClient;
import com.matj.bet.management.api.service.team.CreateTeamService;
import com.matj.bet.management.api.service.team.ImportTeamByNameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImportTeamByNameServiceImpl implements ImportTeamByNameService {

  @Autowired
  private FootballTeamsRestClient restClient;

  @Autowired
  private CreateTeamService createTeamService;

  @Override
  public void execute(String name) {
    var teams = RestExecutorProvider.execute(restClient.findByName(name));
    ofNullable(teams.getResponse()).orElse(List.of())
        .stream()
        .map(TeamApiResponseModelDto::getTeam)
        .forEach(createTeamService::execute);
  }
}
