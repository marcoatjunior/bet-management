package com.matj.bet.management.api.mapper;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeamMapper {

  TeamResponseDto toResponseDto(TeamModelDto modelDto);
}
