package com.matj.bet.management.api.repository.league;

import com.matj.bet.management.api.entity.LeagueEntity;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends MongoRepository<LeagueEntity, String> {

  Optional<LeagueEntity> findByName(String name);
}
