package com.matj.bet.management.api.converter.request;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import org.springframework.stereotype.Component;

@Component
public class StakeRequestConverter {

  public StakeModelDto toModel(StakeRequestDto requestDto) {
    return StakeModelDto.builder()
        .size(requestDto.getSize())
        .weight(requestDto.getWeight())
        .build();
  }
}
