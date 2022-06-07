package Questao3;

public class TestaCaminhao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caminhao caminhao = new Caminhao();
		
		caminhao.aumentaVelocidade();
		caminhao.trocaCombustivel("Gás");
		
		System.out.println(caminhao.verCombustivel());
		System.out.println(caminhao.verVelocidade());
	}

}
