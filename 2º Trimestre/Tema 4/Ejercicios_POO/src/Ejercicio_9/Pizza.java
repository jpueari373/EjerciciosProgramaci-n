package Ejercicio_9;

public class Pizza {
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	private String tama�o;
	private String tipo;
	private String estado;



	public Pizza(String tama�o, String tipo) {
		super();
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.estado = "pedida";
		totalPedidas++;
	}

	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public static void setTotalPedidas(int totalPedidas) {
		Pizza.totalPedidas = totalPedidas;
	}

	public static int getTotalServidas() {
		return totalServidas;
	}

	public static void setTotalServidas(int totalServidas) {
		Pizza.totalServidas = totalServidas;
	}
	
	public void sirve() {
		if (this.estado.equals("pedida")) {
			this.estado = "servida";
			totalServidas++;
		}else {
			System.out.println("Est� pizza ya se ha servido ");
			
		}
	}

	@Override
	public String toString() {
		return tipo +" "+ tama�o +", "+ estado;
	}
	
}
