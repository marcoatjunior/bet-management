package com.matj.bet.management.api.provider;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RetrofitProvider {

  public static Retrofit getInstance(String url, Integer timeout, Interceptor... interceptors) {
    var httpClient = OkHttpClientProvider.getOkHttpClient(timeout, interceptors);
    return buildRetrofit(url, httpClient);
  }

  private static Retrofit buildRetrofit(String url, OkHttpClient httpClient) {
    return new Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(JacksonConverterFactory.create())
        .client(httpClient)
        .build();
  }
}