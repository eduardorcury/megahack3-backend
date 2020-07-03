package time43.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import time43.domain.Cliente;
import time43.repository.ClienteRepository;
import time43.security.ClienteDetails;

@Service
public class ClienteDetailsService implements UserDetailsService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Cliente cliente = clienteRepository.findByEmail(email);
		if (cliente == null) {
			throw new UsernameNotFoundException("Email não encontrado");
		}
		return new ClienteDetails(cliente.getId(), cliente.getEmail(), cliente.getSenha());
		
	}

}
