package com.matj.bet.management.api.dto.model.bet;

import com.matj.bet.management.api.dto.model.league.LeagueModelDto;
import com.matj.bet.management.api.dto.model.method.MethodModelDto;
import com.matj.bet.management.api.dto.model.stake.StakeModelDto;
import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import com.matj.bet.management.api.enumeration.BetResultEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class BetModelDto implements Serializable {

  private static final long serialVersionUID = 6535376215231L;

  private String id;
  private LocalDate eventDate;
  private LeagueModelDto league;
  private TeamModelDto home;
  private TeamModelDto away;
  private String bet;
  private MethodModelDto method;
  private StakeModelDto stake;
  private BigDecimal odd;
  private BetResultEnum result;
}
