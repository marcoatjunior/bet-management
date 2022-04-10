package com.matj.bet.management.api.rest.method;

import com.matj.bet.management.api.dto.response.method.MethodResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface FindMethodByIdRest extends MethodRest {
  
  @GetMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Consulta método por id")
  public MethodResponseDto findById(@PathVariable String id);
}
