package time43.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import time43.domain.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		
		Cliente cliente1 = new Cliente(1, "Eduardo", "eduardo@gmail.com");
		Cliente cliente2 = new Cliente(2, "Eliz", "eliz@gmail.com");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.addAll(Arrays.asList(cliente1, cliente2));
		
		return ResponseEntity.ok().body(clientes);
		
	}

}



