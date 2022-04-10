package com.matj.bet.management.api.rest.method;

import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ListMethodRest extends MethodRest {
  
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Lista métodos")
  public List<MethodResponseDto> list();
}
