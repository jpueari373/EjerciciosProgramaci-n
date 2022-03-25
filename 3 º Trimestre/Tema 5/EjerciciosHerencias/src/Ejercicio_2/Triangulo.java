package Ejercicio_2;

public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public double area() {
		double p = (lado1+lado2+lado3)/2;
		return Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	
	
}
