package com.matj.bet.management.api.converter.request;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import org.springframework.stereotype.Component;

@Component
public class MethodRequestConverter {

  public MethodModelDto toModel(MethodRequestDto requestDto) {
    return MethodModelDto.builder()
        .name(requestDto.getName())
        .build();
  }
}
