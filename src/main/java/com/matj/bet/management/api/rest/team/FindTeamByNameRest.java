package com.matj.bet.management.api.rest.team;

import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface FindTeamByNameRest extends TeamRest {

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Consulta time de futebol por nome")
  public List<TeamResponseDto> findByName(@RequestParam("name") String name);
}
