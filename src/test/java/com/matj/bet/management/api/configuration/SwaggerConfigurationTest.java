package com.matj.bet.management.api.configuration;

import static com.matj.bet.management.api.configuration.SwaggerConfiguration.API_DESCRIPTION;
import static com.matj.bet.management.api.configuration.SwaggerConfiguration.API_NAME;
import static com.matj.bet.management.api.configuration.SwaggerConfiguration.API_VERSION;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class SwaggerConfigurationTest {

  private static final String NOME = "CORPAC API";
  private static final String DESCRICAO = "API do CORPAC";
  private static final String VERSAO = "1.0.0";

  private @InjectMocks SwaggerConfiguration swagger;
  private @Mock Environment environment;

  @Test
  @DisplayName("Deve retornar dados da API")
  public void deveRetornarDadosApiLocal() {
    mockEnvironment();

    var api = swagger.getApi();
    assertThat(api).isNotNull();
    
    var info = api.getInfo();
    assertAll(
        () -> assertThat(info).isNotNull(),
        () -> assertThat(info.getTitle()).isEqualTo(NOME),
        () -> assertThat(info.getDescription()).isEqualTo(DESCRICAO),
        () -> assertThat(info.getVersion()).isEqualTo(VERSAO));
  }

  private void mockEnvironment() {
    when(environment.getProperty(API_NAME)).thenReturn(NOME);
    when(environment.getProperty(API_DESCRIPTION)).thenReturn(DESCRICAO);
    when(environment.getProperty(API_VERSION)).thenReturn(VERSAO);
  }
}
