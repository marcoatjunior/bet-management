package com.matj.bet.management.api.dto.model.method;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MethodModelDto implements Serializable {

  private static final long serialVersionUID = 4863248763248L;

  private String id;
  private String name;
}
