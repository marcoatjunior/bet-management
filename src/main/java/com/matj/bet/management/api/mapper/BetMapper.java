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
    var entity = new BetEntity();
    entity.setId(modelDto.getId());
    entity.setEventDate(modelDto.getEventDate());
    entity.setLeague(leagueMapper.toEntity(modelDto.getLeague()));
    entity.setHome(teamMapper.toEntity(modelDto.getHome()));
    entity.setAway(teamMapper.toEntity(modelDto.getAway()));
    entity.setBet(modelDto.getBet());
    entity.setMethod(methodMapper.toEntity(modelDto.getMethod()));
    entity.setStake(stakeMapper.toEntity(modelDto.getStake()));
    entity.setOdd(modelDto.getOdd());
    entity.setResult(modelDto.getResult());
    return entity;
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
