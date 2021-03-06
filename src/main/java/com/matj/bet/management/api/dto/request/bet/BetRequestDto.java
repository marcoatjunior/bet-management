package com.matj.bet.management.api.dto.request.bet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BetRequestDto implements Serializable {
  
  private static final long serialVersionUID = -384732984732984L;

  @NotNull
  private LocalDate eventDate;
  
  @NotNull
  private String leagueId;

  @NotNull
  private String homeId;

  @NotNull
  private String awayId;

  @NotNull
  private String bet;

  @NotNull
  private String methodId;

  @NotNull
  private String stakeId;

  @NotNull
  private BigDecimal odd;
}
