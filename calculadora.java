class Calculadora {
    public int valor1;
    public int valor2;
    public int somar;
    public int subtrair;
    public int multiplicar;
    public int dividir;
    
    public Calculadora(){
        
    }
    
    public Calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.somar = valor1 + valor2;
        this.subtrair = valor1 - valor2;
        this.multiplicar = valor1 * valor2;
        this.dividir = valor1 / valor2;
    }
    
}

public class Main
{
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora(4, 2);
        System.out.println(calculadora.dividir);
    }
}
