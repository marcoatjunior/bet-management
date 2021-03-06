package com.matj.bet.management.api.dto.response.team;

import java.io.Serializable;
import lombok.Data;

@Data
public class TeamResponseDto implements Serializable {

  private static final long serialVersionUID = 8473298473294L;

  private String id;
  private Long apiId;
  private String name;
  private String logo;
}
