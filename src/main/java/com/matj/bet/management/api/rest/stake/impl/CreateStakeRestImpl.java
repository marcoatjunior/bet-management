package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.dto.request.StakeRequestDto;
import com.matj.bet.management.api.mapper.StakeMapper;
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
  private StakeMapper mapper;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String create(StakeRequestDto requestDto) {
    service.execute(mapper.toModelDto(requestDto));
    return messageProvider.get(StakeMessageKey.CREATED.getKey());
  }
}
