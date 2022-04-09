package com.matj.bet.management.api.rest.client.rapid.football;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FootballTeamsRestClient {

  @GET("teams")
  Call<List<Object>> searchByName(@Query("search") String name);
}
