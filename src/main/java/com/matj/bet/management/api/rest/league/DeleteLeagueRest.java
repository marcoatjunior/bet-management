package com.matj.bet.management.api.rest.league;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface DeleteLeagueRest extends LeagueRest {

  @DeleteMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Exclui liga")
  public String delete(@PathVariable String id);
}
