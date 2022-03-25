

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		int intentos = 4;
		int numero = 0;
		boolean acertado = false;

		do {
			System.out.print("Introduzca la clave de la caja fuerte: ");
			Scanner sn=new Scanner(System.in);
			numero=sn.nextInt();
			if (numero == 1234) {
				acertado = true;
			} else {
				System.out.println("Lo siento, esa no es la combinación");
			}
  
			intentos--;

			} while((intentos > 0) && (!acertado));

		if (acertado) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		} else {
			System.out.println("Lo siento, ha agotado las 4 oportunidades");
		}
	}
}
