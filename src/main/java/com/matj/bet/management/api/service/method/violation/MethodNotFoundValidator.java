package com.matj.bet.management.api.service.method.violation;

import static com.matj.bet.management.api.service.method.violation.MethodViolationMessageKey.METHOD_NOT_FOUND;

import com.matj.bet.management.api.entity.MethodEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodNotFoundValidator {

  @Autowired
  private MessageProvider messageProvider;

  public MethodEntity validate(Optional<MethodEntity> optional) {
    return optional.orElseThrow(() -> {
      throw new BusinessViolationException(
          messageProvider.get(METHOD_NOT_FOUND.getKey()));
    });
  }
}
