package Ejercicio_6;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha() {
		
	}

	public Fecha(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int año) {
		this.anyo = año;
	}
	
	private boolean esBisiesto (int año) {
		return (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0);
	}
	
	public boolean fechaCorrecta () {
		boolean diaCorrecto, mesCorrecto, anyoCorrecto;
		mesCorrecto = mes >= 1 && mes <= 31;
		anyoCorrecto = anyo > 0;
		switch (mes) {
		case 2:
			if (esBisiesto(anyo)) {
				diaCorrecto = dia >= 1 && dia <= 29;
			}else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4,6,9,11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <=31;
		}
		return diaCorrecto && mesCorrecto && anyoCorrecto;
	}
	
	public void diaSiguiente () {
		dia++;
		if(!fechaCorrecta()) {
			dia = 1;
			mes++;
		}
		if(!fechaCorrecta()) {
			mes = 1;
			anyo++;
		}
	}

	@Override
	public String toString() {
//USAMOS .APPEND QUE NOS PERMITE ADJUNTAR ELEMENTOS AL CONSTRUCTOR
	StringBuilder sc = new StringBuilder();
		if (dia < 10) {
			sc.append("0");
			}
		sc.append(dia);
		sc.append("-");
		if (mes < 10) {
			sc.append("0");
		}
		sc.append(mes);
		sc.append("-");
		sc.append(anyo);
		return sc.toString();
	}
	
}
