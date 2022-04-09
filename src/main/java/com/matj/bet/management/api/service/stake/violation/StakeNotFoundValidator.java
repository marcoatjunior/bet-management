package com.matj.bet.management.api.service.stake.violation;

import static com.matj.bet.management.api.service.stake.violation.StakeViolationMessageKey.STAKE_NOT_FOUND;

import com.matj.bet.management.api.entity.StakeEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StakeNotFoundValidator {

  @Autowired
  private MessageProvider messageProvider;

  public StakeEntity validate(Optional<StakeEntity> optional) {
    return optional.orElseThrow(() -> {
      throw new BusinessViolationException(
          messageProvider.get(STAKE_NOT_FOUND.getKey()));
    });
  }
}
