package com.matj.bet.management.api.repository.method;

import com.matj.bet.management.api.entity.MethodEntity;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodRepository extends MongoRepository<MethodEntity, String> {

  List<MethodEntity> findByName(String size);
}
