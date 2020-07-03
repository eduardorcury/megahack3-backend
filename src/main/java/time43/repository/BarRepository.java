package time43.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import time43.domain.Bar;

@Repository
public interface BarRepository extends MongoRepository<Bar, String> {
	
	List<Bar> findByNomeContainingIgnoreCase(String nome);
	
	@Query("{ $or: [ { 'nome' : { $regex: ?0, $options: 'i' } }, { 'menu.bebidas.nome' : { $regex: ?0, $options: 'i' } }, { 'menu.comidas.nome' : { $regex: ?0, $options: 'i' } } ] }")
	List<Bar> search(String texto);
	
}
