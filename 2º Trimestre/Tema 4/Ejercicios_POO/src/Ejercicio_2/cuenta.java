package Ejercicio_2;

public class cuenta {
	
	private String nombre;
	private String numero_cuenta;
	private double tipo_interes;
	private double saldo;
	
	
	//CONSTRUCTOR POR DEFECTO
	public cuenta () {
	
	}


	//CONSTRUCTOR CON LOS PARAMETROS
	public cuenta(String nombre, String numero_cuenta, double tipo_interes, double saldo) {
		super();
		this.nombre = nombre;
		this.numero_cuenta = numero_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
	}
	
	//CONSTRUCTOR COPIA
	public cuenta(final cuenta cuentausuario) {
		super();
		this.nombre = cuentausuario.nombre;
		this.numero_cuenta = cuentausuario.numero_cuenta;
		this.tipo_interes = cuentausuario.tipo_interes;
		this.saldo = cuentausuario.saldo;
	}

	//METODOS GET Y SET DE LOS DATOS DE LA CUENTA
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumero_cuenta() {
		return numero_cuenta;
	}


	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}


	public double getTipo_interes() {
		return tipo_interes;
	}


	public void setTipo_interes(double tipo_interes) {
		this.tipo_interes = tipo_interes;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//FIN METODOS GET Y SET

	//METODO INGRESO
	public boolean ingreso (double saldo_ingreso) {
	boolean resultado_ingreso = true;
		
	if (saldo_ingreso < 0) {
		resultado_ingreso = false;
	}else {
		saldo += saldo_ingreso; 
	}
	
	
	return resultado_ingreso;	
	}
	
	
	//METODO REINTEGRO
	public boolean reintegro (double saldo_reintegro) {
		boolean resultado_reintegro = true;
						
		if (saldo_reintegro < 0 && saldo < saldo_reintegro) {
			resultado_reintegro = false;
		}else {
			saldo -=saldo_reintegro;
		}
		
		
		return resultado_reintegro;
	}
	
	//METODO DE TRANSFERENCIA 
	public boolean transferencia (cuenta destino, double importe) {
		boolean resultado_transferencia = true;
		if (importe < 0 ) {
		resultado_transferencia = false;
		
		}else if (saldo >= importe){
			reintegro(importe);
			destino.ingreso(importe);
		}else {
			resultado_transferencia = false;
		}
		
		return resultado_transferencia;
	}

	@Override
	public String toString() {
		return "cuenta [nombre=" + nombre + ", numero_cuenta=" + numero_cuenta + ", tipo_interes=" + tipo_interes
				+ ", saldo=" + saldo + "]";
	}
	
}
