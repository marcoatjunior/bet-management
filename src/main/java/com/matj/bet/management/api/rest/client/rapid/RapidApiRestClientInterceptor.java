package com.matj.bet.management.api.rest.client.rapid;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class RapidApiRestClientInterceptor implements Interceptor {

  private static final String HEADER_HOST = "X-RapidAPI-Host";
  private static final String HEADER_KEY = "X-RapidAPI-Key ";

  protected static final String SOE_AUTH_CLIENT = "client.i5.id";
  protected static final String SOE_AUTH_SECRET = "client.i5.secret";

  private @Autowired Environment environment;

  @Override
  public Response intercept(Interceptor.Chain chain) throws IOException {
    var original = chain.request();
    var requestBuilder = original.newBuilder() //
        .headers(Headers.of( //
            HEADER_HOST, environment.getProperty("api.rapid.host.url"), //
            HEADER_KEY, environment.getProperty("api.rapid.key.secret")));
    return chain.proceed(requestBuilder.build());
  }

}
