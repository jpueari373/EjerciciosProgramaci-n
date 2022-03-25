package Examen;

public class Vehiculos {
	private String marca;
	private String matricula;
	private int numeroDeKilometros;
	private Fecha fechaDeMatriculacion;
	private String descripcion;
	private double precio;
	private String nombreDelPropietario;
	private String dniDelPropietario;
	
	public Vehiculos () {
		
	}

	public Vehiculos(String marca, String matricula, int numeroDeKilometros, Fecha fechaDeMatriculacion,
			String descripcion, double precio, String nombreDelPropietario, String dniDelPropietario) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.numeroDeKilometros = numeroDeKilometros;
		this.fechaDeMatriculacion = fechaDeMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombreDelPropietario = nombreDelPropietario;
		this.dniDelPropietario = dniDelPropietario;
	}
	
	public Vehiculos(Vehiculos Vehiculo) {
		super();
		this.marca = Vehiculo.marca;
		this.matricula = Vehiculo.matricula;
		this.numeroDeKilometros = Vehiculo.numeroDeKilometros;
		this.fechaDeMatriculacion = Vehiculo.fechaDeMatriculacion;
		this.descripcion = Vehiculo.descripcion;
		this.precio = Vehiculo.precio;
		this.nombreDelPropietario = Vehiculo.nombreDelPropietario;
		this.dniDelPropietario = Vehiculo.dniDelPropietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroDeKilometros() {
		return numeroDeKilometros;
	}

	public void setNumeroDeKilometros(int numeroDeKilometros) {
		this.numeroDeKilometros = numeroDeKilometros;
	}

	public Fecha getFechaDeMatriculacion() {
		return fechaDeMatriculacion;
	}

	public void setFechaDeMatriculacion(Fecha fechaDeMatriculacion) {
		this.fechaDeMatriculacion = fechaDeMatriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombreDelPropietario() {
		return nombreDelPropietario;
	}

	public void setNombreDelPropietario(String nombreDelPropietario) {
		this.nombreDelPropietario = nombreDelPropietario;
	}

	public String getDniDelPropietario() {
		return dniDelPropietario;
	}

	public void setDniDelPropietario(String dniDelPropietario) {
		this.dniDelPropietario = dniDelPropietario;
	}
	
	public int getAnios() {
		return Fecha.getAño();
		
	}
}
