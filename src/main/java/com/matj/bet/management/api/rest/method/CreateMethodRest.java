package com.matj.bet.management.api.rest.method;

import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface CreateMethodRest extends MethodRest {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  @Operation(description = "Cria método")
  public String create(@RequestBody MethodRequestDto requestDto);
}
