package com.matj.bet.management.api.dto.model.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamResponseModelDto implements Serializable {
  
  private static final long serialVersionUID = 343298483243298L;

  private TeamModelDto team;

}
