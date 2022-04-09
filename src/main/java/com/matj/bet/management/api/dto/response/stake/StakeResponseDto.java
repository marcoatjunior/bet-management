package com.matj.bet.management.api.dto.response.stake;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class StakeResponseDto implements Serializable {

  private static final long serialVersionUID = 47623487648763287L;

  private String id;
  private String size;
  private BigDecimal weight;
}
