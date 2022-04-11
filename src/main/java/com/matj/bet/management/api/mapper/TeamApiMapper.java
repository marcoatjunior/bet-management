package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import org.springframework.stereotype.Component;

@Component
public class TeamApiMapper {

  public TeamResponseDto toResponseDto(TeamApiModelDto modelDto) {
    var responseDto = new TeamResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    responseDto.setLogo(modelDto.getLogo());
    return responseDto;
  }
}
