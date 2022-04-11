package com.matj.bet.management.api.repository.team;

import com.matj.bet.management.api.entity.TeamEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<TeamEntity, String> {
}
