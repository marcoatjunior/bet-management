package com.matj.bet.management.api.repository.bet;

import com.matj.bet.management.api.entity.BetEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends MongoRepository<BetEntity, String> {

  @Query("{ 'eventDate' : { $gt: ?0, $lt: ?1 } }")
  List<BetEntity> findByEventDateBetween(LocalDate start, LocalDate end);
}
