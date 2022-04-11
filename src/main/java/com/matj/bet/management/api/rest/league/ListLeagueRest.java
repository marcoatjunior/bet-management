package com.matj.bet.management.api.rest.league;

import com.matj.bet.management.api.dto.response.league.LeagueResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ListLeagueRest extends LeagueRest {
  
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Lista ligas")
  public List<LeagueResponseDto> list();
}
