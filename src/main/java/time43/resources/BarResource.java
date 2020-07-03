package time43.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import time43.domain.Bar;
import time43.dto.BarEstadoDTO;
import time43.dto.PontuacaoDTO;
import time43.services.BarService;

@RestController
@RequestMapping("/bares")
public class BarResource {
	
	@Autowired
	private BarService barService;
	
	@GetMapping
	public ResponseEntity<List<Bar>> findAll() {
		
		
		List<Bar> bares = barService.findAll();
		return ResponseEntity.ok().body(bares);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Bar> findById(@PathVariable String id) {
		
		Bar bar = barService.findById(id);
		return ResponseEntity.ok().body(bar);
		
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Bar bar) {
		
		Bar obj = barService.insert(bar);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
	
	@PutMapping("/{id}/pontuacao")
	public ResponseEntity<Void> updatePontuacao(@PathVariable String id, @RequestBody PontuacaoDTO pontuacao) {
		
		Bar bar = barService.findById(id);
		bar.setId(id);
		bar.setPontuacao(pontuacao.getPontuacao());
		bar = barService.updatePontuacao(bar);
		return ResponseEntity.noContent().build();
		
	}
	
	@PutMapping("/{id}/estado")
	public ResponseEntity<Void> updateEstado(@PathVariable String id, @RequestBody BarEstadoDTO estado) {
		
		Bar bar = barService.findById(id);
		bar.setId(id);
		bar.setEstado(estado.getEstado());
		bar = barService.updateEstado(bar);
		return ResponseEntity.noContent().build();
		
	}

}






