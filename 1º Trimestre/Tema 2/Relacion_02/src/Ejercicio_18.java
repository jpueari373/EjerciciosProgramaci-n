import java.util.Scanner;


public class Ejercicio_18 {

  public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    
 
    do {
      System.out.print("Introduzca un número entero: ");
      primerNumero = s.nextInt();
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      segundoNumero = s.nextInt();
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
   
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
    s.close();
  }
}