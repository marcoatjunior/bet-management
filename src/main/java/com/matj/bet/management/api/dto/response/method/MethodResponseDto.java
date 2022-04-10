package com.matj.bet.management.api.dto.response.method;

import java.io.Serializable;
import lombok.Data;

@Data
public class MethodResponseDto implements Serializable {

  private static final long serialVersionUID = 7643764873264832L;

  private String id;
  private String name;
}
