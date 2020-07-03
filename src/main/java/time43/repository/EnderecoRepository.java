package time43.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import time43.domain.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {

}
