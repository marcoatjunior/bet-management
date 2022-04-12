package com.matj.bet.management.api.service.method.impl;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.mapper.MethodMapper;
import com.matj.bet.management.api.repository.method.MethodRepository;
import com.matj.bet.management.api.service.method.ListMethodService;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListMethodServiceImpl implements ListMethodService {

  @Autowired
  private MethodRepository repository;

  @Autowired
  private MethodMapper mapper;

  @Override
  public List<MethodModelDto> execute() {
    return repository.findAll().stream()
        .map(mapper::toModel)
        .sorted(Comparator.comparing(MethodModelDto::getName))
        .toList();
  }

}
