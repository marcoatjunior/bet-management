package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.entity.StakeEntity;
import org.springframework.stereotype.Component;

@Component
public class StakeMapper {

  public StakeEntity toEntity(StakeModelDto requestDto) {
    var entity = new StakeEntity();
    entity.setId(requestDto.getId());
    entity.setSize(requestDto.getSize());
    entity.setWeight(requestDto.getWeight());
    return entity;
  }

  public StakeModelDto toModel(StakeEntity entity) {
    var modelDto = new StakeModelDto();
    modelDto.setId(entity.getId());
    modelDto.setSize(entity.getSize());
    modelDto.setWeight(entity.getWeight());
    return modelDto;
  }
}
