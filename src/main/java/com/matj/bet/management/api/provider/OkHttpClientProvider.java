package com.matj.bet.management.api.provider;

import java.util.List;
import java.util.concurrent.TimeUnit;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OkHttpClientProvider {

  protected static OkHttpClient getOkHttpClient(//
      Integer timeout, Interceptor... interceptors) {
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    return buildOkHttpClient(timeout, builder, interceptors);
  }

  private static OkHttpClient buildOkHttpClient(//
      Integer timeout, OkHttpClient.Builder builder, Interceptor[] interceptors) {
    addInterceptors(builder, interceptors);
    return builder.readTimeout(timeout, TimeUnit.SECONDS).build();
  }

  private static void addInterceptors(//
      OkHttpClient.Builder builder, Interceptor[] interceptors) {
    List.of(interceptors).forEach(builder::addInterceptor);
  }

}
