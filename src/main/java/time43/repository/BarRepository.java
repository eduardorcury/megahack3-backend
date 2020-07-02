package time43.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import time43.domain.Bar;

@Repository
public interface BarRepository extends MongoRepository<Bar, String> {

}
