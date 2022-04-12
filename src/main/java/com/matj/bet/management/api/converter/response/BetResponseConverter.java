package com.matj.bet.management.api.converter.response;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.response.bet.BetResponseDto;
import org.springframework.stereotype.Component;

@Component
public class BetResponseConverter {
    
    public BetResponseDto toResponse(BetModelDto modelDto) {
      return BetResponseDto.builder()
          .id(modelDto.getId())
          .eventDate(modelDto.getEventDate())
          .league(modelDto.getLeague().getName())
          .home(modelDto.getHome().getName())
          .away(modelDto.getAway().getName())
          .bet(modelDto.getBet())
          .method(modelDto.getMethod().getName())
          .stake(modelDto.getStake().getWeight())
          .odd(modelDto.getOdd())
          .result(modelDto.getResult())
          .build();
      }
}
