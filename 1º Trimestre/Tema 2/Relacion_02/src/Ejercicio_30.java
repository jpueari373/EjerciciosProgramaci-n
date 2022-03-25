import java.util.Scanner;
public class Ejercicio_30 {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		Scanner sn= new Scanner(System.in);
	    int primerDia = 0;
	    int segundoDia = 0;
	    int primeraHora;
	    int segundaHora;
	    String primerDiaString;
	    String segundoDiaString;
	    String nombrePrimerDia = "";
	    String nombreSegundoDia = "";
	    boolean datosCorrectos = true;
	    
	   
	    do {
	      System.out.println("\nPor favor, introduzca la primera hora.");
	      System.out.print("D�a: ");
	      primerDiaString = s.nextInt();
	      System.out.print("Hora: ");
	      primeraHora = sn.nextInt();
	      
	      
	      switch(primerDiaString) {
	        case "lunes":
	        case "1":
	          primerDia = 1;
	          nombrePrimerDia = "lunes";
	          break;
	        case "martes":
	        case "2":
	          primerDia = 2;
	          nombrePrimerDia = "martes";
	          break;
	        case "mi�rcoles":
	        case "3":
	          primerDia = 3;
	          nombrePrimerDia = "miercoles";
	          break;
	        case "jueves":
	        case "4":
	          primerDia = 4;
	          nombrePrimerDia = "jueves";
	          break;
	        case "viernes":
	        case "5":
	          primerDia = 5;
	          nombrePrimerDia = "viernes";
	          break;
	        case "s�bado":
	        case "6":
	          primerDia = 6;
	          nombrePrimerDia = "s�bado";
	          break;
	        case "domingo":
	        case "7":
	          primerDia = 7;
	          nombrePrimerDia = "domingo";
	          break;
	        default:
	          primerDia = 0;
	      }
	      
	      System.out.println("Por favor, introduzca la segunda hora.");
	      System.out.print("D�a: ");
	      segundoDiaString = System.console().readLine();
	      System.out.print("Hora: ");
	      segundaHora = Integer.parseInt(System.console().readLine());
	      
	      switch(segundoDiaString) {
	        case "lunes":
	        case "1":
	          segundoDia = 1;
	          nombreSegundoDia = "lunes";
	          break;
	        case "martes":
	        case "2":
	          segundoDia = 2;
	          nombreSegundoDia = "martes";
	          break;
	        case "mi�rcoles":
	        case "3":
	          segundoDia = 3;
	          nombreSegundoDia = "mi�rcoles";
	          break;
	        case "jueves":
	        case "4":
	          segundoDia = 4;
	          nombreSegundoDia = "jueves";
	          break;
	        case "viernes":
	        case "5":
	          segundoDia = 5;
	          nombreSegundoDia = "viernes";
	          break;
	        case "s�bado":
	        case "6":
	          segundoDia = 6;
	          nombreSegundoDia = "s�bado";
	          break;
	        case "domingo":
	        case "7":
	          segundoDia = 7;
	          nombreSegundoDia = "domingo";
	          break;
	        default:
	          segundoDia = 0;
	      }
	      
	      datosCorrectos = true;
	      
	      if (segundoDia <= primerDia) {
	        System.out.println("El segundo d�a debe ser posterior al primero.");
	        datosCorrectos = false;
	      }
	      
	      if ((primerDia == 0) || (segundoDia == 0)) {
	        System.out.println("No se ha introducido correctamente el d�a de la semana.");
	        System.out.println("Los d�as v�lidos son: lunes, martes, mi�rcoles, jueves y viernes.");
	        datosCorrectos = false;
	      }
	      
	      if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
	        System.out.println("No se ha introducido correctamente la hora del d�a.");
	        System.out.println("Las horas v�lidas est�n entre 0 y 23.");
	        datosCorrectos = false;
	      }
	      
	    } while (!datosCorrectos);
	    // Fin de la recogida de datos ///////////////////////////
	    
	    System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
	    System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
	    System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");

	  }
	}