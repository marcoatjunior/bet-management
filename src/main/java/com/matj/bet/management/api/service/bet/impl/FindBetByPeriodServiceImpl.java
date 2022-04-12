package com.matj.bet.management.api.service.bet.impl;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import com.matj.bet.management.api.mapper.BetMapper;
import com.matj.bet.management.api.repository.bet.BetRepository;
import com.matj.bet.management.api.service.bet.FindBetByPeriodService;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindBetByPeriodServiceImpl implements FindBetByPeriodService {

  @Autowired
  private BetRepository repository;

  @Autowired
  private BetMapper mapper;

  @Override
  public List<BetModelDto> execute(LocalDate start, LocalDate end) {
    return repository.findByEventDateBetween(start, end)
        .stream()
        .map(mapper::toModel)
        .sorted(Comparator.comparing(BetModelDto::getEventDate))
        .toList();
  }

}
