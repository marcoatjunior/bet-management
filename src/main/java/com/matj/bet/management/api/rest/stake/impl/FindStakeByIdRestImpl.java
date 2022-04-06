package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.dto.response.StakeResponseDto;
import com.matj.bet.management.api.mapper.StakeMapper;
import com.matj.bet.management.api.rest.stake.FindStakeByIdRest;
import com.matj.bet.management.api.service.stake.FindStakeByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindStakeByIdRestImpl implements FindStakeByIdRest {

  @Autowired
  private FindStakeByIdService service;

  @Autowired
  private StakeMapper mapper;

  @Override
  public StakeResponseDto findById(String id) {
    return mapper.toResponseDto(service.execute(id));
  }

}
