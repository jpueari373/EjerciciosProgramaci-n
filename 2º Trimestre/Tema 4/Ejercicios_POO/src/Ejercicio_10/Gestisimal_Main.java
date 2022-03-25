package Ejercicio_10;

import Ejercicio_7.Empleado;

public class Gestisimal_Main {
	final static int num = 100;
	public static void main(String[] args) {
		//GENERAR ARRAY PARA GUARDAR LOS DATOS DE CADA ARTICULO
		Articulo[] articulo = new Articulo [num];
		
		//INSERTAR LOS DATOS DE CADA ARTICULO
		for(int i = 0; i < num; i++) {
			articulo[i] = new Articulo ();
		}
		do {
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificación");
			System.out.println("5. Entrada de mercancía");
			System.out.println("6. Salida de mercancía");
			System.out.println("7. Salir");
			System.out.println("Introduce una opcion");
		}
	}

}
