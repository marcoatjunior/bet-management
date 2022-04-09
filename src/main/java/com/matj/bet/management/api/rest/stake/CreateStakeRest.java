package com.matj.bet.management.api.rest.stake;

import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface CreateStakeRest extends StakeRest {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  @Operation(description = "Cria unidade de medida")
  public String create(@RequestBody StakeRequestDto requestDto);
}
