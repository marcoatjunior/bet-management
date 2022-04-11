package com.matj.bet.management.api.rest.league;

import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface UpdateLeagueRest extends LeagueRest {

  @PutMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Atualiza liga")
  public String update(@PathVariable String id, @RequestBody LeagueRequestDto requestDto);
}
