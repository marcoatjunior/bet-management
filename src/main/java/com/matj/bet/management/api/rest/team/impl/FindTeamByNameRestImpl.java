package com.matj.bet.management.api.rest.team.impl;

import com.matj.bet.management.api.converter.response.TeamResponseConverter;
import com.matj.bet.management.api.dto.response.team.TeamResponseDto;
import com.matj.bet.management.api.rest.team.FindTeamByNameRest;
import com.matj.bet.management.api.service.team.impl.FindTeamByNameServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindTeamByNameRestImpl implements FindTeamByNameRest {

  @Autowired
  private FindTeamByNameServiceImpl service;

  @Autowired
  private TeamResponseConverter converter;

  @Override
  public List<TeamResponseDto> findByName(String name) {
    return service.execute(name).stream().map(converter::toResponse).toList();
  }

}
