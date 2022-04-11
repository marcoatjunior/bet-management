package com.matj.bet.management.api.service.league;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;

public interface UpdateLeagueService {

  void execute(String id, LeagueModelDto modelDto);
}
