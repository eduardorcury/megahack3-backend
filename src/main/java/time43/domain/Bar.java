package time43.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import time43.enums.BarEstado;

@Document
public class Bar implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String nome;
	private Double pontuacao;
	private Menu menu;
	private Endereco endereco;
	private BarEstado estado;
	
	private List<Cliente> clientes;
	
	public Bar() {
		
	}

	public Bar(String id, String nome, Double pontuacao, Menu menu, Endereco endereco, BarEstado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.pontuacao = pontuacao;
		this.menu = menu;
		this.endereco = endereco;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public BarEstado getEstado() {
		return estado;
	}

	public void setEstado(BarEstado estado) {
		this.estado = estado;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bar other = (Bar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
