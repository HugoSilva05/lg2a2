package hospital;

public enum Genero {
	FEMININO(1, "Feminino"),
	MASCULINO(2, "Masculino");
	
	private int id;
	private String descricao;
	
	private Genero(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
