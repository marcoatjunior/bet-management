package com.matj.bet.management.api.service.league.impl;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.mapper.LeagueMapper;
import com.matj.bet.management.api.repository.league.LeagueRepository;
import com.matj.bet.management.api.service.league.ListLeagueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListLeagueServiceImpl implements ListLeagueService {

  @Autowired
  private LeagueRepository repository;

  @Autowired
  private LeagueMapper mapper;

  @Override
  public List<LeagueModelDto> execute() {
    return repository.findAll().stream().map(mapper::toModel).toList();
  }

}
