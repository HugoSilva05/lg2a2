package Questao2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ponto2D teste = new Ponto2D(7, 8);
		
		Ponto2D wow = teste.clona();
		
		System.out.print(wow.distancia(teste));
	}

}
