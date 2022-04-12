package com.matj.bet.management.api.service.team.violation;

import static com.matj.bet.management.api.service.team.violation.TeamViolationMessageKey.TEAM_NOT_FOUND;

import com.matj.bet.management.api.entity.TeamEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamNotFoundValidator {

  @Autowired
  private MessageProvider messageProvider;

  public TeamEntity validate(Optional<TeamEntity> optional) {
    return optional.orElseThrow(() -> {
      throw new BusinessViolationException(
          messageProvider.get(TEAM_NOT_FOUND.getKey()));
    });
  }
}
