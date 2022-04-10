package com.matj.bet.management.api.service.method.impl;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.mapper.MethodMapper;
import com.matj.bet.management.api.repository.method.MethodRepository;
import com.matj.bet.management.api.service.method.CreateMethodService;
import com.matj.bet.management.api.service.method.violation.NameAlreadyRegisteredValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateMethodServiceImpl implements CreateMethodService {

  @Autowired
  private MethodRepository repository;

  @Autowired
  private MethodMapper mapper;

  @Autowired
  private NameAlreadyRegisteredValidator validator;

  @Override
  public void execute(MethodModelDto modelDto) {
    var entities = repository.findByName(modelDto.getName());
    validator.validate(entities);
    repository.insert(mapper.toEntity(modelDto));
  }

}
