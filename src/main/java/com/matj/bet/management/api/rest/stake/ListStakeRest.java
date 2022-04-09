package com.matj.bet.management.api.rest.stake;

import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ListStakeRest extends StakeRest {
  
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Lista unidades de medida")
  public List<StakeResponseDto> list();
}
