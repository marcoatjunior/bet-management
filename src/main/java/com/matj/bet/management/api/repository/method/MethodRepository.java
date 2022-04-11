package com.matj.bet.management.api.repository.method;

import com.matj.bet.management.api.entity.MethodEntity;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodRepository extends MongoRepository<MethodEntity, String> {

  Optional<MethodEntity> findByName(String name);
}
