package Ejercicios_pares;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
		int [] numero = new int [15];
		int i = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce numeros enteros");
		
		//pedir los numeros enteros y guardarlos en el array
		
		for (i = 0; i < 15; i++) {
		numero[i] = s.nextInt();
		}
		System.out.print(" ");
		
		//Mostrar el indice del array
		System.out.println("\nMostrar el array inicial");
		for (i = 0; i < 15; i++) {
			 System.out.printf("|%3d ", i);
		}
		
		 System.out.println("|");
		 System.out.println("----------------------------------------------------------------------------");
		
		//Mostrar el array con los numeros guardados
		for (i = 0; i < 15; i++) {
			 System.out.printf("|%3d ", numero[i]);
		}
	    System.out.println("|");
		//Mostrar el array rotada una posicion a la derecha
		
		//Introduccimos una variable para guardar el ultimo valor del array
		int aux = numero[14];
		for (i = 14; i > 0; i--) {
			numero[i] = numero[i-1];
		}
		//El ultimo valor se colocara en la primera posicion, para ello a la primera posicion le asignamos la variable anterior
		numero[0] = aux;
		System.out.println("\nArray rotado a la derecha una posición:");
		 for (i = 0; i < 15; i++) {
		        System.out.printf("|%3d ", i);
		      }
		 System.out.println("|");
		 System.out.println("----------------------------------------------------------------------------");
		 for (i = 0; i < 15; i++) {
		        System.out.printf("|%3d ", numero[i]);
		 }
	      System.out.println("|");
		 s.close();
	}
	
}
