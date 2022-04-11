package com.matj.bet.management.api.rest.bet.impl;

import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
import com.matj.bet.management.api.rest.bet.ListBetByYearMonthRest;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListBetByYearMonthRestImpl implements ListBetByYearMonthRest {

  @Override
  public List<StakeResponseDto> listByYearMonth(Long year, Long month) {
    return null;
  }
  
}
