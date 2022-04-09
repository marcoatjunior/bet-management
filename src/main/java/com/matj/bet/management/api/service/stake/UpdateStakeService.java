package com.matj.bet.management.api.service.stake;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;

public interface UpdateStakeService {

  void execute(String id, StakeModelDto modelDto);
}
