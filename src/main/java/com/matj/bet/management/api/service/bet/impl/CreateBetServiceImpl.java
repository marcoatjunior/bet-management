package com.matj.bet.management.api.service.bet.impl;

import com.matj.bet.management.api.converter.request.BetRequestConverter;
import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.repository.bet.BetRepository;
import com.matj.bet.management.api.service.bet.CreateBetService;
import com.matj.bet.management.api.service.league.FindLeagueByIdService;
import com.matj.bet.management.api.service.method.FindMethodByIdService;
import com.matj.bet.management.api.service.stake.FindStakeByIdService;
import com.matj.bet.management.api.service.team.FindTeamByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateBetServiceImpl implements CreateBetService {

  @Autowired
  private BetRepository repository;

  @Autowired
  private FindLeagueByIdService findLeagueByIdService;

  @Autowired
  private FindTeamByIdService findTeamByIdService;

  @Autowired
  private FindStakeByIdService findStakeByIdService;

  @Autowired
  private FindMethodByIdService findMethodByIdService;

  @Autowired
  private BetMapper mapper;

  @Autowired
  private BetRequestConverter converter;

  @Override
  public void execute(BetRequestDto requestDto) {
    var modelDto = performInsert(requestDto);
    repository.insert(mapper.toEntity(modelDto));
  }

  private BetModelDto performInsert(BetRequestDto requestDto) {
    return converter.toModel(requestDto).toBuilder()
        .league(findLeagueByIdService.execute(requestDto.getLeagueId()))
        .home(findTeamByIdService.execute(requestDto.getHomeId()))
        .away(findTeamByIdService.execute(requestDto.getAwayId()))
        .stake(findStakeByIdService.execute(requestDto.getStakeId()))
        .method(findMethodByIdService.execute(requestDto.getMethodId()))
        .build();
  }
}
