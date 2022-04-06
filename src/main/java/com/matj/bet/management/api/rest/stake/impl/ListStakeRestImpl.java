package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.dto.response.StakeResponseDto;
import com.matj.bet.management.api.mapper.StakeMapper;
import com.matj.bet.management.api.rest.stake.ListStakeRest;
import com.matj.bet.management.api.service.stake.ListStakeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListStakeRestImpl implements ListStakeRest {

  @Autowired
  private ListStakeService service;

  @Autowired
  private StakeMapper mapper;

  @Override
  public List<StakeResponseDto> list() {
    return service.execute().stream().map(mapper::toResponseDto).toList();
  }

}
