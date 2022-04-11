package com.matj.bet.management.api.service.stake.violation;

import static com.matj.bet.management.api.service.stake.violation.StakeViolationMessageKey.SIZE_ALREADY_REGISTERED;

import com.matj.bet.management.api.entity.StakeEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SizeAlreadyRegisteredValidator {

  @Autowired
  private MessageProvider messageProvider;

  public void validate(Optional<StakeEntity> entity) {
    if (!entity.isPresent()) {
      throw new BusinessViolationException(
          messageProvider.get(SIZE_ALREADY_REGISTERED.getKey()));
    }
  }
}
