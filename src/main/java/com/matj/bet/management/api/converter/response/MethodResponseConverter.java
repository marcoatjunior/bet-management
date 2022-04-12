package com.matj.bet.management.api.converter.response;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import org.springframework.stereotype.Component;

@Component
public class MethodResponseConverter {

  public MethodResponseDto toResponse(MethodModelDto modelDto) {
    var responseDto = new MethodResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    return responseDto;
  }
}
