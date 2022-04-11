package com.matj.bet.management.api.service.bet.impl;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.entity.MethodEntity;
import com.matj.bet.management.api.entity.StakeEntity;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.repository.bet.BetRepository;
import com.matj.bet.management.api.repository.method.MethodRepository;
import com.matj.bet.management.api.repository.stake.StakeRepository;
import com.matj.bet.management.api.service.bet.CreateBetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateBetServiceImpl implements CreateBetService {

  @Autowired
  private BetRepository repository;

  @Autowired
  private BetMapper mapper;

  @Autowired
  private StakeRepository stakeRepository;

  @Autowired
  private MethodRepository methodRepository;

  @Override
  public void execute(BetModelDto modelDto) {
    var bet = mapper.toEntity(modelDto);
    bet.setStake(findStakeBySize(modelDto.getStake()));
    bet.setMethod(findMethodByName(modelDto.getMethod()));
    repository.insert(bet);
  }

  private StakeEntity findStakeBySize(StakeModelDto modelDto) {
    return stakeRepository.findBySize(modelDto.getSize())
        .stream()
        .findFirst()
        .orElse(null);
  }

  private MethodEntity findMethodByName(MethodModelDto modelDto) {
    return methodRepository.findByName(modelDto.getName())
        .stream()
        .findFirst()
        .orElse(null);
  }
}
