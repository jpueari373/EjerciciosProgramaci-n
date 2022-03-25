import javax.swing.JOptionPane;
public class Ejercicio_5 {

		public static void main(String[] args) {
			int euro=166;
			String peseta = JOptionPane.showInputDialog("Introduce la cantidad de euros a convertir");
			int total=Integer.parseInt(peseta);
			JOptionPane.showMessageDialog(null,"La cantidad de " + peseta + " pesetas equivale a "+total/euro +" euro");
	}

}