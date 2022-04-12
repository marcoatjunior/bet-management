package com.matj.bet.management.api.converter.request;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import org.springframework.stereotype.Component;

@Component
public class StakeRequestConverter {

  public StakeModelDto toModel(StakeRequestDto requestDto) {
    var modelDto = new StakeModelDto();
    modelDto.setSize(requestDto.getSize());
    modelDto.setWeight(requestDto.getWeight());
    return modelDto;
  }
}
