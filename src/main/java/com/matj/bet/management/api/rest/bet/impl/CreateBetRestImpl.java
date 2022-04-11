package com.matj.bet.management.api.rest.bet.impl;

import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.bet.CreateBetRest;
import com.matj.bet.management.api.rest.method.MethodMessageKey;
import com.matj.bet.management.api.service.bet.CreateBetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateBetRestImpl implements CreateBetRest {

  @Autowired
  private CreateBetService service;

  @Autowired
  private BetMapper mapper;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String create(BetRequestDto requestDto) {
    service.execute(mapper.toModelDto(requestDto));
    return messageProvider.get(MethodMessageKey.CREATED.getKey());
  }
}