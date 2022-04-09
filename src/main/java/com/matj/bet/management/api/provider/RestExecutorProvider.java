package com.matj.bet.management.api.provider;

import com.matj.bet.management.api.exception.BusinessViolationException;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Response;

@Slf4j
public class RestExecutorProvider {

  public static <T> T execute(Call<T> call) {
    try {
      Response<T> response = call.execute();
      if (response.isSuccessful()) {
        return response.body();
      }
      throw new BusinessViolationException("Ocorreu um erro ao chamar o serviço.");
    } catch (IOException exception) {
      log.error(exception.getMessage(), exception);
      throw new BusinessViolationException("Ocorreu um erro inesperado.");
    }
  }
}
