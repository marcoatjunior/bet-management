package com.matj.bet.management.api.dto.model.league;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LeagueModelDto implements Serializable {

  private static final long serialVersionUID = 7368721638721L;

  private String id;
  private String name;
}
