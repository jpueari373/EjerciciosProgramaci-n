import javax.swing.JOptionPane;
public class Ejercicio_4 {

		public static void main(String[] args) {
			final double PESETA=166;
			String euro = JOptionPane.showInputDialog("Introduce la cantidad de euros a convertir");
			int total=Integer.parseInt(euro);
			JOptionPane.showMessageDialog(null,"La cantidad de " + euro + " euros equivale a "+total*PESETA +" Pesetas");
	}

}
