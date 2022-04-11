package com.matj.bet.management.api.rest.league;

import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface CreateLeagueRest extends LeagueRest {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  @Operation(description = "Cria liga")
  public String create(@RequestBody LeagueRequestDto requestDto);
}
