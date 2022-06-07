package Questao3;

public class Caminhao {
	private String combustivel;
	private int velocidade;
	
	public Caminhao() {
		this.combustivel = "Gasolina";
		this.velocidade = 0;
	}
	
	public void trocaCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void aumentaVelocidade() {
		if(this.velocidade < 150) {
			this.velocidade++;			
		}
	}
	
	public void diminuiVelocidade() {
		if(this.velocidade > 0) {
			this.velocidade--;			
		}
	}
	
	public int verVelocidade() {
		return this.velocidade;
	}
	
	public String verCombustivel() {
		return this.combustivel;
	}
}
