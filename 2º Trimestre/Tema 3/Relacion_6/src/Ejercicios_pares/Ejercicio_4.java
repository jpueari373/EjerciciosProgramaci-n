package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_4 {
	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = user.nextLine();
		char espacio = ' ';
		int blanco = 0;
		for(int i = 0; i < frase.length(); i++) {
		char caracter =	frase.charAt(i);
		if (caracter == espacio) {
			blanco ++;
			}
		}
		System.out.println("La frase tiene: " + blanco + " espacios");
		user.close();
	}
}