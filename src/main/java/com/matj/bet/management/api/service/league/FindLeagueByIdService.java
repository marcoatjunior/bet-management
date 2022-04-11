package com.matj.bet.management.api.service.league;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;

public interface FindLeagueByIdService {

  LeagueModelDto execute(String id);
}
