package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.entity.LeagueEntity;
import org.springframework.stereotype.Component;

@Component
public class LeagueMapper {

  public LeagueEntity toEntity(LeagueModelDto requestDto) {
    var entity = new LeagueEntity();
    entity.setId(requestDto.getId());
    entity.setName(requestDto.getName());
    return entity;
  }

  public LeagueModelDto toModel(LeagueEntity entity) {
    var modelDto = new LeagueModelDto();
    modelDto.setId(entity.getId());
    modelDto.setName(entity.getName());
    return modelDto;
  }
}
