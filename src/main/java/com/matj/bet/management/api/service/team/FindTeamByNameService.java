package com.matj.bet.management.api.service.team;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import java.util.List;

public interface FindTeamByNameService {

  List<TeamModelDto> execute(String name);
}
