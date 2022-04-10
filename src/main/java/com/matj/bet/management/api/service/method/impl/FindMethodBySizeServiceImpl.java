package com.matj.bet.management.api.service.method.impl;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.mapper.MethodMapper;
import com.matj.bet.management.api.repository.method.MethodRepository;
import com.matj.bet.management.api.service.method.FindMethodByIdService;
import com.matj.bet.management.api.service.method.violation.MethodNotFoundValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindMethodBySizeServiceImpl implements FindMethodByIdService {

  @Autowired
  private MethodRepository repository;

  @Autowired
  private MethodMapper mapper;

  @Autowired
  private MethodNotFoundValidator validator;

  @Override
  public MethodModelDto execute(String id) {
    var entity = validator.validate(repository.findById(id));
    return mapper.toModelDto(entity);
  }

}
