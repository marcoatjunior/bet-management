package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

  public TeamResponseDto toResponseDto(TeamModelDto modelDto) {
    var responseDto = new TeamResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    responseDto.setLogo(modelDto.getLogo());
    return responseDto;
  }

  public TeamModelDto toModelDto(TeamRequestDto requestDto) {
    var modelDto = new TeamModelDto();
    modelDto.setId(requestDto.getId());
    modelDto.setName(requestDto.getName());
    modelDto.setLogo(requestDto.getLogo());
    return modelDto;
  }

  public TeamEntity toEntity(TeamModelDto modelDto) {
    var entity = new TeamEntity();
    entity.setId(modelDto.getId().toString());
    entity.setName(modelDto.getName());
    entity.setLogo(modelDto.getLogo());
    return entity;
  }
}
