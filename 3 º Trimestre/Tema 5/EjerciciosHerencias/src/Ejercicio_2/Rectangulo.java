package Ejercicio_2;

public class Rectangulo {
	private double lado1;
	private double lado2;
	
	public Rectangulo (int numeroLado) {
		super();
	}

	
	public double area() {
		return lado1 * lado2;
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
	
	
}
