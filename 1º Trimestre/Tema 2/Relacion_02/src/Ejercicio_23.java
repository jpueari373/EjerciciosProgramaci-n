import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Introduce números");
		System.out.println("Hasta que la suma de ellos sea mayor que 10.000");
		
		int suma = 0;
		int contadornumeros = 0;
		
		do {
		int numero = s.nextInt();
		suma = suma	+ numero;
		contadornumeros ++;
			
		} while (suma <= 10000);

		System.out.println("La suma de todos los los números es: " + suma);
		System.out.println("La cantidad de numeros introducidos es: " + contadornumeros);
		System.out.println("La media de todos los los números es: " + suma/contadornumeros);


		

	}

}
