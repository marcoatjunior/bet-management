package com.matj.bet.management.api.provider;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

  @Autowired
  private MessageSource source;

  public String get(String key, String... params) {
    return source.getMessage(key, params, new Locale("PT", "br"));
  }
}
