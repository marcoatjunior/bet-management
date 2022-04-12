package com.matj.bet.management.api.dto.model.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamModelDto implements Serializable {

  private static final long serialVersionUID = -83473284632L;

  private String id;
  private Long apiId;
  private String name;
  private String logo;

}
