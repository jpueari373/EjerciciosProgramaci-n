package Ejercicio_4;

import java.util.Scanner;

public class LibroMain {

	public static void main(String[] args) {
		boolean resultado = true;
		 Scanner sc = new Scanner(System.in);
		Libro Libro1 = new Libro("El quijote","Cervantes",1,0);	
		Libro Libro2 = new Libro();
		System.out.println("Introduce el titulo del libro");
		String titulo = sc.nextLine();
		System.out.println("Introduce el autor del libro");
		String autor = sc.nextLine();
		System.out.println("Introduce el numero de ejemplares del libro");
		int numero_ejemplares = sc.nextInt();
		System.out.println("Introduce el numero de ejemplares prestados del libro");
		int numero_ejemplares_prestados = sc.nextInt();
		Libro2.setTitulo(titulo);
		Libro2.setAutor(autor);
		Libro2.setNumero_ejemplares(numero_ejemplares);
		Libro2.setNumero_ejemplares_prestados(numero_ejemplares_prestados);
		System.out.println(" ");
		System.out.println("\nLos datos del Libro 1 son: ");
		System.out.println(Libro1.toString());
		System.out.println(" ");
		if (Libro1.prestamo()) {
			System.out.println("El Prestamo del libro: " + Libro1.getTitulo() + " se ha realizado correctamente");
		}else {
			System.out.println("El Prestamo del libro: " + Libro1.getTitulo() + " no se puede realizar");
		}
		if (Libro1.devolucion()) {
			System.out.println("La devolucion del libro: " + Libro1.getTitulo() + " se ha realizado correctamente");
		}else {
			System.out.println("La devolucion del libro: " + Libro1.getTitulo() + "  no se puede realizar");
		}
		if (Libro1.prestamo()) {
			System.out.println("El Prestamo del libro: " + Libro1.getTitulo() + " se ha realizado correctamente");
		}else {
			System.out.println("El Prestamo del libro: " + Libro1.getTitulo() + " no se puede realizar");
		}
		if (Libro1.prestamo()) {
			System.out.println("El Prestamo del libro: " + Libro1.getTitulo() + " se ha realizado correctamente");
		}else {
			System.out.println("No quedan ejemplares del libro: " + Libro1.getTitulo());
		}
		System.out.println("\nLos datos del Libro 1 son: ");
		System.out.println(Libro1.toString());
		System.out.println("\nLos datos del Libro 2 son: ");
		System.out.println(Libro2.toString());
	}

}
