package com.matj.bet.management.api.service.team;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;

public interface FindTeamByIdService {

  TeamModelDto execute(String id);
}
