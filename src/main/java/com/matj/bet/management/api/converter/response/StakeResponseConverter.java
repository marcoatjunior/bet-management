package com.matj.bet.management.api.converter.response;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
import org.springframework.stereotype.Component;

@Component
public class StakeResponseConverter {

  public StakeResponseDto toResponse(StakeModelDto modelDto) {
    var responseDto = new StakeResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setSize(modelDto.getSize());
    responseDto.setWeight(modelDto.getWeight());
    return responseDto;
  }
}
