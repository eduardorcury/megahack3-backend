package time43.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import time43.domain.Cliente;
import time43.repository.ClienteRepository;
import time43.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		
		return clienteRepository.findAll();
		
	}
	
	public Cliente findById(String id) {
		
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
		
	}

}
