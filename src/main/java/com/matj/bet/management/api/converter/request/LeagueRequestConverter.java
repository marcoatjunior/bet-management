package com.matj.bet.management.api.converter.request;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import org.springframework.stereotype.Component;

@Component
public class LeagueRequestConverter {
  
  public LeagueModelDto toModel(LeagueRequestDto requestDto) {
    return LeagueModelDto.builder()
        .name(requestDto.getName())
        .build();
  }
}
