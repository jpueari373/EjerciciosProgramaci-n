package Ejercicio_1;

public class Directivo extends Empleado{

	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	 @Override
	    public String toString() {
	        return super.toString() + " -> Directivo";
	    }
}
