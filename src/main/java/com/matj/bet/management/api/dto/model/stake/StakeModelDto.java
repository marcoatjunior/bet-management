package com.matj.bet.management.api.dto.model.stake;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class StakeModelDto implements Serializable {

  private static final long serialVersionUID = 23892139872183921L;

  private String id;
  private String size;
  private BigDecimal weight;
}
