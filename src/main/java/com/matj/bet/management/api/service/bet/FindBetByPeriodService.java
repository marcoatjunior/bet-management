package com.matj.bet.management.api.service.bet;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;
import java.time.LocalDate;
import java.util.List;

public interface FindBetByPeriodService {

  List<BetModelDto> execute(LocalDate start, LocalDate end);
}
