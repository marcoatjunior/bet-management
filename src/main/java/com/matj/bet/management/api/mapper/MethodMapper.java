package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import com.matj.bet.management.api.entity.MethodEntity;
import org.mapstruct.Mapper;

@Mapper
public class MethodMapper {

  public MethodEntity toEntity(MethodModelDto requestDto) {
    var entity = new MethodEntity();
    entity.setId(requestDto.getId());
    entity.setName(requestDto.getName());
    return entity;
  }

  public MethodResponseDto toResponseDto(MethodModelDto modelDto) {
    var responseDto = new MethodResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setName(modelDto.getName());
    return responseDto;
  }

  public MethodModelDto toModelDto(MethodEntity entity) {
    var modelDto = new MethodModelDto();
    modelDto.setId(entity.getId());
    modelDto.setName(entity.getName());
    return modelDto;
  }

  public MethodModelDto toModelDto(MethodRequestDto requestDto) {
    var modelDto = new MethodModelDto();
    modelDto.setName(requestDto.getName());
    return modelDto;
  }
}
