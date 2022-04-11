package com.matj.bet.management.api.dto.request.bet;

import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import com.matj.bet.management.api.dto.request.stake.StakeRequestDto;
import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BetRequestDto implements Serializable {
  
  private static final long serialVersionUID = -384732984732984L;

  private LocalDateTime time;
  private String league;
  private TeamRequestDto home;
  private TeamRequestDto away;
  private MethodRequestDto method;
  private StakeRequestDto stake;
  private BigDecimal odd;
}
