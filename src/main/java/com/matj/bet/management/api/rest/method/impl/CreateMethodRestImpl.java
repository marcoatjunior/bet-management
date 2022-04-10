package com.matj.bet.management.api.rest.method.impl;

import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.mapper.MethodMapper;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.method.CreateMethodRest;
import com.matj.bet.management.api.rest.stake.StakeMessageKey;
import com.matj.bet.management.api.service.method.CreateMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateMethodRestImpl implements CreateMethodRest {

  @Autowired
  private CreateMethodService service;

  @Autowired
  private MethodMapper mapper;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String create(MethodRequestDto requestDto) {
    service.execute(mapper.toModelDto(requestDto));
    return messageProvider.get(StakeMessageKey.CREATED.getKey());
  }
}
