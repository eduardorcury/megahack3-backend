package time43.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import time43.domain.Endereco;
import time43.services.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll() {
		
		List<Endereco> enderecos = enderecoService.findAll();
		return ResponseEntity.ok().body(enderecos);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable String id) {
		
		Endereco endereco = enderecoService.findById(id);
		return ResponseEntity.ok().body(endereco);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Endereco endereco) {
		
		Endereco obj = enderecoService.insert(endereco);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}

}
