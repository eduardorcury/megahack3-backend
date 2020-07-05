package time43.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import time43.domain.Cliente;
import time43.repository.ClienteRepository;
import time43.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		
		return clienteRepository.findAll();
		
	}
	
	public Cliente findById(String id) {
		
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
		
	}
	
	public Cliente insert(Cliente cliente) {
		
		Cliente novoCliente = new Cliente(null, cliente.getNome(), cliente.getCpf(), cliente.getNascimento(), cliente.getEmail(), encoder.encode(cliente.getSenha()));
		return clienteRepository.insert(novoCliente);
		
	}
	
	public Cliente updateMoedas(Cliente cliente) {
		
		Cliente newCliente = findById(cliente.getId());
		newCliente.setId(cliente.getId());
		newCliente.setNome(cliente.getNome());
		newCliente.setCpf(cliente.getCpf());
		newCliente.setNascimento(cliente.getNascimento());
		newCliente.setEmail(cliente.getEmail());
		newCliente.setMoedas(cliente.getMoedas());
		return clienteRepository.save(newCliente);
		
	}

}
