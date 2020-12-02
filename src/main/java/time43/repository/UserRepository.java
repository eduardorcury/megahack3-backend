package time43.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import time43.model.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Long> {
    
}
