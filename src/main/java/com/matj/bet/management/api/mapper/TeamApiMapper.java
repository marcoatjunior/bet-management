package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import com.matj.bet.management.api.entity.TeamEntity;
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

  public TeamEntity toEntity(TeamApiModelDto modelDto) {
    var entity = new TeamEntity();
    entity.setApiId(modelDto.getId());
    entity.setName(modelDto.getName());
    entity.setLogo(modelDto.getLogo());
    return entity;
  }
}
