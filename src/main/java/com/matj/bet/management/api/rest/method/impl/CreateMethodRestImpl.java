package com.matj.bet.management.api.rest.method.impl;

import com.matj.bet.management.api.converter.request.MethodRequestConverter;
import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.method.CreateMethodRest;
import com.matj.bet.management.api.rest.method.MethodMessageKey;
import com.matj.bet.management.api.service.method.CreateMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateMethodRestImpl implements CreateMethodRest {

  @Autowired
  private CreateMethodService service;

  @Autowired
  private MethodRequestConverter converter;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String create(MethodRequestDto requestDto) {
    service.execute(converter.toModel(requestDto));
    return messageProvider.get(MethodMessageKey.CREATED.getKey());
  }
}
