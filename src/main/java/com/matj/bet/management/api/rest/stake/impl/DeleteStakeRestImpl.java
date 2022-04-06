package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.stake.DeleteStakeRest;
import com.matj.bet.management.api.rest.stake.StakeMessageKey;
import com.matj.bet.management.api.service.stake.DeleteStakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteStakeRestImpl implements DeleteStakeRest {

  @Autowired
  private DeleteStakeService service;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String delete(String id) {
    service.execute(id);
    return messageProvider.get(StakeMessageKey.DELETED.getKey());
  }
}
