public class Main
{
    static int somaDois(int valor){
        return valor + 2;
    }
    
    static void somaTres(int valor){
        System.out.println(valor + 3);
    }
    
	public static void main(String[] args){
	    int valor = 1;
	    int valor2 = somaDois(valor);
	    somaTres(valor);
	    System.out.println(valor);
	    System.out.println(valor2);
	}
}
