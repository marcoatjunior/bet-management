package com.matj.bet.management.api.rest.client.rapid.football;

import com.matj.bet.management.api.dto.model.team.TeamListModelDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FootballTeamsRestClient {

  @GET("teams")
  Call<TeamListModelDto> findByName(@Query("search") String name);
}
