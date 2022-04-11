package com.matj.bet.management.api.service.stake.impl;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.mapper.StakeMapper;
import com.matj.bet.management.api.repository.stake.StakeRepository;
import com.matj.bet.management.api.service.stake.CreateStakeService;
import com.matj.bet.management.api.service.stake.violation.SizeAlreadyRegisteredValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateStakeServiceImpl implements CreateStakeService {

  @Autowired
  private StakeRepository repository;

  @Autowired
  private StakeMapper mapper;

  @Autowired
  private SizeAlreadyRegisteredValidator validator;

  @Override
  public void execute(StakeModelDto modelDto) {
    var entity = repository.findBySize(modelDto.getSize());
    validator.validate(entity);
    repository.insert(mapper.toEntity(modelDto));
  }

}
