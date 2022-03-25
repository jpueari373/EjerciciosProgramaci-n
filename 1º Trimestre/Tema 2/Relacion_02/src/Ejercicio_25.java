import java.util.Scanner;

public class Ejercicio_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sn= new Scanner (System.in);
		    
		    System.out.println("Mostrar un número al reves.");
		    System.out.println("Introduce un número");
		   int numeroIntroducido = sn.nextInt();
		   int reves = 0;
		   
		   while (numeroIntroducido > 0) {
		   reves = (reves * 10) + (numeroIntroducido % 10);
		   numeroIntroducido /= 10;
		   }
		   
		  System.out.println("El número al reves es: " + reves);
	}

}