import java.util.Scanner;
public class Ejercicio_11 {

		  public static void main(String[] args) {
		    long numero, aux, digito, decimal;
		     int exponente;
		     boolean esBinario;
		     Scanner n = new Scanner(System.in);

		    //pedir y comprobar el numero introducido
		     do {
		          System.out.print("Introduce un numero binario: ");
		          numero = n.nextLong();
		          //comprobamos que sea un numero binario
		          esBinario = true;
		          aux = numero;
		          while (aux != 0) {
		                     digito = aux % 10; //obtiene la última cifra del numero
		                     if (digito != 0 && digito != 1) { //si numero no es 0 o 1
		                          esBinario = false; //no es un numero binario
		                     }
		                     aux = aux / 10; //quitamos la ultima cifra del numero y volvemos a repetir el proceso                          
		           }
		      } while (!esBinario); //se vuelve a pedir mientras que el numero no sea binario

		      //proceso para pasar de binario a decimal
		      exponente = 0;
		      decimal = 0; //sera el numero convertido a decimal
		      while (numero != 0) {
		                //se toma la ultima cifra
		                digito = numero % 10;
		                //se multiplica por la potencia de 2 correspondiente y se suma al número                          
		                decimal = decimal + digito * (int) Math.pow(2, exponente);
		                //se aumenta el exponente
		                exponente++;
		                //se quita la última cifra para repetir el proceso
		                numero = numero / 10;
		      }
		      System.out.println("Decimal: " + decimal);
		   }
	}


