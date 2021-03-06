package com.matj.bet.management.api.dto.model.team.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamApiListModelDto implements Serializable {

  private static final long serialVersionUID = 389473298473294L;

  private List<TeamApiResponseModelDto> response;
}
