package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		System.out.println("Jugador 1: Introduce la contrase�a");
		String contrasena = user.nextLine();
		int longitud = contrasena.length();
		boolean adivina = false;
		
		//VERSION 1
		System.out.println("La contrase�a tiene: " + longitud + " caracteres");
		System.out.println("La primera letra es: " + contrasena.charAt(0));
		System.out.println("La �ltima letra es: " + contrasena.charAt(longitud - 1));
		do {
			System.out.println("Jugador 2: Introduce la contrase�a");
			String intento = user.nextLine();
			int longitudintento = intento.length();
			if(contrasena.equals(intento)){
				adivina = true;
			}
			//VERSION 2
			if(longitudintento > longitud) {
				System.out.println("La palabra introducida es mayor que la contrase�a");
			}
			else {
				System.out.println("La palabra introducida es menor que la contrase�a");
			}
			//FIN VERSION 2
		}while(adivina == false);
		System.out.println("\nGenial, has acertado la contrase�a 'maquina'");	
		user.close();
	}
	
}
