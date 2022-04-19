package estacionamento;

import java.util.Arrays;

public class Estacionamento {
	private String nome;
	private String localizacao;
	private Veiculo[] veiculos;
	
	public Estacionamento(int numeroVagas) {
		veiculos = new Veiculo[numeroVagas];
	}
	
	public void adicionar(Veiculo v) {
		veiculos[0] = v;
	}
	
	public void listar() {
		System.out.println(Arrays.toString(veiculos));
	}
}