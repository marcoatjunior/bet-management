package com.matj.bet.management.api.service.method.impl;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.entity.MethodEntity;
import com.matj.bet.management.api.repository.method.MethodRepository;
import com.matj.bet.management.api.service.method.UpdateMethodService;
import com.matj.bet.management.api.service.method.violation.MethodNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMethodServiceImpl implements UpdateMethodService {

  @Autowired
  private MethodRepository repository;

  @Autowired
  private MethodNotFoundValidator validator;

  @Override
  public void execute(String id, MethodModelDto modelDto) {
    var entity = validator.validate(repository.findById(id));
    performUpdate(entity, modelDto);
  }

  private void performUpdate(MethodEntity entity, MethodModelDto modelDto) {
    entity = updateFields(entity, modelDto);
    repository.save(entity);
  }

  private MethodEntity updateFields(MethodEntity entity, MethodModelDto modelDto) {
    entity.setName(modelDto.getName());
    return entity;
  }
}
