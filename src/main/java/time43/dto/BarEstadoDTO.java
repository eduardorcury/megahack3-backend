package time43.dto;

import time43.enums.BarEstado;

public class BarEstadoDTO {

	private BarEstado estado;

	public BarEstadoDTO() {

	}

	public BarEstadoDTO(BarEstado estado) {
		super();
		this.estado = estado;
	}

	public BarEstado getEstado() {
		return estado;
	}

	public void setEstado(BarEstado estado) {
		this.estado = estado;
	}

}
