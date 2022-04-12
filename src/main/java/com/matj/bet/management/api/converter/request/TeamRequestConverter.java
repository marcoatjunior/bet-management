package com.matj.bet.management.api.converter.request;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import org.springframework.stereotype.Component;

@Component
public class TeamRequestConverter {

  public TeamModelDto toModel(TeamRequestDto requestDto) {
    return TeamModelDto.builder().name(requestDto.getName()).build();
  }
}
