package com.matj.bet.management.api.service.bet.impl;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.repository.bet.BetRepository;
import com.matj.bet.management.api.service.bet.CreateBetService;
import com.matj.bet.management.api.service.method.FindMethodByNameService;
import com.matj.bet.management.api.service.stake.FindStakeBySizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateBetServiceImpl implements CreateBetService {

  @Autowired
  private BetRepository repository;

  @Autowired
  private BetMapper mapper;

  @Autowired
  private FindStakeBySizeService findStakeBySizeService;

  @Autowired
  private FindMethodByNameService findMethodByNameService;

  @Override
  public void execute(BetModelDto modelDto) {
    performInsert(modelDto);
    repository.insert(mapper.toEntity(modelDto));
  }

  private void performInsert(BetModelDto modelDto) {
    modelDto.setStake(findStakeBySize(modelDto.getStake()));
    modelDto.setMethod(findMethodByName(modelDto.getMethod()));
  }

  private StakeModelDto findStakeBySize(StakeModelDto modelDto) {
    return findStakeBySizeService.execute(modelDto.getSize());
  }

  private MethodModelDto findMethodByName(MethodModelDto modelDto) {
    return findMethodByNameService.execute(modelDto.getName());
  }
}
