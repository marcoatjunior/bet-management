package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.converter.response.StakeResponseConverter;
import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
import com.matj.bet.management.api.rest.stake.FindStakeByIdRest;
import com.matj.bet.management.api.service.stake.FindStakeByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindStakeByIdRestImpl implements FindStakeByIdRest {

  @Autowired
  private FindStakeByIdService service;

  @Autowired
  private StakeResponseConverter converter;

  @Override
  public StakeResponseDto findById(String id) {
    return converter.toResponse(service.execute(id));
  }
}
