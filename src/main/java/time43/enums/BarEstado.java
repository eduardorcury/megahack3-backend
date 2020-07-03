package time43.enums;

public enum BarEstado {

	INDEFINIDO(1, "Indefinido"), 
	ABERTO(2, "Aberto"), 
	FECHADO(3, "Fechado"), 
	LOTADO(4, "Lotado");
	
	private Integer codigo;
	private String descricao;
	
	private BarEstado(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static BarEstado toEnum(Integer codigo) {
		
		if (codigo == null) {
			return null;
		}
		
		for (BarEstado x : BarEstado.values()) {
			if (codigo == x.getCodigo()) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + codigo);
		
	}

}
