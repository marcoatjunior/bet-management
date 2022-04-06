package com.matj.bet.management.api.rest.stake;

import com.matj.bet.management.api.dto.request.StakeRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface UpdateStakeRest extends StakeRest {

  @PutMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Atualiza unidade de medida")
  public String update(@PathVariable String id, @RequestBody StakeRequestDto requestDto);
}
