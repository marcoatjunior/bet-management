package com.matj.bet.management.api.rest.team.impl;

import com.matj.bet.management.api.dto.request.team.TeamRequestDto;
import com.matj.bet.management.api.provider.MessageProvider;
import com.matj.bet.management.api.rest.team.ImportTeamRest;
import com.matj.bet.management.api.rest.team.TeamMessageKey;
import com.matj.bet.management.api.service.team.ImportTeamByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportTeamRestImpl implements ImportTeamRest {

  @Autowired
  private ImportTeamByNameService service;


  @Autowired
  private MessageProvider messageProvider;

  @Override
  public String doImport(TeamRequestDto requestDto) {
    service.execute(requestDto.getName());
    return messageProvider.get(TeamMessageKey.IMPORTED.getKey());
  }
}
