package com.matj.bet.management.api.rest.bet;

import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ListBetByYearMonthRest extends BetRest {

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Lista apostas por ano/mês")
  public List<StakeResponseDto> listByYearMonth(
      @RequestParam("year") Long year,
      @RequestParam("month") Long month);
}
