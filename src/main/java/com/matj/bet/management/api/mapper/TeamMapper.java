package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

  public TeamEntity toEntity(TeamModelDto modelDto) {
    var entity = new TeamEntity();
    entity.setId(modelDto.getId());
    entity.setApiId(modelDto.getApiId());
    entity.setName(modelDto.getName());
    entity.setLogo(modelDto.getLogo());
    return entity;
  }

  public TeamModelDto toModel(TeamEntity entity) {
    var modelDto = new TeamModelDto();
    modelDto.setId(entity.getId());
    modelDto.setApiId(entity.getApiId());
    modelDto.setName(entity.getName());
    modelDto.setLogo(entity.getLogo());
    return modelDto;
  }
}
