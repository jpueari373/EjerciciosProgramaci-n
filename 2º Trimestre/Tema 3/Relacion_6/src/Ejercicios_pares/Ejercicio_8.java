package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_8 {

	 public static void main(String[] args) {
	        Scanner user = new Scanner(System.in);
	        System.out.println("Introduzca una frase");
	        String frase = user.nextLine();
	        if (esPalindroma(frase)) {
	            System.out.println("La frase es palíndroma");
	        } else {
	            System.out.println("La frase no es palíndroma");
	        }
	        user.close();
	    }
	
	 public static boolean esPalindroma(String frase) {
	    String normal = "";
	    for (int i = 0; i < frase.length(); i++) {
	        char c = frase.charAt(i);
	        if (c!=' ') {
	            normal += c;
	        }
	    }
	    normal = normal.toLowerCase();
	    String invertida = invertir(normal);
	     return normal.equals(invertida);
	}
	
	
	//Invertir la frase
	
	public static String invertir(String frase) {
	    String invertida = "";
	    for (int i = frase.length() -1; i >= 0; i--) {
	        invertida += frase.charAt(i);
	    }
	    return invertida;
	   
		}
	
	}