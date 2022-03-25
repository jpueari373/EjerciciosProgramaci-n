package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_6 {
	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = user.nextLine();
		
		for(int i = frase.length() -1; i >= 0; i--) {
		char inverso= frase.charAt(i);
		System.out.print(inverso);
		}
		user.close();
	}
}
