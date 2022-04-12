package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.entity.StakeEntity;
import org.springframework.stereotype.Component;

@Component
public class StakeMapper {

  public StakeEntity toEntity(StakeModelDto modelDto) {
    return StakeEntity.builder()
        .id(modelDto.getId())
        .size(modelDto.getSize())
        .weight(modelDto.getWeight())
        .build();
  }

  public StakeModelDto toModel(StakeEntity entity) {
    return StakeModelDto.builder()
        .id(entity.getId())
        .size(entity.getSize())
        .weight(entity.getWeight())
        .build();
  }
}
