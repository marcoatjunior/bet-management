package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
import com.matj.bet.management.api.dto.response.bet.BetResponseDto;
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

  public BetModelDto toModelDto(BetEntity entity) {
    return BetModelDto.builder()
        .id(entity.getId())
        .eventDate(entity.getEventDate())
        .league(leagueMapper.toModelDto(entity.getLeague()))
        .home(teamMapper.toModelDto(entity.getHome()))
        .away(teamMapper.toModelDto(entity.getAway()))
        .bet(entity.getBet())
        .method(methodMapper.toModelDto(entity.getMethod()))
        .stake(stakeMapper.toModelDto(entity.getStake()))
        .odd(entity.getOdd())
        .result(entity.getResult())
        .build();
  }

  public BetModelDto toModelDto(BetRequestDto requestDto) {
    return BetModelDto.builder()
        .eventDate(requestDto.getEventDate())
        .bet(requestDto.getBet())
        .odd(requestDto.getOdd())
        .build();
  }

  public BetResponseDto toResponseDto(BetModelDto modelDto) {
    return BetResponseDto.builder()
        .id(modelDto.getId())
        .eventDate(modelDto.getEventDate())
        .league(modelDto.getLeague().getName())
        .home(modelDto.getHome().getName())
        .away(modelDto.getAway().getName())
        .bet(modelDto.getBet())
        .method(modelDto.getMethod().getName())
        .stake(modelDto.getStake().getWeight())
        .odd(modelDto.getOdd())
        .result(modelDto.getResult())
        .build();
  }
}
