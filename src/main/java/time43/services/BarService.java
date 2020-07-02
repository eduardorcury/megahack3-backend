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

}
