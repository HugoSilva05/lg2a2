import java.util.Arrays;

public class Main
{
	public static void main(String[] args){
	    int [][]colunas = new int[8][];
	    int []linha = {9, 10, 8, 12, 6, 2, 1, 8};
	    int contador = 1;
	   
	    for (int j = 0; j < 8; j++){
	        colunas[j] = new int[linha[j]];
	  
	  
    	    for (int i = 0; i < colunas[j].length; i++, contador++){
    	        colunas[j][i] = contador;
    	    }
    	    System.out.println(Arrays.toString(colunas[j]));
	    }
	}
}
