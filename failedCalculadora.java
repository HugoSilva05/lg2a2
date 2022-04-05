class Calculadora {
    public int valor1;
    public int valor2;
    public int soma;
    
    public Calculadora(){
        
    }
    
    public void Calculadora(){
        this.soma = valor1 + valor2;
    }
    
}

public class Main
{
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.valor1 = 1;
        calculadora.valor2 = 2;
        System.out.println(calculadora.soma);
    }
}
