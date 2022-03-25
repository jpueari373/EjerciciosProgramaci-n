package Ejercicio_7;

import java.util.Scanner;

public class Empleado_Main {
	final static int empleadosMaximos = 20;
	static Empleado[] empleados = new Empleado [empleadosMaximos];
	static int indice = 0;
	Scanner user = new Scanner(System.in);
	public static void main(String[] args) {
	
		double importe;
		Empleado empleado1;
		leerempleados();
		if(numerodeempleados() > 0) {
			
			System.out.print("\n Empleados introducidos: ");
			mostrar();
			importe = leerimportehorasextras();
			Empleado.setPagoPorHoraExtra(importe);
			//EMPLEADO QUE MAS COBRA
			empleado1 = empleadoquemascobra();
			System.out.print("\n Empleados que más cobra: ");
			System.out.print(empleado1);
			System.out.printf("Sueldo: %.2f € %n", empleado1.calcularSueldo());
			//EMPLEADO QUE MENOS COBRA
			empleado1 = empleadoquemenoscobra();
			System.out.print("\n Empleados que menos cobra: ");
			System.out.print(empleado1);
			System.out.printf("Sueldo: %.2f € %n", empleado1.calcularSueldo());
			//EMPLEADO QUE MAS COBRA POR HORAS EXTRAS
			empleado1 = empleadoquemascobraporhorasextras();
			System.out.print("\n Empleados que más cobra por horas extras: ");
			System.out.print(empleado1);
			System.out.printf("Sueldo: %.2f € %n", empleado1.calcularSueldo());
			//EMPLEADO QUE MENOS COBRA POR HORAS EXTRAS
			empleado1 = empleadoquemenoscobraporhorasextras();
			System.out.print("\n Empleados que menos cobra por horas extras: ");
			System.out.print(empleado1);
			System.out.printf("Sueldo: %.2f € %n", empleado1.calcularSueldo());
			//ORDENAR POR SALARIO
			ordenarporsalario();
			System.out.println("\n\nEmpleados ordenados por salario:");
            mostrarEmpleadosYSalarios();
		
		}
	}
}
