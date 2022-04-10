package com.matj.bet.management.api.service.method;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;

public interface UpdateMethodService {

  void execute(String id, MethodModelDto modelDto);
}
