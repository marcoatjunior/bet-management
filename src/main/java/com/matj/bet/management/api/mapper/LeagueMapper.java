package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.entity.LeagueEntity;
import org.springframework.stereotype.Component;

@Component
public class LeagueMapper {

  public LeagueEntity toEntity(LeagueModelDto modelDto) {
    return LeagueEntity.builder()
        .id(modelDto.getId())
        .name(modelDto.getName())
        .build();
  }

  public LeagueModelDto toModel(LeagueEntity entity) {
    return LeagueModelDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .build();
  }
}
