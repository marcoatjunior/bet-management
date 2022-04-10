package com.matj.bet.management.api.service.method;

import com.matj.bet.management.api.dto.model.method.MethodModelDto;

public interface FindMethodByIdService {

  MethodModelDto execute(String id);
}
