package calculadora;

public class Calculadora {
	public void executar(OperacaoMatematica matematica) {
		double valor = matematica.calcular();
		imprimirValor(valor);
	}
	
	public void imprimirValor(double valor) {
		System.out.println(valor);
	}
}