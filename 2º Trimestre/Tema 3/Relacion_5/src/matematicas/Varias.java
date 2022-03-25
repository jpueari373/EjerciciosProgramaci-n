package matematicas;

public class Varias {

	//Devuelve verdadero si el número que se pasa como parámetro es capicúa
	//y falso en caso contrario.
	
	
	  public static boolean esCapicua(long x) {
		  //un numero capicua se lee igual sin importar por donde se empiece por eso le daremos la vuelta al numero.
	    return x == voltea(x);
	  }

	
	  public static boolean esCapicua(int x) {
		  //Si el numero se lee igual nos devolvera el numero y nos indicara verdadero o falso.
	    return esCapicua((long)x);
	  }

	 //Devuelve verdadero si el número que se pasa como parámetro es primo y
	 //falso en caso contrario.
	  public static boolean esPrimo(long n) {
	    if (n < 2) {
	      return false;
	    } else {
	      for (long i = n / 2; i >= 2; i--) {
	        if (n % i == 0) {
	          return false;
	        }
	      }
	    }
	    return true;
	  }

	 
	   //Un número primo es un número natural mayor que 1 y divisible únicamente
	   //entre el mismo y entre 1.
	   
	  public static Boolean esPrimo(int n) {
	    return esPrimo((long) n);
	  }
	  
	//Devuelve verdadero si el numero es primo y falso si no lo es.
	  public static int siguientePrimo(int x) {
	    while (!esPrimo(++x)) {};

	    return x;
	  }

	  //Dada una base y un exponente devuelve la potencia.

	  public static double potencia(int base, int exponente) {
	    if (exponente == 0) {
	      return 1;
	    }

	    if (exponente < 0) {
	      return 1/potencia(base, -exponente);
	    }

	    int n = 1;

	    for (int i = 0; i < Math.abs(exponente); i++) {
	      n = n * base;
	    }

	    return n;
	  }

	 
	   //Cuenta el numero de digitos de un numero entero.
	  
	  public static int digitos(long x) {
	    if (x < 0) {
	      x = -x;
	    }

	    if (x == 0) {
	      return 1;
	    } else {
	      int n = 0;
	      while (x > 0) {
	        x = x / 10; // se le quita un digito a x
	        n++; // incrementa la cuenta de digitos
	      }
	      return n;
	    }
	  }

	   // numero de digitos que tiene el numero que se pasa como parametro
	  
	  public static int digitos(int x) {
	    return digitos((long)x);
	  }

	  //Le da la vuelta a un numero.
	  public static long voltea(long x) {
	    if (x < 0) {
	      return -voltea(-x);
	    }

	    long volteado = 0;

	    while(x > 0) {
	      volteado = (volteado * 10) + (x % 10);
	      x = x / 10;
	    }

	    return volteado;
	  }

	  //Devuelve el numero volteado
	  public static int voltea(int x) {
	    return (int)voltea((long)x);
	  }

	 //Cuenta el numero de digitos de un numero entero.

	  public static int digitoN(long x, int n) {
	    x = voltea(x);

	    while (n-- > 0) {
	      x = x / 10;
	    }

	    return (int)x % 10;
	  }

	 //Devuelve el digito que esta en la posicion n de un numero entero. Se
	 //empieza contando por el 0 y de izquierda a derecha.

	  public static int digitoN(int x, int n) {
	    return digitoN((long)x, n);
	  }
	  
	  //Da la posicion de la primera ocurrencia de un digito dentro de
	 //un numero entero. Si no se encuentra, devuelve -1.

	  public static int posicionDeDigito(long x, int d) {
	    int i;

	    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

	    if (i == digitos(x)) {
	      return -1;
	    } else {
	      return i;
	    }
	  }

	
	  public static int posicionDeDigito(int x, int d) {
	    return posicionDeDigito((long)x, d);
	  }
	}