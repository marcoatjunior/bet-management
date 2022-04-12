package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.converter.request.StakeRequestConverter;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.stake.StakeMessageKey;
import com.matj.bet.management.api.rest.stake.UpdateStakeRest;
import com.matj.bet.management.api.service.stake.UpdateStakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateStakeRestImpl implements UpdateStakeRest {

  @Autowired
  private UpdateStakeService service;

  @Autowired
  private StakeRequestConverter converter;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String update(String id, StakeRequestDto requestDto) {
    service.execute(id, converter.toModel(requestDto));
    return messageProvider.get(StakeMessageKey.UPDATED.getKey());
  }
}
