package Ejercicio_9;

public class Pizza {
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	private String tamaño;
	private String tipo;
	private String estado;



	public Pizza(String tamaño, String tipo) {
		super();
		this.tamaño = tamaño;
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
			System.out.println("Está pizza ya se ha servido ");
			
		}
	}

	@Override
	public String toString() {
		return tipo +" "+ tamaño +", "+ estado;
	}
	
}
