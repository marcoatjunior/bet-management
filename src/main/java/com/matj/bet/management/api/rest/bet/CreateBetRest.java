package com.matj.bet.management.api.rest.bet;

import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface CreateBetRest extends BetRest {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  @Operation(description = "Cria aposta")
  public String create(@RequestBody BetRequestDto requestDto);
}
