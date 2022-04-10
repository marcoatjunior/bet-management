package com.matj.bet.management.api.service.method.impl;

import com.matj.bet.management.api.repository.method.MethodRepository;
import com.matj.bet.management.api.service.method.DeleteMethodService;
import com.matj.bet.management.api.service.method.violation.MethodNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteMethodServiceImpl implements DeleteMethodService {

  @Autowired
  private MethodRepository repository;

  @Autowired
  private MethodNotFoundValidator validator;

  @Override
  public void execute(String id) {
    var entity = validator.validate(repository.findById(id));
    repository.deleteById(entity.getId());
  }
}
