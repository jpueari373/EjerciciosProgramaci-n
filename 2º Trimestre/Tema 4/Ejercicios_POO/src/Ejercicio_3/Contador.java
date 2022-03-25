package Ejercicio_3;

public class Contador {

	private int cont;

	//CONTADOR POR DEFECTO
	public Contador() {
	}
	//CONSTRUCTOR VARIABLE CONT
	public Contador(int cont) {
		this.cont = cont;
		if (cont < 0) {
			cont = 0;
		}
	}
	//CONSTRUCTOR COPIA
	public Contador(Contador cuenta) {
		this.cont = cuenta.cont;
		if (cont < 0) {
			cont = 0;
		}
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int incrementar (int incremento) {
		 incremento = cont++;
		return incremento;
	}
	public int decrementar (int decremento) {
		if (cont > 0) {
			decremento = cont--;
		}else {
			cont = 0;
			decremento = cont;
		}
		return decremento;
	}
}
