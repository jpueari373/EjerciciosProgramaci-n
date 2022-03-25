package Ejercicio_2;

import java.util.Scanner;

public class cuentamain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //INTRODUCIR POR PANTALLA LOS DATOS DE LA CUENTA 1
		 cuenta cuenta1 = new cuenta();
		 System.out.println("Introduce el nombre de la cuenta");
		 String nombre = sc.nextLine();
		 System.out.println("Introduce el numero de cuenta");
		 String numero_cuenta = sc.nextLine();
		 System.out.println("Introduce la cantidad de intereses de la cuenta");
		 double intereses = sc.nextDouble();
		 System.out.println("Introduce el saldo de la cuenta");
		 double saldo = sc.nextDouble();
		 cuenta1.setNombre(nombre);
		 cuenta1.setNumero_cuenta(numero_cuenta);
		 cuenta1.setTipo_interes(intereses);
		 cuenta1.setSaldo(saldo);
		 //INTRODUCIMOS LOS DATOS DE LA CUENTA 2
		 cuenta cuenta2 = new cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300 );
		 //COPIAMOS LOS DATOS DE LA CUENTA 1 A LA CUENTA 3
		 cuenta cuenta3 = new cuenta(cuenta1);
		 //MOSTRAR DATOS DE CUENTA 1
		 System.out.println("\n"+cuenta1.toString());
		 //REALIZAR INGRESO DE 500€ A CUENTA 1
		 cuenta1.ingreso(500);
		 System.out.println("\nEl ingreso total es: "+cuenta1.getSaldo());
		 //MOSTRAR DATOS DE CUENTA 2 Y CUENTA 3
		 System.out.println("\nDatos de la cuenta 2: "+cuenta2.toString());
		 System.out.println("\nDatos de la cuenta 3: "+cuenta3.toString());
		 //TRASFERENCIA DE CUENTA 3 A CUENTA 2
		 cuenta3.transferencia(cuenta2, 10);
		 System.out.println("\nEl saldo total de cuenta 2 es: "+cuenta2.getSaldo());
		 System.out.println("\nEl saldo total de cuenta 3 es: "+cuenta3.getSaldo());
		 sc.close();
	}

}
