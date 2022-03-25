import javax.swing.JOptionPane;

public class Ejercicio_6 {

		public static void main(String[] args) {
			final double IVA=0.21;
			JOptionPane.showMessageDialog(null,"Calcular la Factura");
			String precio = JOptionPane.showInputDialog("Introduce el precio");
			int total=Integer.parseInt(precio);
			JOptionPane.showMessageDialog(null,"El precio, incluyendo el IVA es " +(total+(total*IVA))+" euros"); 
	}
}
