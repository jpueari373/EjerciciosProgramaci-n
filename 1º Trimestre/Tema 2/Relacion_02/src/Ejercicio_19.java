
import java.util.Scanner;
public class Ejercicio_19 {
	 public static void main(String[] args) {
		  
		  Scanner s1= new Scanner(System.in);
		  Scanner s2= new Scanner(System.in);
	    
	    System.out.print("Por favor, introduzca la altura de la pirámide: ");
	    int altura = s1.nextInt();

	    System.out.print("Introduzca el carácter para la pirámide: ");
	    String caracter = s2.nextLine();
	    
	    int planta = 1;
	    int longitud = 1;
	    int espacios = altura-1;
	    
	    while (planta <= altura) {
	      
	      for (int i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }
	      for (int i = 1; i <= longitud; i++) {
	        System.out.print(caracter);
	      }

	      System.out.println();

	      planta++;
	      espacios--;
	      longitud += 2;
	      s1.close();
	      s2.close();
	    }
	  }
	}