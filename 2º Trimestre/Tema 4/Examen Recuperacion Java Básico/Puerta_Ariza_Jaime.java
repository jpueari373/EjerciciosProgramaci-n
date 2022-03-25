package Examen;
import java.util.Scanner;
public class Juego {
	final static int TAMCIRCUITO = 11;
	static int fichaJ1 = 0;
	static int fichaJ2 = 0;
	static int minDado;
	static int maxDado;
	static int tirada1 = 0;
	static int tirada2 = 0;
	static String nomJ1;
	static String nomJ2;
	
	public static int tiraDados (int minDado, int maxDado) {
		int valor;
		return valor = (int)(Math.random() * minDado) * maxDado;
	}
	
	public static void pintaPista (int fichaJ1, int fichaJ2) {
		for (int i = 1; i < TAMCIRCUITO + 1; i++) {
			System.out.print("\t"+ i + "\t");
		}
		System.out.println("\nJ1");
		System.out.println("J2");
	}
	
	public static boolean sumaDeNumerosEsPrimo (int tirada1, int tirada2) {
		boolean resp = false;
		int suma = tirada1 + tirada2;
		for(int i = 2; i < suma; i++) {
			if (suma % i == 0) {
				resp = true;
			}
		}
		return resp;
	}
	
	public static void imprimeComoVaLaCarrera (String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		if (fichaJ1 > fichaJ2) {
			System.out.println("Va ganando el jugador 1 " + nomJ1);
		}else if (fichaJ1 < fichaJ2) {
			System.out.println("Va ganando el jugador 2 " + nomJ2);
			}else if (fichaJ1 == fichaJ2) {
				System.out.println("Van empatados");
			}
	}
	
	public static String EsGanador (String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		String Ganador = "";
		boolean resp = false;
		if (fichaJ1 >= TAMCIRCUITO) {
			Ganador = nomJ1;
		}
		if (fichaJ2 >= TAMCIRCUITO) {
			Ganador = nomJ2;
		}
		return Ganador;
	}
	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		System.out.print("¿Cual es el número mínimo del dado ");
		minDado = usuario.nextInt();
		System.out.print("¿Cual es el número máximo del dado ");
		maxDado = usuario.nextInt();
		usuario.nextLine();
		System.out.print("¿Cual es el nombre del jugador 1 ");
		nomJ1 = usuario.nextLine();
		do {
			
			System.out.print("¿Cual es el nombre del jugador 2 ");
			nomJ2 = usuario.nextLine();
		}while(nomJ2.equals(nomJ1));
		System.out.println("¡COMENCEMOS A JUGAR!");
		pintaPista(fichaJ1,fichaJ2);
		System.out.println(" ");
		do {
			System.out.println("Pulsa cualquier tecla para la siguiente ronda");
			char siguiente = usuario.next().charAt(0);
			System.out.println("Turno para el jugador 1 " + nomJ1);
			tirada1 = tiraDados (minDado, maxDado);
			tirada2 = tiraDados (minDado, maxDado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			if (sumaDeNumerosEsPrimo (tirada1, tirada2)) {
				System.out.println("¡TIRADA VÁLIDA!");
				fichaJ1 = tirada1 + tirada2;
			}else {
				System.out.println("¡TIRADA NO VÁLIDA!");
				System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
			}
			pintaPista(fichaJ1,fichaJ2);
			imprimeComoVaLaCarrera (nomJ1, nomJ2, fichaJ1, fichaJ2);
			EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2);
			System.out.println("Turno para el jugador 2 " + nomJ2);
			tirada1 = tiraDados (minDado, maxDado);
			tirada2 = tiraDados (minDado, maxDado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");
			if (sumaDeNumerosEsPrimo (tirada1, tirada2)) {
				System.out.println("¡TIRADA VÁLIDA!");
				fichaJ2 = tirada1 + tirada2;
			}else {
				System.out.println("¡TIRADA NO VÁLIDA!");
				System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
			}
			pintaPista(fichaJ1,fichaJ2);
			imprimeComoVaLaCarrera (nomJ1, nomJ2, fichaJ1, fichaJ2);
		}while (EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2) != null);	
		System.out.print("JUGADOR GANADOR : " + EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2));
		usuario.close();
	}

}
