

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		  
		  Scanner s=new Scanner (System.in);
	    
	    System.out.println("Este programa muestra los n primeros n�meros.");
	    System.out.print("Por favor, introduzca n: ");
	    int n = s.nextInt();

	    switch (n) {
	      case 1:
	        System.out.print("0");
	        break;
	      case 2:
	        System.out.print("0 1");
	        break;
	      default:
	        System.out.print("0 1");
	        int f1 = 0;
	        int f2 = 1;
	        int aux;
	        while(n > 2) {
	            aux = f1;
	            f1 = f2;
	            f2 = aux + f2;
	            System.out.print(" " + f2);
	            n--;
	        }
	    }
	    System.out.println();
	    s.close();
	  }
	}