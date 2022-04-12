package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.entity.MethodEntity;
import org.springframework.stereotype.Component;

@Component
public class MethodMapper {

  public MethodEntity toEntity(MethodModelDto modelDto) {
    return MethodEntity.builder()
        .id(modelDto.getId())
        .name(modelDto.getName())
        .build();
  }

  public MethodModelDto toModel(MethodEntity entity) {
    return MethodModelDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .build();
  }
}
