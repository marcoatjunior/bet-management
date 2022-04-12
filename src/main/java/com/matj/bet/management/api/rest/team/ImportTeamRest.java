package com.matj.bet.management.api.rest.team;

import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ImportTeamRest extends TeamRest {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  @Operation(description = "Importa times de API Football")
  public String doImport(@RequestBody TeamRequestDto requestDto);
}
