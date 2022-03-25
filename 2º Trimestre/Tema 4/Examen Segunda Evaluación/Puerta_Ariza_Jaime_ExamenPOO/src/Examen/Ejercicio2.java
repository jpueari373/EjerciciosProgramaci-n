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
		      System.out.println("1. Nuevo Vehículo");
		      System.out.println("2. Ver matrícula");
		      System.out.println("3. Ver número de Kilómetros");
		      System.out.println("4. Actualizar Kilómetros");
		      System.out.println("5. Ver años de antiguedad");
		      System.out.println("6. Mostrar Propietario");
		      System.out.println("7. Mostrar Descripción");
		      System.out.println("8. Mostrar Precio");
		      System.out.println("9. Salir");
		      System.out.print("Introduzca una opción: ");
		      opcion = user.nextInt();
		      
		      switch (opcion) {
		      	case 0:
		    	  System.out.println("1. Nuevo Vehículo");
			      System.out.println("2. Ver matrícula");
			      System.out.println("3. Ver número de Kilómetros");
			      System.out.println("4. Actualizar Kilómetros");
			      System.out.println("5. Ver años de antiguedad");
			      System.out.println("6. Mostrar Propietario");
			      System.out.println("7. Mostrar Descripción");
			      System.out.println("8. Mostrar Precio");
			      System.out.println("9. Salir");
			      System.out.print("Introduzca una opción: ");
			      opcion = user.nextInt();
			      break;
			      
		        case 1:
		          user.nextLine();
		          System.out.println("\nNuevo Vehículo");
		          System.out.println("Marca: ");
		          String marca = user.nextLine();
		          System.out.println("Matrícula: ");
		          String matricula = user.nextLine();
		          System.out.println("Número de Kilómetros: ");
		          int numeroKilometros = user.nextInt();
		          if (numeroKilometros <= 0) {
		        	  System.out.println("El número de Kilómetros es erroneo");  
		        	  opcion = 0;
		          }
		          do {
		        	  System.out.println("Fecha de matriculación: ");
		                System.out.print("Dia: ");
		                int dia = user.nextInt();
		                System.out.print("Mes: ");
		                int mes = user.nextInt();
		                System.out.print("Año: ");
		                int anio = user.nextInt();
		                fecha = new Fecha(dia, mes,anio);
		            } while (!fecha.fechaCorrecta());
		          if (fecha == actual){
	                	System.out.println("La fecha introducida no es anterior a la fecha actual ");
	                	resp = false;
	                	opcion = 0;
	                }
		          user.nextLine();
		          System.out.println("Descripción: ");
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
		        	  System.out.println("\nVer matrícula");
		        	    System.out.println("Matrícula: " + Vehiculo1.getMatricula());
		        	    System.out.println(" ");
		        	  break;
		          case 3:
		        	  System.out.println("\nVer número de Kilómetros");
		        	  System.out.println("Número de Kilómetros: " + Vehiculo1.getNumeroDeKilometros());
		        	  System.out.println(" ");
		        	  break;
		          case 4:
		        	  System.out.println("\nActualizar número de Kilómetros");
		        	  System.out.println("Introduce los nuevos Kilómetros");
		        	  int numeroKilometrosNuevo = user.nextInt();
		        	  int nuevo = Vehiculo1.getNumeroDeKilometros() + numeroKilometrosNuevo;
		        	  Vehiculo1.setNumeroDeKilometros(nuevo);
		        	  System.out.println("Número de Kilómetros: " + nuevo);
		        	  System.out.println(" ");
		        	  break;
		          case 5:
		        	  System.out.println("\nVer años de antiguedad");
		        	  int años = 2022 - Vehiculo1.getAnios();
		        	  System.out.println("años de antiguedad: " + años);
		        	  System.out.println(" ");
		        	  break;
		          case 6:
		        	  System.out.println("\nMostrar propietario");
		        	  System.out.println("propietario: " + Vehiculo1.getNombreDelPropietario());
		        	  System.out.println("Dni: " + Vehiculo1.getDniDelPropietario());
		        	  System.out.println(" ");
		        	  break;
		          case 7:
		        	  System.out.println("\nMostrar Descripción");
		        	  System.out.println("Descripción: " + Vehiculo1.getDescripcion());
		        	  System.out.println("Matrícula: " + Vehiculo1.getMatricula());
		        	  System.out.println("Número de Kilómetros: " + Vehiculo1.getNumeroDeKilometros());
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
