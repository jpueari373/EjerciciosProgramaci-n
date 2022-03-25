
public class Ejercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean primo = true;
		 for (int n = 2; n <=100; n++) {
			 
			 for (int i = 2; i < n; i++); {
			 }  
			   	 //comprobamos si n es primo
				 primo = true;
			      for (int i = 2; i < n; i++) {
			        if (n % i == 0) {
			          primo = false;
			        }
			      }

			      // si n es primo, se muestra en fila todos los numeros primos
			      if (primo) {
			        System.out.print(n + " ");
			      }
			    }
		 System.out.println();
	}
 }

