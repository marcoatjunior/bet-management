package com.matj.bet.management.api.dto.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class StakeModelDto {
  
  private String id;
  private String size;
  private BigDecimal weight;
}
