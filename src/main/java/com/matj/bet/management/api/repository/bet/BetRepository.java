package com.matj.bet.management.api.repository.bet;

import com.matj.bet.management.api.entity.BetEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends MongoRepository<BetEntity, String> {
}
