package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.StakeModelDto;
import com.matj.bet.management.api.dto.request.StakeRequestDto;
import com.matj.bet.management.api.dto.response.StakeResponseDto;
import com.matj.bet.management.api.entity.StakeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StakeMapper {

  StakeEntity toEntity(StakeModelDto requestDto);

  StakeResponseDto toResponseDto(StakeModelDto modelDto);

  StakeModelDto toModelDto(StakeEntity entity);

  StakeModelDto toModelDto(StakeRequestDto requestDto);
}
