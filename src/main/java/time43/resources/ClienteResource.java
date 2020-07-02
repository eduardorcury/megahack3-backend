package time43.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import time43.domain.Cliente;
import time43.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		
		
		List<Cliente> clientes = clienteService.findAll();
		return ResponseEntity.ok().body(clientes);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable String id) {
		
		Cliente cliente = clienteService.findById(id);
		return ResponseEntity.ok().body(cliente);
		
	}

}



