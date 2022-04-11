package com.matj.bet.management.api.dto.response.league;

import java.io.Serializable;
import lombok.Data;

@Data
public class LeagueResponseDto implements Serializable {

  private static final long serialVersionUID = 983721983721L;

  private String id;
  private String name;
}
