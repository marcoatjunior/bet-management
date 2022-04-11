package com.matj.bet.management.api.repository.stake;

import com.matj.bet.management.api.entity.StakeEntity;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StakeRepository extends MongoRepository<StakeEntity, String> {

  Optional<StakeEntity> findBySize(String size);
}
