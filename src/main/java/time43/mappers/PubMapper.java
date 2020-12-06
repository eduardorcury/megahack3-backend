package time43.mappers;

import org.mapstruct.Mapper;
import time43.domain.Pub;
import time43.model.PubDTO;

@Mapper
public interface PubMapper {

    PubDTO toDTO(Pub pub);

    Pub toDomain(PubDTO pubDTO);

}
