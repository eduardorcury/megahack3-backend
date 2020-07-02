package time43.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Bebida> bebidas = new ArrayList<>();
	private List<Comida> comidas = new ArrayList<>();

	public List<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public List<Comida> getComidas() {
		return comidas;
	}

	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}

}
