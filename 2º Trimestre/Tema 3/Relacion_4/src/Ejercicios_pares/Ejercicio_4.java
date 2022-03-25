package Ejercicios_pares;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int [] numero = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
		for (int i = 0; i < 20; i++) {
			numero[i] =  (int) (Math.random()*100 + 1) ; 
			
			
		cuadrado[i] = numero[i] * numero[i];
		cubo[i] = cuadrado[i] * numero[i];
		System.out.println("El numero: " + numero[i] + " su cuadrado es: " + cuadrado[i]+ " y su cubo es: "+cubo[i]);
		}
		
	
	}

}
