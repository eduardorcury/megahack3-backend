package time43.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import time43.domain.Bar;
import time43.domain.Bebida;
import time43.domain.Cliente;
import time43.domain.Comida;
import time43.domain.Endereco;
import time43.domain.Menu;
import time43.repository.BarRepository;
import time43.repository.ClienteRepository;

@Configuration
public class Banco implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private BarRepository barRepository;

	@Override
	public void run(String... args) throws Exception {
		
		clienteRepository.deleteAll();
		barRepository.deleteAll();
		
		Cliente cliente1 = new Cliente(null, "Eduardo", "eduardo@gmail.com");
		Cliente cliente2 = new Cliente(null, "ELizabeth", "eliz@gmail.com");
		Cliente cliente3 = new Cliente(null, "Ana", "ana@gmail.com");
		
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2, cliente3));
		
		Bebida bebida1 = new Bebida("Skol", 10.0);
		Bebida bebida2 = new Bebida("Itaipava", 8.0);
		Bebida bebida3 = new Bebida("Guaraná", 5.0);
		Bebida bebida4 = new Bebida("Coca-cola", 5.5);
		
		Comida comida1 = new Comida("Batata Frita", 8.0);
		Comida comida2 = new Comida("Doce", 6.0);
		
		Menu menu1 = new Menu();
		Menu menu2 = new Menu();
		menu1.setBebidas(Arrays.asList(bebida1, bebida2));
		menu2.setBebidas(Arrays.asList(bebida3, bebida4));
		menu1.setComidas(Arrays.asList(comida1));
		menu1.setComidas(Arrays.asList(comida2));
		
		Endereco endereco1 = new Endereco("Rua Dourados", "270", "Centro");
		Endereco endereco2 = new Endereco("Rua São Carlos", "1500", "Centro");

		Bar bar1 = new Bar(null, "Bar do Zé", 5.0, menu1, endereco1);
		Bar bar2 = new Bar(null, "Bar da Vó", 5.0, menu2, endereco2);
		
		bar1.setClientes(Arrays.asList(cliente1, cliente2));
		bar2.setClientes(Arrays.asList(cliente2, cliente3));
		
		barRepository.saveAll(Arrays.asList(bar1, bar2));
		
	}

}
