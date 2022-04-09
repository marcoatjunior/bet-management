package com.matj.bet.management.api.dto.request.stake;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class StakeRequestDto implements Serializable {

  private static final long serialVersionUID = 988347832749832L;

  private String size;
  private BigDecimal weight;
}
