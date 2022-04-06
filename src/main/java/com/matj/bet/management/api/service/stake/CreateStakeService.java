package com.matj.bet.management.api.service.stake;

import com.matj.bet.management.api.dto.model.StakeModelDto;

public interface CreateStakeService {

  void execute(StakeModelDto modelDto);
}
