package com.matj.bet.management.api.rest.method.impl;

import com.matj.bet.management.api.converter.request.MethodRequestConverter;
import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.method.MethodMessageKey;
import com.matj.bet.management.api.rest.method.UpdateMethodRest;
import com.matj.bet.management.api.service.method.UpdateMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateMethodRestImpl implements UpdateMethodRest {

  @Autowired
  private UpdateMethodService service;

  @Autowired
  private MethodRequestConverter converter;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String update(String id, MethodRequestDto requestDto) {
    service.execute(id, converter.toModel(requestDto));
    return messageProvider.get(MethodMessageKey.UPDATED.getKey());
  }
}
