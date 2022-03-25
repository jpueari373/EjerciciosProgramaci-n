package Examen;
import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int opcion;
		Fecha fecha;
		Fecha actual;
		actual = new Fecha(18,03,2022);
		boolean resp = true;
		Vehiculos Vehiculo1 = new Vehiculos ();
		do {
		      System.out.println("1. Nuevo Veh�culo");
		      System.out.println("2. Ver matr�cula");
		      System.out.println("3. Ver n�mero de Kil�metros");
		      System.out.println("4. Actualizar Kil�metros");
		      System.out.println("5. Ver a�os de antiguedad");
		      System.out.println("6. Mostrar Propietario");
		      System.out.println("7. Mostrar Descripci�n");
		      System.out.println("8. Mostrar Precio");
		      System.out.println("9. Salir");
		      System.out.print("Introduzca una opci�n: ");
		      opcion = user.nextInt();
		      
		      switch (opcion) {
		      	case 0:
		    	  System.out.println("1. Nuevo Veh�culo");
			      System.out.println("2. Ver matr�cula");
			      System.out.println("3. Ver n�mero de Kil�metros");
			      System.out.println("4. Actualizar Kil�metros");
			      System.out.println("5. Ver a�os de antiguedad");
			      System.out.println("6. Mostrar Propietario");
			      System.out.println("7. Mostrar Descripci�n");
			      System.out.println("8. Mostrar Precio");
			      System.out.println("9. Salir");
			      System.out.print("Introduzca una opci�n: ");
			      opcion = user.nextInt();
			      break;
			      
		        case 1:
		          user.nextLine();
		          System.out.println("\nNuevo Veh�culo");
		          System.out.println("Marca: ");
		          String marca = user.nextLine();
		          System.out.println("Matr�cula: ");
		          String matricula = user.nextLine();
		          System.out.println("N�mero de Kil�metros: ");
		          int numeroKilometros = user.nextInt();
		          if (numeroKilometros <= 0) {
		        	  System.out.println("El n�mero de Kil�metros es erroneo");  
		        	  opcion = 0;
		          }
		          do {
		        	  System.out.println("Fecha de matriculaci�n: ");
		                System.out.print("Dia: ");
		                int dia = user.nextInt();
		                System.out.print("Mes: ");
		                int mes = user.nextInt();
		                System.out.print("A�o: ");
		                int anio = user.nextInt();
		                fecha = new Fecha(dia, mes,anio);
		            } while (!fecha.fechaCorrecta());
		          if (fecha == actual){
	                	System.out.println("La fecha introducida no es anterior a la fecha actual ");
	                	resp = false;
	                	opcion = 0;
	                }
		          user.nextLine();
		          System.out.println("Descripci�n: ");
		          String descripcion = user.nextLine();
		          user.nextLine();
		          System.out.println("Precio: ");
		          double precio = user.nextDouble();
		          user.nextLine();
		          System.out.println("Nombre del propietario: ");
		          String nombreDelPropietario = user.nextLine();
		          System.out.println("Dni del propietario: ");
		          String dniDelPropietario = user.nextLine();
		          if (dniDelPropietario.length() < 9) {
		        	  System.out.println("El Dni introducido es erroneo");
		        	  opcion = 0;
		          	}
		          
		          Vehiculo1.setMarca(marca);
		          Vehiculo1.setMatricula(matricula);
		          Vehiculo1.setNumeroDeKilometros(numeroKilometros);
		          Vehiculo1.setDescripcion(descripcion);
		          Vehiculo1.setFechaDeMatriculacion(fecha);
		          Vehiculo1.setPrecio(precio);
		          Vehiculo1.setNombreDelPropietario(nombreDelPropietario);
		          Vehiculo1.setDniDelPropietario(dniDelPropietario);
		          System.out.println(" ");
		          break;
		          
		          case 2:
		        	  System.out.println("\nVer matr�cula");
		        	    System.out.println("Matr�cula: " + Vehiculo1.getMatricula());
		        	    System.out.println(" ");
		        	  break;
		          case 3:
		        	  System.out.println("\nVer n�mero de Kil�metros");
		        	  System.out.println("N�mero de Kil�metros: " + Vehiculo1.getNumeroDeKilometros());
		        	  System.out.println(" ");
		        	  break;
		          case 4:
		        	  System.out.println("\nActualizar n�mero de Kil�metros");
		        	  System.out.println("Introduce los nuevos Kil�metros");
		        	  int numeroKilometrosNuevo = user.nextInt();
		        	  int nuevo = Vehiculo1.getNumeroDeKilometros() + numeroKilometrosNuevo;
		        	  Vehiculo1.setNumeroDeKilometros(nuevo);
		        	  System.out.println("N�mero de Kil�metros: " + nuevo);
		        	  System.out.println(" ");
		        	  break;
		          case 5:
		        	  System.out.println("\nVer a�os de antiguedad");
		        	  int a�os = 2022 - Vehiculo1.getAnios();
		        	  System.out.println("a�os de antiguedad: " + a�os);
		        	  System.out.println(" ");
		        	  break;
		          case 6:
		        	  System.out.println("\nMostrar propietario");
		        	  System.out.println("propietario: " + Vehiculo1.getNombreDelPropietario());
		        	  System.out.println("Dni: " + Vehiculo1.getDniDelPropietario());
		        	  System.out.println(" ");
		        	  break;
		          case 7:
		        	  System.out.println("\nMostrar Descripci�n");
		        	  System.out.println("Descripci�n: " + Vehiculo1.getDescripcion());
		        	  System.out.println("Matr�cula: " + Vehiculo1.getMatricula());
		        	  System.out.println("N�mero de Kil�metros: " + Vehiculo1.getNumeroDeKilometros());
		        	  System.out.println(" ");
		        	  break;
		          case 8:
		        	  System.out.println("\nMostrar Precio");
		        	  System.out.println("Precio: " + Vehiculo1.getPrecio());
		        	  System.out.println(" ");
		      }  
		   }while(opcion != 9);
	
	}
}
