package com.matj.bet.management.api.dto.response;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class StakeResponseDto {
  
  private String id;
  private String size;
  private BigDecimal weight;
}
