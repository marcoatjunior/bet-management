package com.matj.bet.management.api.repository.team;

import com.matj.bet.management.api.entity.TeamEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<TeamEntity, String> {

  Optional<TeamEntity> findByApiId(Long apiId);

  @Query("{ 'name' : { '$regex' : ?0 , $options: 'i'}}")
  List<TeamEntity> findByName(String name);
}
