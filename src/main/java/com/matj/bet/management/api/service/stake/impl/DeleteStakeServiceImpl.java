package com.matj.bet.management.api.service.stake.impl;

import com.matj.bet.management.api.repository.stake.StakeRepository;
import com.matj.bet.management.api.service.stake.DeleteStakeService;
import com.matj.bet.management.api.service.stake.violation.StakeNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStakeServiceImpl implements DeleteStakeService {

  @Autowired
  private StakeRepository repository;

  @Autowired
  private StakeNotFoundValidator validator;

  @Override
  public void execute(String id) {
    var entity = validator.validate(repository.findById(id));
    repository.deleteById(entity.getId());
  }
}
