package com.matj.bet.management.api.rest.method.impl;

import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.method.DeleteMethodRest;
import com.matj.bet.management.api.rest.method.MethodMessageKey;
import com.matj.bet.management.api.service.method.DeleteMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteMethodRestImpl implements DeleteMethodRest {

  @Autowired
  private DeleteMethodService service;

  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String delete(String id) {
    service.execute(id);
    return messageProvider.get(MethodMessageKey.DELETED.getKey());
  }
}
