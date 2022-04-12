package com.matj.bet.management.api.converter.response;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import org.springframework.stereotype.Component;

@Component
public class TeamResponseConverter {
  
  public TeamResponseDto toResponse(TeamModelDto modelDto) {
    var responseDto = new TeamResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setApiId(modelDto.getApiId());
    responseDto.setName(modelDto.getName());
    responseDto.setLogo(modelDto.getLogo());
    return responseDto;
  }
}
