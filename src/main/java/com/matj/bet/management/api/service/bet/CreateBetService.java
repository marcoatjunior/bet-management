package com.matj.bet.management.api.service.bet;

import com.matj.bet.management.api.dto.request.bet.BetRequestDto;

public interface CreateBetService {

  void execute(BetRequestDto modelDto);
}
