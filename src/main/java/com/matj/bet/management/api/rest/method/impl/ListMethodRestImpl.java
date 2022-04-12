package com.matj.bet.management.api.rest.method.impl;

import com.matj.bet.management.api.converter.response.MethodResponseConverter;
import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import com.matj.bet.management.api.rest.method.ListMethodRest;
import com.matj.bet.management.api.service.method.ListMethodService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListMethodRestImpl implements ListMethodRest {

  @Autowired
  private ListMethodService service;

  @Autowired
  private MethodResponseConverter converter;

  @Override
  public List<MethodResponseDto> list() {
    return service.execute().stream().map(converter::toResponse).toList();
  }

}
