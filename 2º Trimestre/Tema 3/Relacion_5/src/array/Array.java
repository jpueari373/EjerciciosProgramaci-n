package array;

public class Array {

	//Crea una biblioteca de funciones para arrays (de una dimensión) de números enteros que contenga
	//las siguientes funciones.
	
	  public static void muestraArrayInt(int x[]) {
	    for (int n : x) {
	      System.out.print(n + " ");
	    }
	    System.out.println();
	  }

	  //Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
	  //máximo) se indica como parámetro.
	  public static int[] generaArrayInt(int n, int minimo, int maximo) {
	    int[] x = new int[n];

	    for(int i = 0; i < n; i++) {
	      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
	    }
	      
	    return x;
	  }

	  
	   //Devuelve el mínimo del array que se pasa como parámetro.

	  public static int minimoArrayInt(int[] x) {
	    int minimo = Integer.MAX_VALUE;
	    
	    for (int n : x) {
	      if (n < minimo) {
	        minimo = n;
	      }
	    }
	    return minimo;
	  }

	  //: Devuelve el máximo del array que se pasa como parámetro
	  public static int maximoArrayInt(int[] x) {
	    int maximo = Integer.MIN_VALUE;
	    
	    for (int n : x) {
	      if (n > maximo) {
	        maximo = n;
	      }
	    }
	      
	    return maximo;
	  }
	  
	 //Devuelve la media del array que se pasa como parámetro
	  public static double mediaArrayInt(int[] x) {
	    int suma = 0;
	    
	    for (int n : x) {
	      suma += n;
	    }
	      
	    return (double)suma / x.length;
	  }
}  
	 