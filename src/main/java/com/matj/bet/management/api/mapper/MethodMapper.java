package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import com.matj.bet.management.api.entity.MethodEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MethodMapper {

  MethodEntity toEntity(MethodModelDto requestDto);

  MethodResponseDto toResponseDto(MethodModelDto modelDto);

  MethodModelDto toModelDto(MethodEntity entity);

  MethodModelDto toModelDto(MethodRequestDto requestDto);
}
