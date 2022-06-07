package Questao1;

public class UsaLampada {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada();
		
		lampada1.ligar();
		lampada2.desligar();
		
		System.out.println(lampada1.observar());
		System.out.println(lampada2.observar());
	}

}
