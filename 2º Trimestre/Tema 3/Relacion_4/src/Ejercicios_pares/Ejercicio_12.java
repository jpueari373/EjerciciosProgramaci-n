package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		  
	    int[] n = new int[10];
	    int[] resultado = new int[10];
	    int i;
	    int nInicial;
	    int nFinal;
	    boolean valido;
	    
	    System.out.println("Introduzca 10 números separados por INTRO:");

	    for (i = 0; i < 10; i++) {
	      n[i] = s.nextInt();
	    }
	    
	    // Muestra el array original.
	    System.out.println("\n\nArray original:");
	    System.out.println("\n----------------------------------------------------------------------");
	    System.out.print("| Índice ");
	    for (i = 0; i < 10; i++) {
	      System.out.printf("│%4d ", i);
	    }
	    System.out.println("\n----------------------------------------------------------------------");
	    System.out.print("| Valor  ");
	    for (i = 0; i < 10; i++) {
	      System.out.printf("|%4d ", n[i]);
	    }
	    System.out.println("\n----------------------------------------------------------------------");

	    // Pide las posiciones inicial y final.
	    do {
	      valido = true;
	      
	      System.out.print("Introduzca la posición inicial (0 - 9): ");
	      nInicial =s.nextInt();
	      if ((nInicial < 0) || (nInicial > 9)) {
	        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
	        valido = false;
	      }
	  
	      System.out.print("Introduzca la posición final (0 - 9): ");
	      nFinal = s.nextInt();
	      if ((nFinal < 0) || (nFinal > 9)) {
	        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
	        valido = false;
	      }
	      
	      if (nInicial >= nFinal) {
	        System.out.println("Valores incorrectos, la posición inicial debe ser menor que la posición final.");
	        valido = false;
	      }
	    } while (!valido);
	    s.close();

	    // Muestra de nuevo el array original.
	    System.out.println("\n\nArray original:");
	    System.out.println("\n----------------------------------------------------------------------");
	    System.out.print("│ Índice: ");
	    for (i = 0; i < 10; i++) {
	      System.out.print(i + " | ");
	    }
	    System.out.println("\n----------------------------------------------------------------------");
	    System.out.print("│ Valor:  ");
	    for (i = 0; i < 10; i++) {
	      System.out.print(n[i] + " | ");
	    }
	    System.out.println("\n----------------------------------------------------------------------");
	    
	    // Copia el array n en resultado.
	    for (i = 0; i < 10; i++) {
	      resultado[i] = n[i];
	    }
	    
	    resultado[nFinal] = n[nInicial];
	    
	    for (i = nFinal + 1; i < 10; i++)
	      resultado[i] = n[i - 1];
	    
	    resultado[0] = n[9];
	    
	    for (i = 0; i < nInicial; i++)
	      resultado[i + 1] = n[i];
	    
	    // Muestra el resultado.
	    System.out.println("\nArray resultante:");
	    System.out.println("\n----------------------------------------------------------------------");
	    System.out.print("│ Índice: ");
	    for (i = 0; i < 10; i++) {
	      System.out.print(i + " | ");
	    }
	    System.out.println("\n----------------------------------------------------------------------");
	    System.out.print("│ Valor:  ");
	    for (i = 0; i < 10; i++) {
	      System.out.print(resultado[i] + " | ");
	    }
	    System.out.println("\n----------------------------------------------------------------------");
	    
	  }
	}