package com.matj.bet.management.api.service.stake.impl;

import com.matj.bet.management.api.dto.model.StakeModelDto;
import com.matj.bet.management.api.entity.StakeEntity;
import com.matj.bet.management.api.repository.stake.StakeRepository;
import com.matj.bet.management.api.service.stake.UpdateStakeService;
import com.matj.bet.management.api.service.stake.violation.StakeNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateStakeServiceImpl implements UpdateStakeService {

  @Autowired
  private StakeRepository repository;

  @Autowired
  private StakeNotFoundValidator validator;

  @Override
  public void execute(String id, StakeModelDto modelDto) {
    var entity = validator.validate(repository.findById(id));
    performUpdate(entity, modelDto);
  }

  private void performUpdate(StakeEntity entity, StakeModelDto modelDto) {
    entity = updateFields(entity, modelDto);
    repository.save(entity);
  }

  private StakeEntity updateFields(StakeEntity entity, StakeModelDto modelDto) {
    entity.setSize(modelDto.getSize());
    entity.setWeight(modelDto.getWeight());
    return entity;
  }
}
