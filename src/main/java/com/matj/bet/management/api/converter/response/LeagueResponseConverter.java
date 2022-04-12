package com.matj.bet.management.api.converter.response;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.dto.response.league.LeagueResponseDto;
import org.springframework.stereotype.Component;

@Component
public class LeagueResponseConverter {
  
  public LeagueResponseDto toResponse(LeagueModelDto modelDto) {
    var responseDto = new LeagueResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    return responseDto;
  }
}
