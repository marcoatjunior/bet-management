package com.matj.bet.management.api.rest.method.impl;

import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import com.matj.bet.management.api.mapper.MethodMapper;
import com.matj.bet.management.api.rest.method.FindMethodByIdRest;
import com.matj.bet.management.api.service.method.FindMethodByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindMethodByIdRestImpl implements FindMethodByIdRest {

  @Autowired
  private FindMethodByIdService service;

  @Autowired
  private MethodMapper mapper;

  @Override
  public MethodResponseDto findById(String id) {
    return mapper.toResponseDto(service.execute(id));
  }

}
