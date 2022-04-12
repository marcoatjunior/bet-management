package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.converter.request.StakeRequestConverter;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.stake.CreateStakeRest;
import com.matj.bet.management.api.rest.stake.StakeMessageKey;
import com.matj.bet.management.api.service.stake.CreateStakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateStakeRestImpl implements CreateStakeRest {

  @Autowired
  private CreateStakeService service;

  @Autowired
  private StakeRequestConverter converter;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String create(StakeRequestDto requestDto) {
    service.execute(converter.toModel(requestDto));
    return messageProvider.get(StakeMessageKey.CREATED.getKey());
  }
}
