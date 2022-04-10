package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import org.mapstruct.Mapper;

@Mapper
public class TeamMapper {

  public TeamResponseDto toResponseDto(TeamModelDto modelDto) {
    var responseDto = new TeamResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    responseDto.setLogo(modelDto.getLogo());
    return responseDto;
  }
}
