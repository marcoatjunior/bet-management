package com.matj.bet.management.api.rest.bet.impl;

import com.matj.bet.management.api.dto.response.bet.BetResponseDto;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.rest.bet.FindBetByPeriodRest;
import com.matj.bet.management.api.service.bet.FindBetByPeriodService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindBetByPeriodRestImpl implements FindBetByPeriodRest {

  @Autowired
  private FindBetByPeriodService service;

  @Autowired
  private BetMapper mapper;

  @Override
  public List<BetResponseDto> findByPeriod(LocalDate start, LocalDate end) {
    return service.execute(start, end).stream().map(mapper::toResponseDto).toList();
  }

}
