package Questao2;

public class Tv {
	private boolean ligado;
	private int canal;
	private int volume;
	
	public Tv() {
		
	}
	
	public Tv(int canal) {
		this.canal = canal;
		this.volume = 25;
		this.ligado = true;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void aumentarVolume() {
		if (this.volume < 100) {
			this.volume++;			
		}
	}
	
	public void reduzirVolume() {
		if(this.volume > 0) {
			this.volume--;			
		}
	}
	
	public void aumentarCanal() {
		if (this.canal < 999) {
			this.canal++;			
		}
	}
	
	public void reduzirCanal() {
		if (this.canal > 0) {
			this.canal--;			
		}
	}
	
	public String mostrar() {
		return "Ligado: " + this.ligado + " canal: " + this.canal + " volume: " + this.volume;
	}
}
