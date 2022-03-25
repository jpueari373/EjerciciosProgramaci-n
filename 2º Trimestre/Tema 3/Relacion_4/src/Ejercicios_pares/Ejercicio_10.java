package Ejercicios_pares;

public class Ejercicio_10 {

	public static void main(String[] args) {
		int [] numero = new int [20];
		int [] pares = new int [20];
		int [] impares = new int [20];
		int [] numero2 = new int [20];
		int i = 0;
		int par = 0;
		int impar = 0;
		for (i = 0; i < 20; i++) {
			numero[i] =  (int) (Math.random()*100 + 1) ; 
			
			if (numero[i] % 2 == 0) {
				pares [par++] = numero [i];
			}else {
				impares[impar++] = numero [i];
			}
		}
		System.out.println("Array sin modificar");
		for (i = 0; i < 20; i++) {
			System.out.print(numero[i] + " | ");
		}
		System.out.println(" ");
		for(i = 0; i < par; i++) {
			numero2[i] = pares [i];
		}
		for(i = par; i < 20; i++) {
			numero2[i] = impares[i - par];
		}
		System.out.println("Array con los pares primeros y los impares los últimos");
		for (i = 0; i < 20; i++) {
			System.out.print(numero2[i] + " | ");
		}
	}
}
