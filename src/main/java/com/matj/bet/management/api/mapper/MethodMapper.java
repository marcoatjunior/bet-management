package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.entity.MethodEntity;
import org.springframework.stereotype.Component;

@Component
public class MethodMapper {

  public MethodEntity toEntity(MethodModelDto requestDto) {
    var entity = new MethodEntity();
    entity.setId(requestDto.getId());
    entity.setName(requestDto.getName());
    return entity;
  }

  public MethodModelDto toModel(MethodEntity entity) {
    var modelDto = new MethodModelDto();
    modelDto.setId(entity.getId());
    modelDto.setName(entity.getName());
    return modelDto;
  }
}
