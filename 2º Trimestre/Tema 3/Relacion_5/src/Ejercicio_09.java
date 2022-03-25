import matematicas.Varias;

public class Ejercicio_09 {
	public static void main(String[] args) {
	// Muestra los números primos que hay entre 1 y 1000.
		for(int i=1;i<=1000;i++){
			 if (matematicas.Varias.esPrimo(i)) {
			        System.out.print(i + "  ");
		      }
		}
	}
}