package com.matj.bet.management.api.rest.client.rapid.football;

import com.matj.bet.management.api.dto.model.team.api.TeamApiListModelDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FootballTeamsRestClient {

  @GET("teams")
  Call<TeamApiListModelDto> findByName(@Query("search") String name);
}
