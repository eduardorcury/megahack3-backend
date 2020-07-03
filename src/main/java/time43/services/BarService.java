package time43.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import time43.domain.Bar;
import time43.repository.BarRepository;
import time43.services.exception.ObjectNotFoundException;

@Service
public class BarService {

	@Autowired
	private BarRepository barRepository;

	public List<Bar> findAll() {

		return barRepository.findAll();

	}

	public Bar findById(String id) {

		Optional<Bar> bar = barRepository.findById(id);
		return bar.orElseThrow(() -> new ObjectNotFoundException("Bar não encontrado"));

	}

	public Bar insert(Bar bar) {

		return barRepository.insert(bar);

	}

	public Bar updatePontuacao(Bar bar) {

		Bar newBar = findById(bar.getId());
		newBar.setClientes(bar.getClientes());
		newBar.setEndereco(bar.getEndereco());
		newBar.setEstado(bar.getEstado());
		newBar.setId(bar.getId());
		newBar.setMenu(bar.getMenu());
		newBar.setNome(bar.getNome());
		newBar.setPontuacao(bar.getPontuacao());
		return barRepository.save(newBar);

	}

	public Bar updateEstado(Bar bar) {

		Bar newBar = findById(bar.getId());
		newBar.setClientes(bar.getClientes());
		newBar.setEndereco(bar.getEndereco());
		newBar.setEstado(bar.getEstado());
		newBar.setId(bar.getId());
		newBar.setMenu(bar.getMenu());
		newBar.setNome(bar.getNome());
		newBar.setPontuacao(bar.getPontuacao());
		return barRepository.save(newBar);

	}

	public List<Bar> findByNome(String nome) {

		return barRepository.findByNomeContainingIgnoreCase(nome);

	}

	public List<Bar> search(String texto) {

		return barRepository.search(texto);

	}

}
