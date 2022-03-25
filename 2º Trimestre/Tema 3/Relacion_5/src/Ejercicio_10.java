
	import matematicas.Varias;

	public class Ejercicio_10 {

	  public static void main(String[] args) {
//Todos los numeros capicua desde el 1 hasta el 99999, para ello utilizaremos una subfuncion creada anteriormente.
	    for(int i = 1; i < 99999; i++) {
	      if (matematicas.Varias.esCapicua(i)) {
	        System.out.print(i + "  ");
	      }
	    }
	  }
	}

