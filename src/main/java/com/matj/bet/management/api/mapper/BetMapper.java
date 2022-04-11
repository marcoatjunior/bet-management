package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
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
  private TeamMapper teamMapper;

  public BetEntity toEntity(BetModelDto modelDto) {
    var entity = new BetEntity();
    entity.setId(modelDto.getId());
    entity.setTime(modelDto.getTime());
    entity.setLeague(modelDto.getLeague());
    entity.setHome(teamMapper.toEntity(modelDto.getHome()));
    entity.setAway(teamMapper.toEntity(modelDto.getAway()));
    entity.setBet(modelDto.getBet());
    entity.setMethod(methodMapper.toEntity(modelDto.getMethod()));
    entity.setStake(stakeMapper.toEntity(modelDto.getStake()));
    entity.setOdd(modelDto.getOdd());
    entity.setResult(modelDto.getResult());
    return entity;
  }

  public BetModelDto toModelDto(BetRequestDto requestDto) {
    var modelDto = new BetModelDto();
    modelDto.setTime(requestDto.getTime());
    modelDto.setLeague(requestDto.getLeague());
    modelDto.setHome(teamMapper.toModelDto(requestDto.getHome()));
    modelDto.setAway(teamMapper.toModelDto(requestDto.getAway()));
    modelDto.setMethod(methodMapper.toModelDto(requestDto.getMethod()));
    modelDto.setStake(stakeMapper.toModelDto(requestDto.getStake()));
    modelDto.setOdd(requestDto.getOdd());
    return modelDto;
  }
}
