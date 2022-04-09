package com.matj.bet.management.api.service.stake;

import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import java.util.List;

public interface ListStakeService {

  List<StakeModelDto> execute();
}
