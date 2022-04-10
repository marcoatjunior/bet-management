package com.matj.bet.management.api.rest.method;

import com.matj.bet.management.api.dto.request.method.MethodRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface UpdateMethodRest extends MethodRest {

  @PutMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  @Operation(description = "Atualiza método")
  public String update(@PathVariable String id, @RequestBody MethodRequestDto requestDto);
}
