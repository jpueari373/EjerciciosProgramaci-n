
public class Ejercicio_29 {
	 
	public static void main(String[] args) {

		    System.out.print("Introduzca un n�mero entero positivo (relativamente grande): ");
		    int numeroGrande = Integer.parseInt(System.console().readLine());

		    System.out.print("Introduzca otro n�mero (relativamente peque�o): ");
		    int numeroPequeno = Integer.parseInt(System.console().readLine());

		    System.out.print("Los n�meros enteros positivos menores que " + numeroGrande );
		    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

		    int cuenta = 0;
		    int suma = 0;

		    for (int i = 1; i < numeroGrande; i++) {
		      if ((i % numeroPequeno) != 0) {
		        System.out.print(i + " ");
		      }
		    }
		  }
		}