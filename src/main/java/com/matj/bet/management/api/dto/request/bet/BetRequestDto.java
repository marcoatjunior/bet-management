package com.matj.bet.management.api.dto.request.bet;

import com.matj.bet.management.api.dto.request.league.LeagueRequestDto;
import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BetRequestDto implements Serializable {
  
  private static final long serialVersionUID = -384732984732984L;

  @NotNull
  private LocalDateTime time;
  
  @NotNull
  private LeagueRequestDto league;

  @NotNull
  private TeamRequestDto home;

  @NotNull
  private TeamRequestDto away;

  @NotNull
  private MethodRequestDto method;

  @NotNull
  private StakeRequestDto stake;

  @NotNull
  private BigDecimal odd;
}
