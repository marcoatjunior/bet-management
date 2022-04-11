package com.matj.bet.management.api.service.league.violation;

import static com.matj.bet.management.api.service.league.violation.LeagueViolationMessageKey.LEAGUE_NOT_FOUND;

import com.matj.bet.management.api.entity.LeagueEntity;
import com.matj.bet.management.api.exception.BusinessViolationException;
import com.matj.bet.management.api.provider.MessageProvider;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeagueNotFoundValidator {

  @Autowired
  private MessageProvider messageProvider;

  public LeagueEntity validate(Optional<LeagueEntity> optional) {
    return optional.orElseThrow(() -> {
      throw new BusinessViolationException(
          messageProvider.get(LEAGUE_NOT_FOUND.getKey()));
    });
  }
}
