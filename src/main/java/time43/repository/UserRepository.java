package time43.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import time43.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
