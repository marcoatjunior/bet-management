package com.matj.bet.management.api.converter.request;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.dto.request.bet.BetRequestDto;
import org.springframework.stereotype.Component;

@Component
public class BetRequestConverter {
    
    public BetModelDto toModel(BetRequestDto requestDto) {
        return BetModelDto.builder()
            .eventDate(requestDto.getEventDate())
            .bet(requestDto.getBet())
            .odd(requestDto.getOdd())
            .build();
      }
}
