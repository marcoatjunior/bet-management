package com.matj.bet.management.api.dto.model.team.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamApiResponseModelDto implements Serializable {
  
  private static final long serialVersionUID = 343298483243298L;

  private TeamApiModelDto team;

}
