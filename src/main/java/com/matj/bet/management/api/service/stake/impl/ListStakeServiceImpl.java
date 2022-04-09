package com.matj.bet.management.api.service.stake.impl;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.mapper.StakeMapper;
import com.matj.bet.management.api.repository.stake.StakeRepository;
import com.matj.bet.management.api.service.stake.ListStakeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListStakeServiceImpl implements ListStakeService {

  @Autowired
  private StakeRepository repository;

  @Autowired
  private StakeMapper mapper;

  @Override
  public List<StakeModelDto> execute() {
    return repository.findAll().stream().map(mapper::toModelDto).toList();
  }

}
