package com.matj.bet.management.api.service.bet.impl;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.repository.bet.BetRepository;
import com.matj.bet.management.api.service.bet.CreateBetService;
import com.matj.bet.management.api.service.league.FindLeagueByIdService;
import com.matj.bet.management.api.service.method.FindMethodByIdService;
import com.matj.bet.management.api.service.stake.FindStakeByIdService;
import com.matj.bet.management.api.service.team.CreateTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateBetServiceImpl implements CreateBetService {

  @Autowired
  private BetRepository repository;

  @Autowired
  private CreateTeamService createTeamService;

  @Autowired
  private FindStakeByIdService findStakeByIdService;

  @Autowired
  private FindMethodByIdService findMethodByIdService;

  @Autowired
  private FindLeagueByIdService findLeagueByIdService;

  @Autowired
  private BetMapper mapper;

  @Override
  public void execute(BetRequestDto requestDto) {
    var modelDto = mapper.toModelDto(requestDto);
    performInsert(requestDto, modelDto);
    repository.insert(mapper.toEntity(modelDto));
  }

  private void performInsert(BetRequestDto requestDto, BetModelDto modelDto) {
    modelDto.setLeague(findLeagueByIdService.execute(requestDto.getLeagueId()));
    modelDto.setStake(findStakeByIdService.execute(requestDto.getStakeId()));
    modelDto.setMethod(findMethodByIdService.execute(requestDto.getMethodId()));
    modelDto.setHome(createTeamService.execute(requestDto.getHomeId()));
    modelDto.setAway(createTeamService.execute(requestDto.getAwayId()));
  }
}
