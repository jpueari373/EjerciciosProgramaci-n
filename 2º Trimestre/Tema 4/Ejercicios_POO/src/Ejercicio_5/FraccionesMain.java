package Ejercicio_5;

public class FraccionesMain {

	public static void main(String[] args) {
		//SE CREAN 4 FRACCIONES
		Fraccion f1 = new Fraccion (1, 4); //FRACION 1/4
		Fraccion f2 = new Fraccion (1, 2); //FRACION 1/2
		Fraccion f3 = new Fraccion (); //FRACCION 0/1
		Fraccion f4 = new Fraccion (4); //FRACCION 4/1
		//OPERADORES ARIMÉTICAS CON ESAS FRACCIONES
		Fraccion suma = f1.sumar(f2);
		Fraccion resta = f1.resta(f3);
		Fraccion producto = f1.multiplicar(f4);
		Fraccion cociente = f1.dividir(f2);
		//MOSTRAR RESULTADOS
		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " - " + f3 + " = " + resta);
		System.out.println(f1 + " * " + f4 + " = " + producto);
		System.out.println(f1 + " / " + f2 + " = " + cociente);
		
	}

}
