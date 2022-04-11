package com.matj.bet.management.api.service.bet;

import com.matj.bet.management.api.dto.model.bet.BetModelDto;

public interface CreateBetService {

  void execute(BetModelDto modelDto);
}
