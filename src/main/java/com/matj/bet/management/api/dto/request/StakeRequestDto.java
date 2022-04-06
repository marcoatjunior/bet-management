package com.matj.bet.management.api.dto.request;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class StakeRequestDto {
  
  private String size;
  private BigDecimal weight;
}
