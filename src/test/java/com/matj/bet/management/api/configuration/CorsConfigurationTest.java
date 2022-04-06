package com.matj.bet.management.api.configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@ExtendWith(SpringExtension.class)
public class CorsConfigurationTest {

  private @InjectMocks CorsConfiguration configuration;

  @Test
  @DisplayName("Deve instanciar bean de configurações do CORS")
  public void deveInstanciarBean() {
    var registry = spy(CorsRegistry.class);

    configuration.addCorsMappings(registry);
    verify(registry).addMapping("/**");

    assertThat(registry).isNotNull();
  }
}
