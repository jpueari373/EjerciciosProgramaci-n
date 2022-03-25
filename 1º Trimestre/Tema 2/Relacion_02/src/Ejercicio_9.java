

import java.util.Scanner;

public class Ejercicio_9 {

	  public static void main(String[] args) {
		  
		Scanner s=new Scanner(System.in);
	    
	    int numeroDeDigitos = 1, n, numeroIntroducido;

	    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
	    numeroIntroducido = s.nextInt();
	    
	    n = numeroIntroducido;
	    
	    while (n > 10) {
	      n /= 10;
	      numeroDeDigitos++;
	    }
	    
	    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
	    s.close();

	  }
	}
