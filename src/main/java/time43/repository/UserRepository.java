package time43.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import time43.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
