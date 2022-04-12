package com.matj.bet.management.api.rest.bet;

import com.matj.bet.management.api.dto.response.bet.BetResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import java.time.LocalDate;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface FindBetByPeriodRest extends BetRest {

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Lista apostas por período")
  public List<BetResponseDto> findByPeriod(
      @RequestParam("start") LocalDate start,
      @RequestParam("end") LocalDate end);
}
