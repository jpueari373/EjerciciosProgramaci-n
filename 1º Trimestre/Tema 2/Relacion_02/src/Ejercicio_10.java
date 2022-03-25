

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		  
		Scanner s=new Scanner(System.in);
	    
	    double numeros = 0;
	    double numeroIntroducido = 0;
	    double suma = 0;

	    System.out.println("Este programa calcula la media de los números positivos introducidos.");
	    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");

	    while (numeroIntroducido >= 0) {
	      numeroIntroducido = s.nextDouble();
	      numeros++;
	      suma += numeroIntroducido;
	    }
	    s.close();
	    
	    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

	  }
	}