package com.matj.bet.management.api.dto.model.team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamModelDto implements Serializable {

  private static final long serialVersionUID = 8731623872168371L;

  private Long id;
  private String name;
  private String code;
  private String country;
  private Long founded;
  private Boolean national;
  private String logo;

}
