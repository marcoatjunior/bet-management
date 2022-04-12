package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.api.TeamApiModelDto;
import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamApiMapper {

  public TeamEntity toEntity(TeamApiModelDto modelDto) {
    return TeamEntity.builder()
        .apiId(modelDto.getId())
        .name(modelDto.getName())
        .logo(modelDto.getLogo())
        .build();
  }
}
