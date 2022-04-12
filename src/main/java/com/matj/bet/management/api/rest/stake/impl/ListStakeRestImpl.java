package com.matj.bet.management.api.rest.stake.impl;

import com.matj.bet.management.api.converter.response.StakeResponseConverter;
import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
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
  private StakeResponseConverter converter;

  @Override
  public List<StakeResponseDto> list() {
    return service.execute().stream().map(converter::toResponse).toList();
  }
}
