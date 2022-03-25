package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	 static int N = 50;
	 static Vehiculos[] Vehiculo = new Vehiculos[N];
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		Fecha fecha;
		Fecha actual;
		actual = new Fecha(18,03,2022);
		boolean resp = true;
		int opcion;
		int primeraLibre;
		do {
			System.out.println("1. Nuevo vehículo");
			System.out.println("2. Listar vehículos");
			System.out.println("3. Buscar vehículos");
			System.out.println("4. Modificar Kms de vehículo");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
		      opcion = user.nextInt();
			switch (opcion) {
			case 1:
				 primeraLibre = 2;
				 
				 while ((primeraLibre < N) ) {
			            
			            for(int i = 1; i < primeraLibre; i++) {
							Vehiculo[i] = new Vehiculos();
							user.nextLine();
							System.out.println("\nNuevo vehículo");
							 System.out.println("Marca: ");
					          String marca = user.nextLine();
					          System.out.println("Matrícula: ");
					          String matricula = user.nextLine();
					          System.out.println("Número de Kilómetros: ");
					          int numeroKilometros = user.nextInt();
					          do {
					        	  System.out.println("Fecha de matriculación: ");
					                System.out.print("Dia: ");
					                int dia = user.nextInt();
					                System.out.print("Mes: ");
					                int mes = user.nextInt();
					                System.out.print("Año: ");
					                int anio = user.nextInt();
					                fecha = new Fecha(dia, mes,anio);
					                if (fecha == actual){
					                	System.out.println("La fecha introducida no es anterior a la fecha actual ");
					                	resp = false;
					                }
					            } while (!fecha.fechaCorrecta() && resp != false);
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
					          
					          	Vehiculo[i].setMarca(marca);
								Vehiculo[i].setMatricula(matricula);
								Vehiculo[i].setNumeroDeKilometros(numeroKilometros);
								Vehiculo[i].setFechaDeMatriculacion(fecha);
								Vehiculo[i].setDescripcion(descripcion);
								Vehiculo[i].setPrecio(precio);
								Vehiculo[i].setNombreDelPropietario(nombreDelPropietario);
								Vehiculo[i].setDniDelPropietario(dniDelPropietario);
						    }
			            primeraLibre++;
			            }
				 		break;
			case 2:
				System.out.println("\nListar vehículo");

	            for(int i = 1; i < N; i++) {
					
					Vehiculo[i].getMarca();
					Vehiculo[i].getMatricula();
					Vehiculo[i].getNumeroDeKilometros();
					Vehiculo[i].getFechaDeMatriculacion();
					Vehiculo[i].getDescripcion();
					Vehiculo[i].getPrecio();
					Vehiculo[i].getNombreDelPropietario();
					Vehiculo[i].getDniDelPropietario();
	            }
				break;
				
			case 3:
				System.out.println("\nBuscar vehículos");
				System.out.println("Inserte Matrícula para buscar el vehiculo ");
		        String busquedaMatricula = user.nextLine();
		        for(int i = 1; i < N; i++) {
		        	if (busquedaMatricula == Vehiculo[i].getMatricula()) {
		        		Vehiculo[i].getMarca();
						Vehiculo[i].getMatricula();
						Vehiculo[i].getNumeroDeKilometros();
						Vehiculo[i].getFechaDeMatriculacion();
						Vehiculo[i].getDescripcion();
						Vehiculo[i].getPrecio();
						Vehiculo[i].getNombreDelPropietario();
						Vehiculo[i].getDniDelPropietario();
		        	}
		        }
				break;
				
			case 4:
				System.out.println("\nModificar KMS de vehículo");
				System.out.println("Inserte Matrícula para buscar el vehiculo ");
		         busquedaMatricula = user.nextLine();
		         user.nextInt();
		         System.out.println("Inserte número de Kilómetros: ");
		         int numeroKilometrosNuevo = user.nextInt();
		          for(int i = 1; i < N; i++) {
			        	if (busquedaMatricula == Vehiculo[i].getMatricula()) {
			        		int nuevo = Vehiculo[i].getNumeroDeKilometros() + numeroKilometrosNuevo;
			        		Vehiculo[i].setNumeroDeKilometros(nuevo);				
			        	}
			        }
				break;
			}
		}while(opcion != 5);
	
		
	}

}
