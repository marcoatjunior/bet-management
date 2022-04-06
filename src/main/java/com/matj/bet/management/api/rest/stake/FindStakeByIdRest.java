package com.matj.bet.management.api.rest.stake;

import com.matj.bet.management.api.dto.response.StakeResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface FindStakeByIdRest extends StakeRest {
  
  @GetMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Consulta unidade de medida por id")
  public StakeResponseDto findById(@PathVariable String id);
}
