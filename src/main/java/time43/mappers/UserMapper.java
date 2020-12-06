package time43.mappers;

import org.mapstruct.Mapper;
import time43.domain.User;
import time43.model.UserDTO;

@Mapper
public interface UserMapper {

    UserDTO toDTO(User user);

    User toDomain(UserDTO userDTO);

}
