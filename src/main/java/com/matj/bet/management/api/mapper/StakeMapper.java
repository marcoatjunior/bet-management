package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import com.matj.bet.management.api.dto.response.stake.StakeResponseDto;
import com.matj.bet.management.api.entity.StakeEntity;
import org.mapstruct.Mapper;

@Mapper
public class StakeMapper {

  public StakeEntity toEntity(StakeModelDto requestDto) {
    var entity = new StakeEntity();
    entity.setId(requestDto.getId());
    entity.setSize(requestDto.getSize());
    entity.setWeight(requestDto.getWeight());
    return entity;
  }

  public StakeResponseDto toResponseDto(StakeModelDto modelDto) {
    var responseDto = new StakeResponseDto();
    responseDto.setId(modelDto.getId());
    responseDto.setSize(modelDto.getSize());
    responseDto.setWeight(modelDto.getWeight());
    return responseDto;
  }

  public StakeModelDto toModelDto(StakeEntity entity) {
    var modelDto = new StakeModelDto();
    modelDto.setId(entity.getId());
    modelDto.setSize(entity.getSize());
    modelDto.setWeight(entity.getWeight());
    return modelDto;
  }

  public StakeModelDto toModelDto(StakeRequestDto requestDto) {
    var modelDto = new StakeModelDto();
    modelDto.setSize(requestDto.getSize());
    modelDto.setWeight(requestDto.getWeight());
    return modelDto;
  }
}
