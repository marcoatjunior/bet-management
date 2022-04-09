package com.matj.bet.management.api.configuration;

import com.matj.bet.management.api.provider.RetrofitProvider;
import com.matj.bet.management.api.rest.client.rapid.RapidApiRestClientInterceptor;
import com.matj.bet.management.api.rest.client.rapid.football.FootballTeamsRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class RapidApiConfiguration {

  protected static final String FOOTBALL_URL = "api.rapid.football.url";
  protected static final Integer TIMEOUT_HTTP = 60;

  private @Autowired Environment environment;

  @Bean
  public RapidApiRestClientInterceptor getRapidApiRestClientInterceptor() {
    return new RapidApiRestClientInterceptor();
  }

  @Bean
  public FootballTeamsRestClient getSoeAuthRestClientProducer() {
    return RetrofitProvider.getInstance(environment.getProperty(FOOTBALL_URL), //
        TIMEOUT_HTTP, getRapidApiRestClientInterceptor()) //
        .create(FootballTeamsRestClient.class);
  }
}
