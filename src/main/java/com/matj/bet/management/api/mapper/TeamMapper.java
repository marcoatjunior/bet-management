package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

  public TeamEntity toEntity(TeamModelDto modelDto) {
    return TeamEntity.builder()
        .id(modelDto.getId())
        .apiId(modelDto.getApiId())
        .name(modelDto.getName())
        .logo(modelDto.getLogo())
        .build();
  }

  public TeamModelDto toModel(TeamEntity entity) {
    return TeamModelDto.builder()
        .id(entity.getId())
        .apiId(entity.getApiId())
        .name(entity.getName())
        .logo(entity.getLogo())
        .build();
  }
}
