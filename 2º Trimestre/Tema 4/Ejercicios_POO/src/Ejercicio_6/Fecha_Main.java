package Ejercicio_6;

import java.util.Scanner;

public class Fecha_Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un día");
	int dia = sc.nextInt();
	System.out.println("Introduce un mes");
	int mes = sc.nextInt();
	System.out.println("Introduce un año");
	int anyo = sc.nextInt();
	Fecha Fecha1 = new Fecha (); 
	Fecha1.setDia(dia);
	Fecha1.setMes(mes);
	Fecha1.setAnyo(anyo);
	if (Fecha1.fechaCorrecta()) {
		System.out.println("Fecha introducida: " + Fecha1);
		System.out.println("Los 10 días siguientes son:");
		for(int i = 0; i < 10; i++) {
			Fecha1.diaSiguiente();
			System.out.println(Fecha1);
			}
	}else {
		System.out.println("La fecha introducida no es válida");
		}
	}
}
