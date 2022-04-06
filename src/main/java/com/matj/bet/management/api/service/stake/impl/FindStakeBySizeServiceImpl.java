package com.matj.bet.management.api.service.stake.impl;

import com.matj.bet.management.api.dto.model.StakeModelDto;
import com.matj.bet.management.api.mapper.StakeMapper;
import com.matj.bet.management.api.repository.stake.StakeRepository;
import com.matj.bet.management.api.service.stake.FindStakeByIdService;
import com.matj.bet.management.api.service.stake.violation.StakeNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindStakeBySizeServiceImpl implements FindStakeByIdService {

  @Autowired
  private StakeRepository repository;

  @Autowired
  private StakeMapper mapper;

  @Autowired
  private StakeNotFoundValidator validator;

  @Override
  public StakeModelDto execute(String id) {
    var entity = validator.validate(repository.findById(id));
    return mapper.toModelDto(entity);
  }

}
