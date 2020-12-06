package time43.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import time43.domain.Pub;

@Repository
public interface PubRepository extends JpaRepository<Pub, Long> {
}
