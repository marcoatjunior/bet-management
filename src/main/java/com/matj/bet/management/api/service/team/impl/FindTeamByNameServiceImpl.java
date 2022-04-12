package com.matj.bet.management.api.service.team.impl;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.mapper.TeamMapper;
import com.matj.bet.management.api.repository.team.TeamRepository;
import com.matj.bet.management.api.service.team.FindTeamByNameService;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindTeamByNameServiceImpl implements FindTeamByNameService {

  @Autowired
  private TeamRepository repository;

  @Autowired
  private TeamMapper mapper;

  @Override
  public List<TeamModelDto> execute(String name) {
    return repository.findByName(name)
        .stream()
        .map(mapper::toModelDto)
        .sorted(Comparator.comparing(TeamModelDto::getName))
        .toList();
  }
}
