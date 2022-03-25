package Ejercicio_3;

import java.util.Scanner;

import Ejercicio_2.cuenta;

public class ContadorMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Contador cuenta1 = new Contador();
		 Contador cuenta2 = new Contador (10);
		 System.out.println("Introduce un valor al contador");
		 int num = sc.nextInt();
		 cuenta1.setCont(num);
		 Contador cuenta3 = new Contador(cuenta2);
		 cuenta1.incrementar(num);
		 System.out.println("\nIncremento cuenta 1: "+cuenta1.getCont());
		 cuenta1.incrementar(num);
		 System.out.println("\nIncremento cuenta 1: "+cuenta1.getCont());
		 cuenta1.decrementar(num);
		 System.out.println("\nDecremento cuenta 1: "+cuenta1.getCont());
		 cuenta2.incrementar(num);
		 System.out.println("\nIncremento cuenta 2: "+cuenta2.getCont());
		 cuenta2.decrementar(num);
		 System.out.println("\nDecremento cuenta 2: "+cuenta2.getCont());
		 System.out.println("\nValor contador 3: "+cuenta3.getCont());
		 sc.close();
	}

}
