
import java.util.Scanner;
public class Ejercicio_20 {

	  public static void main(String[] args) {
		  
		  Scanner s1= new Scanner(System.in);
		  Scanner s2= new Scanner(System.in);
	    
	    System.out.print("Por favor, introduzca la altura de la pirámide: ");
	    int alturaIntro = s1.nextInt();

	    System.out.print("Introduzca el carácter de relleno: ");
	    String caracter = s2.nextLine();
	    
	    int i=0;
	    int altura = 1;
	    int espaciosdelante = alturaIntro - 1;
	    int espaciosinternos = 0;
	    
	    while (altura < alturaIntro) {
	      
	    	//pintar los espacios de delante
	      for (i = 1; i <= espaciosdelante; i++) {
	        System.out.print(" ");
	      	  }
	      //pinta la línea
	      System.out.print(caracter);
	      for (i = 1; i < espaciosinternos; i++) {
		        System.out.print(" ");
		      }
	      
	      if (altura>1) {
	        System.out.print(caracter);
	      }

	      System.out.println();
	      altura++;
	      espaciosdelante--;
	      espaciosinternos +=2;
	      s1.close();
	      s2.close();
	     }
	    //Base de la piramide
	      for (i = 1; i < altura*2; i++) {
	          System.out.print(caracter);
	      }
	  }
	}