import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {

		 	Scanner s= new Scanner (System.in);
		    
		    System.out.print("Por favor, introduzca la altura de la pirámide:");
		    int alturaIntro = s.nextInt();

		    int altura = 1;
		    int i;
		    int espacios = alturaIntro - 1;
		    
		    while (altura <= alturaIntro) {
		      
		      // inserta espacios
		      for (i = 1; i <= espacios; i++) {
		        System.out.print(" ");
		      }
		      
		      //pinta
		      for (i = 1; i < altura; i++) {
		        System.out.print(i);
		      }
		      
		      for (i = altura; i > 0; i--) {
		        System.out.print(i);
		      }
		      
		      System.out.println();
		      
		      altura++;
		      espacios--;
		    } // while
		  }
		}