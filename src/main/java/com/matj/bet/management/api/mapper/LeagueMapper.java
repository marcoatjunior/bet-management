package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import com.matj.bet.management.api.dto.response.league.LeagueResponseDto;
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

  public LeagueResponseDto toResponseDto(LeagueModelDto modelDto) {
    var responseDto = new LeagueResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    return responseDto;
  }

  public LeagueModelDto toModelDto(LeagueEntity entity) {
    var modelDto = new LeagueModelDto();
    modelDto.setId(entity.getId());
    modelDto.setName(entity.getName());
    return modelDto;
  }

  public LeagueModelDto toModelDto(LeagueRequestDto requestDto) {
    var modelDto = new LeagueModelDto();
    modelDto.setName(requestDto.getName());
    return modelDto;
  }
}
