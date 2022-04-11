package com.matj.bet.management.api.rest.league;

import com.matj.bet.management.api.dto.response.league.LeagueResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface FindLeagueByIdRest extends LeagueRest {
  
  @GetMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Consulta liga por id")
  public LeagueResponseDto findById(@PathVariable String id);
}
