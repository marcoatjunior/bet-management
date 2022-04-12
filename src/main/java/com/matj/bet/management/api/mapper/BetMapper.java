package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.entity.BetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BetMapper {

  @Autowired
  private MethodMapper methodMapper;

  @Autowired
  private StakeMapper stakeMapper;

  @Autowired
  private LeagueMapper leagueMapper;

  @Autowired
  private TeamMapper teamMapper;

  public BetEntity toEntity(BetModelDto modelDto) {
    return BetEntity.builder()
        .id(modelDto.getId())
        .eventDate(modelDto.getEventDate())
        .league(leagueMapper.toEntity(modelDto.getLeague()))
        .home(teamMapper.toEntity(modelDto.getHome()))
        .away(teamMapper.toEntity(modelDto.getAway()))
        .bet(modelDto.getBet())
        .method(methodMapper.toEntity(modelDto.getMethod()))
        .stake(stakeMapper.toEntity(modelDto.getStake()))
        .odd(modelDto.getOdd())
        .result(modelDto.getResult())
        .build();
  }

  public BetModelDto toModel(BetEntity entity) {
    return BetModelDto.builder()
        .id(entity.getId())
        .eventDate(entity.getEventDate())
        .league(leagueMapper.toModel(entity.getLeague()))
        .home(teamMapper.toModel(entity.getHome()))
        .away(teamMapper.toModel(entity.getAway()))
        .bet(entity.getBet())
        .method(methodMapper.toModel(entity.getMethod()))
        .stake(stakeMapper.toModel(entity.getStake()))
        .odd(entity.getOdd())
        .result(entity.getResult())
        .build();
  }
}
