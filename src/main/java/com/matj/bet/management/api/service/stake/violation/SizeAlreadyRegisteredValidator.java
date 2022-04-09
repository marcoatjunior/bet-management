package com.matj.bet.management.api.service.stake.violation;

import static com.matj.bet.management.api.service.stake.violation.StakeViolationMessageKey.SIZE_ALREADY_REGISTERED;

import com.matj.bet.management.api.entity.StakeEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class SizeAlreadyRegisteredValidator {

  @Autowired
  private MessageProvider messageProvider;

  public void validate(List<StakeEntity> entities) {
    if (!CollectionUtils.isEmpty(entities)) {
      throw new BusinessViolationException(
          messageProvider.get(SIZE_ALREADY_REGISTERED.getKey()));
    }
  }
}
