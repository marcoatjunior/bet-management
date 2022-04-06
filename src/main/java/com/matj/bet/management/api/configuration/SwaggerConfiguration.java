package com.matj.bet.management.api.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class SwaggerConfiguration {

  protected static final String API_NAME = "application.name";
  protected static final String API_DESCRIPTION = "application.description";
  protected static final String API_VERSION = "application.version";

  private @Autowired Environment environment;

  @Bean
  public OpenAPI getApi() {
    return new OpenAPI().info(getInfo());
  }

  private Info getInfo() {
    return new Info().title(environment.getProperty(API_NAME))
        .description(environment.getProperty(API_DESCRIPTION))
        .version(environment.getProperty(API_VERSION));
  }
}
