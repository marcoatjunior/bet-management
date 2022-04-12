package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamApiMapper {

  public TeamEntity toEntity(TeamApiModelDto modelDto) {
    var entity = new TeamEntity();
    entity.setApiId(modelDto.getId());
    entity.setName(modelDto.getName());
    entity.setLogo(modelDto.getLogo());
    return entity;
  }
}
