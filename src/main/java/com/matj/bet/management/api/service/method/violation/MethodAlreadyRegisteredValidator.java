package com.matj.bet.management.api.service.method.violation;

import static com.matj.bet.management.api.service.method.violation.MethodViolationMessageKey.METHOD_ALREADY_REGISTERED;

import com.matj.bet.management.api.entity.MethodEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodAlreadyRegisteredValidator {

  @Autowired
  private MessageProvider messageProvider;

  public MethodEntity validate(Optional<MethodEntity> optional) {
    if (optional.isPresent()) {
      throw new BusinessViolationException(
        messageProvider.get(METHOD_ALREADY_REGISTERED.getKey()));
    }
    return optional.get();
  }
}
