package time43.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import time43.domain.Endereco;
import time43.repository.EnderecoRepository;
import time43.services.exception.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<Endereco> findAll() {
		
		return enderecoRepository.findAll();
		
	}
	
	public Endereco findById(String id) {

		Optional<Endereco> endereco = enderecoRepository.findById(id);
		return endereco.orElseThrow(() -> new ObjectNotFoundException("Endereço não encontrado"));

	}

	public Endereco insert(Endereco endereco) {

		return enderecoRepository.insert(endereco);

	}

}
