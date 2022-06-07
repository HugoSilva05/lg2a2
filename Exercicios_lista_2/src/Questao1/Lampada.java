package Questao1;

public class Lampada {
	private boolean status;
	
	public Lampada() {
		
	}
	
	public void ligar() {
		this.status = true;
	}
	
	public void desligar() {
		this.status = false;
	}
	
	public String observar() {
		if(this.status == true) {
			return "ligada";
		}else {
			return "desligada";
		}
	}
}
