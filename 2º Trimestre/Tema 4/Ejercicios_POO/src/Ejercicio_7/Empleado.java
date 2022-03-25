package Ejercicio_7;

public class Empleado {
	private static double pagoPorHoraExtra; 
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;  
    private int numeroHijos;

    public Empleado () {
	   	
	}

	public Empleado(String nif) {
		super();
		this.nif = nif;
	}

	public static double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
		Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
    
    
	public double complementoHorasExtras () {
		if (horasExtras > 0 ) {
			pagoPorHoraExtra *= horasExtras;
		}
		
		if (horasExtras == 0 ) {
			pagoPorHoraExtra = 0;
		}
		return pagoPorHoraExtra;
		
	}
	public double SueldoBruto () {
		return sueldoBase + complementoHorasExtras();
		 
	}
    
	public double retencionIRPF () {
		if (casado == 'S' || casado == 's') {
			tipoIRPF -= 2;
		}
		if (numeroHijos > 0) {
			tipoIRPF -= numeroHijos;
		}
		
		return SueldoBruto () * tipoIRPF/100;
	}
	
	public double calcularSueldo() {
		return SueldoBruto () - retencionIRPF ();
	}

	@Override
	public String toString() {
		return  nif + nombre + "\n Sueldo Base: " + sueldoBase + "\n Horas Extras: "
				+ horasExtras + "\n tipo IRPF: " + tipoIRPF + "\n Casado: " + casado + "\n Número de Hijos: " + numeroHijos;
	}
	
}


