package com.matj.bet.management.api.service.method.violation;

import static com.matj.bet.management.api.service.method.violation.MethodViolationMessageKey.METHOD_ALREADY_REGISTERED;

import com.matj.bet.management.api.entity.MethodEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class NameAlreadyRegisteredValidator {

  @Autowired
  private MessageProvider messageProvider;

  public void validate(List<MethodEntity> entities) {
    if (!CollectionUtils.isEmpty(entities)) {
      throw new BusinessViolationException(
          messageProvider.get(METHOD_ALREADY_REGISTERED.getKey()));
    }
  }
}
