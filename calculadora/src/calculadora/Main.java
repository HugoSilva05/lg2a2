package calculadora;

public class Main{
	
	public void main() {
		Soma somar = new Soma();
		
		somar.setX(5d);
		
		somar.setY(7d);
		
		System.out.print(somar.calcular());
	}
}