package com.matj.bet.management.api.dto.request.team;

import java.io.Serializable;
import lombok.Data;

@Data
public class TeamRequestDto implements Serializable {

  private static final long serialVersionUID = 98473298473289L;

  private Long id;
  private String name;
  private String logo;
}
