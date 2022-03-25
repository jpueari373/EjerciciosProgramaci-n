package Ejercicio_4;

public class Libro {
	private String titulo;
	private String autor;
	private int numero_ejemplares;
	private int numero_ejemplares_prestados;
	
	//CONSTRUCTOR POR DEFECTO
	public Libro () {
	
	}
	//CONSTRUCTOR CON LOS PARAMETROS
	public Libro(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numero_ejemplares = numero_ejemplares;
		this.numero_ejemplares_prestados = numero_ejemplares_prestados;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumero_ejemplares() {
		return numero_ejemplares;
	}
	public void setNumero_ejemplares(int numero_ejemplares) {
		this.numero_ejemplares = numero_ejemplares;
	}
	public int getNumero_ejemplares_prestados() {
		return numero_ejemplares_prestados;
	}
	public void setNumero_ejemplares_prestados(int numero_ejemplares_prestados) {
		this.numero_ejemplares_prestados = numero_ejemplares_prestados;
	}
	
	public boolean prestamo () {
		boolean resultado = true;
		if (numero_ejemplares_prestados < numero_ejemplares ) {
			numero_ejemplares_prestados++;
		}else {
			resultado = false;
		}
		return resultado;
	}
	public boolean devolucion () {
		boolean resultado = true;
		if (numero_ejemplares_prestados == 0) {
			resultado = false;
		}else {
			numero_ejemplares_prestados --;
		}
		return resultado;
	}
	@Override
	public String toString() {
		return "titulo= " + titulo + "\n" + "autor= " + autor + "\n" + "numero_ejemplares= " + numero_ejemplares
				+ "\n"+ "numero_ejemplares_prestados= " + numero_ejemplares_prestados;
	}
}
