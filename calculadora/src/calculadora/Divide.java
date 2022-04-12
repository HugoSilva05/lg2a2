package calculadora;

public class Divide extends OperacaoMatematica {
	
	private Double x;
	private Double y;
	
	public Divide() {
	}
	
	public Divide(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double calcular() {
		return x / y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
}