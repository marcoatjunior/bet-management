package com.matj.bet.management.api.service.team;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import java.util.List;

public interface FindTeamByNameService {

  List<TeamApiModelDto> execute(String name);
}
