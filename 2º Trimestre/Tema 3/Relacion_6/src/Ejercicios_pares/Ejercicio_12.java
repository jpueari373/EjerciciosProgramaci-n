package Ejercicios_pares;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio_12 {
	  public static void main(String[] args) {
	        Scanner user = new Scanner(System.in);
	        System.out.println("Introduce la primera palabra");
	        String palabra1 = user.nextLine();
	        System.out.println("Introduce la segunda palabra");
	        String palabra2 = user.nextLine();
	        if (sonAnagramas(palabra1, palabra2)) {
	        	  System.out.println("Las palabras son anagramas");
	        	
	        }else {
	        	System.out.println("Las palabras no son anagramas");
	        }
	        user.close();
	    }
	    
	    public static boolean sonAnagramas(String palabra1, String palabra2) {
	        boolean resultado;
	        if (palabra1.length() != palabra2.length()) {
	            resultado = false;
	        } else {
	            char[] p1 = palabra1.toCharArray();
	            char[] p2 = palabra2.toCharArray();
	            Arrays.sort(p1);
	            Arrays.sort(p2);
	            resultado = Arrays.equals(p1, p2);
	        }
	        return resultado;
	    } 
}

