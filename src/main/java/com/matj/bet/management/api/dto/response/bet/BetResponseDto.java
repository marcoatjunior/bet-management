package com.matj.bet.management.api.dto.response.bet;

import com.matj.bet.management.api.enumeration.BetResultEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BetResponseDto implements Serializable {

  private static final long serialVersionUID = -98371238621321L;

  private String id;
  private LocalDate eventDate;
  private String league;
  private String home;
  private String away;
  private String bet;
  private String method;
  private BigDecimal stake;
  private BigDecimal odd;
  private BetResultEnum result;
}
