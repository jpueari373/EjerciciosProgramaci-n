package Ejercicio_2;

public abstract class Poligono {
	private int numeroLados;
	
	public Poligono() {
		
	}

	public Poligono(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	@Override
	public String toString() {
		return "numeroLados = " + numeroLados;
	}
	
	public abstract Double area();
	
}
