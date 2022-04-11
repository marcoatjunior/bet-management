package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

  public TeamModelDto toModelDto(TeamEntity entity) {
    var modelDto = new TeamModelDto();
    modelDto.setId(entity.getId());
    modelDto.setApiId(entity.getApiId());
    modelDto.setName(entity.getName());
    modelDto.setLogo(entity.getLogo());
    return modelDto;
  }

  public TeamModelDto toModelDto(TeamRequestDto requestDto) {
    var modelDto = new TeamModelDto();
    modelDto.setApiId(requestDto.getId());
    modelDto.setName(requestDto.getName());
    modelDto.setLogo(requestDto.getLogo());
    return modelDto;
  }

  public TeamEntity toEntity(TeamModelDto modelDto) {
    var entity = new TeamEntity();
    entity.setId(modelDto.getId());
    entity.setApiId(modelDto.getApiId());
    entity.setName(modelDto.getName());
    entity.setLogo(modelDto.getLogo());
    return entity;
  }
}
