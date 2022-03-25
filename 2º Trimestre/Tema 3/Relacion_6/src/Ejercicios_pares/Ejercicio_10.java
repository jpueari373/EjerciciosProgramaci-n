package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_10 {

	public static void main(String[] args) {
		
		 char[] conjunto1 = new char[11];
		  conjunto1 [0] = 'e';
		  conjunto1 [1] = 'i';
		  conjunto1 [2] = 'k';
		  conjunto1 [3] = 'm';
		  conjunto1 [4] = 'p';
		  conjunto1 [5] = 'q';
		  conjunto1 [6] = 'r';
		  conjunto1 [7] = 's';
		  conjunto1 [8] = 't';
		  conjunto1 [9] = 'u';
		  conjunto1 [10] = 'v';
		  
		  char[] conjunto2 = new char[11];
		  conjunto2 [0] = 'p';
		  conjunto2 [1] = 'v';
		  conjunto2 [2] = 'i';
		  conjunto2 [3] = 'u';
		  conjunto2 [4] = 'm';
		  conjunto2 [5] = 't';
		  conjunto2 [6] = 'e';
		  conjunto2 [7] = 'r';
		  conjunto2 [8] = 'k';
		  conjunto2 [9] = 'q';
		  conjunto2 [10] = 's';
		  
		  Scanner user= new Scanner(System.in);
		  System.out.println("Introduce una frase");
	      String frase = user.nextLine();
	      String codificada = codificaCadena(conjunto1, conjunto2, frase);
	      //mostrar la frase codificada 
	      System.out.println("La cadena codificada es: " + codificada);
	      //mostrar frase descodificada
	      String decodificada = codificaCadena(conjunto2, conjunto1, codificada);
	     
	      System.out.println("La cadena decodificada es: " + decodificada);
	      user.close();
	    }
	    
	    // pasar caracter de una posicion del primer array a la misma posicion del segundo array
	    
	    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
	        char resultado = Character.toLowerCase(c);
	        boolean encontrado = false;
	        for (int i = 0; i < conjunto1.length && !encontrado; i++) {
	            if (resultado == conjunto1[i]) {
	                resultado = conjunto2[i];
	                encontrado = true;
	            }
	        }
	        return resultado;
	    }
	    
	    //pasa el string frase al string codificada, ya con el string modificado
	    
	    public static String codificaCadena(char[] conjunto1, char[] conjunto2, String frase) {
	        String codificada = "";
	        for (int i = 0; i < frase.length(); i++) {
	            codificada += codifica(conjunto1, conjunto2, frase.charAt(i));
	        }
	        return codificada;
	    }
	}